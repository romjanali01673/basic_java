package basic_java;

import java.util.Scanner;

public class problem_13{
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        int menite ,hours;
        System.out.print("enter the amout of menite : ");
        menite = input.nextInt();
        hours = menite/60;
        System.out.print(menite + " menite = "+ hours+" hours");


    }

}

