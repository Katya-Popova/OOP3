import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public  class FamilyIterator implements Iterator<Human>{
    private int index;
    private List<Human> humanList;

    public FamilyIterator(List<Human> humanList){
        this.humanList=humanList;
    }
    @Override
    public boolean hasNext() {
        
        return humanList.size()>index;
    }@Override
    public Human next() {
        return humanList.get(index++);
    }


   
}
