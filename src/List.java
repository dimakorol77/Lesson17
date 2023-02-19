import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        // создаем список и заполняем его на 10 элементов
        java.util.List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // выводим содержимое списка на экран с помощью итератора
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
