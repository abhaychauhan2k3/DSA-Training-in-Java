package lec7;

public class recursion {
    //Methods basics 
    //when we call a function , it push itno stack along with its locla vriables 
    static void show(int x, int y){ //no object is needed 
        System.out.println("I am Static method " + x +" "+ y);

    }
    void non_static(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        show(1,3);
        recursion obj = new recursion();
        obj.non_static();
    }
}
