import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        System.out.println("Задание 1");
        MyCalculator.sum(5L, 5L);
        MyCalculator.multiply(5, 5.5);
        MyCalculator.substract(8.3, 4);
        MyCalculator.divide(8L, 0);
        System.out.println();
    }

    private static void ex2() {
        System.out.println("Задание 2");
        List<String> listOfStrings = Stream.of("один", "два", "три", "четыре").toList();

        List<Integer> listOfIntegers1 = Stream.of(1, 2, 2, 4).toList();
        CompareArrays<String, Integer> compareArrays1 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfStrings, listOfIntegers1);
        System.out.println(compareArrays1.compareArrays(listOfStrings, listOfIntegers1));

        List<Integer> listOfIntegers2 = Stream.of(2, 3, 4, 5).toList();
        CompareArrays<Integer, Integer> compareArrays2 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfIntegers2, listOfIntegers1);
        System.out.println(compareArrays2.compareArrays(listOfIntegers2, listOfIntegers1));

        List<Integer> listOfIntegers3 = Stream.of(1, 2, 2, 4, 5).toList();
        CompareArrays<Integer, Integer> compareArrays3 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfIntegers3, listOfIntegers1);
        System.out.println(compareArrays3.compareArrays(listOfIntegers3, listOfIntegers1));

        List<Object> listOfObjects1 = Arrays.asList(1, "два", 3, "четыре");
        CompareArrays<Object, Integer> compareArrays4 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfObjects1, listOfIntegers1);
        System.out.println(compareArrays4.compareArrays(listOfObjects1, listOfIntegers1));

        List<Object> listOfObjects2 = Arrays.asList(2, "три", 4, "пять");
        CompareArrays<Object, Object> compareArrays5 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfObjects1, listOfObjects2);
        System.out.println(compareArrays5.compareArrays(listOfObjects1, listOfObjects2));

        List<Object> listOfObjects3 = Arrays.asList(5, 6, 7, 8);
        CompareArrays<Object, Integer> compareArrays6 = new CompareArrays<>();
        System.out.printf("Результат сравнения %s и %s ", listOfObjects3, listOfIntegers1);
        System.out.println(compareArrays6.compareArrays(listOfObjects3, listOfIntegers1));

        System.out.println();
    }
    private static void ex3(){
        System.out.println("Задание 3");
        Pair<Integer, String> pair = new Pair<>(1, "два");
        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());
        System.out.println(pair);
        System.out.println();
    }

}
