package question1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IHMPile extends JFrame implements ActionListener {

    private JTextField donnee = new JTextField(6);
    private JTextField sommet = new JTextField(6);
    private JLabel contenu = new JLabel("[]");

    private Pile p;

    public IHMPile() {
        super("IHM Pile");
        JButton boutonEmpiler = new JButton("empiler");
        JButton boutonDepiler = new JButton("depiler");

        JPanel enHaut = new JPanel();
        enHaut.add(donnee);
        enHaut.add(boutonEmpiler);
        enHaut.add(boutonDepiler);
        enHaut.add(sommet);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu);
        enHaut.setBackground(Color.red);
        setLocation(100, 100);
        pack();
        setVisible(true);
        boutonEmpiler.addActionListener(this);
        boutonDepiler.addActionListener(this);

        p = new Pile(5);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("empiler")) {
            try {
                p.empiler(donnee.getText());
                contenu.setText(p.toString());

            } catch (PilePleineException ex) {
                contenu.setText(p.toString() + " la pile est pleine!");
            }
         
        } else {
            try {
                p.depiler();
                contenu.setText(p.toString());

            } catch (PileVideException ex) {
            contenu.setText(p.toString() +  " estVide !");
            }
           
        }
    }

    public static void main(String[] args) {
        new IHMPile();
    }
}
