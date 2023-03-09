
import java.util.Comparator;

public class FamilyComparatorAge implements Comparator<Human> {
   @Override
   public int compare(Human o, Human o1) {
      return Integer.compare(o.getAge(), o1.getAge());

   }
}
