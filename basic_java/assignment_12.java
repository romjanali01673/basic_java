package basic_java;

import java.util.Scanner;

public class assignment_12 {
    public static void main(String[] args) {
        int x,y,a , b ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of fast number : ");
        a = input.nextInt();
        System.out.println("enter the value of last number : ");
        b = input.nextInt();
        y = 0;
        for ( x=a ; x <=b; x ++){
            if (x%2 != 0){
                y = y+x;
            }
        }
        System.out.println("the sumantion is :"+ y);
    }
}













