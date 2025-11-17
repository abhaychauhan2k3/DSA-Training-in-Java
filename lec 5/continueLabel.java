public class continueLabel {
    public static void main(String[] args) {
        abcd:
        for(int i = 1 ; i<=3 ; i++){
            for(int j = 1 ; j<=3 ; j++){
                if(i == j){
                    continue abcd; //similar to the goto in cpp
                }
                if(i == 3){
                    break abcd;
                }
                System.out.println(i + " " + j);
            }
        }
    }    
}
