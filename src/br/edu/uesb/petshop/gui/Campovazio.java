/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.gui;
import br.edu.uesb.petshop.gui.Login;
/**
 *
 * @author matheus
 */

public class Campovazio {

    //metodo para controlar os labels lbFalta
    public boolean textfield(javax.swing.JTextField txt, javax.swing.JLabel label) {
        if (txt.getText().length() <= 0) {
            label.setVisible(true);
            return true;
        } else {
            label.setVisible(false);
            return false;
        }
    }

    public boolean formattedtextfield(javax.swing.JFormattedTextField txt, javax.swing.JLabel label) {
//        int numero = Integer.parseInt(txt.getText());
        String string = new String(txt.getText());
        string = string.replace('-', ' ');
        string = string.replace('(', ' ');
        string = string.replace(')', ' ');
        string = string.replace('.', ' ');
        string = string.replace('/', ' ');
        string = string.replaceAll(" ", " ");

        if (string.substring(1, 10).trim().equals("")) {
            label.setVisible(true);
            return true;
        } else {
            label.setVisible(false);
            return false;
        }
    }

    public boolean combobox(javax.swing.JComboBox txt, javax.swing.JLabel label) {
        int item = new Integer(txt.getSelectedIndex());
//        String string;
//        string = Integer.toString(txt.getSelectedIndex());
        if (item == 0) {
            label.setVisible(true);
            return true;
        } else {
            label.setVisible(false);
            return false;
        }
    }
}
