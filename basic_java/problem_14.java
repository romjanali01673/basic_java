package basic_java;
import java.util.Scanner;
 
public class problem_14{
    public static void main(String [] args){
        Scanner input = new Scanner ( System.in);
        int hours , second;
        System.out.print("enter hour : ");
        hours = input.nextInt();
        second = hours*60*60;
        System.out.println(hours + " hours = "+ second+" second");

    }
    
}