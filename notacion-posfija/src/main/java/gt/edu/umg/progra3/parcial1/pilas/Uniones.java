package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;

public class Uniones implements Pila{

    private List<String> union  = new ArrayList<>();

    @Override
    public void push(String item) {
        union.add(item);
    }

    @Override
    public String pop() {
        return union.remove(union.size()-1);
    }

    @Override
    public String peek() {
        return union.remove(union.size()-1);
    }

    @Override
    public int size() {
        return union.size();
    }

    @Override
    public boolean isEmpty() {
        return union.isEmpty();
    }
}
