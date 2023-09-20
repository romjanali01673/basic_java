package basic_java;
import java.util.Scanner;
public class problem_8 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        double length, area ;
        System.out.print(" enter the value of length = ");
        length = input.nextDouble();
       
        
        area = length*length;
        System.out.printf("the area of square : %.3f", area); 


    }
}
