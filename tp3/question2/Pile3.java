package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // à compléter
        if (taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        v = new Vector<Object>(taille);
    }

    public void empiler(Object o) throws PilePleineException {
        // à compléter
         if (estPleine()) {
            throw new PilePleineException();
        }
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        // à compléter
         if (estVide()) {
            throw new PileVideException();
        }
         
        return v.remove(v.size()-1);
    }

    public Object sommet() throws PileVideException {
        // à compléter
         if (estVide()) {
            throw new PileVideException();
        }
        return v.get(v.size()-1);
    }

    public int taille() {
        // à compléter
        return v.size();
    }

    public int capacite() {
        // à compléter
        return 	v.capacity();
    }

    public boolean estVide() {
        // à compléter
        return v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
        return v.capacity() == taille();
    }

    public String toString() {
        String s = "[";
        for(int i = 0 ; i<= v.size() -1 ; i++){
            if(v.size()-1 == i){
                s+= v.get(i);
            }else{
                s+= v.get(i) +",";

            }
        }
        return s + "]";
    }

    public boolean equals(Object o) {
         // a completer
        if (o instanceof Pile3){
            if(((Pile3) o).taille() == ((Pile3) o).capacite()){
                
                return eltEquals((Pile3) o);
            }
           
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }
 private boolean eltEquals(Pile3 p) {

        for (int i = 0; i <= this.v.size() -1; i++) {
            if (this.v.get(i) != p.v.get(i)) {
                return false;
            }
        }
        return true;
    }
}
