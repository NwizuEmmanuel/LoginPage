/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerinput;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class ScannerInput {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered: " + x);
        
    }
    
}
