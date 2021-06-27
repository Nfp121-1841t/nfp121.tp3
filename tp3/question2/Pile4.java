package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile4 implements PileI, Cloneable {
    /** la liste des Maillons/Elements */
    private Maillon stk;
    /** la capacité de la pile */
    private int capacite;
    /** le nombre */
    private int nombre;

    /**
     * Classe interne "statique" contenant chaque élément de la chaine c'est une
     * proposition, vous pouvez l'ignorer !
     */
    private static class Maillon implements Cloneable {
        private Object element;
        private Maillon suivant;

        public Maillon(Object element, Maillon suivant) {
            this.element = element;
            this.suivant = suivant;
        }

        public Maillon suivant() {
            return this.suivant;
        }

        public Object element() {
            return this.element;
        }

        public Object clone() throws CloneNotSupportedException {
            Maillon m = (Maillon) super.clone();
            m.element = element;
            return m;
        }
    }

    /**
     * Création d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit être > 0
     */
    public Pile4(int taille) {
        if (taille <= 0)
            taille = CAPACITE_PAR_DEFAUT;
        this.stk = null;
        this.capacite = taille;
    }

    public Pile4() {
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        // à compléter

        stk= new Maillon(o,this.stk);
        nombre++;        
        
    }

    public Object depiler() throws PileVideException {
       if (estVide())
            throw new PileVideException();
        nombre--;
        Maillon maillon = this.stk;
        this.stk = this.stk.suivant();

        return maillon.element();
    }

    public Object sommet() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        return this.stk.element(); // à compléter
    }

    /**
     * Effectue un test de l'état de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        
        return  this.stk==null;// à compléter
    }

    /**
     * Effectue un test de l'état de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        return this.taille() == this.capacite(); // à compléter
    }

    /**
     * Retourne une représentation en String d'une pile, contenant la
     * représentation en String de chaque élément.
     * 
     * @return une représentation en String d'une pile
     */
    public String toString() {

        String s = "[";
        // à compléter
        Maillon maillon = this.stk;
        while(maillon != null){
          
            s+= maillon.element;
            if(maillon.suivant != null){
            s+=",";
          }
            maillon = maillon.suivant;

        }
        return s + "]";
    }

    public boolean equals(Object o) {
        if (o instanceof Pile4) {
            if(this.taille() == ((Pile4) o).taille() && this.capacite() == ((Pile4) o).capacite()){
            return eltEquals((Pile4) o);
            }
            
            return false;
        }
        return false;
    }

    public int capacite() {
        return this.capacite;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public int taille() {
        return nombre;
    }
     private boolean eltEquals(Pile4 p) {
       Maillon maillon = this.stk;
       while(this.stk != null && p.stk != null){
           if(! maillon.element().equals(p.stk.element())){
           return false;
           }
           maillon= maillon.suivant();
           p.stk = p.stk.suivant();
       }
    return true;
 }

}