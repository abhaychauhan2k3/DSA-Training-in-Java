public class swapFirstLast {
    public static void main(String[] args) {
        int num = 72456;
        int count =0 ;
        int copy= num;
    
        //1) finding first digit and removing it 
        //1.1) finding count
        while ( copy > 0){
            count++;
            copy = copy / 10;
        }
        //1.2) finding first digit 
        int firstDigit = num / (int)Math.pow(10,count-1);
        //1.3) removing firstdigit
        int newNum = num % (int)Math.pow(10,count-1);

        //2) finding last digit and removing it 
        int lastDigit = newNum%10;
        int newNum1 = newNum/10;

        //3)
        int x = newNum1 * 10 + firstDigit;
        int y = lastDigit*(int)Math.pow(10,count-1);
        int finalNum = y + x;
        System.out.println("the number after swapping is :"+finalNum);  
    }
}
