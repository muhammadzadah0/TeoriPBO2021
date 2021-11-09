/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriMinggu11.EXERCISE2;

/**
 *
 * @author PC-HP
 */
public class Manusia {
   public void nyalahkanPerangkat(Elektronik perangkat){
   if(perangkat instanceof TelevisiJadul){
       System.out.println("Nyalahkan Televisi jadul dengan input: "+ ((TelevisiJadul) perangkat).getModelInput()
       +"\nVoltase Televisi: "+ perangkat.getVoltase());
    }else if( perangkat instanceof TelevisiModern){
         System.out.println("Nyalahkan Televisi moderen dengan input: "+ ((TelevisiModern) perangkat).getModelInput()
       +"\nVoltase Televisi: "+ perangkat.getVoltase());       
    }
   } 
}
