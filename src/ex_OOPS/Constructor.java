package ex_OOPS;

public class Constructor {
    public static void main(String[] args){
       // DummyCons a;
        //in this condition constructor will not be called until we initiatize object
        DummyCons a = new DummyCons();
        //this is first type of constructor- doesn't have any args not return.
        //it will automatically created if we don't create.we can call two ways ,either using separate
        //class or using in same file
        A test=new A();
        mySQL s=new mySQL();
    }
}
class A {
    A() {
        System.out.println("Default constructor.will be called while creating object");
    }
}

    class mySQL{
        mySQL(){
            System.out.println("MY SQL connected");
        }
    }



