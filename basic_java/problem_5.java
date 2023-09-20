package basic_java;
import java.util.Scanner;
public class problem_5 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        double romjan , kapil ,jahid, sakib;
        System.out.print(" enter the value of a = ");
        romjan = input.nextDouble();
        System.out.print(" enter the value of b = ");
        kapil = input.nextDouble();
        System.out.print(" enter the value of c = ");
        jahid = input.nextDouble();
        sakib = (romjan+kapil+jahid)/3;
        System.out.printf("the average  point is : %.3f", sakib); 


    }
}

