package avaliaçãounid2;

public class JogoForca extends javax.swing.JFrame {
    
    
    public void setLabelWord(String LabelWord) {
        this.LabelWord.setText(LabelWord);       
    }
    public void setLabelLetter(String LabelLetter) {
        this.LabelLetter.setText(LabelLetter);       
    }
    public void setLabelDicas(String LabelDicas) {
        this.LabelDicas.setText("Dica: " + LabelDicas);       
    }
    
    
    public JogoForca() {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelWord = new javax.swing.JLabel();
        BotãoComeçar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LabelLetter = new javax.swing.JLabel();
        LabelDica = new javax.swing.JLabel();
        LabelDicas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Joguinho da Forca");

        LabelWord.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelWord.setText("Observe o TERMINAL para acompanhar seu progresso!");
        LabelWord.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BotãoComeçar.setText("Começar");
        BotãoComeçar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoComeçarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Letras já utilizadas:");

        LabelLetter.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LabelLetter.setText("Nenhuma até agora.");

        LabelDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LabelDicas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        LabelDicas.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(LabelDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(LabelWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(LabelDica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LabelLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(BotãoComeçar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LabelLetter)
                .addGap(72, 72, 72)
                .addComponent(LabelWord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelDicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(LabelDica)
                .addGap(18, 18, 18)
                .addComponent(BotãoComeçar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotãoComeçarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoComeçarActionPerformed

        CodeForca jogodaforca = new CodeForca();
        jogodaforca.forca(this);
    }//GEN-LAST:event_BotãoComeçarActionPerformed

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
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoForca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoForca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotãoComeçar;
    private javax.swing.JLabel LabelDica;
    private javax.swing.JLabel LabelDicas;
    private javax.swing.JLabel LabelLetter;
    private javax.swing.JLabel LabelWord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
