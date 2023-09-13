public class Main {
    public static void main (String[] args) {
        int l = 11;
        int c = 21;
        GPS g1 = new GPS();
        Robo r1 = new Robo( 1, g1);
        while( r1.MOVE() != Move.STOP) {}
        r1.print();
        System.out.print("\nFim\n");
    }
}
