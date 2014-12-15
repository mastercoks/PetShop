/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders;
/**
 *
 * @author matheus
 */
public class Campovazio {

    //metodo para controlar os labels lbFalta
    public boolean textfield(javax.swing.JTextField txt) {
        boolean valor;
        if (txt.getText().length() <= 0) {
            txt.setBorder(new LineBorder(Color.RED));
            valor = true;
        } else {
            txt.setBorder(new MetalBorders.TextFieldBorder());
            valor = false;
        }
        return valor;
    }

    public boolean formattedtextfield(javax.swing.JFormattedTextField txt) {
//        int numero = Integer.parseInt(txt.getText());
        boolean valor;
        String string = txt.getText();
        string = string.replace('-', ' ');
        string = string.replace('(', ' ');
        string = string.replace(')', ' ');
        string = string.replace('.', ' ');
        string = string.replace('/', ' ');
        string = string.replaceAll(" ", " ");

        if (string.substring(1, 10).trim().equals("")) {
            txt.setBorder(new LineBorder(Color.RED));
            valor = true;
        } else {
            txt.setBorder(new MetalBorders.TextFieldBorder());
            valor = false;
        }
        return valor;
    }

    public boolean limparFormattedtextfield(javax.swing.JFormattedTextField txt) {
        boolean valor;
        txt.setBorder(new MetalBorders.TextFieldBorder());
        txt.setText("");
        valor = false;
        return valor;
    }

    public boolean limparTextfield(javax.swing.JTextField txt) {
        boolean valor;
        txt.setBorder(new MetalBorders.TextFieldBorder());
        txt.setText("");
        valor = false;
        return valor;
    }

    public boolean combobox(javax.swing.JComboBox txt) {
        boolean valor;
        int item = txt.getSelectedIndex();
//        String string;
//        string = Integer.toString(txt.getSelectedIndex());
        if (item == 0) {
            txt.setForeground(Color.RED);
            valor = true;
        } else {
            txt.setForeground(Color.getHSBColor(0, 0, (float) 30.2));
            valor = false;
        }
        return valor;
    }
    
    public boolean limparCombobox(javax.swing.JComboBox txt) {
        boolean valor;
        txt.setForeground(Color.getHSBColor(0, 0, (float) 30.2));
        txt.setSelectedItem(0);
        valor = false;
        return valor;
    }

    public void capslock(final javax.swing.JTextField txt) {
        txt.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt.setText(txt.getText().toUpperCase());
            }
        });
    }
}
