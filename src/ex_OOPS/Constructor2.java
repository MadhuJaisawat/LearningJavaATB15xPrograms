package ex_OOPS;

public class Constructor2 {
    public static void main(String[] args) {
        cat c= new cat();
        cat c1=new cat("lucy");
        cat c2=new cat("tossi");
        
    }

}
class cat{
    String name;
    cat(){
        System.out.println("Default Constructor");
    }
    cat(String nameGiven){
        this.name=nameGiven;
        System.out.println("parametric constructor"+nameGiven);

    }

    void running(){
        int a=10;//local variable
        System.out.println("This will be called "+this.name);
    }
}

