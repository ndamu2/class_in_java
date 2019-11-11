import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     //Declaring array for input
        int[][] numArray=new int[3][4];
        int [] column_Sum= new int[4];
        int value;

// user input values for Array
        System.out.println("enter values for 3x4 array: ");
        for (int x=0;x<3;x++){
            for(int y=0;y<4;y++){
                Scanner myArray=new Scanner(System.in);
               System.out.println("Enter value for row"+(x+1)+"column"+(y+1));
               int array=myArray.nextInt();

            }//end of 2nd loop
            for (int y=0;y<4;y++){
                System.out.println("column"+(y+1));

            }//end of 3rd loop
        }//end of first loop

    }
}
