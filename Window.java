/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica_grafica;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import javax.swing.border.Border;

/**
 *
 * @author AntoFra
 */
public class Window implements ActionListener, WindowListener, MouseListener {

    JFrame f = new JFrame ();
    JPanel p = new JPanel ();
    JLabel l = new JLabel ("Contatti");
    Vector <JLabel> l_v = new Vector (1,1);
    Vector <Dati> dati = new Vector (1,1);
    Dati dati_ap;
    JButton b = new JButton ("+");
    
    GridBagLayout layout = new GridBagLayout ();
    GridBagConstraints g = new GridBagConstraints ();
    
    JMenuBar bar = new JMenuBar ();
    JMenu menu = new JMenu ();
    JMenu menu1 = new JMenu ("Info");
    JMenu menu2 = new JMenu ("Cambia colore");
    JMenu menu2_1 = new JMenu ("Sfondo");
    JMenu menu2_2 = new JMenu ("Testo");
    JMenu menu2_3 = new JMenu ("Bottoni");
    JMenu menu2_4 = new JMenu ("Bordo");
    
    Color color = Color.BLACK;
    JFrame fcolor = new JFrame ();
    JColorChooser color_choose = new JColorChooser();
    
    Border bordo;
    
    int cont = 0;
    boolean control = false;
    
    JFrame f2 = new JFrame ("Dati");
    JPanel p2 = new JPanel ();
    JLabel l1 = new JLabel ("Nome");
    JTextField t1 = new JTextField (10);
    JLabel l2 = new JLabel ("Cognome");
    JTextField t2 = new JTextField (10);
    JLabel l3 = new JLabel ("Telefono");
    JTextField t3 = new JTextField (10);
    JLabel l4 = new JLabel ("Email");
    JTextField t4 = new JTextField (10);
    JButton b_annulla = new JButton ("Annulla");
    JButton b_fine = new JButton ("Fine");
    
    JFrame f3 = new JFrame ();
    JPanel p3 = new JPanel ();
    JLabel lnome = new JLabel ("Nome: ");
    JLabel lcognome = new JLabel ("Cognome: ");
    JLabel ltelefono = new JLabel ("Telefono: ");
    JLabel lemail = new JLabel ("Email: ");
    JButton b_mod = new JButton ("Modifica");
    JButton b_canc = new JButton ("Elimina");
    
    int contcolor = 0;
    
    public Window () {
        
        fcolor.addWindowListener(this);
        fcolor.setBounds(400, 300, 650, 400);
        fcolor.add(color_choose);
        
        menu.setIcon(new ImageIcon("C:\\rubrica\\settings\\icona.png"));
        bar.setBackground(Color.black);
        Image im = Toolkit.getDefaultToolkit().getImage("C:\\rubrica\\settings\\icona_frame.gif");
        f.setIconImage(im);
        f2.setIconImage(im);
        f3.setIconImage(im);
        f.setBounds(100, 100, 100, 300);
        f.addWindowListener(this);
        b.addActionListener(this);
        menu1.addMouseListener(this);
        menu2_1.addMouseListener(this);
        menu2_2.addMouseListener(this);
        menu2_3.addMouseListener(this);
        menu2_4.addMouseListener(this);
        f.add(p);
        
        f.setJMenuBar(bar);
        bar.add(menu);
        menu.add(menu1);
        menu.add(menu2);
        menu2.add(menu2_1);
        menu2.add(menu2_2);
        menu2.add(menu2_3);
        menu2.add(menu2_4);
        
        l.setFont(new Font ("", Font.BOLD, 25));
        b.setFont(new Font ("", Font.BOLD, 20));
        
        p.setLayout(layout);
        f.add(b, "North");
        
        /*
        g.gridx = 1;
        g.gridy = 0;
        g.gridwidth = 1;
        g.gridheight = 1;
        g.anchor = GridBagConstraints.NORTHEAST;
        layout.setConstraints(b, g);
        */
        
        g.gridx = 0;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l, g);
        p.add(l);
        
        /*
        l_v.add(new JLabel ("d"));
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l_v.get(1), g);
        p.add(l_v.get(1));
        
        l_v.add(new JLabel ("d"));
        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l_v.get(2), g);
        p.add(l_v.get(2));
        */
        
        f.setVisible(true);
        
        
        f2.setBounds(100, 100, 300, 500);
        f2.addWindowListener(this);
        t1.addMouseListener(this);
        t2.addMouseListener(this);
        t3.addMouseListener(this);
        t4.addMouseListener(this);
        b_annulla.addActionListener(this);
        b_fine.addActionListener(this);
        f2.add(p2);
        
