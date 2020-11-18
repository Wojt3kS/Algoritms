package challenges;

import java.util.*;

public class Ruthenium2019_2 {
    private class Book {
        int originalIndex;
        int numberOfReplacementsLeft;
        int firstIndexConnected;
    }

    private class NotNullGetHashMap extends HashMap<Integer, List<Book>> {
        public List<Book> get(Object key) {
            List<Book> books = super.get(key);
            if (books == null) {
                books = new ArrayList<>();
            }
            return books;
        }
    }

    private int maxNumberOfConsecutiveBooksFromTheSameAge;
    private Map<Integer, List<Book>> booksConnections = new NotNullGetHashMap();
    private List<Book> booksFromSameAge;

    public int solution(int[] listOfBooks, int numberOfBooksThatCanBeReplaced) {
        for (int i = 0; i < listOfBooks.length; i++) {
            booksFromSameAge = booksConnections.get(listOfBooks[i]);
            Book book = new Book();
            fillBookWithDefaultParameters(book, i, numberOfBooksThatCanBeReplaced);
            changeDefaultBookParametersWhereNecessarily(book, numberOfBooksThatCanBeReplaced);
            booksFromSameAge.add(book);
            booksConnections.put(listOfBooks[i], booksFromSameAge);
            int actualNumberOfConsecutiveBooksFromThisAge = booksFromSameAge.size() - book.firstIndexConnected;
            maxNumberOfConsecutiveBooksFromTheSameAge =
                    Math.max(actualNumberOfConsecutiveBooksFromThisAge, maxNumberOfConsecutiveBooksFromTheSameAge);
        }
        maxNumberOfConsecutiveBooksFromTheSameAge =
                Math.min(maxNumberOfConsecutiveBooksFromTheSameAge + numberOfBooksThatCanBeReplaced, listOfBooks.length);
        return maxNumberOfConsecutiveBooksFromTheSameAge;
    }

    private void fillBookWithDefaultParameters(Book book, int index, int numberOfBooksThatCanBeReplaced) {
        book.originalIndex = index;
        book.numberOfReplacementsLeft = numberOfBooksThatCanBeReplaced;
        book.firstIndexConnected = booksFromSameAge.size();
    }

    private void changeDefaultBookParametersWhereNecessarily(Book book, int numberOfBooksThatCanBeReplaced) {
        if (booksFromSameAge.size() == 0) {
            return;
        }
        Book lastBookFromSameAge = booksFromSameAge.get(booksFromSameAge.size() - 1);
        if (book.originalIndex - lastBookFromSameAge.originalIndex - 1 > numberOfBooksThatCanBeReplaced) {
            return;
        }
        int numberOfBooksToRemove = 0;
        int numberOfBooksFromOtherAgeBetween = book.originalIndex - lastBookFromSameAge.originalIndex - 1;
        int actualNumberOfReplacementsLeft =
                lastBookFromSameAge.numberOfReplacementsLeft - numberOfBooksFromOtherAgeBetween;
        while (actualNumberOfReplacementsLeft < 0) {
            numberOfBooksToRemove++;
            actualNumberOfReplacementsLeft +=
                    calculateFreeReplacementsAfterRemovingBook(numberOfBooksToRemove, lastBookFromSameAge);
        }
        book.numberOfReplacementsLeft = actualNumberOfReplacementsLeft;
        book.firstIndexConnected = lastBookFromSameAge.firstIndexConnected + numberOfBooksToRemove;
    }

    private int calculateFreeReplacementsAfterRemovingBook(int numberOfBooksToRemove, Book lastBookFromSameAge) {
        Book bookToRemove = booksFromSameAge.get(lastBookFromSameAge.firstIndexConnected + numberOfBooksToRemove - 1);
        Book firstConnectedBook = booksFromSameAge.get(lastBookFromSameAge.firstIndexConnected + numberOfBooksToRemove);
        return firstConnectedBook.originalIndex - bookToRemove.originalIndex - 1;
    }


    public static void main(String[] args) {
        Ruthenium2019_2 ruthenium2019_2 = new Ruthenium2019_2();
        int[] listOfBooks = {3, 1, 2, 3, 3, 3, 3, 2, 5, 3, 7, 3};
        int numberOfBooksThatCanBeReplaced = 1;
        System.out.println(ruthenium2019_2.solution(listOfBooks, numberOfBooksThatCanBeReplaced));
        int[] listOfBooks2 = {4, 5, 5, 4, 2, 2, 4};
        int numberOfBooksThatCanBeReplaced2 = 0;
        System.out.println(ruthenium2019_2.solution(listOfBooks2, numberOfBooksThatCanBeReplaced2));
    }
}
