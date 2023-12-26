import java.util.*;

public class MaxMain {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter the three integers: ");

        System.out.println("a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("b:");
        int b = sc.nextInt();

        System.out.println("c:");
        int c = sc.nextInt();

        IntegerMax intMax = new IntegerMax();

        int maximum = intMax.findMax(a, b, c);

        System.out.println("Maximum: "+maximum);

    }
}
