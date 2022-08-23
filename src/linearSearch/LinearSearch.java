package linearSearch;

public class LinearSearch {

    void searchLinearly(String[] mylist){
        int i ;
        for (i = 0; i < mylist.length; i++){
            System.out.println(mylist[i]);
        }
    }
    public static void main(String[] args){
        String[] mylist = {"cow", "goat","pig","dog","bitch","penguin"};
        LinearSearch myLinearInstance = new LinearSearch();
        myLinearInstance.searchLinearly(mylist);
    }
}
