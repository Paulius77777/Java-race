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
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Masina[] masinos = {
            
            new Masina("audi", 100),
            new Masina("vw", 100),
            new Masina("bmw", 100),
            new Masina("opel", 100),
            new Masina("citroen", 100),
            new Masina("jeep", 100),
            new Masina("mini", 100),
            new Masina("honda", 100),
            new Masina2("Ferrari", 300),
            new Masina2("Mclaren", 300),
        };   
        do {
            for (int i = 0; i < masinos.length; i++) {
                Masina masina = masinos[i];
                if(Math.random() <= 0.22){
                    masina.stabdis((int)(Math.random() * 4));
                }else {
                    masina.gazas((int)(Math.random() * 6));
                }
                masina.vaziuojam();
            }
            arraySort(masinos);
            for(Masina masina : masinos){
            System.out.println(masina.getPavadinimas()+ " " +masina.getGreitis() + " " +masina.getKelias()); 
            }
            System.out.println("--------------------------");
        } while (masinos[0].getKelias()< 8000);
        System.out.println("Laimetojas: " + masinos[0].getPavadinimas());
    }
   public static void arraySort(Masina[] masyvas) {
        for (int i = 0; i < masyvas.length -1; i++) {
            for (int j = i + 1; j < masyvas.length; j++) {
                if(masyvas[i].getKelias() < masyvas[j].getKelias()){
                    Masina temp = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = temp;
                
            }
           
       }
            }
        }
    }  
