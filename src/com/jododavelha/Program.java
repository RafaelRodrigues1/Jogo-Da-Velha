package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class Program extends javax.swing.JFrame {

    
    public Program() {
        initComponents();
        b1.setVisible(false);
        x1.setVisible(false);
        b2.setVisible(false);
        x2.setVisible(false);       
        b3.setVisible(false);
        x3.setVisible(false);
        b4.setVisible(false);
        x4.setVisible(false);
        b5.setVisible(false);
        x5.setVisible(false);       
        b6.setVisible(false);
        x6.setVisible(false);
        b7.setVisible(false);
        x7.setVisible(false);
        b8.setVisible(false);
        x8.setVisible(false);       
        b9.setVisible(false);
        x9.setVisible(false);
        Velha.primeiraJogada(JOptionPane.showConfirmDialog(null, "Primeira jogada do X?", "Primeira jogada", JOptionPane.YES_NO_OPTION));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        x4 = new javax.swing.JLabel();
        x5 = new javax.swing.JLabel();
        x6 = new javax.swing.JLabel();
        x7 = new javax.swing.JLabel();
        x8 = new javax.swing.JLabel();
        x9 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(lbl1, gridBagConstraints);

        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(lbl2, gridBagConstraints);

        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(lbl3, gridBagConstraints);

        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(lbl4, gridBagConstraints);

        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(lbl5, gridBagConstraints);

        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(lbl6, gridBagConstraints);

        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(lbl7, gridBagConstraints);

        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(lbl8, gridBagConstraints);

        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(lbl9, gridBagConstraints);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(x1, gridBagConstraints);

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(x2, gridBagConstraints);

        x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(x3, gridBagConstraints);

        x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(x4, gridBagConstraints);

        x5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(x5, gridBagConstraints);

        x6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(x6, gridBagConstraints);

        x7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(x7, gridBagConstraints);

        x8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(x8, gridBagConstraints);

        x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(x9, gridBagConstraints);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(b1, gridBagConstraints);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(b2, gridBagConstraints);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(b3, gridBagConstraints);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(b4, gridBagConstraints);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(b5, gridBagConstraints);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(b6, gridBagConstraints);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(b7, gridBagConstraints);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(b8, gridBagConstraints);

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(b9, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/jgvelha.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 48, 63);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        if(Velha.verificaCampo(Velha.getCampo3())){
            if(Velha.verificaJogada()){
                x3.setVisible(true);
                X.setX3(1);
               
            }else{
                b3.setVisible(true);
                B.setB3(1);                
            }
             Velha.setCampo3(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        if(Velha.verificaCampo(Velha.getCampo1())){
            if(Velha.verificaJogada()){
                x1.setVisible(true);
                X.setX1(1);
               
            }else{
                b1.setVisible(true);
                B.setB1(1);                
            }
             Velha.setCampo1(1);
             Velha.verificaEmpate();
        }
        
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        if(Velha.verificaCampo(Velha.getCampo2())){
            if(Velha.verificaJogada()){
                x2.setVisible(true);
                X.setX2(1);
               
            }else{
                b2.setVisible(true);
                B.setB2(1);                
            }
             Velha.setCampo2(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        if(Velha.verificaCampo(Velha.getCampo6())){
            if(Velha.verificaJogada()){
                x6.setVisible(true);
                X.setX6(1);
               
            }else{
                b6.setVisible(true);
                B.setB6(1);                
            }
             Velha.setCampo6(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        if(Velha.verificaCampo(Velha.getCampo9())){
            if(Velha.verificaJogada()){
                x9.setVisible(true);
                X.setX9(1);
               
            }else{
                b9.setVisible(true);
                B.setB9(1);                
            }
             Velha.setCampo9(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        if(Velha.verificaCampo(Velha.getCampo5())){
            if(Velha.verificaJogada()){
                x5.setVisible(true);
                X.setX5(1);
               
            }else{
                b5.setVisible(true);
                B.setB5(1);                
            }
             Velha.setCampo5(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
       if(Velha.verificaCampo(Velha.getCampo8())){
            if(Velha.verificaJogada()){
                x8.setVisible(true);
                X.setX8(1);
               
            }else{
                b8.setVisible(true);
                B.setB8(1);                
            }
             Velha.setCampo8(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        if(Velha.verificaCampo(Velha.getCampo7())){
            if(Velha.verificaJogada()){
                x7.setVisible(true);
                X.setX7(1);
               
            }else{
                b7.setVisible(true);
                B.setB7(1);                
            }
             Velha.setCampo7(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        if(Velha.verificaCampo(Velha.getCampo4())){
            if(Velha.verificaJogada()){
                x4.setVisible(true);
                X.setX4(1);
               
            }else{
                b4.setVisible(true);
                B.setB4(1);                
            }
             Velha.setCampo4(1);
             Velha.verificaEmpate();
        }
    }//GEN-LAST:event_lbl4MouseClicked

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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }
    int jogou00=0, jogou01=0, jogou02=0, jogou10=0, jogou11=0, jogou12=0, jogou20=0, jogou21=0, jogou22=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
    private javax.swing.JLabel x6;
    private javax.swing.JLabel x7;
    private javax.swing.JLabel x8;
    private javax.swing.JLabel x9;
    // End of variables declaration//GEN-END:variables
}
