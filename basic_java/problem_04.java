
package basic_java;
import java.util.Scanner;
public class problem_04 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int romjan , kapil ;
        System.out.print(" enter the value of a = ");
        romjan = input.nextInt();
        System.out.print(" enter the value of b = ");
        kapil = input.nextInt();
        double jahid = (double)romjan / kapil;
        System.out.printf("the dev is : %.3f", jahid); // .3f mean 3 decimal cheracter will be print

    }
}

