/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math_box;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Math_tools2 {
    public static void main(String[] args) {
        
       /* Dice highest and lowest number */
        double headDice = 6;
        double tailDice = 1;
        /* End */
        /* Dice random generator*/
        Random myDice = new Random(System.currentTimeMillis());
        double myDice1 = myDice.nextDouble();
        double myDice2 = tailDice + (myDice1*(headDice-tailDice));
        double myDice3 = Math.round(myDice2);
        /* End */        
        /*Start screen*/
        System.out.println("Hey do u wanna roll a dice?");
        System.out.println("Yes, ok hit any number from 1-6 (as a wish) to roll.");
        /*Start screem end*/
        /* User input manager*/
        Scanner myScannerObj = new Scanner(System.in);
        int buttonHit = myScannerObj.nextInt();
        System.out.println("Well u typed " + buttonHit + " as a wish");
        System.out.println("Event outcome: " + myDice3);
        /* End */
        
    }
}
