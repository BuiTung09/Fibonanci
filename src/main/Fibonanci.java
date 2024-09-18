
package main;


public class Fibonanci{
    public static int fibonanci (int numb) {
        if(numb <= 1){
            return numb;
        }
        else 
            return fibonanci(numb - 1) + fibonanci(numb - 2);
    }
    public static void main(String[] args) {
        System.out.println("The 45 sequence array: ");
        for (int i = 0; i < 45; i++) {
            if(i < 44){
                System.out.print(fibonanci(i) + ", ");
        }
            else System.out.print(fibonanci(44));
        }
        
    }
    
}
