package basic_java;
import java.util.Scanner;
 
public class problem_17{
    public static void main(String [] args){
        Scanner input = new Scanner ( System.in);
        double cel , fahr;
        System.out.print("enter the temperature in farhenheit : ");
        fahr = input.nextDouble();
        cel = (fahr-32)*0.55;

        System.out.printf("temperature in celsius : %.2f", cel);

    }
    
}
