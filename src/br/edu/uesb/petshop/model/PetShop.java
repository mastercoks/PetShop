/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.model;

import br.edu.uesb.petshop.gui.*;

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
        TelaMenuServico telaLoginold = new TelaMenuServico();
        tela.setPanel(telaLoginold);
//        TelaMenuServico telaServ = new TelaMenuServico();
//        tela.setPanel(telaServ);
        

    }
}
