public class printPower{
    static String power(int num , int range , String result){
        //base case 
        if (range == 0){
            return result ;
        }
        //recursion call 
        String smallResult = power(num , range-1 , result);

        //POP logic
        String exp = num + "^" + range + " = " + (int)Math.pow(num, range);
        return smallResult + exp + "\n";
    }
    public static void main(String[] args) {
        System.out.println(power(2,3,""));
    }
}