import java.util.List;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
 * элементы одного типа по парно. (используйте instanceof)
 * @param <T> тип данных
 * @param <V> тип данных
 */
public class CompareArrays <T, V> {
    public boolean compareArrays(List<T> list1, List<V> list2){
        if (list1.size() == list2.size()){
            for(int i = 0; i < list1.size(); i++){
                if(!list1.get(i).getClass().isInstance(list2.get(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
