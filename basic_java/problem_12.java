package basic_java;
import java.util.Scanner;
public class problem_12 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int hours, menite ;
        System.out.print(" enter the number of hours : ");
        hours = input.nextInt();
       
        
        menite = 60 * hours;
        System.out.printf(hours + " hours =" + menite + " menite"); 
    }}