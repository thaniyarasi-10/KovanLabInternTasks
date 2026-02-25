import java.util.*;

public class SetPractice {
    static void printUniqueElements(){
        List<Integer> list =  new ArrayList<>(List.of(1,2,3,4,5,6,7,1,2,3,4));
        Set<Integer> set =  new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);
    }

    static void checkElementPresence(){
        Set<Integer> set = new HashSet<>(Set.of(1,2,3,4,5));
        System.out.println(set.contains(1)?"Present":"Not present");
        System.out.println(set.contains(6)?"Present":"Not present");
    }

    static void removeElementsGreaterThan100(){
        Set<Integer> set = new HashSet<>(Set.of(100,200,35,49,500));
        set.removeIf(n-> n>100);
        System.out.println(set);
    }

    static void insertionOrderInLinkedHashSet(){
       // Set<Integer> set =  new LinkedHashSet<>(Set.of(1,2,3,4,5)); if we give like this, it can't store in insertion order, coz set don't maintain insertion order
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
    }

    static void removeDuplicatedInLinkedHashSet(){
        List<Integer> list = new ArrayList<>(List.of(1,2,3,3,4,5,5));
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set);
    }

    static void iterationOrder(){
        Set<Integer> hashSet= new HashSet<>(Set.of(1,2,3,4,5));
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
    }

    static void sortedEmployeeId(){
        Map<Integer,String> map =  new TreeMap<>(Map.of(2,"java",1,"Python",3,"TypeScript"));
        System.out.println(map);

    }

    static void smallestAndLargestElement(){
         /* Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        We can't use first and last methods here coz , the reference here is Set
        System.out.println("Smallest element: " + set.first());
        System.out.println("Largest element: " + set.last()); */


        TreeSet<Integer> set =
                new TreeSet<>(Set.of(50, 10, 30, 70, 20));

        System.out.println("Smallest element: " + set.first());
        System.out.println("Largest element: " + set.last());
        //first and last only used in TreeSet

    }

    static void elementsGreaterThanValue(){
        TreeSet<Integer> set =  new TreeSet<>(Set.of(50, 10, 30, 70, 20));
        int value= 20;
        System.out.println(set.tailSet(value,false));


        //tailSet(E fromElement)     >=value         -from SortedSet
        //tailSet(E fromElement, boolean inclusive) false -> >value, true -> >=value- from NavigableSet
    }

    static void displayInDescOrder(){
        TreeSet<Integer> set =  new TreeSet<>(Set.of(50, 10, 30, 70, 20));
        System.out.println(set.descendingSet());
    }



    public static void main(String[] args) {
        //printUniqueElements();
        //checkElementPresence();
        //removeElementsGreaterThan100();
        //insertionOrderInLinkedHashSet();
        //removeDuplicatedInLinkedHashSet();
        //iterationOrder();
        //sortedEmployeeId();
        //smallestAndLargestElement();
        //elementsGreaterThanValue();
        displayInDescOrder();
    }
}
