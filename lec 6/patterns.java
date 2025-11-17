public class patterns {
    public static void main(String[] args) {
        int n =9;
        //pattern 1

        // for(int row = 1 ; row<=n ; row ++){
        //     for(int col = 1 ; col <= n ; col++){
        //         if(col<=row)
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //pattern 2
        // for(int row = 1 ; row<= n ; row++){
        //     for(int col = 1 ; col<= n ; col ++){
        //         if(col>= row){
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        //pattern 3
        // for(int row = 1 ; row<= n ; row++){
        //     for(int col = 1 ; col<= n ; col ++){
        //         if(col>=n-row+1){
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //for practicing pattern que - > codeforwin website

        //pattern 3
        /*

         *
         * *
         * * *
         * * * *
         * * * 
         * * 
         * 
         
         */
    //     for (int row = 1 ; row <= n; row++){
    //         for(int col = 1; col<=n/2 + 1 ; col ++){
    //             if (row <= (n/2)) {
    //                 if(col<=row){
    //                     System.out.print("*");
    //                 }
    //             }
    //             else{
    //                 if(col>=(row - n/2)){
    //                     System.out.print("*");
    //                 }
    //             }
    //         }
    //         System.out.println();
    //     }
    //     if(n%2 == 0)
    //     System.out.println("*");

    

    //pattern 4
    /*
          *
        * * *
       * * * *  
     
    */
//     int x = n/2;
//     for(int row = 1 ; row <= (n/2) ; row++){
//         for (int col = 1 ; col<n ; col++){
//             if ( col <(n/2)+1){
//             if(col < x){
//                 System.out.print(" ");
//                 }
//             else{
//                 System.out.print("*");
//                 }
//             }
//             else{
//                 int y = col;
//                 y -= (n/2);
//                 if(y>=row){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//         }
//         x--;
//         System.out.println();
//     }
//     }
// }

//pattern 5
// *****
// ****
// ***
// **
// *

// for (int row = 1 ; row<=n ; row++){
//     for (int col = 1 ; col<=n ; col++){
//         if(col <= (n-row+1)){
//             System.out.print("*");
//         }
//     }
//     System.out.println();
//     }

//pattern 6
//     *
//    **
//   ***
//  ****
// *****
// for (int row = 1 ; row<=n; row++){
//     for(int col = 1 ; col<=n ; col++){
//         if(row>n-col){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
// }
// }

//pattern 7
/*   
      *********
      **** ****
      ***   ***
      **     **
      *       *

*/

for(int row = 1 ; row<=n ; row++){
    for(int col = 1 ; col<= n ; col ++){
        if(row == 1){
            System.out.print("*");
        }
        else if(col <= ((n/2)-row+2) || col> n/2 +1 ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        // if(col > n/2 +1 -row){
        //     System.out.print("*");
        // }
        // else{
        //     System.out.println(" ");
        // }
    }
    System.out.println();
}
}}

//medium - > proffessional blogging wesite