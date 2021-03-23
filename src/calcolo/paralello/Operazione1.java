package calcolo.paralello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Giorgio Del Rocca
 */
public class Operazione1 implements Runnable {

    Buffer dati;

    public Operazione1(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.x = 3 +dati.a;
        System.out.println("Ho calcolato x: " + dati.x);
    }

}
