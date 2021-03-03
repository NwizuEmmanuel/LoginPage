/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operators;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Operators_codes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to java operators!");//Welcome note
        System.out.println("Addition operators");//intro
        
        System.out.println("Enter a number to add: ");//first number intro tag
        double firstNumberAdd = myScanner.nextDouble();//first number to be added.
        
        System.out.println("Enter another number: ");//second number intro tag
        double secondNumberAdd = myScanner.nextDouble();//second number to be added
        
        double totalAdd = firstNumberAdd + secondNumberAdd;//addition summary
        
        System.out.println("You added " + firstNumberAdd + " to " + secondNumberAdd + ".");//result printout1
        System.out.println("Ans " + totalAdd);//result printout2
        
        System.out.println("Subtraction operators");//intro 
        
        System.out.println("Enter a number to subtract: ");//first number intro tag
        double firstNumberSub = myScanner.nextDouble();//first number to be subtracted.
        
        System.out.println("Enter another number: ");//second number intro tag
        double secondNumberSub = myScanner.nextDouble();//second number to be subtracted.
        
        double totalSub = firstNumberSub - secondNumberSub;//subtraction summary
        
        System.out.println("You subtracted " + firstNumberSub + " from " + secondNumberSub);//result printout1
        System.out.println("Ans " + totalSub);//result printout2
        
        System.out.println("Multiplication operators");//intro
        
        System.out.println("Enter a number to multiply: ");//1st number intro tag
        double firstNumberMult = myScanner.nextDouble();//first number
        
        System.out.println("Enter another number: ");//2nd number intro tag
        double secondNumberMult = myScanner.nextDouble();//2nd number
        
        double totalMult = firstNumberMult * secondNumberMult;//mult summary
        
        System.out.println("You multiplied " + firstNumberMult+ " by " + secondNumberMult);//result printout1
        System.out.println("Ans " + totalMult);//result printout2
          
          System.out.println("Division operator");//intro
          
          System.out.println("Enter a number to divide: ");//1st num. intro
          double firstNumberDiv = myScanner.nextDouble();//1st num.
          
          System.out.println("Enter another number: ");//2nd num. intro
          double secondNumberDiv = myScanner.nextDouble();//2nd num.
          
          double totalDiv = firstNumberDiv / secondNumberDiv;//div summary
          
          System.out.println("You divided " + firstNumberDiv + " by " + secondNumberDiv);//printout result
          System.out.println("Ans " + totalDiv);
          
          System.out.println("Modulus operators");//intro
          
          System.out.println("Enter  number to get mod.: ");//1st no. intro
          int firstNumberMod = myScanner.nextInt();//1st no.
          
          System.out.println("Enter another number: ");//2nd no. intro
          int secondNumberMod = myScanner.nextInt();//2nd no.
          
          int totalMod = firstNumberMod % secondNumberMod;//mod summary
          
          System.out.println("You perform an operation called modulus: ");//printout
          System.out.println(totalMod + " remains when " + firstNumberMod + " is divided by " + secondNumberMod);
          
          System.out.println("Increment operator");//intro
          
          System.out.println("Enter a number: ");//1st no. tag
          double firstNumberIncr = myScanner.nextDouble();//1st no.
          
          double totalIncr = ++firstNumberIncr;//result
        System.out.println("1 was added to ur number" + " so ur ans is " + totalIncr);//result printout
        
        System.out.println("Decrement operators");//intro
        
        System.out.println("Enter a number: ");//1st no. tag
        double firstNumberDecr = myScanner.nextDouble();//1st no.
        
        double totalDecr = --firstNumberDecr;//result
        
        System.out.println("1 was subtracted from ur number\nAns: " + totalDecr);//result printout
        
        System.out.println("OR operators");//intro
        
        System.out.println("Enter number: ");//1st no.tag
        int firstNumberOR = myScanner.nextInt();//1st no.
        
        System.out.println("Enter another number: ");//2nd number
        int secondNumberOR = myScanner.nextInt();//2nd no.
        
        int totalOR = firstNumberOR | secondNumberOR;//Or summary
        
        System.out.println("Operator: bitwise (OR)\nAns: (in decimal)" + totalOR);//printout
        
        System.out.println("AND operator");//intro
        
        System.out.println("Enter number: ");//1st no. tag
        int firstNumberAND = myScanner.nextInt();//1st no.
        
        System.out.println("Enter another number: ");//2nd no. tag
        int secondNumberAND = myScanner.nextInt();//2nd no.
        
        int totalAND = firstNumberAND & secondNumberAND;//AND summary
        
        System.out.println("Operator: bitwise (AND)\nAns: (in decimal)" + totalAND);
        
        System.out.println("XOR operator");//intro
        
        System.out.println("Enter number: ");//1 no. tg
        int firstNumberXOR = myScanner.nextInt();//1 no.
        
        System.out.println("Enter another number: ");//2 n0. tg
        int secondNumberXOR = myScanner.nextInt();//2 no.
        
        int totalXOR = firstNumberXOR ^ secondNumberXOR;//final result
        
        System.out.println("Operation: bitwise (XOR)\nAns: (in decimal)" + totalXOR);//printout
        
        System.out.println("Compliment operators");//intro
        
        System.out.println("Enter number: ");//1st no. tg
        int firstNumberCom = myScanner.nextInt();//1st no.
        
        int totalCom = ~firstNumberCom;//final result
        
        System.out.println("Operation: bitwise (compliment)\nAns: (in decimal)" + totalCom);//printout
        
        System.out.println("Quick addition");//intro
        
        System.out.println("Enter number: ");//1st no. tg
        int firstNumFiv = myScanner.nextInt();//1st no.
        
        int totalFiv = (firstNumFiv += 5) ;//final result
        
        System.out.println("5 was added to ur number\nAns: " + totalFiv);
        
        System.out.println("Quick substraction");//intro
        
        System.out.println("Enter number: ");//1st no. tg
        int firstNumSubFiv = myScanner.nextInt();//1st no.
        
        int totalSubFiv = --firstNumSubFiv;//result
        
        System.out.println("1 was added to ur number so ur ans is " + totalSubFiv);//printout

        System.out.println("Shift right operators");//intro
        
        System.out.println("Enter number: ");//1st no. tg
        int firstNumberSh = myScanner.nextInt();//1st no.
        
        System.out.println("Enter another number: ");//2nd no. tg
        int secondNumberSh = myScanner.nextInt();//2nd no.
        
        int totalSh = firstNumberSh >> secondNumberSh;//final result
        
        System.out.println("Operator: bitwise(Shift right)\nAns: " + totalSh);//printout
        
        System.out.println("Left shift operators");//intro
        
        System.out.println("Enter number: ");//1st no. tg
        int firstNumberLsh = myScanner.nextInt();//1st no.
        
        System.out.println("Enter another number: ");//2nd no. tg
        int secondNumberLsh = myScanner.nextInt();//2nd no.
        
        int totalLsh = firstNumberLsh << secondNumberLsh;//final result
        
        System.out.println("Operator: bitwise (left shift)\nAns: " + totalLsh);//printout
    }
}

