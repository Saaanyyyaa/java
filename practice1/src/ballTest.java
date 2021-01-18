public class ballTest {
    public static void main(String[] args) {
        ball b1 = new ball("yellow", 30);
        ball b2 = new ball("red", 10);
        ball b3 = new ball("blue");
        b3.setSize(40);
        System.out.println(b1);
        System.out.println(b3);
    }
}
