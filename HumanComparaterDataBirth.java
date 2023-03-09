

import java.util.Comparator;

public class HumanComparaterDataBirth  implements Comparator<Human>  {
    @Override
    public int compare(Human o, Human o1) {
        return o.getDateBirth().compareTo(o1.getDateBirth());

    }

}