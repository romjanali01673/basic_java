package basic_java;
import java.util.Scanner;
public class problem_9 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        double romjan, area ; 

        System.out.print(" enter the value of radius = ");
        romjan = input.nextDouble();
        
        area = romjan * 3.1416;
        System.out.printf("the area of circal : %.3f", area); 


    }
}
