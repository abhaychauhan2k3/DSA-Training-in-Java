public class leapYear {
    public static void main(String[] args) {
        //logic is :
        /*
         every 4th year is a leap year 
         century years are not leap year 
         century years which comes in every 400 year is a leap year 
         */
        int year = 2024;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Its a Leap Year");
                }
                else {
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}

//Grading system -> if-else used ✔️