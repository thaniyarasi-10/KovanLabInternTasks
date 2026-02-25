import java.util.*;

public class ComparatorFunctions {

    static void sortInDescOrder() {
        List<Integer> num = List.of(1, 2, 3, 4, 5, -6);
        num.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    class Student {
        double marks;
        int age;

        Student(double marks, int age) {
            this.marks = marks;
            this.age = age;
        }

        public double getMarks() {
            return marks;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "marks=" + marks + ", age=" + age;
        }
    }

    void sortByMarkAndAge() {
        List<Student> list = List.of(
                new Student(99, 19),
                new Student(93, 19),
                new Student(79, 18),
                new Student(89, 20),
                new Student(100, 23)
        );
//        List<Integer> num= new ArrayList<>(Set.of(1,1,2,3,4,4,5)); shows IllegalArgumentException - because of duplicate values
//        Set<Integer> set= new HashSet<>(List.of(1,1,2,3,4));
//        System.out.println(set);
//        System.out.println(num);
        list.stream()
                .sorted(Comparator.comparingDouble((Student s) -> s.marks).reversed() //giving type  once is enough for java to understand
                        .thenComparingInt(s -> s.age))
                .forEach(System.out::println);

    }

    static void longestString() {
        List<String> value = List.of("R", "Go", "Java", "Angular", "");
        System.out.println(
                value.stream()
                        .max(Comparator.comparing(String::length))
                        .orElse(null)
        );
    }

    class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    void maxPrizeProduct() {
        List<Product> list = List.of(
                new Product("Apple", 100),
                new Product("Banana", 50),
                new Product("Mango", 150),
                new Product("Berries", 200)

        );
        list.stream()
                .max(Comparator.comparingDouble((Product n) -> n.price))
                .stream().map(Product::getName)
                .forEach(System.out::println);
    }

    static void shortestString() {
        List<String> value = List.of("R", "Go", "Java", "Angular", "");
        System.out.println(
                value.stream()
                        .min(Comparator.comparing(String::length))
                        .orElse(null));
    }

    class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ": " + salary;
        }
    }

    void employeeWithLowestSalary() {
        List<Employee> employees = List.of(
                new Employee("Ravi", 50000),
                new Employee("Anu", 45000),
                new Employee("Kumar", 60000),
                new Employee("Meena", 40000)
        );

        Employee lowestPaid =
                employees.stream()
                        .min(Comparator.comparingDouble(e -> e.salary))
                        .orElse(null);

        System.out.println(lowestPaid);
    }


    public static void main(String[] args) {
        sortInDescOrder();
        ComparatorFunctions comparatorFunctions = new ComparatorFunctions();
        comparatorFunctions.sortByMarkAndAge();
        longestString();
        comparatorFunctions.maxPrizeProduct();
        shortestString();
        comparatorFunctions.employeeWithLowestSalary();

    }
}
