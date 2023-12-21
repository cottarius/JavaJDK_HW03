/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class MyCalculator {
    /**
     * Метод СЛОЖЕНИЯ двух чисел разного типа
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param <F> тип данных
     * @param <S> тип данных
     */
    public static <F extends Number, S extends Number> void sum(F firstNumber, S secondNumber) {

        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            System.out.println(firstNumber.doubleValue() + secondNumber.doubleValue());
        } else if (firstNumber instanceof Float || secondNumber instanceof Float) {
            System.out.println(firstNumber.floatValue() + secondNumber.floatValue());
        } else if (firstNumber instanceof Long || secondNumber instanceof Long) {
            System.out.println(firstNumber.longValue() + secondNumber.longValue());
        } else {
            System.out.println(firstNumber.intValue() + secondNumber.intValue());
        }
    }

    /**
     * Метод УМНОЖЕНИЯ двух чисел разного типа
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param <F> тип данных
     * @param <S> тип данных
     */
    public static <F extends Number, S extends Number> void multiply(F firstNumber, S secondNumber){
        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            System.out.println(firstNumber.doubleValue() * secondNumber.doubleValue());
        } else if (firstNumber instanceof Float || secondNumber instanceof Float) {
            System.out.println(firstNumber.floatValue() * secondNumber.floatValue());
        } else if (firstNumber instanceof Long || secondNumber instanceof Long) {
            System.out.println(firstNumber.longValue() * secondNumber.longValue());
        } else {
            System.out.println(firstNumber.intValue() * secondNumber.intValue());
        }
    }

    /**
     * Метод ВЫЧИТАНИЯ двух чисел разного типа
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param <F> тип данных
     * @param <S> тип данных
     */
    public static <F extends Number, S extends Number> void substract(F firstNumber, S secondNumber){
        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            System.out.println(firstNumber.doubleValue() - secondNumber.doubleValue());
        } else if (firstNumber instanceof Float || secondNumber instanceof Float) {
            System.out.println(firstNumber.floatValue() - secondNumber.floatValue());
        } else if (firstNumber instanceof Long || secondNumber instanceof Long) {
            System.out.println(firstNumber.longValue() - secondNumber.longValue());
        } else {
            System.out.println(firstNumber.intValue() - secondNumber.intValue());
        }
    }

    /**
     * Метод ДЕЛЕНИЯ двух чисел разного типа
     * @param firstNumber первое число
     * @param secondNumber второе число
     * @param <F> тип данных
     * @param <S> тип данных
     */
    public static <F extends Number, S extends Number> void divide(F firstNumber, S secondNumber) {
        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            System.out.println(firstNumber.doubleValue() / secondNumber.doubleValue());
        } else if (firstNumber instanceof Float || secondNumber instanceof Float) {
            System.out.println(firstNumber.floatValue() / secondNumber.floatValue());
        } else if (firstNumber instanceof Long || secondNumber instanceof Long) {
            try {
                System.out.println(firstNumber.longValue() / secondNumber.longValue());
            } catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }
        } else {
            try {
                System.out.println(firstNumber.intValue() / secondNumber.intValue());
            } catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }

        }
    }
}
