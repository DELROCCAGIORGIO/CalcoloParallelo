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
public class Operazione4 implements Runnable{
    Buffer dati;

    public Operazione4(Buffer dati) {
        this.dati = dati;
    }

    @Override
    public void run() {
        dati.t=dati.z*dati.y;
        System.out.println("Ho calcolato t: "+dati.t);
    }


}