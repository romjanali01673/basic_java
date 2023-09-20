package basic_java;
import java.util.Scanner;
public class problem_03 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int romjan , kapil ,jahid ;
        System.out.print(" enter the value of a = ");
        romjan = input.nextInt();
        System.out.print(" enter the value of b = ");
        kapil = input.nextInt();
        jahid = romjan * kapil;
        System.out.printf("the mul is : %d", jahid);

    }
}
