package question3;

import question1.PolygoneRegulier;

public class UneUtilisation {

    public static void main(String[] args) throws Exception {
        // dÃ©clarer p1
        PileI<PolygoneRegulier>p1= new Pile2<PolygoneRegulier>();
        // déclarer p2
        PileI<Object> p2=new Pile2<Object>();
        // p1 est ici une pile de polygones réguliers PolygoneRegulier.java
        p1.empiler(new PolygoneRegulier(4, 100));
        p1.empiler(new PolygoneRegulier(5, 100));

        System.out.println(" la pile p1 = " + p1);

        p2.empiler(p1);
        System.out.println(" la pile p2 = " + p2);

        try {
             p1.empiler(new PolygoneRegulier(5,100));  
             System.out.println(" la pile p1 = " + p1);

             
            /* String s = (String)p1.depiler(); // dÃ©sormais une erreur de
             
             l'erreur est :
            
            java.lang.RuntimeException: Uncompilable source code - incompatible types: question1.PolygoneRegulier cannot be converted to java.lang.String
	at question3.UneUtilisation.main(UneUtilisation.java:27) 
           
        /* pour prendre le resultat du p1.depiler() il faut declarer un variable du type Object ou bien de me
        type qui est PolygoneRegulier ou bien le valeur depiler transformer le en String d'apres 
            la fonction toString() comme le code si dessous :
                                                            
        */ 
            
            PolygoneRegulier pr = p1.depiler();
            System.out.println("Polygone regulier : "+pr);
            Object o = p1.depiler();
            System.out.println("object :"+o);
            
            String s = (p1.depiler()).toString();
            System.out.println("La valeur string depiler est :"+s);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}