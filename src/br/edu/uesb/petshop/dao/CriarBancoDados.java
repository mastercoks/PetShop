/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.dao;

/**
 *
 * @author matheus
 */
public class CriarBancoDados extends AbstractDAO {

    private void criarDatabase() {
        executeUpdate("CREATE DATABASE \"PetShop\"\n"
                + "  WITH ENCODING='UTF8'\n"
                + "       OWNER=postgres\n"
                + "       CONNECTION LIMIT=-1;");
    }

    private void criarSequences(String seq) {
        executeUpdate("-- Sequence: " + seq + "\n"
                + "\n"
                + "-- DROP SEQUENCE " + seq + ";\n"
                + "\n"
                + "CREATE SEQUENCE " + seq + "\n"
                + "  INCREMENT 1\n"
                + "  MINVALUE 1\n"
                + "  MAXVALUE 9000000000000000000\n"
                + "  START 1\n"
                + "  CACHE 1;\n"
                + "ALTER TABLE " + seq + "\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableAnimal() {
        executeUpdate("-- Table: animal\n"
                + "\n"
                + "-- DROP TABLE animal;\n"
                + "\n"
                + "CREATE TABLE animal\n"
                + "(\n"
                + "  id numeric DEFAULT nextval('seq_animal'::regclass),\n"
                + "  nome character varying,\n"
                + "  sexo character varying,\n"
                + "  especie character varying,\n"
                + "  raca character varying,\n"
                + "  id_dono numeric,\n"
                + "  CONSTRAINT animal_id_dono_fkey FOREIGN KEY (id_dono)\n"
                + "      REFERENCES cliente (id) MATCH SIMPLE\n"
                + "      ON UPDATE NO ACTION ON DELETE NO ACTION\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE animal\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableCliente() {
        executeUpdate("-- Table: cliente\n"
                + "\n"
                + "-- DROP TABLE cliente;\n"
                + "\n"
                + "CREATE TABLE cliente\n"
                + "(\n"
                + "  id numeric NOT NULL DEFAULT nextval('seq_cliente'::regclass),\n"
                + "  nome character varying,\n"
                + "  datanascimento date,\n"
                + "  sexo character varying,\n"
                + "  endereco character varying,\n"
                + "  bairro character varying,\n"
                + "  complemento character varying,\n"
                + "  cpf character varying,\n"
                + "  telefone1 character varying,\n"
                + "  telefone2 character varying,\n"
                + "  CONSTRAINT \"Cliente_pkey\" PRIMARY KEY (id)\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE cliente\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableExame() {
        executeUpdate("-- Table: exame\n"
                + "\n"
                + "-- DROP TABLE exame;\n"
                + "\n"
                + "CREATE TABLE exame\n"
                + "(\n"
                + "  id numeric DEFAULT nextval('seq_exame'::regclass),\n"
                + "  nome character varying,\n"
                + "  preco money\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE exame\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableServico() {
        executeUpdate("-- Table: servico\n"
                + "\n"
                + "-- DROP TABLE servico;\n"
                + "\n"
                + "CREATE TABLE servico\n"
                + "(\n"
                + "  id numeric DEFAULT nextval('seq_servico'::regclass),\n"
                + "  nome character varying,\n"
                + "  preco money\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE servico\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableCirurgia() {
        executeUpdate("-- Table: cirurgia\n"
                + "\n"
                + "-- DROP TABLE cirurgia;\n"
                + "\n"
                + "CREATE TABLE cirurgia\n"
                + "(\n"
                + "  id numeric DEFAULT nextval('seq_cirurgia'::regclass),\n"
                + "  nome character varying,\n"
                + "  preco money\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE cirurgia\n"
                + "  OWNER TO postgres;");
    }

    private void criarTableFuncionario() {
        executeUpdate("-- Table: funcionario\n"
                + "\n"
                + "-- DROP TABLE funcionario;\n"
                + "\n"
                + "CREATE TABLE funcionario\n"
                + "(\n"
                + "  id numeric DEFAULT nextval('seq_funcionario'::regclass),\n"
                + "  nome character varying,\n"
                + "  cpf character varying,\n"
                + "  datanascimento date,\n"
                + "  sexo character varying,\n"
                + "  login character varying(15) NOT NULL,\n"
                + "  senha character varying(20),\n"
                + "  nivel numeric(1,0) DEFAULT 1,\n"
                + "  endereco character varying,\n"
                + "  bairro character varying,\n"
                + "  complemento character varying,\n"
                + "  telefone2 character varying,\n"
                + "  telefone1 character varying\n"
                + ")\n"
                + "WITH (\n"
                + "  OIDS=FALSE\n"
                + ");\n"
                + "ALTER TABLE funcionario\n"
                + "  OWNER TO postgres;");
    }

    private void criarAdmin() {
        executeUpdate("INSERT INTO funcionario(\n"
                + "            login, senha, nivel)\n"
                + "    VALUES ('admin', 'admin', 2);");
    }

    public void CriarDatabase() {

        criarDatabase();

    }

    public void CriarBancoDeDados() {

        criarSequences("seq_animal");
        criarSequences("seq_cliente");
        criarSequences("seq_exame");
        criarSequences("seq_cirurgia");
        criarSequences("seq_servico");
        criarSequences("seq_funcionario");

        criarTableAnimal();
        criarTableCliente();
        criarTableExame();
        criarTableCirurgia();
        criarTableServico();
        criarTableFuncionario();

        criarAdmin();

    }

}
