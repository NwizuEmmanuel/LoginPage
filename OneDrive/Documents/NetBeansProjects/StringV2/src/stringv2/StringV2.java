/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringv2;

/**
 *
 * @author HP
 */
public class StringV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myAgeInt = 18;
        String myAge = Integer.toString(myAgeInt);
        System.out.println(myAge);
        
        String numberOne = "50";
        int b = Integer.parseInt(numberOne);
        System.out.println(b);
        /**Done*/
        
        double numberTwo = 5.67;
        int numberTwoV2 = (int) numberTwo;
        System.out.println(numberTwoV2);
        
        Integer wrap = 10;
        System.out.println(wrap);
        int prim = wrap;
        System.out.println(prim);
        
        int i = 45;
        int j = 50;
        System.out.print(i);
        System.out.print(" and ");
        System.out.println(j);
        System.out.println(i + " and " + j);
        
        
    }
    
}
