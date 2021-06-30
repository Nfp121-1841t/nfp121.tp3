package question1;

public class UneUtilisation {

    public static void main(String[] args) throws Exception {
        Pile p1 = new Pile(6);
        Pile p2 = new Pile(10);
        // p1 est ici une pile de polygones réguliers PolygoneRegulier.java

        p1.empiler(new PolygoneRegulier(5, 100));
        p1.empiler("polygone");
        p1.empiler(new Integer(100));
        System.out.println(" la pile p1 = " + p1); // Quel est le résultat ?
        //result :
        //la pile p1 = [100, polygone, <5,100>]

        p2.empiler(new Integer(1000));
        p1.empiler(p2);
        System.out.println(" la p1 = " + p1); // Quel est le résultat ?
        /*result :
             la p1 = [[1000], 100, polygone, <5,100>] */
        try {
            p1.empiler(new PolygoneRegulier(4,100));
            System.out.println("la pile p1 = "+p1.toString());

            
        /*      String s = (String) p1.depiler(); // vérifiez qu'une exception se
                                                // produit
                                                
        l'exception est :
        java.lang.ClassCastException: question1.PolygoneRegulier cannot be cast to java.lang.String
    at question1.UneUtilisation.main(UneUtilisation.java:26)*/

         p1.depiler();
         System.out.println("la pile p1 = "+p1.toString());
         
        } catch (Exception e) {
            e.printStackTrace();
        } // catch
    } // main()
} // UneUtilisation
