package TryJava;

public class Test {

    private String myString;

    public Test(String cowpeas){
        this.myString = cowpeas;
    }
    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public String myfun(){
        return  this.myString;
    }
}
