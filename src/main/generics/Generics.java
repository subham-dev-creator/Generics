package main.generics;

import java.util.*;

public class Generics<T extends Comparable<T>> {
    List<T> list = new ArrayList<>();

    public Generics(T... parameters) {
        for (T t : parameters)
            this.list.add(t);
    }
    public T findMaxGeneric() {
        return Generics.findMaxGeneric(list);
    }

    // Generic Function to compute maximum in an Array of 3 ojects
    public static <T extends Comparable<T>> T findMaxGeneric(List<T> list) {
        try{
           return (T) Collections.max(list);
        }
        catch (NoSuchElementException e){
            return null;
        }
    }
}
