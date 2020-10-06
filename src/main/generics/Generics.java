package main.generics;

public class Generics {

//    public static void main(String[] args) {
//        Integer array1[] = {3, 2, 1};
//        findMax(array1);
//
//        Integer array2[] = {1, 3, 2};
//        findMax(array1);
//
//        Integer array3[] = {1, 2, 3};
//        findMax(array1);
//    }

    public Integer findMax(Integer[] array) {
        Integer maxInt = array[0];
        if(array[1].compareTo(maxInt)>0)
            maxInt=array[1];
        if(array[2].compareTo(maxInt)>0)
            maxInt=array[2];

        System.out.println(maxInt);
        return maxInt;
    }
}
