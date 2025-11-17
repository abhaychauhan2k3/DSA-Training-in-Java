public class recursion {
    static int power(int num , int pow){
        if ( pow == 0 ){
            //time to prepare the result 
            return 1;
        }
        int smallResult = power(num , pow -1);
        int result = smallResult*num;
        return result;
    }    
    public static void main(String[] args) {
        int num = 2;
        int pow = 5;
        System.out.println(power(num, pow));
    }
    
}
//return based questions mai stack se aate time(pop) result bnega
//void based que mai stack mai push krte time result bnega 
