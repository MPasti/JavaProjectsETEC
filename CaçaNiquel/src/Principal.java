
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Principal extends javax.swing.JFrame {

    
   int moeda = 20;
   int pontos = 0;
   
    /**
     * Creates new form Principal
     */
    public Principal() {
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("jackpot.png")));
        initComponents();
        
        bt_5.setEnabled(false);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_4 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo_moeda = new javax.swing.JLabel();
        remoeda = new javax.swing.JLabel();
        lbl_titulo_pontuacao = new javax.swing.JLabel();
        repont = new javax.swing.JLabel();
        bt_5 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_1.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N

        bt_2.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N

        bt_3.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Placar Geral"));

        lbl_titulo_moeda.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_titulo_moeda.setText("Quantidade de Moeda:");

        remoeda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        lbl_titulo_pontuacao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_titulo_pontuacao.setText("Pontuação..................:");

        repont.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_titulo_moeda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_titulo_pontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repont, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_titulo_moeda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remoeda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_titulo_pontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        bt_5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_5.setText("Apostar");
        bt_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });

        bt_6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_6.setText("Novo Jogo");
        bt_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });

        bt_7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_7.setText("Sair");
        bt_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(bt_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        int i1, i2, i3;
        Random r1 = new Random();
        Random r2 = new Random();
        Random r3 = new Random();
        i1 = r1.nextInt(10);
        i2 = r2.nextInt(10);
        i3 = r3.nextInt(10);
        bt_1.setText(String.valueOf(i1));
        bt_2.setText(String.valueOf(i2));
        bt_3.setText(String.valueOf(i3));
        checarjogo(i1, i2, i3);        // TODO add your handling code here:
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bt_7ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        moeda = 0;
    moeda = 20;
    pontos = 0; 
                remoeda.setText(String.valueOf(moeda));
            repont.setText(String.valueOf(pontos));
                    bt_1.setText("");
        bt_2.setText("");
        bt_3.setText("");
                       bt_1.setEnabled(true);
                   bt_2.setEnabled(true);
                   bt_3.setEnabled(true);
                    bt_5.setEnabled(true);
    // TODO add your handling code here:
    }//GEN-LAST:event_bt_6ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    public void checarjogo (int a, int b, int c){
        if((a == 7)&&(b==7)&&(c==7)){
            moeda = moeda + 100;
            pontos = pontos + 100;
            JOptionPane.showMessageDialog(rootPane, "Parabéns, você é o vencedor!");
            remoeda.setText(String.valueOf(moeda));
            repont.setText(String.valueOf(pontos));
            bt_1.setEnabled(false);
            bt_2.setEnabled(false);
            bt_3.setEnabled(false);
        }else{
            if(((a==7)&&(b==7))|| ((a == 7) && (c==7)) || ((b==7) && (c ==7))){
                moeda = moeda +2;
                pontos = pontos +2;
                remoeda.setText(String.valueOf(moeda));
                repont.setText(String.valueOf(pontos));
            }else{
                if((a==7)||(b==7)||(c==7)){
                moeda = moeda +1;
                pontos = pontos +1;
                remoeda.setText(String.valueOf(moeda));
                repont.setText(String.valueOf(pontos));
                }else{
                if((a!=7)&&(b!=7)&&(c!=7)){
                moeda = moeda -1;
                remoeda.setText(String.valueOf(moeda));
                repont.setText(String.valueOf(pontos));
                if (moeda == 0){
                    JOptionPane.showMessageDialog(rootPane, "Você perdeu!");
                   bt_1.setEnabled(false);
                   bt_2.setEnabled(false);
                   bt_3.setEnabled(false);
                    bt_5.setEnabled(false);
                }
                }
              }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_titulo_moeda;
    private javax.swing.JLabel lbl_titulo_pontuacao;
    private javax.swing.JLabel remoeda;
    private javax.swing.JLabel repont;
    // End of variables declaration//GEN-END:variables
}
