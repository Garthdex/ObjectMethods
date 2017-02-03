import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antoine on 03.02.2017.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Object> list = new ArrayList<Object>();
        List<Object> list2 = new ArrayList<Object>();
        list.add(1);
        list2.add(1);

        NewList list3 = new NewList(list);
        NewList list4 = new NewList(list2);

        NewList list5 = (NewList) list3.clone();

        list4.unmodifiableList();

        System.out.println(list3.hashCode() + "" + list4.hashCode());
        System.out.println(list3.equals(list4));
        System.out.println(list3.equals(list5));
        System.out.println(list3.toString());

    }
}
