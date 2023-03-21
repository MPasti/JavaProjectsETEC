
import Utilitarios.conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class frmCadastroProdutos extends javax.swing.JFrame {
    
    conexao con_cliente;
    
    public frmCadastroProdutos() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from tbclientes order by codigo");
        posicionarRegistro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataNascto = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnVoltaUmRegistro = new javax.swing.JButton();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnAvancaUmRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Clientes");
        setMinimumSize(new java.awt.Dimension(806, 497));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 140, 55, 22);

        txtCodigo.setBackground(new java.awt.Color(0, 0, 0));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(260, 140, 158, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 180, 48, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 260, 68, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Nasc:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 220, 79, 22);

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(260, 180, 272, 20);

        txtDataNascto.setBackground(new java.awt.Color(0, 0, 0));
        txtDataNascto.setForeground(new java.awt.Color(255, 255, 255));
        txtDataNascto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNasctoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataNascto);
        txtDataNascto.setBounds(260, 220, 115, 20);

        txtTelefone.setBackground(new java.awt.Color(0, 0, 0));
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(260, 260, 158, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 300, 51, 22);

        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(260, 300, 207, 20);

        btnVoltaUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultset_previous.png"))); // NOI18N
        btnVoltaUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaUmRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltaUmRegistro);
        btnVoltaUmRegistro.setBounds(200, 480, 49, 26);

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrimeiroRegistro);
        btnPrimeiroRegistro.setBounds(140, 480, 49, 26);

        btnAvancaUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultset_next.png"))); // NOI18N
        btnAvancaUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancaUmRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvancaUmRegistro);
        btnAvancaUmRegistro.setBounds(260, 480, 49, 26);

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnUltimoRegistro);
        btnUltimoRegistro.setBounds(320, 480, 49, 26);

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disk.png"))); // NOI18N
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(550, 480, 29, 26);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_form_magnify.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(590, 480, 29, 26);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_edit.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(620, 480, 29, 26);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/application_delete.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(660, 480, 29, 26);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(520, 480, 29, 26);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/door_in.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(660, 510, 41, 26);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/palm.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-680, -100, 1910, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtDataNasctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNasctoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNasctoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
       String nome = txtNome.getText();
       String data_nasc = txtDataNascto.getText();
       String telefone = txtTelefone.getText();
       String email = txtEmail.getText();  
       try{
           
           String insert_sql = "insert into tbclientes (nome, dt_nasc, telefone, email) values('" + nome + "','"
                   + data_nasc + "','" + telefone + "','" + email + "')";
           
           con_cliente.statement.executeUpdate(insert_sql);
           JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso");
           
           con_cliente.resultset = con_cliente.statement.executeQuery("Select * from tbclientes order by nome");
           con_cliente.resultset.first();
           mostrarDados();
       } catch (SQLException errosql) {
           JOptionPane.showMessageDialog(null, "\nErro na gravação!\nERRO: " + errosql);
       }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
            new Direct().setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVoltaUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaUmRegistroActionPerformed
        try{
            con_cliente.resultset.previous();
            mostrarDados();
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "\nNão foi possível achar o registro\n" + erro);
        }
    }//GEN-LAST:event_btnVoltaUmRegistroActionPerformed

    private void btnAvancaUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancaUmRegistroActionPerformed
              try{
            con_cliente.resultset.next();
            mostrarDados();
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "\nNão foi possível achar o registro\n" + erro);
        }
    }//GEN-LAST:event_btnAvancaUmRegistroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       txtCodigo.setText("");
        txtNome.setText("");
         txtDataNascto.setText("");
          txtTelefone.setText("");
           txtEmail.setText("");
            txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
               try{
            con_cliente.resultset.last();
            mostrarDados();
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "\nNão foi possível achar o registro\n" + erro);
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
               try{
            con_cliente.resultset.first();
            mostrarDados();
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "\nNão foi possível achar o registro\n" + erro);
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       String sql = "";
       try{
           int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir mesmo?",
                   "confirmar exclusão", JOptionPane.YES_OPTION, 3);
           if (resposta == 0){
               sql = "delete from tbclientes where codigo = " + txtCodigo.getText();
               int excluir = con_cliente.statement.executeUpdate(sql);
               if (excluir == 1){
                   JOptionPane.showMessageDialog(rootPane, "Exclusão realizada com sucesso");
                   con_cliente.executaSQL("Select * from tbclientes order by codigo");
                   con_cliente.resultset.first();
                   posicionarRegistro();
                   mostrarDados();
               }
           } else {
               JOptionPane.showMessageDialog(null, "\nOperação cancelada pelo usuário");
           }
       } catch (SQLException excecao) {
           JOptionPane.showMessageDialog(null, "\nErro de exclusão" + excecao
           + "\nComando SQL passado" + sql);
           
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    public void mostrarDados(){
        try{
            txtCodigo.setText(con_cliente.resultset.getString("codigo"));
            txtNome.setText(con_cliente.resultset.getString("nome"));
            txtDataNascto.setText(con_cliente.resultset.getString("dt_nasc"));
            txtTelefone.setText(con_cliente.resultset.getString("telefone"));
            txtEmail.setText(con_cliente.resultset.getString("email"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro.getMessage());
        }
    }
    public void posicionarRegistro(){
        try{
            con_cliente.resultset.first();
            mostrarDados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "\nNão foi possivel posicionar o primeiro registro\n"+erro);
        }
    }
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
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new frmCadastroClientes().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvancaUmRegistro;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltaUmRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataNascto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}