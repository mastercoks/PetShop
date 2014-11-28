/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.model;

import br.edu.uesb.petshop.gui.BarraDeMenu;
import br.edu.uesb.petshop.gui.TelaLogin;

/**
 *
 * @author Matheus
 */
public class PetShop extends javax.swing.JPanel{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        
        BarraDeMenu tela = new BarraDeMenu();
        TelaLogin telaL = new TelaLogin();
        tela.setVisible(true);
        
        tela.setPanel(telaL.pLogin);
//        tela.setContentPane(telaL.pLogin);
        
//        teste.setContentPane(teste.pMenuPrincipal);
        

    }
}
