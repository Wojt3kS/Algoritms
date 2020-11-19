package challenges.ey.task1;

// Wojt3kS

class App {

    public static void main(String[] args) {
        App app = new App();
        boolean amIEgoistic = app.isEgoistic("cokolwiek");
        if (amIEgoistic) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("I hope not");
    }

    public boolean isEgoistic(String N) {
        System.out.println("I am not egoistic. My code is available (hidden) on github");
        return false;
    }
}