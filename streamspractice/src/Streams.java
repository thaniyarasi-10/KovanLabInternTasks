import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String name;
     int salary;
    String department;
    int age;
    Employee(String name,int salary, String department, int age){
        this.salary= salary;
        this.name= name;
        this.department = department;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String getDepartment(){
        return department;
    }
    public int getAge(){
        return age;
    }

}
class  Streams{
// Basic Problems
     static void evenNumbers(){
        List<Integer> num = new ArrayList<>(List.of(1,2,3,4));
        num.stream()
                .filter(n -> (n % 2) == 0)
                .forEach(System.out::println);
    }

    static void upperCase(){
         List<String> values = new ArrayList<>(List.of("Java", "Python", "TypeScript"));
         values.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }

    static void countElements(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        long count =num.stream()
                .filter(n-> n>50)
                .count(); // only returns long
        System.out.println(count);

    }

    static void firstElementStartWithA(){
        List<String> values = new ArrayList<>(List.of("Java", "Python", "TypeScript", "Array", "Arraylist"));
        System.out.println( values.stream()
                .filter(s-> s.startsWith("A"))
                .findFirst()// return the first value as Optional<T>,  String terminate here
                .orElse("Not found") // belongs to Optional<T> ,not a stream terminal method
            );
    }

    static void removeDuplicate(){
        List<Integer> num = new ArrayList<>(List.of(1,2,2,3,3,3,4,4,5));
        num.stream()
                .distinct()
                .forEach(System.out::println);
    }

    static void sortInt(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        num.stream()
                .sorted() // in ascending order
                .forEach(System.out::println);
    }

    static void sortString(){
        List<String> values = new ArrayList<>(List.of("Java", "Python", "TypeScript", "Array", "Arraylist"));
        List<String> sorted= values.stream()
                .sorted(Comparator.reverseOrder()) //in descending order
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
    static void maxNum(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        System.out.println(num.stream()
                .max(Comparator.naturalOrder()) // will return Optional[350]
                .orElse(0)
        );
    }
    static void minNum(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        System.out.println(num.stream()
                .min(Integer::compareTo) // will return Optional[350]
                .orElse(0)
        );
    }

    static void convertToString(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        String value = num.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(","));


        System.out.println(value);
    }

// Intermediate problems
    static void sumAllElements(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        System.out.println(num.stream()
                .mapToInt(Integer::valueOf)
                .sum() // return int
        );

    }

    static void averageOfAllElements(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        System.out.println(num.stream()
                .mapToInt(Integer ::valueOf )
                .average() // return OptionalDouble, bcoz if total =0, we can't divide by 0,it will be error
                .orElse(0)
        );
    }

    static void lengthGreaterThan5(){
        List<String> values = new ArrayList<>(List.of("Java", "Python", "TypeScript", "Array", "Arraylist"));
        values.stream()
                .filter(s -> s.length() >5)
                .forEach(System.out::println);
    }

    static void startWithVowel(){
        List<String> values = new ArrayList<>(List.of("Java", "Python", "TypeScript", "Array", "Arraylist"));
        System.out.println(values.stream()
                .filter(s->  "AEIOUaeiou".contains(String.valueOf(s.charAt(0))))
                .count());
    }

    static void squareEachNumber(){
        List<Integer> num = new ArrayList<>(List.of(100,20,350,43));
        List<Integer> squared= num.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squared);
    }

    static void secondLargestNumber(){
        List<Integer> num = new ArrayList<>(List.of(100,350,20,350,43));
        num.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }

    static void mergeAndRemoveDuplicates(){
        List<Integer> list1 = new ArrayList<>(List.of(100,350,20,350,43));
        List<Integer> list2 = new ArrayList<>(List.of(50,100,25,300));
        Stream
                .concat(list2.stream(),list2.stream()) // concat is a static method, so we are calling it using the Class name
                .distinct()
                .forEach(System.out::println);
    }

    static void partitionOfInteger(){
        List<Integer> list1 = new ArrayList<>(List.of(100,357,20,350,43));
        // if need seperate list
        System.out.println(list1.stream()
                .collect(Collectors.partitioningBy(n-> n%2 ==0))
                //.get(true)
                //.get(false)

        );
        // both as same list
        List<Integer> result =
                list1.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0))
                        .values()            // Collection<List<Integer>>
                        .stream()
                        .flatMap(List::stream)
                        .toList();
        System.out.println(result);
    }

    static void groupStringByLength(){
        List<String> value = new ArrayList<>(List.of("Java", "Python","String", "TypeScript", "Array", "Arraylist"));
        List <String > result=value.stream()
                .collect(Collectors.groupingBy(s -> s.length()))
                .values()            // Collection<List<Integer>> - only values no keys
                .stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(result);

    }
    static void divisibleBy3And5(){
        List<Integer> list1 = new ArrayList<>(List.of(50,100,25,300));
        list1.stream()
                .filter(n-> (n % 3==0) && (n % 5==0))
                .forEach(System.out::println);

    }

