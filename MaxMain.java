import java.util.*;

public class MaxMain {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter the three Strings: ");

        System.out.println("a:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println("b:");
        String b = sc.nextLine();

        System.out.println("c:");
        String c = sc.nextLine();

        StringMax stringMax = new StringMax();

        String maximum = stringMax.findMax(a, b, c);

        System.out.println("Maximum: "+maximum);

    }
}
