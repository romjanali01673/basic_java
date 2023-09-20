package basic_java;
import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args){
        
        Scanner numbers = new Scanner (System.in);
        int fast_number , fast_numbers, sum;
        System.out.print("enter fast number : ");
        fast_number = numbers.nextInt();
        System.out.print("enter 2nd number : ");
        fast_numbers = numbers.nextInt();

        sum = fast_number + fast_numbers;
        
        System.out.println("sum = "+ sum);
       
        
    }   
}