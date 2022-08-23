package DataStructures.arrays;

import java.util.Arrays;

public class Two2DArray {
    public static void main(String[] args) {
        int[][] my2darray = new int[][]{{1,2},{3,4}};
        var mystring  = Arrays.stream(my2darray).toString();
        System.out.println(mystring);
    }
}
