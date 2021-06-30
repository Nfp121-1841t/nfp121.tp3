package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
         
        if (taille <= 0) {
            taille = CAPACITE_PAR_DEFAUT;
        }
        this.zone = new Object[taille];
        this.ptr = 0;
    }

    public Pile() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
         if (estPleine()) {
            throw new PilePleineException();
        }
        this.zone[this.ptr] = o;
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
         if (estVide()) {
            throw new PileVideException();
        }

        return this.zone[this.ptr--];
    }

    public Object sommet() throws PileVideException {
        if(estVide()){
            throw new PileVideException();
        }
        return this.taille() - 1;
    }

    public int capacite() {

        return this.zone.length;
    }

    public int taille() {
        // a completer
        return ptr;
    }

    public boolean estVide() {
        // a completer
        if (taille() == 0) {
            return true;
        }
        return false;
    }

    public boolean estPleine() {

        if (!estVide() && this.taille() == this.capacite()) {
            return true;
        }
        return false;
    }

  /*  public boolean equals(Object o) {

        if (o instanceof Pile) {
            if (this.taille() == ((Pile) o).taille() && this.capacite() == ((Pile) o).capacite()) {
                if (eltEquals((Pile) o)) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }*
  public boolean equals(Object o) {
    if (o instanceof PileI) {
      PileI p = (PileI) o;
      return this.capacite() == p.capacite()
          && this.hashCode() == p.hashCode();
    } else
      return false;
  }*/
    public boolean equals(Object o) {
        String s = this.toString();
        String ss = o.toString();
    return this.toString() == o.toString();
  }
    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String resultat ;
        String s ="[";
        for(int i = this.taille() -1; i >=0  ; i--){
            s+= this.zone[i]+",";
            if(i == 0){
                s+= this.zone[i];
            }
        }
        
        resultat = s + "]";
        return resultat;
    }

    private boolean eltEquals(Pile p) {

        for (int i = 0; i <= this.taille() -1; i++) {
            if (this.zone[i] != p.zone[i]) {
                return false;
            }
        }
        return true;
    }
}
