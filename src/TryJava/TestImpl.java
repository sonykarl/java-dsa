package TryJava;

public class TestImpl {

    Test mytest = new Test("asfuck");
    public void tester(){
        String mystring = mytest.myfun();
        System.out.println(mystring);
    }

    public static void main(String[] args) {

        MyDataClass dataClass = new MyDataClass("cow","goat",12);
        DbClass dbClass = new DbClass("firstname", "minodi");
        TestImpl mytestIpl = new TestImpl();
        mytestIpl.tester();
        System.out.println(dataClass.firstName);
    }

}
