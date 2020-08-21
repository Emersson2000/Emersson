
package Factorial_Recursivo;

public class Factorial {
    
//    public int factorialRecursivo(int n) {
//        if (n > 0){
//             int a = n * factorialRecursivo(n-1);
//            System.out.print(a+" - ");
//            return a;
//        }
//        else{
//           return 1;
//        }
//    }
    
    public int fibonacciRecursivo(int n) {
     
        if (n <= 2){
            return 1;
        }
        else{
            return fibonacciRecursivo(n-1) + fibonacciRecursivo (n-2); 
        }
            
        }
         
    }
    

