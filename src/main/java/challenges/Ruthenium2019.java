package challenges;

import java.util.Arrays;

public class Ruthenium2019 {
    private final int DEFAULT_VALUE = 0;

    private int[] listOfBooks;
    private int numberOfBooksWhichCanBeReplaced;
    private int numberOfBooksFromAgeWithMostBooks = DEFAULT_VALUE;

    public int solution(int[] listOfBooks, int numberOfBooksThatCanBeReplaced) {
        this.listOfBooks = listOfBooks;
        this.numberOfBooksWhichCanBeReplaced = numberOfBooksThatCanBeReplaced;
        findAgeWithMostBooksAndTheirCount();
        return numberOfBooksFromAgeWithMostBooks + checkHowManyBooksCanBeReplaced();
    }

    private void findAgeWithMostBooksAndTheirCount() {
        Arrays.sort(listOfBooks);
        int currentAge = DEFAULT_VALUE;
        int numberOfBooksFromCurrentAge = DEFAULT_VALUE;
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == currentAge) {
                numberOfBooksFromCurrentAge++;
            } else {
                currentAge = listOfBooks[i];
                numberOfBooksFromCurrentAge = 1;
            }
            if (numberOfBooksFromCurrentAge > numberOfBooksFromAgeWithMostBooks) {
                numberOfBooksFromAgeWithMostBooks = numberOfBooksFromCurrentAge;
            }
        }
    }

    private int checkHowManyBooksCanBeReplaced() {
        return Math.min(listOfBooks.length - numberOfBooksFromAgeWithMostBooks, numberOfBooksWhichCanBeReplaced);
    }
}
