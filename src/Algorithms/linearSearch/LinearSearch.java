package Algorithms.linearSearch;

public class LinearSearch {

    void searchLinearly(String[] mylist, String target){
        int i ;
        for (i = 0; i < mylist.length; i++){
            if(mylist[i] == target){
                String s = String.format("the position is at %s", i);
                System.out.println(s);
            }

        }
    }
    public static void main(String[] args){
        String[] mylist = {"cow", "goat","pig","dog","chicken","penguin"};
        LinearSearch myLinearInstance = new LinearSearch();
        myLinearInstance.searchLinearly(mylist, "dog");
    }
}
