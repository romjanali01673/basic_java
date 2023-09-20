package basic_java;
import java.util.Scanner;
public class problem_02 {
    public static void main (String [ ] args){
        Scanner input = new Scanner (System.in );
        int a , b ,c ;
        System.out.print(" enter the value of a = ");
        a = input.nextInt();
        System.out.print(" enter the value of b = ");
        b = input.nextInt();
        c = a-b;
        System.out.printf("the sub is : %d",  c);

    }
}
