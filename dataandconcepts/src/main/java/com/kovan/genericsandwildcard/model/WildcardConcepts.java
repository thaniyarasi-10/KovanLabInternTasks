package com.kovan.genericsandwildcard.model;

//  Generic Class
class  WildcardConcepts <A>{
    // We use < > to specify Parameter type

//    T: Type
//    E: Element
//    K: Key
//    N: Number
//    V: Value
// No need to use the above characters, we can use anything like name,id or anything
        A obj;
        WildcardConcepts(A obj) {
            this.obj = obj;
        }
        public A getObject() { return this.obj; }

    //Generic method
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);


//      WildcardConcepts p = new WildcardConcepts();
//      System.out.println(p.getClass().getName()); op: com.kovan.genericsandwildcard.model.WildcardConcepts
//      System.out.println(p.getClass()) op: class com.kovan.genericsandwildcard.model.WildcardConcepts
//      System.out.println(s.getName()); op - compile time error

    }



}

    class Geeks {
        public static void main(String[] args)
        {
            // instance of Integer type
            WildcardConcepts<Integer> iObj = new WildcardConcepts<Integer>(15);
            System.out.println(iObj.getObject());

            // instance of String type
            WildcardConcepts<String> sObj
                    = new WildcardConcepts<String>("GeeksForGeeks");
            System.out.println(sObj.getObject());
            sObj.genericDisplay("Intern");

        }
    }
