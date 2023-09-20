/* 
switch syntax:----------
switch (expression){
    case value-0:

        break;

    case value-1:

        break;

    case value-2:

        break;
    
    default:
        break;
}

*/

package basic_java;
import java.util.Scanner ;


public class  switch_31 {
    public static void main ( String [] args ){
        Scanner input = new Scanner (System.in);
        int d ;
        System.out.print("enter eny digit (0-9) :");
        d = input.nextInt();
        switch (d) {
            case (0 ):
                System.out.println("one");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
        
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
        
            default:
                System.out.println("enter degit !");
                break;
        }


    }
    
}








