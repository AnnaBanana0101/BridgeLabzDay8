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

        GenericMax genericMax = new GenericMax();

        String maximum = genericMax.findMax(a, b, c);

        System.out.println("Maximum: "+maximum);
        System.out.println("");

        System.out.println("Enter the three Integers: ");

        System.out.println("a:");
        //Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("b:");
        int y = sc.nextInt();

        System.out.println("c:");
        int z = sc.nextInt();

        int max = genericMax.findMax(x, y, z);

        System.out.println("Maximum: "+max);
        System.out.println("");



    }
}
