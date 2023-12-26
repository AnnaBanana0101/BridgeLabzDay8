import java.util.*;

public class MaxMain {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter the three decimals: ");

        System.out.println("a:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        System.out.println("b:");
        float b = sc.nextFloat();

        System.out.println("c:");
        float c = sc.nextFloat();

        FloatMax floatMax = new FloatMax();

        float maximum = floatMax.findMax(a, b, c);

        System.out.println("Maximum: "+maximum);

    }
}
