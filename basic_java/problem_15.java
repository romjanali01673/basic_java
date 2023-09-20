package basic_java;
import java.util.Scanner;
 
public class problem_15{
    public static void main(String [] args){
        Scanner input = new Scanner ( System.in);
        int hours , second;
        System.out.print("enter second : ");
        second = input.nextInt();
        hours = second/3600;
        System.out.println(second + " second = "+ hours +" hours");

    }
    
}

