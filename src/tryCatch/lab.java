package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab {
    public static int num1;
    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        try{
            lab.num1 = sc.nextInt();
            if( lab.num1 < 10 ){
                throw new IllegalArgumentException();
            }
        }catch(InputMismatchException e){
            System.out.println("Введено не число!!!");
        }catch(IllegalArgumentException e){
            System.out.println("Число меньше чем требуется");
        }finally{
            System.out.println("Введённое число равно: "+lab.num1);
        }
    }
}
