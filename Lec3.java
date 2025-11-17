public class Lec3 {
    int h2; //instance variable -> need an object to access it
    static int h1; //class variable -> can be accessed directly in static methods
    public static void main(String[] args) {
    //Constants 
  //  final int MAX = 100; //by convention constants are written in uppercase letters
    //value of MAX cannot be changed 
   // byte e = 130; //compile time error because byte can store values from -128 to 127 only
    //but
    byte e = (byte)130; //circular way mai rotate hojayega and value stored will be -126 
    System.out.println(e);

    //class variable
    System.out.println(h1);
    //instance variable
    Lec3 obj = new Lec3();
    System.out.println(obj.h2);

    //maximujm value of integer 
    System.out.println(Integer.MAX_VALUE);

    //ARRAY
    int arr[] = {10,20,30,40}; //arr has address of the array //REFERENCE TYPE
    System.out.println(arr); //prints hashcode of array
   // int b[] = arr; //both points to the address of array (Mutable)

   
//there is no term as garbage values in java .

//local variables must be initialized before use in java .but class variables get default values if not initialized explicitly.(0)

//keywords - Class 
//int - Integer
//byte - Byte
//short - Short
//long - Long
//float - Float
//double - Double
//char - Character
//boolean - Boolean
    // double nn = 10.5; //data only
    // Double mm = 20.5; //data + methods (wrapper class)/(helper methods)
    // int b2 = mm.intValue();
    // System.out.println(b2); 


    String n = "abhay".intern(); //string literals //intern() method checks in string pool if the string is already present or not 
    String m = "abhay"; // string pool mai check krega agr pehle se hai to new memory allocate nhi krega
    System.out.println(n==m); //true //compares addresses not values 

    String a = new String("abhay"); //heap memory mai new object bnayega 
    //but if 
    String c = new String("abhay").intern(); //ab intern() use krne se string pool mai check krega agr pehle se hai to new memory allocate nhi krega
    System.out.println(a==n); //false
    System.out.println(c==n); //true

    //string is immutable , and for every change a new string is created 
    //to make a string mutable or you want to make more changes use StringBuilder or StringBuffer
    //StringBuilder sb = new StringBuilder("hello"); - use StringBuilder more 
    //StringBuffer is legacy class
    System.out.println("*******************");
    StringBuilder sb1 = new StringBuilder();
    System.out.println(sb1.capacity());
    System.out.println(sb1.length());
    StringBuilder sb = new StringBuilder("abhay");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("bhsvhbdjbjdbhjhbdcjnnd");
    //when length > capacity , a new capacity created by formula old_cap * 2 + 2
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    

    //Big Types
    

} 
}
