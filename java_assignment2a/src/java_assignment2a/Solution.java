package java_assignment2a;
import java.io.*;
import java.util.*;

public class Solution {
    public static void printBinaryFormat(int number,int NumberOfTimes){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();

    }
    
    public static void main(String[] args) {
   
    
        //DecimalToBinary dtb = new DecimalToBinary();
        //dtb.printBinaryFormat();
        Scanner sc = new Scanner(System.in);
        
        
        //Scan the number of times 
        //System.out.println("Number of times ");
        int noOfTimes = sc.nextInt();
        
        
        //Scan the numbers
        
        for(int i= 0 ;i < noOfTimes;i++){
          //  System.out.println("Please enter the number :    ");   
            int number = sc.nextInt();
            // int number2 = sc.nextInt() ;
            printBinaryFormat(number,noOfTimes);
        }
       
}

}