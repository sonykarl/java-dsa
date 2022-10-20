package Algorithms.SortingAlgorithms.bubblesort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public void sort(List<Integer> array) {

        for (int i = 0; i < array.size(); i++){
            for (int j = 1; j< array.size(); j++) {
                if (array.get(j) < array.get(j - 1)) {
                    var temp = array.get(j);
                    array.set(j, array.get(j - 1));
                    array.set(j - 1, temp);
                }
            }
        }

        System.out.println(array);
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(4);
        myArray.add(3);
        myArray.add(2);
        myArray.add(8);
        myArray.add(5);

        bubbleSort.sort(myArray);
    }
}


