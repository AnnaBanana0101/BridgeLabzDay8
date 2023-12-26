import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class GenericMax<T extends Comparable<T>>{

    // T A;
    // T B;
    // T C;

    // public GenericMax(T a, T b, T c)
    // {
    //     A = a;
    //     B = b;
    //     C = c;
    // }


    public Optional<T> findMax(T...values)
    {
        //return A.compareTo(B)>=0 ?( B.compareTo(C)>=0 ? A : C ): A.compareTo(C) >=0? B : B.compareTo(C)>=0? B: C;

        // if(A.compareTo(B)>=0 && A.compareTo(C)>=0)
        //     return (T) A;
        // else if(A.compareTo(B)<=0 && B.compareTo(C)>=0)
        //     return (T) B;
        // else
        //     return (T) C;

        Arrays.sort(values, Comparator.reverseOrder());
        return Optional.of(values[0]);
    }
}