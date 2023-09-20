package basic_java;
import java.util.Scanner;
public class problem_10 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int romjan, month ;
        System.out.print(" enter the number of days which days you want to convart by an month : ");
        romjan  = input.nextInt();
        
        
        month = romjan/30;
        System.out.print(romjan +" days = "+ month + " month"); 


    }
}
