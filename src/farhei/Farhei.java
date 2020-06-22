/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farhei;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Farhei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double f,num,i;
        System.out.println("Digite o grau em celsius:");
        num=entrada.nextDouble();
        i=1;
        while(i<10)
        {
            f =(9*i/5) + 32;
            System.out.println("n" +f);
            i=i+i;
        }
    }
    
    
}
