package practices;

public class SwapValues {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println("Inainte de swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Dupa swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Dupa swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
