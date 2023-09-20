package basic_java;
import java.util.Scanner;
public class problem_6 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        double length, width, area ;
        System.out.print(" enter the value of L = ");
        length  = input.nextDouble();
        System.out.print(" enter the value of W = ");
        width = input.nextDouble();
        
        area = length* width;
        System.out.printf("rectangale area is : %.3f", area); 


    }
}
