//import java.math.BigInteger;

public class Lec2Abc {
    public static void main(String[] args) {
        //variables - can store vary values
        // int a = 10; //explicit
        // var b0 = 20; //type inference feature of java //based on value complier automatically decides the type of b as int 

     
//Datatype -> Primitive(value/primary/Immutable(copy can be formed)) and Non-Primitive(secondary/reference/Mutable)

//Datatypes -> 
//1)Non-Decimal -> byte(1 byte / 8 bits / -2^7 to 2^7 -1), short(2 bytes/16 bits / -2^15 to 2^15 -1), int(4 bytes), long(8 bytes)
        // byte age = 25; //byte Literal
        // short year = 2024;
        // int population = 100000;
        // long distance = 15000000000L; //suffix L or l for long //long literal
        //long out_of_range = 65555125556555455485L;
        // //so to handle such large values we can use BigInteger class from java.math package
        // BigInteger b = new BigInteger("65555125556555456651554255485"); 
        // BigInteger b2 = new BigInteger("123456789012345678901234567890");
        // BigInteger sum = b.add(b2);
//2)Decimal -> float(4 bytes), double(8 bytes)

        //float x = 10.5; //by default decimal values are treated as double so we have to explicitly mention float with f or F
        // float x = 10.5f;
        // float z = (float)20.5; //type casting
        // double y = 20.5; //no need to explicitly mention anything for double

//3)Character -> char(2 bytes) -> UNICODE(supports multiple languages ) / Cpp works on ASCII code.
        //System.out.println("हैलो जावा"); //UNICODE example
//4)Boolean -> boolean(1 bit) -> true/false

//sandboxes are created when we run code in java (java apna ek process bna lega) -> some part of cpu is allocated to it . 
//process - Cpu and Memory 
//process has threads -> and per thread one stack is formed .
//Memory - Stack and Heap

//objects fall into heap .
//methods and local variables fall into stack .

/*when we call the main fxn -> process created -> process has threads -> main thread runs main fxn 
-> main fxn goes to stack with its all local variables -> when main fxn ends all its variables destroyed*/

//there is no term as global variables in java .



//arrays 
int prices[] = {10,20,30};
int prices2[] = prices; //shallow copy -> both prices and prices2 point to same memory location

//if we change in the prices2, prices will also change because prices2 is pointing to the  same memory loacation as prices
prices2[0] = 100;
System.out.println(prices[0]);
  
//to print hashcode of array 
System.out.println(prices);
  } 
}