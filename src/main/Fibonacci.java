
package main;

import java.util.Scanner;


public class Fibonacci{
    public static int fibonanci (int numb) {
        if(numb <= 1){
            return numb;
        }
        else 
            return fibonanci(numb - 1) + fibonanci(numb - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n : ");
        int n = sc.nextInt();
        System.out.println("The " + n+ " sequence array: ");
        for (int i = 0; i < n; i++) {
            if(i < n-1){
                System.out.print(fibonanci(i) + ", ");
        }
            else System.out.print(fibonanci(n));
        }
        
    }
    
}
