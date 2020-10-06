package main.generics;

public class Generics {
    // Generic Function to compute maximum in an Array of 3 ojects
    public <T extends Comparable<T>> T findMaxGeneric(T[] array) {
        T maxInt = array[0];
        if (array[1].compareTo(maxInt) > 0)
            maxInt = array[1];
        if (array[2].compareTo(maxInt) > 0)
            maxInt = array[2];
        System.out.println(maxInt);
        return maxInt;
    }
}
