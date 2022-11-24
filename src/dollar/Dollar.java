/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollar;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Dollar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dollar,euro,rupiah;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan rupiah = ");
        rupiah=scan.nextDouble();
        dollar = 14.508/rupiah;
        euro = 17.064/rupiah;
        System.out.println("konversi dollar = "+dollar);
        System.out.println("konversi euro = "+euro);
        
      
                }
}