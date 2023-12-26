import java.util.*;
import java.util.Optional;

public class MaxMain {
    public static void main(String[] args) throws Exception {

        // System.out.println("Enter the three Strings: ");

        // System.out.println("a:");
        // Scanner sc = new Scanner(System.in);
        // String a = sc.nextLine();

        // System.out.println("b:");
        // String b = sc.nextLine();

        // System.out.println("c:");
        // String c = sc.nextLine();

        GenericMax<String> genericMax = new GenericMax();
        Optional<String> result = genericMax.findMax("apple", "banana", "peach", "orange");

        //String maximum = genericMax.findMax();

        System.out.println("Maximum: "+ result);
        System.out.println("");

        // System.out.println("Enter the three Integers: ");

        // System.out.println("a:");
        // //Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // System.out.println("b:");
        // int y = sc.nextInt();

        // System.out.println("c:");
        // int z = sc.nextInt();

        GenericMax<Integer> genericIntMax = new GenericMax();
        //int max = genericIntMax.findMax();
        //Optional<Integer> max = genericIntMax.findMax(1,2,3,4,5);
        genericIntMax.printMax(1,2,3,4,5,6);
        //System.out.println("Maximum: "+max);
        System.out.println("");

    }
}
