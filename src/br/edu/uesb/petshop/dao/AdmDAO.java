/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

import java.sql.ResultSet;
import br.edu.uesb.petshop.model.Adm;

/**
 *
 * @author matheus
 */
public class AdmDAO extends AbstractDAO {

    public ResultSet getById(int id) {
        
        ResultSet rs = executeQuery("SELECT * FROM \"Admin\" WHERE id = " + id);
        return rs;
        
    }
    
    public ResultSet getByLogin(String login) {
        ResultSet rs = executeQuery("SELECT * FROM \"Admin\" WHERE \"login\" = '"+login+"';");
        return rs;
    }
    
    public ResultSet getBySenha(String senha){
        ResultSet rs = executeQuery("SELECT * FROM \"Admin\" WHERE \"senha\" = '"+senha+"';");
        return rs;
    }
    
     public void insert(Adm adm) {
        String sql = "INSERT INTO \"Admin\"(\n"
                + "            login, senha)\n"
                + "    VALUES ('" + adm.getLogin()+ ", " + adm.getSenha() + "');";
        executeUpdate(sql);
    }

    public void delete(Adm adm) {
        String sql = "DELETE FROM \"Admin\" WHERE id = " + adm.getId();
        executeUpdate(sql);
    }

    public void update(Adm adm) {
        String sql = "UPDATE \"Admin\""
                + "   SET login=" + adm.getLogin()+ ", senha=" + adm.getSenha() + ";";
        executeUpdate(sql);
    }
    
    

}
