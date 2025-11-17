import java.util.ArrayList;

public class enhancedFor {
    public static void main(String[] args) {
        // int arr[] = {10,20,30,40};
        // //enhanced for loop 
        // for(int i : arr){
        //     System.out.println(i);
        // }

        //dynamic array -> ArrayList<datatype> name = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        for(int i : arr){
            System.out.println(i);
        }
    }    
}
//forEach and enhanced for loop is different.