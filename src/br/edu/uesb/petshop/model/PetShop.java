/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.model;

import br.edu.uesb.petshop.view.TelaLogin;
import br.edu.uesb.petshop.view.BarraDeMenu;

/**
 *
 * @author Matheus
 */
public class PetShop{

    
    public static BarraDeMenu tela;
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        
        PetShop.tela = new BarraDeMenu();
        tela.setVisible(true);
        
        TelaLogin telaServ = new TelaLogin();
        tela.setPanel(telaServ);
        

    }
}
