public class printTable {
    // static void printtable(int num , int range){
    //     if(range == 0){
    //         return;
    //     }
    //     printtable(num, range-1);
    //     System.out.println(num + " x " + range + " = " + num*range );
    // }
    // public static void main(String[] args){
    //     printtable(5, 10);
    // }

    static void printtable(int num , int range , String result){
        if(range == 0){
            System.out.println(result);
            return;
        }
        String exp = num + " x " + range + " = " + num*range;
        printtable(num, range-1,exp+"\n"+result); // .....swap res and exp position .....
    }
    public static void main(String[] args){
        printtable(5, 10 , "");
    }
}
