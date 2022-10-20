package Algorithms.searchingAlgorithms.binarySearch;


import java.util.Arrays;

public class BinarySearch {

    void searchBinary(int[] mylist, int target){

        /** sort item in an array first */
        Arrays.sort(mylist);

        /** declare points **/
        int startpoint = 0;
        int endpoint = mylist.length - 1;
        int midpoint = (startpoint + endpoint) / 2;

        /** loop through the list */
        while (startpoint <= endpoint){
            if (
                    mylist[midpoint] < target
            ) {
                startpoint = midpoint + 1;
            } else if (
                    mylist[midpoint] == target
            ) {
                String position = Integer.toString(midpoint);
                String s = String.format("the target was found at %s",position);
                System.out.println(s);
                break;
            } else {
                endpoint = midpoint - 1;
            }
            midpoint = (startpoint + endpoint) / 2;
            if (midpoint == endpoint && mylist[midpoint] != target) {
                System.out.println("target not found");
                break;
            }

        }


    }
    public static void main (String[] args) {
        BinarySearch mySearchInstance = new BinarySearch();
        int[] mylist = new int[]{0, 4, 5, 23, 1};

        mySearchInstance.searchBinary(mylist,73);
    }
}
