enum Fruits{
    Mango, Orange, Banana, Apple, Papaya;
}
public class enum {
    public static void main(String[] args) {
        Fruits a, ap2, ap3;
        System.out.println("Fruits constants " + "and their ordinal values:");
        for(Fruits s : Fruits.values())
        System.out.println(s + " " + s.ordinal());
        ap = Fruits.Banana;
        ap2 = Fruits.Orange;
        ap3 = Fruits.Banana;
        System.out.println();
    }
}
