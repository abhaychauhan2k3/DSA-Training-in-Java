public class countzero {
    static void count( int num){
        int count = 0; 
        if(num == 0 ){
            System.out.println(count + 1);
            return ;
        }
        int lastDigit = num%10;
        if(lastDigit == 0 ){
            count++;
        }
        count(num/10);
       }
    public static void main(String[] args) {
        int num =2021022;
        count(num);
    }    
}
