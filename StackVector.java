import java.util.ArrayList;

public class StackVector<T> implements Stack<T>{

    public ArrayList<T> lista = new ArrayList<T>();

    //Metodo para meter elementos
    public void Push(T info){
        lista.add(info);
    }

    public T Pop(){
        int index = lista.size()-1;

        T elemento = lista.get(index);
        lista.remove(index);
        return elemento;
    }
    
    public boolean Empty(){
        return lista.isEmpty();
    }

    public T Peek(){
        int index = lista.size() - 1;
        return lista.get(index);
    }

    public int Size(){
        return lista.size();
    }
}