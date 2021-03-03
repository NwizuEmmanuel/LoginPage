/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math_box;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */public class Math_tools {
    public static void main(String[] args) {
//        float roundd=(Math.round(2.70022));
//        System.out.println(Math.random()*15);
//          System.out.println(roundd); 
int min=5;
int max=8;
          Random rand= new Random(System.currentTimeMillis());
          double rands=rand.nextDouble();
          System.out.println(rands);
          double randnum=min+(rands*(max - min));
          double roundNum = Math.round(randnum);
          System.out.println("random value "+roundNum);
          
          String words = "Obi was a boy but now he's a man>";
          System.out.println(words.indexOf("w"));
          
          int min1 = 4;
          int max1 = 8;
          Random randNumber = new Random(System.currentTimeMillis());
          double randNumberOut = randNumber.nextDouble();
          double randNumberRes = min1+(randNumberOut*(max1- min1));
          double randNumberRod = Math.round(randNumberRes);
          System.out.println("Generated a random value " + randNumberRod);
          
          /* Version 2 of random class. */
          Scanner scan = new Scanner(System.in);
          
          System.out.println("Hello I am Java do u want to generate random values.");
          System.out.println("If yes, hit the enter button to start with inclusive(lowest)");
          int number1 = scan.nextInt();
          
          System.out.println("Enter exclusive: (highest)");
          int number2 = scan.nextInt();
          
          double randNumber1 = randNumber.nextDouble();
          double randNumber2 = number1 + (randNumber1 * (number2 - number1));
          
          double roundUp = Math.round(randNumber2);
          System.out.println("A random value: " + roundUp);
          
    }
}
