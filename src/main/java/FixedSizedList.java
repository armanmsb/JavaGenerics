import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class FixedSizedList <T> implements Iterable<T>{

    private List<T> items = new ArrayList<T>();

    public boolean add(T element){

        if(items.size() > 5){
            System.out.println("Maximum erreicht");
            return false;
        }else if(element == null){
            System.out.println("Übergebener Wert entspricht NULL");
            return false;
        }else{
            items.add(element);
            return true;
        }
    }


    public boolean remove(T element){

        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(element)){
                items.remove(i);
                return true;
            }
        }

        return false;
    }

    public T get(int index){
        return items.get(index);
    }

    public int size(){
        return items.size();
    }

    public boolean contains(T element){

        return items.contains(element);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        items.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }
}



