package main.generics;

public class Generics {
    // Function to find maximum in a Integer Array
    public Integer findMax(Integer[] array) {
        Integer maxInt = array[0];
        if(array[1].compareTo(maxInt)>0)
            maxInt=array[1];
        if(array[2].compareTo(maxInt)>0)
            maxInt=array[2];

        System.out.println(maxInt);
        return maxInt;
    }

    // Function to find maximum in a String Array
    public Float findMaximumFloat(Float[] numbers) {
        Float maxFloat=numbers[0];
        if(numbers[1].compareTo(maxFloat)>0)
            maxFloat=numbers[1];
        if(numbers[2].compareTo(maxFloat)>0)
            maxFloat=numbers[2];

        return maxFloat;
    }
}
