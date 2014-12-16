/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uesb.petshop.view;

import br.edu.uesb.petshop.control.TelaLoginControl;
import br.edu.uesb.petshop.enumerado.EnumView;
import br.edu.uesb.petshop.model.Cliente;

/**
 *
 * @author matheus
 */
public class BarraDeMenu extends javax.swing.JFrame {

    TelaLogin tLogin;
    TelaMenuPrincipal tPrincipal;
    TelaMenuCliente tMenuCliente;
    TelaMenuAnimal tMenuAnimal;
    TelaMenuFuncionario tMenuFuncionario;
    TelaMenuAtendimento tMenuAtendimento;
    TelaAddCliente tAddCliente;
    TelaBuscarCliente tBuscarCliente;
    TelaAddAnimal tAddAnimal;
    TelaBuscarAnimal tBuscarAnimal;
    TelaAddFuncionario tAddFuncionario;
    TelaBuscarFuncionario tBuscarFuncionario;
    TelaAddAtendimento tAddAtendimento;
    TelaBuscarAtendimento tBuscarAtendimento;
    TelaBuscaResultado1 tBuscaResultado;
    TelaAddFuncionario1 tAddFuncionario1;

    /**
     * Creates new form BarraDeMenu
     */
    public BarraDeMenu() {
        initComponents();
        tLogin = new TelaLogin();
        tPrincipal = new TelaMenuPrincipal();
        tMenuCliente = new TelaMenuCliente();
        tMenuAnimal = new TelaMenuAnimal();
        tMenuFuncionario = new TelaMenuFuncionario();
        tMenuAtendimento = new TelaMenuAtendimento();
        tAddAnimal = new TelaAddAnimal();
        tAddAtendimento = new TelaAddAtendimento();
        tAddCliente = new TelaAddCliente();
        tAddFuncionario = new TelaAddFuncionario();
        tBuscarAnimal = new TelaBuscarAnimal();
        tBuscarAtendimento = new TelaBuscarAtendimento();
        tBuscarCliente = new TelaBuscarCliente();
        tAddFuncionario = new TelaAddFuncionario();
        tBuscaResultado = new TelaBuscaResultado1();
        tAddFuncionario1 = new TelaAddFuncionario1();
        tBuscarFuncionario = new TelaBuscarFuncionario();
    }

    public void setTipoMenu(TelaLoginControl.EnumLogin tipo) {
        tPrincipal.setTipoMenu(tipo);

    }

    public void habilitaBarra() {
        mAnimais.setEnabled(true);
        mClientes.setEnabled(true);
        mAtendimento.setEnabled(true);
        mCadastro.setEnabled(true);
    }

    public void desabilitaBarra() {
        mAnimais.setEnabled(false);
        mClientes.setEnabled(false);
        mAtendimento.setEnabled(false);
        mCadastro.setEnabled(false);
    }

    public void habilitaEdicao() {
//        tAddCliente.
    }

    public void viewCliente(Cliente cliente) {

        String data = cliente.getDataNasc().toString().substring(8, 10) + "/"
                + cliente.getDataNasc().toString().substring(5, 7) + "/"
                + cliente.getDataNasc().toString().substring(0, 4);
        tAddCliente = new TelaAddCliente();
        tAddCliente.setTxtNomeAddCliente(cliente.getNome());
        tAddCliente.setTxtCpfAddCliente(cliente.getCpf());
        tAddCliente.setTxtEnderecoAddCliente(cliente.getEndereco());
        tAddCliente.setTxtComplementoAddCliente(cliente.getComplemento());
        tAddCliente.setTxtBairroAddCliente(cliente.getBairro());
        tAddCliente.setTxtDataNascAddCliente(data);
        tAddCliente.setTxtTelefone1AddCliente(cliente.getTelefone1());
        tAddCliente.setTxtTelefone2AddCliente(cliente.getTelefone2());
        tAddCliente.setCbSexoAddCliente(cliente.getSexo());

        tAddCliente.setNoEditCPf(false);

        tAddCliente.setbEnableExcluir(true);
        tAddCliente.setbEnableAtualizar(true);
        tAddCliente.setbEnableSalvar(false);

    }

