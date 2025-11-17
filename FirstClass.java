//file name and class name should be same because while compile we have to write the file name (as javac filename.java) and while runnig we have to write the class name (as java classname)
//after the compiilation a .class file will be generated with the class name which carry the byte code 
public class FirstClass //if we are defining the class as public then it is mandatory to have the file name same as class name
{
    public static void main(String args[])//why static ?  //public keyword make the access of this main method outside the folder 
    //different signatures of the main method
    //static public void main(String args[])
    //public static void main(String[] args)
    //public static void main(String... args) //varargs(n number of arguments)
     
    {
        System.out.println("Hello World"); //out is predefined object and System is a class , System has 3 object in , out , error 
    }
}
 //can we change the signature of main method ? 
 //can we make more than one main method in a class ?
 
 /*
  Yes we can change the signature of the main method ( public static int main() or psv custom()),
  etc but it is not recognised by the java compiler and java virtual machine , so in order to change
  the signature of main method we can create multiple main methods i.e. overloading of main method 
  (ps void main(String args[]) or ps int main(String args[]) or psvm(int x)), but jvm uses the standard psvm as the entry point.
  
  //here is POLYMORPHISM, multiple main methods with diff signatures 
  
  another method to acheive this is -> 
  public static void customMain(){
    }
  public static void main(){
    customMain()  
  } 
*/


//class scope is either public or default (within the package)

//real life example of polymorphism -> in amazon we have a search function, where we can search brand wise, prize wise, or both ,, i.e. search function has multiple forms(search function is overloaded)


//name of class should be written in Pascal case (FirstClass, HelloWorld etc) and variables and methods should be written in camel case (firstClass, helloWorld etc)