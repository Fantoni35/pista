package espista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class PistaKart extends Thread {

    Semaforo pieno;
    String nome;

    public PistaKart(Semaforo pieno, String nome) {
        this.pieno = pieno;
        this.nome=nome;
    }

    public void run() {
        
        pieno.p();
        for (int i = 1; i < 16; i++) {
            System.out.println(nome+ " ha completato il " + i + " giro ");
        }
        System.out.println(nome+ " ha lasciato la pista");
        pieno.v();
    }

}
