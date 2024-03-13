public class Patterns_In_Java {
    public static void main(String[] args) {
        
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
        
//         for(int i = 1; i<=5; i++) {
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
        
        
        
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
        
        // for(int i =1; i<=5; i++) {
        //     for(int j = 1; j<5+1-i; j++) {
        //         System.out.print(" "+" ");
        //     }
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     for(int j = 2; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
            
        //     System.out.println();
        // }
        
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         *         
        
//         for(int i = 1; i<=5; i++) {
//             for(int j=2; j<=i; j++) {
//                 System.out.print(" "+" ");
//             }
            
//             for(int j=1; j<=5-i+1; j++) {
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=5-i; j++) {
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
            
//         }



//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         *
//                 for(int i =1; i<=5; i++) {
//             for(int j = 1; j<5+1-i; j++) {
//                 System.out.print(" "+" ");
//             }
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
//             for(int j = 2; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
            
//             System.out.println();
//         }
        
//         for(int i = 1; i<=4; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(" "+" ");
//             }
            
//             for(int j=1; j<=4-i+1; j++) {
//                 System.out.print("*"+" ");
//             }
//             for(int j=1; j<=4-i; j++) {
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
            
//         }

    }
}
