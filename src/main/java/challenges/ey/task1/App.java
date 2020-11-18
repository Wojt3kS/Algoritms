package challenges.ey.task1;

// Wojt3kS/MRWojt3k
// I used intellij IDEA 2019.2.3 on 3 monitors and mechanical keyboard (CHERRY MX BROWN)
// music on youtube and google github but it was to hard to read terms and conditions XD
class App {

    public static void main(String[] args) {
        App app = new App();
        boolean amIEgoistic = app.isEgoistic("cokolwiek");
        if (amIEgoistic) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        System.out.println("I hope not");
    }
    public boolean isEgoistic(String N) {
        System.out.println("I am not egoistic. My code is available (hidden) on github");

        return false;
    }
}
// szkoda że nie ma automatycznej synchronizacji tego zadania z IntelliJ byłoby o wiele szybciej :/