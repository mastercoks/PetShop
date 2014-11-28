package br.edu.uesb.petshop.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class ConexaoPostgreSQL {

    public static String url = "jdbc:postgresql://localhost:5432/PetShop";
    public static String usuario = "postgres";
    public static String senha = "123";

    public static Statement openConnectionPostgreSQL() {

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, usuario, senha);
//            Cria uma variavel Statement
            return con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados ", "ERRO", JOptionPane.ERROR_MESSAGE, null);

        }
        return null;
    }

    public static void closeConnectionPostgreSQL(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
