
public class FloatMax {

    public Float findMax(float a, float b, float c)
    {
        Float A = a;
        Float B = b;
        Float C = c;

        //return A.compareTo(B)>=0 ?( B.compareTo(C)>=0 ? A : C ): A.compareTo(C) >=0? B : B.compareTo(C)>=0? B: C;

        if(A.compareTo(B)>=0 && A.compareTo(C)>=0)
            return A;
        else if(A.compareTo(B)<=0 && B.compareTo(C)>=0)
            return B;
        else
            return C;
    }
}