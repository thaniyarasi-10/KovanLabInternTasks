import java.util.*;
class ExtraLearnings01 {
    public static void NumericPromotion(){

        //Smaller one is automatically converted to larger one to maintain precision

        byte a=120;
        byte b=50;
        System.out.println(a+b); //conv to int


        byte c=120;
        float  d=50.5f;
        double e=c+d;
        System.out.println(e);
    }

    public static  void StringHashCode(){
        String str1="abc";
        String str2="abc";
        String str3= new String("abc");

        //checks ref
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        //checks value
        System.out.println(str1.equals(str3));

        //cheks value
        System.out.println(str1.hashCode()); //same
        System.out.println(str3.hashCode());

        //checks individual object
        System.out.println(System.identityHashCode(str1));   // different
        System.out.println(System.identityHashCode(str3));
    }

    public static  void stringImmutability(){

        //concat()
        String str1="abc";
        System.out.println(str1);
        System.out.println(str1.concat("a"));// str1 is not modified, instead a new object is created in heap(bcoz String pool only stores compile time objects)

        str1=str1.concat("a");
        System.out.println(str1);

        // + operator
        String str2="abc";
        str2 = "abc" + "xyz";//"abc" + "xyz" are both literals , so the compiler changes your code before running into: str2 = "abcxyz";

        System.out.println(str2);

        String  str3="def";
        str3 = str3 + str2;
        System.out.println(str3);
    }


    public static void primitiveWrappers(){
        int a=125;
        Integer b=125;
        System.out.println(b.equals(a));
        System.out.println(a==b);
    }

    public static void main(String[] args) {
        NumericPromotion();
        StringHashCode();
        stringImmutability();
        primitiveWrappers();
    }
}