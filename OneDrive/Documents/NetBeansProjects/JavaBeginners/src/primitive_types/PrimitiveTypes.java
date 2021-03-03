/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive_types;

/**
 *
 * @author HP
 */
public class PrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number = 2_100_000_000;//integer have 32 bits.
        System.out.println(number);
        
        byte number2 = 45;//byte have 8 bits
        System.out.println(number2);
        
        long number3 = 2_100_000_000;//long has 64 bits
        System.out.println(number3);
        
        String stringNumber3 = String.valueOf(number3);//Converts number3 to string.
        System.out.println(stringNumber3 + " in string");
        
        int integerNumber3 = Integer.parseInt(stringNumber3);//Converts stringNumber3 back to integer.
        System.out.println(integerNumber3 + " in integer");
        
        String numbersInStrings = 56 +"";//Converts 56 to a string.
        System.out.println(numbersInStrings);
        
        short number4 = 456;//Short have 16 bits.
        System.out.println(number4);
        
        char aCharacter = '7';//char is just for only one character.
        System.out.println(aCharacter);
        
        float number5 = 67;//float has 32 bits.
        System.out.println(number5);
        
        double number6 = 50;//double has 64 bits.
        System.out.println(number6);
        
        boolean boo = true;
        System.out.println(boo);
        String booInString = String.valueOf(boo);//Converts boo in string.
        System.out.println(booInString + " in strings");
    }
}
