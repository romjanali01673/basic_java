package basic_java;
import java.util.Scanner;
public class problem_11 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int romjan, days;
        System.out.print(" month number : ");
        romjan  = input.nextInt();
        
        
        days  = romjan*30;
        System.out.printf(romjan +" month = "+ days + " days"); 


    }
}
