package basic_java;
import java.util.Scanner;
public class problem_7 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        double length, width, area ;
        System.out.print(" enter the value of base = ");
        length  = input.nextDouble();
        System.out.print(" enter the value of hight = ");
        width = input.nextDouble();
        
        area = length* width;
        System.out.printf("the area of Rhombus : %.3f", area); 


    }
}
