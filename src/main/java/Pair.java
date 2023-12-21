/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
 * getFirst(), getSecond() для получения значений каждого из составляющих пары, а также переопределение метода
 * toString(), возвращающее строковое представление пары. Работу сдать в виде ссылки на гит репозиторий
 * @param <T> тип данных
 * @param <V> тип данных
 */
public class Pair <T, V> {
    private final T firstValue;
    private final V secondValue;

    public Pair(T firstValue, V secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
