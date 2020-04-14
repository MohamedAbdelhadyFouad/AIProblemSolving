/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject;

/**
 *
 * @author Mohamed Abdelhady
 */
public class ListFitn implements Comparable{
    int x=0;
    String y="";
    
    
    ListFitn(int x, String y){
    this.x=x;
    this.y=y;
   
    
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }

   
    @Override
    public String toString() {
       return"F("+"e)"+"=" + y + "  F=" + x +"\n";
        
    }

    @Override
    public int compareTo(Object o) {
        int compareage=((ListFitn)o).getX();
        /* For Ascending order*/
        return compareage-this.x;
    }
    
    
    
}
