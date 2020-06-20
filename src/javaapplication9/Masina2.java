package javaapplication9;

public class Masina2 extends Masina {
    
        private int spoileris;
        
        
    public Masina2(String pavadinimas, int maxGreitis) {
        super(pavadinimas, maxGreitis);
    }
    public void gazas(int kiek){
        super.gazas(kiek);
        if(this.greitis > 100)
             this.greitis += kiek;
        }
        public void stabdis(int kiek){
            super.stabdis(kiek);
        if(this.greitis > 100)
            this.greitis -= kiek;
        }
    }

