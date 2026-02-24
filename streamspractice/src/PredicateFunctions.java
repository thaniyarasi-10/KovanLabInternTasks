import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;

public class PredicateFunctions {

    //takeWhile()- takes elements until the condition fails, once failed it will not consider the elements after that
    static void elementIspositive(){
        List<Integer> list = List.of(2,3,4,5,6,-1,-2);
        list.stream()
                .takeWhile(n-> n>0)
                .forEach(System.out::println);

    }

    static void salaryGreaterThan50000(){
        List<Integer> salary = new ArrayList<>(List.of(35000,45000,49000,50000,90000,87000,300000,500000));
        salary.stream()
                .takeWhile(n->n<=50000)
                .forEach(System.out::println);
    }

    static void wordLengthLessThan4(){
        List <String> list= List.of("R","C","Go","Java", "Python", "TypeScript");
        list.stream()
                .takeWhile(s->s.length()<=4)
                .forEach(System.out::println);
    }

    static void tempLessThan35(){
        List<Integer> temp = List.of(23,25,27,35,42,52);
        temp.stream()
                .takeWhile(t->t<=35)
                .forEach(System.out::println);
    }

    //dropWhile() - drops all the elements if the condition is true, once it fails it takes all the elements after that

    static void dropElementsLessThan10(){
        List<Integer> element = List.of(1,3,5,7,9,10,11,15,18,20);
        element.stream()
                .dropWhile(n->n<10)
                .forEach(System.out::println);
    }

    static void dropLeadingZeroes(){
        List<Integer> elements = List.of(0,0,0,5,1,0,3,7);
        elements.stream()
                .dropWhile(n -> n == 0)
                .forEach(System.out::print);
    }

    static void dropStringStartWithTemp(){
        List<String> list = List.of("tempFile1", "tempData", "tempConfig", "report.txt","summary.doc", "tempBackup");
        list.stream()
                .dropWhile(s->s.startsWith("temp"))
                .forEach(System.out::println);
    }

    class Log {
        double time;
        String status;

        Log(double time, String status) {
            this.time = time;
            this.status = status;
        }

        double getTime() {
            return time;
        }

        String getStatus() {
            return status;
        }
    }
     void logEntries(){
        List<Log> logs = List.of(
                new Log(10.45, "INIT"),
                new Log(10.50, "INIT"),
                new Log(10.55, "ACTIVE"),
                new Log(11.00, "ERROR")
        );

        logs.stream()
                .dropWhile(log ->log.getStatus()=="INIT")
                .forEach(log ->
                    System.out.println(log.getTime() + ": "+ log.getStatus())

                );
    }

    static void anyEvenNbr(){
        List<Integer> num= List.of(1,2,3,4,5,6);
        System.out.println(num.stream()
                .anyMatch(n-> n%2==0));
    }

    static void negativeInteger(){
        List<Integer> num= List.of(1,2,3,4,5,6);
        System.out.println(
                num.stream()
                        .anyMatch(n-> n<0)
        );
    }

    static void startsWithA(){
        List<String > value=List.of( "R", "Go", "Java","Angular");
        System.out.println(
                value.stream()
                        .anyMatch(s->s.startsWith("A"))
        );
    }

    static void salaryGreaterThan100000(){
        List<Integer> salary = List.of(10000,50000,100000,250000,500000);
        System.out.println(
                salary.stream()
                        .anyMatch(s->s >100000)
        );
    }

    static void allNumberPositive(){
        List<Integer> num= List.of(1,2,3,4,5,-6);
        System.out.println(
                num.stream()
                        .allMatch(n-> n<0)
        );
    }

    static void ageAbove18(){
        List<Integer> age= List.of(18,22,35,43,52,60);
        System.out.println(
                age.stream()
                        .allMatch(n-> n>=18)
        );
    }

    static void noNumIsZero(){
        List<Integer> num= List.of(1,2,3,4,5,-6);
        System.out.println(
                num.stream()
                        .noneMatch(n-> n==0)
        );
    }

    static void noStringIsEmpty(){
        List<String > value=List.of( "R", "Go", "Java","Angular","");
        System.out.println(
                value.stream()
                        .noneMatch(s->s.isEmpty())
        );
    }

    public static void main(String[] args) {
        elementIspositive();
        salaryGreaterThan50000();
        wordLengthLessThan4();
        tempLessThan35();
        dropElementsLessThan10();
        dropLeadingZeroes();
        dropStringStartWithTemp();
        PredicateFunctions predicateFunctions= new PredicateFunctions();
        predicateFunctions.logEntries();
        anyEvenNbr();
        negativeInteger();
        startsWithA();
        salaryGreaterThan100000();
        allNumberPositive();
        ageAbove18();
        noNumIsZero();
        noStringIsEmpty();
    }
}
