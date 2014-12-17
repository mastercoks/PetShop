/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.control;

import br.edu.uesb.petshop.dao.AnimalDAO;
import br.edu.uesb.petshop.model.Animal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class TelaAddAnimalControl {

    AnimalDAO animalDAO;

    public void salvarAnimal(Animal animal) {

        animalDAO = new AnimalDAO();

        animalDAO.insert(animal);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);

    }

    public void excluirAnimal(Animal animal) {

        animalDAO = new AnimalDAO();

        animalDAO.delete(animal);
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);

    }

    public void atualizarAnimal(Animal animal) {

        animalDAO = new AnimalDAO();

        animalDAO.update(animal);
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!", "Atenção", JOptionPane.PLAIN_MESSAGE, null);
    
    }

    public boolean verificaNomeExistente(String nome) {
        animalDAO = new AnimalDAO();

        

        try {
            ResultSet rs = animalDAO.getByNome(nome);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaAddAnimalControl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
    }
    
    public ResultSet bucarByNome(String nome){
        
        animalDAO = new AnimalDAO();
        return animalDAO.getByNome(nome);
    }
    
    public ResultSet bucarByIdDono(int id){
        
        animalDAO = new AnimalDAO();
        return animalDAO.getByIdDono(id);
    }
    
}
