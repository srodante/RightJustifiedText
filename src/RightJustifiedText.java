/*
Assignment is to create a program to take a use input line and right justify it
For this assignment, the length of the line will be 60
 */
import java.util.Scanner;

public class RightJustifiedText {
    public static void main (String[] args){
        Scanner keybd = new Scanner(System.in);
        String inputLine;
        char [] outputLine;
        int index2;

        outputLine = new char[60];
        do {
           System.out.println("Enter your text string. Type q to quit:");
           inputLine = keybd.nextLine();
           index2 = 59;
           for (int index1 = inputLine.length() - 1; index1 >= 0; index1--){
               outputLine[index2] = inputLine.charAt(index1);
               index2 --;
           }
           for (int index3 = index2; index3 >= 0; index3--){
               outputLine[index3] = ' ';
           }
           System.out.println(outputLine);
        } while ((inputLine.equalsIgnoreCase("q")) == false);


    }
}