// Advanced problem

    static List<Employee> getEmployee(){
         return List.of(
                 new Employee("Aruna" , 500000, "BME", 25),
                new Employee("Bala" , 300000, "AIML",36),
                new Employee("Bharath" , 500000, "BME",29),
                new Employee("Arul" , 250000, "CSE",45),
                new Employee("Azeem" , 900000, "AD",22),
                new Employee("Arun" , 20000, "MECH",26),
                new Employee("Dharshana" , 50000, "CIVIL",65)
         );
    }
    static void salaryGreaterThan50000(){

         getEmployee().stream()
                 .filter(s-> s.getSalary()>50000)
                 .map(Employee::getName)
                 .forEach(System.out::println);
    }

    static void highestSalary(){
        System.out.println(getEmployee().stream()
                        .max(Comparator.comparing(Employee::getSalary)) // cant directly accept int value, only accepts Comparator
                .map(Employee::getName)
                .orElse("List Empty")
        );
    }

    static void groupEmployeeByDept(){
         Map<String,List<Employee>> empList = getEmployee().stream()
                 .collect(Collectors.groupingBy(Employee::getDepartment));
        empList.forEach((dep,emp)->
                System.out.println(
                        dep + " = "
                        +emp.stream()
                                .map(Employee::getName)
                                .collect(Collectors.toList())
                )

        );

    }

    static void salaryAvgByDept(){
        Map<String , Double> salaryAvg = getEmployee().stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

        salaryAvg.forEach((dpt, avg)->
                System.out.println(dpt+ " = "+avg));
    }

    static void sortEmpBySalary(){
         getEmployee().stream()
                 .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                 .map(Employee::getName)
                 .forEach(System.out::println);

    }

    static void filterByEmpAge(){
         getEmployee().stream()
                 .filter(e-> e.getAge()>= 25 && e.getAge() <=35)
                 .map(Employee::getName)
                 .forEach(System.out::println);
    }

    static void empInEachDpt(){
         System.out.println(getEmployee().stream()
                 .collect(Collectors.groupingBy(
                         Employee::getDepartment, Collectors.counting()
                 )));
    }
    static void frequentWord(){
         List<String > list = List.of("Java", "Python", "Java", "Typescript", "R", "Go","Java","R","R" );
         Map<Object, Long> freq =
                 list.stream()
                        .collect(Collectors.groupingBy(word->word, Collectors.counting()));

        System.out.println(freq.entrySet()
                 .stream()
                 .max(Map.Entry.comparingByValue()) //coz map entry don't implements comparator
                        .orElse(null)
        );

    }

    static void flattenList(){
         List<List<Integer>> listOfList = List.of(List.of(1,2,3,4), List.of(5,6,7,8));
         listOfList.stream()
                 .flatMap(list->list.stream())
                 .forEach(System.out::println);
    }

    static void duplicateElements(){
        List<String > list = List.of("Java", "Python", "Java", "Typescript", "R", "Go","Java","R","R" );
        Map<String,Long> freq=  list.stream()
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));

        freq.entrySet()
                .stream()
                .filter(e->e.getValue() >1)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        evenNumbers();
        upperCase();
        countElements();
        firstElementStartWithA();
        removeDuplicate();
        sortInt();
        sortString();
        maxNum();
        minNum();
        convertToString();
        sumAllElements();
        averageOfAllElements();
        lengthGreaterThan5();
        startWithVowel();
        squareEachNumber();
        secondLargestNumber();
        mergeAndRemoveDuplicates();
        partitionOfInteger();
        groupStringByLength();
        divisibleBy3And5();
        salaryGreaterThan50000();
        highestSalary();
        groupEmployeeByDept();
        salaryAvgByDept();
        sortEmpBySalary();
        filterByEmpAge();
        empInEachDpt();
        frequentWord();
        flattenList();
        duplicateElements();
    }
}