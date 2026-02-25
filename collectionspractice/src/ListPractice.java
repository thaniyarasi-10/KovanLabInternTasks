import java.util.*;
import java.util.stream.Collectors;

public class ListPractice {

    static void removeWordStartingWithA(){
        List<String> student = new ArrayList<>(List.of("Arun", "azeem", "Bala", "Lakshana", "Aravind","Sri", "Pandi", "Ragul", "Aarav", "Thani"));
        List<String > result= new ArrayList<>();
        for(String name: student){
            if(!(name.startsWith("A"))){
                result.add(name);
            }
        }
        System.out.println(result);
    }

    static void insertElement(){
        List<Integer> num= new ArrayList<>(List.of(1,2,4,5,6,7,8));
        num.add(2,3); // add and shift the elements to right
        // num.set(2,3) // replace the element 3 at index 2
        System.out.println(num);
    }

    static void freqElement(){
        List<Integer> num= new ArrayList<>(List.of(1,6,2,4,4,2,8,4,4,5,6,7,8,8,8));
        Optional<Map.Entry<Integer, Long>> freq= num.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        freq.ifPresent(e -> System.out.println(e.getKey()));


    }

    static void arraylistToArray(){
        List<Integer> num= new ArrayList<>(List.of(1,6,2,4,4,2,8,4,4,5,6,7,8,8,8));

        //ArrayList to Object[]

        Object[] arr0 = num.toArray(); //  must typecast if we want
        System.out.println("Object Array: "+Arrays.toString(arr0));

        //ArrayList<T> to T[]
        Integer[] arr1 = num.toArray(new Integer[0]);
        System.out.println("Integer Array: "+Arrays.toString(arr1));

        //ArrayList to primitive array
        int [] arr2 = num.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("int Array: "+Arrays.toString(arr2));
    }

    static void queueUsingLinkedList(){
        List<String> list = new LinkedList<>(List.of( "Array","List", "ArrayList"));

        //both add() and addLast(), adds element at last, add() used for all collections- Calls addLast() internally but addLast() only for Deque
        list.add("LinkedList");
        list.addLast("Last");
        list.remove(0);
        System.out.println(list);
    }

    static void addElementAtFirstAndLast(){
        List<String> list = new LinkedList<>(List.of( "Array","List", "ArrayList"));
        list.addFirst("Java");
        list.addLast("LinkedList");
        System.out.println(list);
    }

    static void reverseLinkedList(){
        List<String> list = new LinkedList<>(List.of( "Array","List", "ArrayList"));
        List<String > res= new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            res.add(list.get(i));
        }
        System.out.println(res);
    }

    static void middleElementOfLinkedList(){
        List<String> list = new LinkedList<>(List.of( "Array","List","ArrayList", "LinkedList"));
        int mid= (0+ list.size()-1)/2;
        System.out.println(list.get(mid));
    }

    static void palindromeUsingStack(){
        String text= "abaa";
        Stack<Character> stack= new Stack<>();
        for(char ch: text.toCharArray()){
            stack.push(ch);
        }
        boolean isPalindrome = true;
        int mid = text.length()/2;
        for(int i=0;i<mid;i++){
            if(stack.get(i) != stack.pop()){
                isPalindrome= false;
                break;
            }
        }
        System.out.println(isPalindrome?"Palindrome":"Not a palindrome");
    }

    static void pushAndPopElements(){
        String text= "text";
        Stack<Character> stack= new Stack<>();
        for(char ch: text.toCharArray()){
            stack.push(ch);
        }
        try{
            while (stack.size() >=0){
                stack.pop();
            }
        } catch (RuntimeException e) {
            System.out.println("Is empty");
        }

    }


    public static void main(String[] args) {
        //removeWordStartingWithA();
        //insertElement();
        //freqElement();
        //arraylistToArray();
        //queueUsingLinkedList();
        //addElementAtFirstAndLast();
        //reverseLinkedList();
        //middleElementOfLinkedList();
        //palindromeUsingStack();
        //pushAndPopElements();
    }
}
