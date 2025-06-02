package ch.hslu.dmath_algo;

public class RecursiveAlgorithms {
private static int sum = 0;
private static int sum2 = 0;
    private static int sumn(int n){
        if (n > 0) {
            int temp = 0;
            temp = (n + (n - 1));
            sum = sum + temp;
            sumn(n-2);
        }
        return sum;  
        
        
    }

    private static int sumn2(int n){
        if (n > 0) {
            sum += (n + (n - 1));
            sumn2(n-2);
        }
        return sum;  
        
        
    }

    private static int summe(int n){
        if (n == 1){
            return 1;
        }else{
            return n + summe(n-1);
        } 
    }  

     private static int fakultaet(int n){
        if (n == 1){
            return 1;
        }else{
            return n * fakultaet(n-1);
        } 
    } 

    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }

}