        l1.setFont(new Font ("", Font.BOLD, 15));
        l2.setFont(new Font ("", Font.BOLD, 15));
        l3.setFont(new Font ("", Font.BOLD, 15));
        l4.setFont(new Font ("", Font.BOLD, 15));
        
        lnome.setFont(new Font ("", Font.BOLD, 15));
        lcognome.setFont(new Font ("", Font.BOLD, 15));
        ltelefono.setFont(new Font ("", Font.BOLD, 15));
        lemail.setFont(new Font ("", Font.BOLD, 15));
        
        t1.setFont(new Font ("", Font.BOLD, 15));
        t2.setFont(new Font ("", Font.BOLD, 15));
        t3.setFont(new Font ("", Font.BOLD, 15));
        t4.setFont(new Font ("", Font.BOLD, 15));
        
        p2.setLayout(layout);
        
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l1, g);
        p2.add(l1);
        g.gridx = 1;
        g.gridy = 0;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(t1, g);
        p2.add(t1);
        
        g.gridx = 0;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l2, g);
        p2.add(l2);
        g.gridx = 1;
        g.gridy = 1;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(t2, g);
        p2.add(t2);
        
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l3, g);
        p2.add(l3);
        g.gridx = 1;
        g.gridy = 2;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(t3, g);
        p2.add(t3);
        
        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(l4, g);
        p2.add(l4);
        g.gridx = 1;
        g.gridy = 3;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(t4, g);
        p2.add(t4);
        
        g.gridx = 0;
        g.gridy = 4;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(b_annulla, g);
        p2.add(b_annulla);
        g.gridx = 1;
        g.gridy = 4;
        g.gridwidth = 1;
        g.gridheight = 1;
        layout.setConstraints(b_fine, g);
        p2.add(b_fine);
        
        
        f3.setBounds(100, 100, 300, 500);
        f3.addWindowListener(this);
        b_mod.addActionListener(this);
        b_canc.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        String conf = e.getActionCommand();
        if (conf.equals(b.getText()))
        {
            f.setVisible(false);
            f2.setVisible(true);
            control = false;
        }
        else
        {
            if (conf.equals(b_annulla.getText()))
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                f2.setVisible(false);
                f.setVisible(true);
            }
            else
            {
                if (conf.equals(b_fine.getText())&&(!control))
                {
                    boolean error1 = false, error2 = false, error3 = false, error4 = false;
                    try{
                        if ((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals("")))
                            JOptionPane.showMessageDialog(f2, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                        else
                        {
                            for (int i=0; i<t1.getText().length(); i++)
                            {
                                if ((t1.getText().charAt(i) == ' ')||((t1.getText().charAt(i) < 65)||((t1.getText().charAt(i) > 90)&&(t1.getText().charAt(i) < 97))||(t1.getText().charAt(i) > 122)))
                                    error1 = true;
                            }
                            for (int i=0; i<t2.getText().length(); i++)
                            {
                                if ((t2.getText().charAt(i) == ' ')||((t2.getText().charAt(i) < 65)||((t2.getText().charAt(i) > 90)&&(t2.getText().charAt(i) < 97))||(t2.getText().charAt(i) > 122)))
                                    error2 = true;
                            }
                            for (int i=0; i<t3.getText().length(); i++)
                            {
                                if ((t3.getText().charAt(i) == ' ')||(t3.getText().charAt(i) < 48)||(t3.getText().charAt(i) > 57))
                                    error3 = true;
                            }
                            for (int i=0; i<t4.getText().length(); i++)
                            {
                                if ((t4.getText().charAt(i) != 46)&&((t4.getText().charAt(i) == ' ')||((t4.getText().charAt(i) < 64)||((t4.getText().charAt(i) > 90)&&(t4.getText().charAt(i) < 97))||(t4.getText().charAt(i) > 122))))
                                    error4 = true;
                            }
                            if ((!error1)&&(!error2)&&(!error3)&&(!error4))
                            {
                                dati_ap = new Dati ();
                                dati_ap.setNome(t1.getText());
                                dati_ap.setCognome(t2.getText());
                                dati_ap.setTelefono(t3.getText());
                                dati_ap.setEmail(t4.getText());
                                dati.add(dati_ap);
                                
                                l_v.add(new JLabel(t1.getText()));
                                l_v.get(cont).setFont(new Font("", Font.BOLD, 20));
                                l_v.get(cont).addMouseListener(this);
                                l_v.get(cont).setForeground(color);
                                
                                g.gridx = 0;
                                g.gridy = cont+2;
                                g.gridwidth = 1;
                                g.gridheight = 1;
                                layout.setConstraints(l_v.get(cont), g);
                                p.add(l_v.get(cont));
                                cont++;
                                
                                t1.setText("");
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                f2.setVisible(false);
                                f.setVisible(true);
                            }
                            else
                                JOptionPane.showMessageDialog(f2, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                        }
                    }catch (StringIndexOutOfBoundsException e1) {
                        JOptionPane.showMessageDialog(f2, "Inserire tutti i correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else
                {
                    if (conf.equals(b_canc.getText()))
                    {
                        String trova = ltelefono.getText().substring(10);
                        for (int i=0; i<dati.size(); i++)
                        {
                            if (dati.get(i).getTelefono().equals(trova))
                            {
                                dati.remove(i);
                                l_v.remove(i);
                                cont--;
                            }
                        }
                        p.removeAll();
                        
                        f.add(p);
                        p.setLayout(layout);
                        
                        f.add(b, "North");

                        g.gridx = 0;
                        g.gridy = 1;
                        g.gridwidth = 1;
                        g.gridheight = 1;
                        layout.setConstraints(l, g);
                        p.add(l);
                        
                        for (int i=0; i<l_v.size(); i++)
                        {
                            g.gridx = 0;
                            g.gridy = i+2;
                            g.gridwidth = 1;
                            g.gridheight = 1;
                            layout.setConstraints(l_v.get(i), g);
                            p.add(l_v.get(i));
                        }
                        f3.setVisible(false);
                        f.setVisible(true);
                    }
                    else
                    {
                        if (conf.equals(b_mod.getText()))
                        {
                            f3.setVisible(false);
                            f2.setVisible(true);
                            control = true;
                        }
                        else
                            if (conf.equals(b_fine.getText())&&(control))
                            {
                                boolean error1 = false, error2 = false, error3 = false, error4 = false;
                                try{
                                    if ((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals("")))
                                        JOptionPane.showMessageDialog(f2, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                                    else
                                    {
                                        for (int i=0; i<t1.getText().length(); i++)
                                        {
                                            if ((t1.getText().charAt(i) == ' ')||((t1.getText().charAt(i) < 65)||((t1.getText().charAt(i) > 90)&&(t1.getText().charAt(i) < 97))||(t1.getText().charAt(i) > 122)))
                                                error1 = true;
                                        }
                                        for (int i=0; i<t2.getText().length(); i++)
                                        {
                                            if ((t2.getText().charAt(i) == ' ')||((t2.getText().charAt(i) < 65)||((t2.getText().charAt(i) > 90)&&(t2.getText().charAt(i) < 97))||(t2.getText().charAt(i) > 122)))
                                                error2 = true;
                                        }
                                        for (int i=0; i<t3.getText().length(); i++)
                                        {
                                            if ((t3.getText().charAt(i) == ' ')||(t3.getText().charAt(i) < 48)||(t3.getText().charAt(i) > 57))
                                                error3 = true;
                                        }
                                        for (int i=0; i<t4.getText().length(); i++)
                                        {
                                            if ((t4.getText().charAt(i) != 46)&&((t4.getText().charAt(i) == ' ')||((t4.getText().charAt(i) < 64)||((t4.getText().charAt(i) > 90)&&(t4.getText().charAt(i) < 97))||(t4.getText().charAt(i) > 122))))
                                                error4 = true;
                                        }
                                        if ((!error1)&&(!error2)&&(!error3)&&(!error4))
                                        {
                                            String trova = ltelefono.getText().substring(10);
                                            for (int i=0; i<dati.size(); i++)
                                            {
                                                if (trova.equals(dati.get(i).telefono))
                                                {
                                                    dati.get(i).setNome(t1.getText());
                                                    dati.get(i).setCognome(t2.getText());
                                                    dati.get(i).setTelefono(t3.getText());
                                                    dati.get(i).setEmail(t4.getText());
                                                    l_v.get(i).setText(dati.get(i).nome);
                                                }
                                            }
                                            t1.setText("");
                                            t2.setText("");
                                            t3.setText("");
                                            t4.setText("");
                                            f2.setVisible(false);
                                            f.setVisible(true);
                                        }
                                        else
                                            JOptionPane.showMessageDialog(f2, "Inserire tutti i campi correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                                    }
                                }catch (StringIndexOutOfBoundsException e1) {
                                    JOptionPane.showMessageDialog(f2, "Inserire tutti i correttamente.", "Errore", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                    }
                }
            }
        }
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        Component conf = e.getComponent();
        if (conf.equals(f2))
        {
            f2.setVisible(false);
            f.setVisible(true);
        }
        else
        {
            if (conf.equals(f3))
            {
                f3.setVisible(false);
                f.setVisible(true);
            }
            else
            {
                if (conf.equals(fcolor))
                {
                    color = color_choose.getColor();
                    switch (contcolor)
                    {
                        case 1:
                            p.setBackground(color);
                            p2.setBackground(color);
                            p3.setBackground(color);
                            break;
                        case 2:
                            l1.setForeground(color);
                            l2.setForeground(color);
                            l3.setForeground(color);
                            l4.setForeground(color);
                            t1.setForeground(color);
                            t2.setForeground(color);
                            t3.setForeground(color);
                            t4.setForeground(color);
                            l.setForeground(color);
                            lnome.setForeground(color);
                            lcognome.setForeground(color);
                            ltelefono.setForeground(color);
                            lemail.setForeground(color);
                            menu.setForeground(color);
                            menu1.setForeground(color);
                            menu2.setForeground(color);
                            menu2_1.setForeground(color);
                            menu2_2.setForeground(color);
                            menu2_3.setForeground(color);
                            menu2_4.setForeground(color);
                            for (int i=0; i<l_v.size(); i++)
                                l_v.get(i).setForeground(color);
                            break;
                        case 3:
                            b.setForeground(color);
                            b_annulla.setForeground(color);
                            b_fine.setForeground(color);
                            b_mod.setForeground(color);
                            b_canc.setForeground(color);
                            break;
                        case 4:
                            bordo = BorderFactory.createLineBorder(color, 2);
                            p.setBorder(bordo);
                            p2.setBorder(bordo);
                            p3.setBorder(bordo);
                            break;
                    }
                    
                }
                else
                    System.exit(0);
            }
        }
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        Component conf = e.getComponent();
        if (conf.equals(menu1))
            JOptionPane.showMessageDialog(f, "", "Info", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\rubrica\\settings\\info.png"));
        else
        {
            if (conf.equals(menu2_1))
            {
                fcolor.setVisible(true);
                contcolor = 1;
            }
            else
            {
                if (conf.equals(menu2_2))
                {
                    fcolor.setVisible(true);
                    contcolor = 2;
                }
                else
                {
                    if (conf.equals(menu2_3))
                    {
                        fcolor.setVisible(true);
                        contcolor = 3;
                    }
                    else
                    {
                        if (conf.equals(menu2_4))
                        {
                            fcolor.setVisible(true);
                            contcolor = 4;
                        }
                        else
                        {
                            p3.removeAll();
                            for (int i=0; i<l_v.size(); i++)
                                if (conf.equals(l_v.get(i)))
                                {
                                    f.setVisible(false);
                                    f3.setTitle(dati.get(i).getNome());
                                    lnome.setText("Nome: " +dati.get(i).getNome());
                                    lcognome.setText("Cognome: " +dati.get(i).getCognome());
                                    ltelefono.setText("Telefono: " +dati.get(i).getTelefono());
                                    lemail.setText("Email: " +dati.get(i).getEmail());

                                    f3.add(p3);
                                    p3.setLayout(layout);

                                    g.gridx = 0;
                                    g.gridy = 0;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(lnome, g);
                                    p3.add(lnome);

                                    g.gridx = 0;
                                    g.gridy = 1;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(lcognome, g);
                                    p3.add(lcognome);

                                    g.gridx = 0;
                                    g.gridy = 2;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(ltelefono, g);
                                    p3.add(ltelefono);

                                    g.gridx = 0;
                                    g.gridy = 3;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(lemail, g);
                                    p3.add(lemail);

                                    g.gridx = 0;
                                    g.gridy = 4;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(b_canc, g);
                                    p3.add(b_canc);

                                    g.gridx = 1;
                                    g.gridy = 4;
                                    g.gridwidth = 1;
                                    g.gridheight = 1;
                                    layout.setConstraints(b_mod, g);
                                    p3.add(b_mod);

                                    f3.setVisible(true);
                                }
                        }
                    }
                }
            }
            
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
    
}
