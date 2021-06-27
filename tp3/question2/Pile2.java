package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2 implements PileI {
    /** par delegation : utilisation de la class Stack */
    private Stack<Object> stk;

    /** la capacite de la pile */
    private int capacite;

    /**
     * Creation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit etre > 0
     */
    public Pile2(int taille) {
        // prevoir le cas <=0
        // a completer
        if(taille <= 0){
            taille = CAPACITE_PAR_DEFAUT;
        }
        stk = new Stack<Object>();
        capacite=taille;
    }

    // constructeur fourni
    public Pile2() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
         if (estPleine()) {
            throw new PilePleineException();
        }
          stk.push(o);
    }

    public Object depiler() throws PileVideException {
        // a completer
         if (estVide()) {
            throw new PileVideException();
        }
        return stk.pop();
    }

    public Object sommet() throws PileVideException {
          if (estVide()) {
            throw new PileVideException();
        }
        return stk.peek();
    }
    

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
   
    public boolean estVide() {
        // a completer
        
        return stk.empty();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        return this.capacite() == this.taille();
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
        String s = "[";
        for(int i = 0 ; i<= stk.size() -1 ; i++){
            if(stk.size()-1 == i){
                s+= stk.get(i);
            }else{
                s+= stk.get(i) +",";

            }
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        // a completer
        if (o instanceof Pile2){
            if(((Pile2) o).taille() == ((Pile2) o).capacite()){
                
                return eltEquals((Pile2) o);
            }
           
        }
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        // a completer
        return this.stk.size();
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
        return CAPACITE_PAR_DEFAUT;
    }
    
      private boolean eltEquals(Pile2 p) {

        for (int i = 0; i <= this.stk.size() -1; i++) {
            if (this.stk.get(i) != p.stk.get(i)) {
                return false;
            }
        }
        return true;
    }

} // Pile2.java
