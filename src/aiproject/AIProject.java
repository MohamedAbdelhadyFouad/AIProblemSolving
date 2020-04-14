/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject;

import java.util.Scanner;

/**
 *
 * @author Mohamed Abdelhady
 */
public class AIProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //24315128
        //24748652
        //32543213
        //32452411
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number or Generations : ");
        int Generator = sc.nextInt();      
 CalculateFitness x= new CalculateFitness();          
       x.repeat(Generator);
        
        
    }
    
}
