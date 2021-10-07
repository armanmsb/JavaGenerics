import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class FixedSizedList <T> implements Iterable<T>{

    private List<T> items = new ArrayList<T>();

    public void add(T element){

        if(items.size() >= 5){
            System.out.println("Maximum erreicht");
        }else if(element == null){
            System.out.println("Übergebener Wert entspricht NULL");
        }else{
            items.add(element);
        }
    }


    public void remove(T element){

        boolean succesfullyRemoved = false;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(element)){
                items.remove(i);
                succesfullyRemoved = true;
            }
            }
        if(!succesfullyRemoved){
            System.out.println("Element nicht vorhanden");
        }
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



