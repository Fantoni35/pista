/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EsPista;

/**
 *
 * @author PC
 */
public class EsPista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Semaforo spogl=new Semaforo(2);
       Semaforo gara=new Semaforo(4);
       
       PistaKart a=new PistaKart(gara,"Pilota 1");
       Thread Pilota_1=new spogliatoio(spogl,a);
       PistaKart b=new PistaKart(gara,"Pilota 2");
       Thread Pilota_2=new spogliatoio(spogl,b);
       PistaKart c=new PistaKart(gara,"Pilota 3");
       Thread Pilota_3=new spogliatoio(spogl,c);
       PistaKart d=new PistaKart(gara,"Pilota 4");
       Thread Pilota_4=new spogliatoio(spogl,d);
       PistaKart e=new PistaKart(gara,"Pilota 5");
       Thread Pilota_5=new spogliatoio(spogl,e);
        PistaKart f=new PistaKart(gara,"Pilota 6");
       Thread Pilota_6=new spogliatoio(spogl,f);
        PistaKart g=new PistaKart(gara,"Pilota 7");
       Thread Pilota_7=new spogliatoio(spogl,g);
        PistaKart h=new PistaKart(gara,"Pilota 8");
       Thread Pilota_8=new spogliatoio(spogl,h);
       
       
       Pilota_1.start();
       Pilota_2.start();
       Pilota_3.start();
       Pilota_4.start();
       Pilota_5.start();
       Pilota_6.start();
       Pilota_7.start();
       Pilota_8.start();
      
       
       
    }
    
}
