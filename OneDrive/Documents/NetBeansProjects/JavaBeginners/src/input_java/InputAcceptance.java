/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_java;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class InputAcceptance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("enter your name");
//        String name=scanner.nextLine();
//          System.out.println("enter your age");
//        int age=scanner.nextInt();
//      
//          System.out.println("your name is "+name+" and you are "+age+" yrs");
  System.out.println("First number: ");     
double num_1 = scanner.nextDouble();
     System.out.println("Second number: "); 
double num_2 = scanner.nextDouble();
            
            double total = ++num_1 + --num_2;
            System.out.println(num_1 + " + " + num_2 + " is " + total);
            
            
        
    }
}
