package service;

import java.util.ArrayList;
import java.util.List;

// T pode ser o nome que eu quiser, porem tem que usar esse nome em todo o restante da aplicação
public class PrintService<T>{

    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        // metodo get() padrão java;
        return list.get(0);
    }

    public void print(){
        System.out.println(" [");
        if (!list.isEmpty()){
            System.out.println(list.get(0));
        }
        for (int i = 1; i < list.size(); i++){
            System.out.println(", " + list.get(i));
        }
        System.out.println(" ]");
    }

}
