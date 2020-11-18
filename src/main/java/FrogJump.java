public class FrogJump {

    public int solution(int X, int Y, int D) {
        return (Y - X) % D == 0 ? (Y - X) / D : (Y - X) / D + 1;
    }

    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        System.out.println(frogJump.solution(10, 1000000000, 30));
    }

}
