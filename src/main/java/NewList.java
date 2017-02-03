import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Antoine on 03.02.2017.
 */
public class NewList implements Cloneable {
    List<Object> list = new ArrayList<Object>();

    public NewList(List<Object> list) {
        this.list = list;
    }

    public NewList() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewList newList = (NewList) o;

        return list != null ? list.equals(newList.list) : newList.list == null;

    }

    @Override
    public int hashCode() {
        return list != null ? list.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NewList{" +
                "list=" + list +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public List<Object> unmodifiableList() {
        System.out.println("Done");
        return Collections.unmodifiableList(list);
    }
}
