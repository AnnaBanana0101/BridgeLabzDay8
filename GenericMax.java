
public class GenericMax<T extends Comparable<T>>{

    T A;
    T B;
    T C;

    public GenericMax(T a, T b, T c)
    {
        A = a;
        B = b;
        C = c;
    }


    public T findMax()
    {
        //return A.compareTo(B)>=0 ?( B.compareTo(C)>=0 ? A : C ): A.compareTo(C) >=0? B : B.compareTo(C)>=0? B: C;

        if(A.compareTo(B)>=0 && A.compareTo(C)>=0)
            return (T) A;
        else if(A.compareTo(B)<=0 && B.compareTo(C)>=0)
            return (T) B;
        else
            return (T) C;
    }
}