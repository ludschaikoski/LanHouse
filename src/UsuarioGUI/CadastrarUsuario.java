/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioGUI;

import Usuario.Usuario;
import UsuarioDAO.ConectaBanco;
import UsuarioDAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    private static Connection connection;
    private static Statement statement;

    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        CadastroUsuarioLabel = new javax.swing.JLabel();
        DadosPessoaisPanel = new javax.swing.JPanel();
        NomeTextField = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        ApelidoLabel = new javax.swing.JLabel();
        ApelidoTextField = new javax.swing.JTextField();
        CpfTextField = new javax.swing.JTextField();
        CpfLabel = new javax.swing.JLabel();
        TelefoneLabel1 = new javax.swing.JLabel();
        TelefoneTextField = new javax.swing.JTextField();
        DadosPessoaisLabel = new javax.swing.JLabel();
        EnderecoPanel = new javax.swing.JPanel();
        EnderecoLabel = new javax.swing.JLabel();
        RuaLabel = new javax.swing.JLabel();
        NumeroLabel = new javax.swing.JLabel();
        ComplementoLabel = new javax.swing.JLabel();
        BairroLabel = new javax.swing.JLabel();
        CidadeLabel = new javax.swing.JLabel();
        CepLabel = new javax.swing.JLabel();
        RuaTextField = new javax.swing.JTextField();
        NumeroTextField = new javax.swing.JTextField();
        ComplementoTextField = new javax.swing.JTextField();
        BairroTextField = new javax.swing.JTextField();
        CidadeTextField = new javax.swing.JTextField();
        CepTextField = new javax.swing.JTextField();
        Senhalabel = new javax.swing.JLabel();
        SalvarButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();
        SenhaPasswordField = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastroUsuarioLabel.setBackground(new java.awt.Color(22, 8, 8));
        CadastroUsuarioLabel.setForeground(new java.awt.Color(111, 119, 165));
        CadastroUsuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastroUsuarioLabel.setText("Cadastrar Usuário");
        CadastroUsuarioLabel.setToolTipText("");

        NomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTextFieldActionPerformed(evt);
            }
        });

        NomeLabel.setText("Nome: *");

        ApelidoLabel.setText("Apelido: *");

        ApelidoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApelidoTextFieldActionPerformed(evt);
            }
        });

        CpfLabel.setText("CPF: *");

        TelefoneLabel1.setText("Telefone:");

        DadosPessoaisLabel.setText("Dados Pessoais:");

        javax.swing.GroupLayout DadosPessoaisPanelLayout = new javax.swing.GroupLayout(DadosPessoaisPanel);
        DadosPessoaisPanel.setLayout(DadosPessoaisPanelLayout);
        DadosPessoaisPanelLayout.setHorizontalGroup(
            DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosPessoaisPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TelefoneLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DadosPessoaisPanelLayout.createSequentialGroup()
                        .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeLabel)
                            .addComponent(ApelidoLabel))
                        .addGap(24, 24, 24)
                        .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ApelidoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(CpfTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addComponent(CpfLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosPessoaisPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DadosPessoaisLabel)
                .addGap(125, 125, 125))
        );
        DadosPessoaisPanelLayout.setVerticalGroup(
            DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DadosPessoaisPanelLayout.createSequentialGroup()
                .addComponent(DadosPessoaisLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApelidoLabel)
                    .addComponent(ApelidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfLabel)
                    .addComponent(CpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DadosPessoaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneLabel1)
                    .addComponent(TelefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EnderecoLabel.setText("Endereço:");

        RuaLabel.setText("Rua:");

        NumeroLabel.setText("Número:");

        ComplementoLabel.setText("Complemento:");

        BairroLabel.setText("Bairro:");

        CidadeLabel.setText("Cidade:");

        CepLabel.setText("CEP:");

        javax.swing.GroupLayout EnderecoPanelLayout = new javax.swing.GroupLayout(EnderecoPanel);
        EnderecoPanel.setLayout(EnderecoPanelLayout);
        EnderecoPanelLayout.setHorizontalGroup(
            EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnderecoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnderecoPanelLayout.createSequentialGroup()
                        .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CidadeLabel)
                                .addComponent(BairroLabel))
                            .addGroup(EnderecoPanelLayout.createSequentialGroup()
                                .addComponent(RuaLabel)
                                .addGap(116, 116, 116)
                                .addComponent(RuaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(EnderecoPanelLayout.createSequentialGroup()
                                    .addGap(145, 145, 145)
                                    .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EnderecoPanelLayout.createSequentialGroup()
                                    .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NumeroLabel)
                                        .addComponent(CepLabel)
                                        .addComponent(ComplementoLabel))
                                    .addGap(41, 41, 41)
                                    .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnderecoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EnderecoLabel)
                        .addGap(185, 185, 185))))
        );
        EnderecoPanelLayout.setVerticalGroup(
            EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnderecoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RuaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RuaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroLabel)
                    .addComponent(NumeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComplementoLabel)
                    .addComponent(ComplementoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BairroLabel)
                    .addComponent(BairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CidadeLabel)
                    .addComponent(CidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EnderecoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CepLabel)
                    .addComponent(CepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        Senhalabel.setText("Senha:");

        SalvarButton.setText("Salvar");
        SalvarButton.setToolTipText("");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnderecoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DadosPessoaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Senhalabel)
                        .addGap(18, 18, 18)
                        .addComponent(SenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(SalvarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LimparButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SairButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastroUsuarioLabel)
                .addGap(26, 26, 26)
                .addComponent(DadosPessoaisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(EnderecoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senhalabel)
                    .addComponent(SalvarButton)
                    .addComponent(LimparButton)
                    .addComponent(SairButton)
                    .addComponent(SenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTextFieldActionPerformed

    private void ApelidoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApelidoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApelidoTextFieldActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairButtonActionPerformed

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_LimparButtonActionPerformed

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        // TODO add your handling code here:
        conectaBanco();
        String dados = "'" + NomeTextField.getText() + "','" + ApelidoTextField.getText() + "','" + CpfTextField.getText() + "','" + TelefoneTextField.getText() + "','" + RuaTextField.getText() + "','" + NumeroTextField.getText() + "','" + ComplementoTextField.getText() + "','" + BairroTextField.getText() + "','" + CidadeTextField.getText() + "','" + CepTextField.getText() + "','" + Senhalabel.getText() + "'";
        try {
            statement.executeUpdate("INSERT INTO usuario(nome, apelido, cpf, telefone,rua, numero, complemento, bairro, cidade, cep, senha)  VALUES (" + dados + ")");
            JOptionPane.showMessageDialog(this, "Dados Salvo!");
            NomeTextField.setText("");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro ao Cadastrar", "Cadastro nao sucedido", JOptionPane.ERROR_MESSAGE);
        }
        /*
         String nome = NomeTextField.getText();
         // int id = Integer.parseInt(IdTextField.getText()); //gera automatico
         String apelido = ApelidoTextField.getText();
         String cpf = CpfTextField.getText();
         String telefone = TelefoneTextField.getText();
         String endereco = RuaTextField.getText();
         // int numero = Integer.parseInt(NumeroTextField.getText());
         String senha = SenhaPasswordField.getText();
        
         Usuario usuario = new Usuario(nome, apelido, cpf, telefone, senha);

         */
        JOptionPane.showMessageDialog(rootPane, "Usuario Cadastrado", "Cadastro sucedido", JOptionPane.INFORMATION_MESSAGE);
        //} else {
        //    JOptionPane.showMessageDialog(rootPane, "Erro ao Cadastrar", "Cadastro nao sucedido", JOptionPane.ERROR_MESSAGE);
        //}


    }//GEN-LAST:event_SalvarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    public void conectaBanco() {
        try {
            //Class.forName("apache_derby_net");
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Endo", "postgres", "padoka92");
            statement = connection.createStatement();
            System.out.println("Banco de Dados conectado!!!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Nao conectou com o Banco de Dados!!!");
            System.out.println("" + e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApelidoLabel;
    private javax.swing.JTextField ApelidoTextField;
    private javax.swing.JLabel BairroLabel;
    private javax.swing.JTextField BairroTextField;
    private javax.swing.JLabel CadastroUsuarioLabel;
    private javax.swing.JLabel CepLabel;
    private javax.swing.JTextField CepTextField;
    private javax.swing.JLabel CidadeLabel;
    private javax.swing.JTextField CidadeTextField;
    private javax.swing.JLabel ComplementoLabel;
    private javax.swing.JTextField ComplementoTextField;
    private javax.swing.JLabel CpfLabel;
    private javax.swing.JTextField CpfTextField;
    private javax.swing.JLabel DadosPessoaisLabel;
    private javax.swing.JPanel DadosPessoaisPanel;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JPanel EnderecoPanel;
    private javax.swing.JButton LimparButton;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JTextField NomeTextField;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JTextField NumeroTextField;
    private javax.swing.JLabel RuaLabel;
    private javax.swing.JTextField RuaTextField;
    private javax.swing.JButton SairButton;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JPasswordField SenhaPasswordField;
    private javax.swing.JLabel Senhalabel;
    private javax.swing.JLabel TelefoneLabel1;
    private javax.swing.JTextField TelefoneTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
