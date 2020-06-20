/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author macbook
 */
public class Masina {
    protected int greitis;
    private int maxGreitis = 200;
    private int kelias;
    private String pavadinimas;
    
    public Masina(String pavadinimas, int maxGreitis) {
        this.greitis = greitis;
        this.maxGreitis = 200;
        this.kelias = 0;
        this.pavadinimas = pavadinimas;
    }

    public int getGreitis() {
        return greitis;
    }

    public int getMaxGreitis() {
        return maxGreitis;
    }

    public int getKelias() {
        return kelias;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public void gazas(int kiek){
        this.greitis += kiek;
        if(this.greitis < 0);
    }
    public void stabdis(int kiek){
        this.greitis -= kiek;
        if(this.greitis <0 ){
            this.greitis = 0;
        }
    }
    public void vaziuojam(){
        this.kelias += this.greitis;
    }
}
