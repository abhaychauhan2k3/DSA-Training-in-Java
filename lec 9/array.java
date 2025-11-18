public class array {
    public static void main(String[] args) {
        // int arr[] = new int[10];//all values are inntialised to zero bydefAULT
        // int c[] = {10,20,30};
        // int[] b ={10,20,50};
        // String e[] = new String[10]; //all values are initialised to null values.
        // boolean x[] = new boolean[10]; //all values are initialised to false.
        
        //2-d array
        //int n[][] = new int[3][2];

        //zigzag array
        int nn[][] = new int[3][];
        nn[0] = new int[5];
        nn[1] = new int[6];
        nn[2] = new int[7];
        for(int i = 0 ; i<nn.length ; i++){
            for(int j = 0 ; j<nn[i].length ; j++){
                System.out.print(nn[i][j]);
            }
            System.out.println();
        }
    }
}
