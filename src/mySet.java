/** Import HashMap class */
import java.util.HashMap;
/** Import important interface */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class mySet<E> implements Set<E>{
    HashMap<E, Boolean> hmap = new HashMap<>();

    @Override
    public int size() {
        return hmap.size();
    }

    @Override
    public boolean isEmpty() {
        return hmap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hmap.containsKey(o);
    }


    @Override
    public Iterator<E> iterator() {
        return hmap.keySet().iterator();
    }

    @Override
    public boolean add(E e){
        return hmap.put(e,true) == null;
    }

    @Override
    public boolean remove(Object o){
        return hmap.remove(o) != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return hmap.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            modified |= add(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return hmap.keySet().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return hmap.keySet().removeAll(c);
    }

    @Override
    public void clear() {
        hmap.clear();
    }

    @Override
    public Object[] toArray() { // Default Value
        return hmap.keySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) { // Default Value
        return hmap.keySet().toArray(a);
    }

}
