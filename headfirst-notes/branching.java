
public class branching {
    public static void main(String[] args){
    int x = 10; 
    String name= "Dirk"; 
    if (x ==10){
        System.out.println("x = 10");
    }else{
        System.out.println("x != 10");
    }
    if ((x<3) & (name.equals("Dirk"))){
        System.out.println("Gently");
    }
    System.out.println("this line runs no matter what");
    }
}
