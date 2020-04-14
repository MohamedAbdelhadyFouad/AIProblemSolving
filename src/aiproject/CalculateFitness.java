/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class CalculateFitness {

    private String x = "24315128";
    private String y = "24748652";
    private String z = "32543213";
    private String v = "32452411";
    private int xFitness = 0;
    private int yFitness = 0;
    private int zFitness = 0;
    private int vFitness = 0;
     

    public void repeat(int Generator) {    
        int count =1;
        for (int i = 1; i <= Generator; i++) {
            
        xFitness=calcFitness(x);
        yFitness=calcFitness(y);
        zFitness=calcFitness(z);
        vFitness=calcFitness(v);
            System.out.println("Generation : "+ count);
            
            ListFitness(xFitness,yFitness,zFitness,vFitness);
            count++;
        }
      // ListFitness(xFitness,yFitness,zFitness,vFitness);
    }
    // calculate the fitness
 public  int calcFitness(String s1) {
     int countF=0;
    String s2 = s1.toLowerCase();
    StringBuffer sb = new StringBuffer(s2);
    int l = sb.length();
    int count = 0;
    for (int i = 0; i < l; i++) {
      count = 0;
      for (int j = i + 1; j < l; j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
          sb.deleteCharAt(j);
          count++;
          j--;
          l--;
        }
      }
      if (count > 0) {
        sb.deleteCharAt(i);
        i--;
        l--;
      }
    }
    if (sb.length() == 0) {
      System.out.println(-1);
    } else{
        //sb.length()
     countF= sb.length();}
     return countF;

  }
 
//list fitnenss 
 public void ListFitness( int xFtiness, int yFtiness, int zFtiness, int vFtiness){  
       ArrayList<ListFitn> ListFitneses = new ArrayList<>();
     ListFitneses.add(new ListFitn(xFtiness, x));
     ListFitneses.add(new ListFitn(yFtiness, y));
     ListFitneses.add(new ListFitn(zFtiness, z));
     ListFitneses.add(new ListFitn(vFtiness, v));
     System.out.println(ListFitneses);
     Collections.sort(ListFitneses); // sort the array list 
     System.out.println("The smallest Fitness out " + ListFitneses.get(3) );
     ListFitneses.remove(3);  // remove the bad fitness 
     System.out.println("The best fitness  in the 1th and  the 3th place "+ListFitneses.get(0) );
     ListFitneses.add(2, ListFitneses.get(0));     // put the first fitness int he 3th plase 
     System.out.println(ListFitneses);
   //  int k = ListFitneses.get(2).getX(); 
   crossover(ListFitneses);
    }
 
    public void crossover(ArrayList<ListFitn> x){
    String xValue=""; 
    String yValue=""; 
    String zValue=""; 
    String vValue=""; 
      
        xValue=x.get(0).getY().substring(0,4)+x.get(1).getY().substring(4,8);
        yValue=x.get(1).getY().substring(0,4)+x.get(0).getY().substring(4,8);
        zValue=x.get(2).getY().substring(0,4)+x.get(3).getY().substring(4,8);
        vValue=x.get(3).getY().substring(0,4)+x.get(2).getY().substring(4,8);
        System.out.println(xValue);
        System.out.println(yValue);
        System.out.println(zValue);
        System.out.println(vValue);
        
       this.x =xValue;
        y=yValue;
        z=zValue;
        v=vValue;
        // send to the function whihc it can replace a number 
        
        
    }
    
    


}

