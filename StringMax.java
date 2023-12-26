
public class StringMax {

    public String findMax(String A, String B, String C)
    {
        //return A.compareTo(B)>=0 ?( B.compareTo(C)>=0 ? A : C ): A.compareTo(C) >=0? B : B.compareTo(C)>=0? B: C;

        if(A.compareTo(B)>=0 && A.compareTo(C)>=0)
            return A;
        else if(A.compareTo(B)<=0 && B.compareTo(C)>=0)
            return B;
        else
            return C;
    }
}