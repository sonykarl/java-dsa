package Algorithms.linearSearch;

public class LinearSearch {

    void searchLinearly(String[] mylist, String target){
        int i ;
        int endpoint = mylist.length -1 ;
        for (i = 0; i < mylist.length; i++){
            if(mylist[i] == target){
                String s = String.format("the position is at %s as per method one", i);
                System.out.println(s);
                break;
            }
            if (i == endpoint && target != mylist[i]){
                System.out.println("item not found");
                break;
            }



        }

        /** method two */
        for (String listitem: mylist){
            if (listitem == target){
                String s = String.format("the position is at %s for method two", i);
                System.out.println(s);
                break;
            }

            if (i == endpoint && target != mylist[i]){
                System.out.println("item not found");
                break;
            }
        }
    }
    public static void main(String[] args){
        String[] mylist = {"cow", "goat","pig","dog","chicken","penguin"};
        LinearSearch myLinearInstance = new LinearSearch();
        myLinearInstance.searchLinearly(mylist, "dog");
    }
}
