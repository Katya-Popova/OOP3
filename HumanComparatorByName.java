import java.util.Comparator;;

public class HumanComparatorByName implements Comparator<Human> {
    @Override
    public int compare(Human o, Human o1) {
        return o.getName().compareTo(o1.getName());

    }

}
