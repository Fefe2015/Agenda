/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.form;

import br.senac.tads.pi3a.agenda.DAO.ContatoDao;
import br.senac.tads.pi3a.agenda.model.Contato;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class TelaContato extends javax.swing.JFrame {

    DefaultTableModel tbContato = new DefaultTableModel(null, new String[]{"Id", "Nome", "E-mail", "Data Nasc", "Tel Fixo", "Celular"});
    List<Contato> contatos;
    ListSelectionModel myContact;

    public TelaContato() {
        initComponents();
        txtCodigo.setEnabled(false);
        txtNome.setEnabled(false);
        txtEmail.setEnabled(false);
        jFormattedTextFieldDataNasc.setEnabled(false);
        txtTelFixo.setEnabled(false);
        txtCelular.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCodigo = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jDataNasc = new javax.swing.JLabel();
        jTelFixo = new javax.swing.JLabel();
        jCelular = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        txtTelFixo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        btbNovo = new javax.swing.JButton();
        btbExcluir = new javax.swing.JButton();
        btbAlterar = new javax.swing.JButton();
        btbSalvar = new javax.swing.JButton();
        btbSair = new javax.swing.JButton();
        jCampoObrigatório = new javax.swing.JLabel();
        jDataCad = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbContato = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Contato"));

        jCodigo.setText("Código:");

        jName.setForeground(new java.awt.Color(204, 0, 0));
        jName.setText("* Nome:");

        jEmail.setText("E-mail:");

        jDataNasc.setText("Data Nasc:");

        jTelFixo.setForeground(new java.awt.Color(204, 0, 0));
        jTelFixo.setText("* Tel Fixo:");

        jCelular.setText("Celular:");

        try {
            jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btbNovo.setText("Novo");
        btbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbNovoActionPerformed(evt);
            }
        });

        btbExcluir.setText("Excluir");
        btbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbExcluirActionPerformed(evt);
            }
        });

        btbAlterar.setText("Alterar");
        btbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAlterarActionPerformed(evt);
            }
        });

        btbSalvar.setText("Salvar");
        btbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSalvarActionPerformed(evt);
            }
        });

        btbSair.setText("Sair");
        btbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSairActionPerformed(evt);
            }
        });

        jCampoObrigatório.setForeground(new java.awt.Color(204, 0, 0));
        jCampoObrigatório.setText("* Campo Obrigatório");

        jDataCad.setText("Data:");

        jLData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jName)
                            .addComponent(jDataNasc)
                            .addComponent(jTelFixo)
                            .addComponent(jCodigo)
                            .addComponent(jEmail)
                            .addComponent(jCelular))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtTelFixo)
                            .addComponent(txtNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCampoObrigatório)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCelular, txtEmail, txtTelFixo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btbAlterar, btbExcluir, btbNovo, btbSair, btbSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btbNovo)
                            .addGap(18, 18, 18)
                            .addComponent(btbExcluir)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btbAlterar)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jDataNasc)
                                .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(84, 84, 84))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jEmail)
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTelFixo)
                                .addComponent(txtTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCelular)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDataCad)
                                .addComponent(jLData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jName)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCampoObrigatório)
                        .addComponent(btbSair))
                    .addComponent(btbSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCelular, txtCodigo, txtEmail, txtNome, txtTelFixo});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btbAlterar, btbExcluir, btbNovo, btbSair, btbSalvar});

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTbContato.setModel(tbContato);
        jTbContato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        myContact = jTbContato.getSelectionModel();
        myContact.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    selectionTable(jTbContato);
                }
            }
        });
        jScrollPane1.setViewportView(jTbContato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbNovoActionPerformed
        txtNome.setEnabled(true);
        txtEmail.setEnabled(true);
        jFormattedTextFieldDataNasc.setEnabled(true);
        txtTelFixo.setEnabled(true);
        txtCelular.setEnabled(true);

        btbExcluir.setEnabled(false);
        btbAlterar.setEnabled(false);

        txtCodigo.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        jFormattedTextFieldDataNasc.setText("");
        txtTelFixo.setText("");
        txtCelular.setText("");

    }//GEN-LAST:event_btbNovoActionPerformed

    public boolean validaDados() {
        if (!txtNome.getText().equals("") && !txtTelFixo.equals("")) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, " * Campo Obrigatório! ");
        }

        return false;
    }

    //Metodo que seleciona a linha na tabela
    public void selectionTable(JTable table) {
        if (jTbContato.getSelectedRow() != -1) {

            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            jFormattedTextFieldDataNasc.setEnabled(true);
            txtTelFixo.setEnabled(true);
            txtCelular.setEnabled(true);
            
            btbExcluir.setEnabled(true);
            btbAlterar.setEnabled(true);

            txtCodigo.setText(String.valueOf(contatos.get(table.getSelectedRow()).getId()));
            txtNome.setText(contatos.get(table.getSelectedRow()).getNome());
            txtEmail.setText(contatos.get(table.getSelectedRow()).getEmail());
            jFormattedTextFieldDataNasc.setText(String.valueOf(contatos.get(table.getSelectedRow()).getDataNasc()));
            txtTelFixo.setText(contatos.get(table.getSelectedRow()).getTelFixo());
            txtCelular.setText(contatos.get(table.getSelectedRow()).getTelCelular());
            //jLData.setText(contatos.get(table.getSelectedRow()).getData());
           // get(table.getSelectedRow()).getData());
            
        } else {
            txtCodigo.setText("");
            txtNome.setText("");
            txtEmail.setText("");
            jFormattedTextFieldDataNasc.setText("");
            txtTelFixo.setText("");
            txtCelular.setText("");
        }

    }

    public void Cadastrar() {
        try {
            Contato contato = new Contato();
            ContatoDao dao = new ContatoDao();

            contato.setNome(txtNome.getText());
            contato.setEmail(txtEmail.getText());
            contato.setDataNasc(jFormattedTextFieldDataNasc.getText());
            contato.setTelFixo(txtTelFixo.getText());
            contato.setTelCelular(txtCelular.getText());
            contato.setData(jLData.getText());
            dao.addContato(contato);

            //Limpa os campos da tela após realizar a inserção
            txtCodigo.setText("");
            txtNome.setText("");
            txtEmail.setText("");
            jFormattedTextFieldDataNasc.setText("");
            txtTelFixo.setText("");
            txtCelular.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(TelaContato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSalvarActionPerformed
        if (validaDados()) {
            Cadastrar();
            try {
                PesquisarContato();
            } catch (SQLException ex) {
                Logger.getLogger(TelaContato.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtCodigo.setEnabled(false);
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            jFormattedTextFieldDataNasc.setEnabled(false);
            txtTelFixo.setEnabled(false);
            txtCelular.setEnabled(false);

        }
    }//GEN-LAST:event_btbSalvarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed

        try {
            PesquisarContato();
            exibirPesquisa(contatos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro no Botão Pesquisar! " + ex);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void exibirPesquisa(List<Contato> contatos) {
        btbExcluir.setEnabled(true);
        //removendo todas as linhas maiores que zero
        while (tbContato.getRowCount() > 0) {
            tbContato.removeRow(0);
        }

        if (contatos.size() == 0) {
            JOptionPane.showMessageDialog(null, " Não há contato cadastrado! ");
        } else {
            //Adiciona uma linha para cada contato encontrado no banco
            String[] linha = new String[]{null, null, null, null, null, null};
            //String[] linha = new String[6];
            for (int i = 0; i < contatos.size(); i++) {

                tbContato.addRow(linha);
                tbContato.setValueAt(contatos.get(i).getId(), i, 0);
                tbContato.setValueAt(contatos.get(i).getNome(), i, 1);
                tbContato.setValueAt(contatos.get(i).getEmail(), i, 2);
                tbContato.setValueAt(contatos.get(i).getDataNasc(), i, 3);
                tbContato.setValueAt(contatos.get(i).getTelFixo(), i, 4);
                tbContato.setValueAt(contatos.get(i).getTelCelular(), i, 5);
                

            }
        }

    }

    private void btbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbExcluirActionPerformed
        btbExcluir.setEnabled(true);
        try {
            excluirContato();
            PesquisarContato();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro no Botão Excluir! " + ex);
        }
    }//GEN-LAST:event_btbExcluirActionPerformed

    private void btbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAlterarActionPerformed
        // btbAlterar.setEnabled(true);
        try {
            alterarContato();
            PesquisarContato();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro no Botão Alterar! " + ex);
        }
    }//GEN-LAST:event_btbAlterarActionPerformed

    private void btbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btbSairActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd" +"Hora: "+ " HH:mm:ss"); // convertendo a data para uma string com o formato definido
        jLData.setText(formato.format(dataSistema)); // passando a data do sistema para jLabelData, tem convertendo o formato da data para texto
       
    }//GEN-LAST:event_formWindowOpened
    
    
    
    public void excluirContato() throws SQLException {
        int recebe = JOptionPane.showConfirmDialog(this, " Confirma a Exclusão Deste Contato? ",
                "CONFIRMA", JOptionPane.YES_NO_OPTION);
        if (recebe == JOptionPane.YES_NO_OPTION) {
            ContatoDao dao = new ContatoDao();
            dao.exclui(contatos.get(jTbContato.getSelectedRow()));
        }
    }

    public void alterarContato() throws SQLException {
        if (jTbContato.getSelectedRow() != -1) {
            if (validaDados()) {
                Contato contato = new Contato();
                ContatoDao dao = new ContatoDao();

                contato.setId(Integer.parseInt(txtCodigo.getText()));
                contato.setNome(txtNome.getText());
                contato.setEmail(txtEmail.getText());
                contato.setDataNasc(jFormattedTextFieldDataNasc.getText());
                contato.setTelFixo(txtTelFixo.getText());
                contato.setTelCelular(txtCelular.getText());
                dao.alterar(contato);

                JOptionPane.showMessageDialog(null, " Contato Alterado!");

            }
        }
    }

    public void PesquisarContato() throws SQLException {

        ContatoDao dao = new ContatoDao();
        contatos = dao.getLista("%" + txtPesquisa.getText() + "%");
        exibirPesquisa(contatos);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAlterar;
    private javax.swing.JButton btbExcluir;
    private javax.swing.JButton btbNovo;
    private javax.swing.JButton btbSair;
    private javax.swing.JButton btbSalvar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jCampoObrigatório;
    private javax.swing.JLabel jCelular;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jDataCad;
    private javax.swing.JLabel jDataNasc;
    private javax.swing.JLabel jEmail;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbContato;
    private javax.swing.JLabel jTelFixo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelFixo;
    // End of variables declaration//GEN-END:variables

}
