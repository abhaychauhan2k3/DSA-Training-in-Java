public class FindInArray {
    static boolean isFound(int arr[] , int index , int searchValue){
        //base case
        
        if(arr[index] == searchValue){  
            return true;
        }
        if (index == arr.length){
            return false;
        }
        return isFound(arr, index+1, searchValue);
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40};
        System.out.println(isFound(arr, 0, 30)
        ? "Found" : "Not Found");
}
}
