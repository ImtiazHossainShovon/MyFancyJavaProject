class Singleton {  
    //Eager Loading Singleton object
    private static Singleton obj = null;  

    private Singleton() {  
        obj = new Singleton();  
    }  
  
    public static Singleton getInstance() {  
        return obj;  
    }  
}  
public class CsharpCorner {  
    public static void main(String[] args) {  
        Singleton c1 = Singleton.getInstance();  
        Singleton c2 = Singleton.getInstance();  
    }  
}  