    public void showView(EnumView view) {
        switch (view) {
            case TELALOGIN:
                setPanel(tLogin);
                desabilitaBarra();
                break;
            case TELAPRINCIPAL:
                setPanel(tPrincipal);
                habilitaBarra();
                break;
            case TELACLIENTE:
                setPanel(tMenuCliente);
                break;
            case TELAFUNCIONARIO:
                setPanel(tMenuFuncionario);
                break;
            case TELAANIMAL:
                setPanel(tMenuAnimal);
                break;
            case TELAATENDIMENTO:
                setPanel(tMenuAtendimento);
                break;
            case TELAADDANIMAL:
                setPanel(tAddAnimal);
                break;
            case TELAADDATENDIMENTO:
                setPanel(tAddAtendimento);
                break;
            case TELAADDCLIENTE:

                tAddCliente.setNoEditCPf(true);
                tAddCliente.setbEnableSalvar(true);
                tAddCliente.setbEnableExcluir(false);
                tAddCliente.setbEnableAtualizar(false);
                setPanel(tAddCliente);
                break;
            case TELAADDFUNCIONARIO:
                setPanel(tAddFuncionario);
                break;
            case TELABUSCARANIMAL:
                setPanel(tBuscarAnimal);
                break;
            case TELABUSCARATENDIMENTO:
                setPanel(tBuscarAtendimento);
                break;
            case TELABUSCARCLIENTE:
                setPanel(tBuscarCliente);
                break;
            case TELABUSCARFUNCIONARIO:
                setPanel(tBuscarFuncionario);
                break;
            case TELAADDFUNCIONARIO1:
                setPanel(tAddFuncionario1);
                break;
            case TELAVIEWCLIENTE:
//                viewCliente();
                setPanel(tAddCliente);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bmBarraMenu = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miAnimal = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        miBuscarCliente = new javax.swing.JMenuItem();
        mAnimais = new javax.swing.JMenu();
        miBuscarAnimal = new javax.swing.JMenuItem();
        mAtendimento = new javax.swing.JMenu();
        miOrcamento = new javax.swing.JMenuItem();
        miNovoAtendimento = new javax.swing.JMenuItem();
        miContultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));

        mCadastro.setText("Cadastro");
        mCadastro.setEnabled(false);

        miAnimal.setText("Animal");
        miAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAnimalActionPerformed(evt);
            }
        });
        mCadastro.add(miAnimal);

        miCliente.setText("Cliente");
        mCadastro.add(miCliente);

        bmBarraMenu.add(mCadastro);

        mClientes.setText("Clientes");
        mClientes.setEnabled(false);

        miBuscarCliente.setText("Buscar");
        mClientes.add(miBuscarCliente);

        bmBarraMenu.add(mClientes);

        mAnimais.setText("Animais");
        mAnimais.setEnabled(false);

        miBuscarAnimal.setText("Buscar");
        mAnimais.add(miBuscarAnimal);

        bmBarraMenu.add(mAnimais);

        mAtendimento.setText("Atendimento");
        mAtendimento.setEnabled(false);

        miOrcamento.setText("Orçamento");
        mAtendimento.add(miOrcamento);

        miNovoAtendimento.setText("Novo Atendimento");
        mAtendimento.add(miNovoAtendimento);

        miContultar.setText("Consultar");
        miContultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContultarActionPerformed(evt);
            }
        });
        mAtendimento.add(miContultar);

        bmBarraMenu.add(mAtendimento);

        setJMenuBar(bmBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miAnimalActionPerformed

    private void miContultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miContultarActionPerformed

    public void setPanel(javax.swing.JPanel panel) {
        setContentPane(panel);
        pack();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmBarraMenu;
    private javax.swing.JMenu mAnimais;
    private javax.swing.JMenu mAtendimento;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem miAnimal;
    private javax.swing.JMenuItem miBuscarAnimal;
    private javax.swing.JMenuItem miBuscarCliente;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miContultar;
    private javax.swing.JMenuItem miNovoAtendimento;
    private javax.swing.JMenuItem miOrcamento;
    // End of variables declaration//GEN-END:variables
}
