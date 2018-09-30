/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciussfarenheitt;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Celciussfarenheitt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tgs01-a
        Scanner inpt = new Scanner(System.in);
        double C,F;
        System.out.println("Mengkonversi Suhu Celcius Ke Farenheit");
        System.out.print("Suhu Celcius = ");
        C = inpt.nextInt();
        System.out.println("Suhu Farenheit = " + ((C*9/5)+32) );
        System.out.println();
        System.out.println("Mengkonversi Suhu Farenheit Ke Celcius");
        System.out.print("Suhu Farenheit = ");
        F = inpt.nextInt();
        System.out.println("Suhu Celcius = " + ((F-32)*5/9) );
    }
    
}
