package org.pierre.typeparameter;

public class MyTypeParameter {

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {2, 5, 1, 9 -4};
        int result = countGreaterThan(myArray, 3);
        System.out.println(result);
    }
}
