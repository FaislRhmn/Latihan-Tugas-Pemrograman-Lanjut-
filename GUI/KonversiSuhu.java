
package GUI;

public class KonversiSuhu extends javax.swing.JFrame {
    double Celcius;
    double Fahrenheit;
    double Kelvin;
    double Reamur;
    
    public KonversiSuhu() {
        initComponents();
    }
    private void Celcius(){
        Celcius = Double.parseDouble(txtSuhu.getText());
         Fahrenheit =Celcius * 1.8 + 32;
         Kelvin = Celcius + 273.15;
         Reamur = Celcius * 0.8;
       lblCelcius.setText(Celcius+" Celcius");
       lblFahrenheit.setText(Fahrenheit+" Fahrenheit");
       lblKelvin.setText(Kelvin+" Kelvin");
       lblReamur.setText(Reamur+" Reamur");
    }
    
    private void Fahrenheit(){
        Fahrenheit = Double.parseDouble(txtSuhu.getText());
         Celcius = (Fahrenheit - 32)/1.8;
         Reamur = (Fahrenheit-32)/2.25;
         Kelvin = (Fahrenheit+459.67)/1.8;
        lblCelcius.setText(Celcius+" Celcius");
        lblFahrenheit.setText(Fahrenheit+" Fahrenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");
    }
    
    private void Kelvin(){
      Kelvin =Double.parseDouble(txtSuhu.getText());
       Fahrenheit = Kelvin * 1.8 - 459.67;
       Celcius = Kelvin - 273.15;
       Reamur = (Kelvin - 273.15)*0.8;
      lblCelcius.setText(Celcius+" Celcius");
      lblFahrenheit.setText(Fahrenheit+" Fahrenheit");
      lblKelvin.setText(Kelvin+" Kelvin");
      lblReamur.setText(Reamur+" Reamur");
    }
    
    private void Reamur(){
        Reamur = Double.parseDouble(txtSuhu.getText());
         Fahrenheit = (Reamur*2.25)+32;
         Kelvin = (Reamur/0.8)+273.15;
         Celcius = Reamur/0.8;
        lblCelcius.setText(Celcius+" Celcius");
        lblFahrenheit.setText(Fahrenheit+" Fahrenheit");
        lblKelvin.setText(Kelvin+" Kelvin");
        lblReamur.setText(Reamur+" Reamur");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        rbCelcius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();
        rbReamur = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblReamur = new javax.swing.JLabel();
        lblFahrenheit = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblCelcius = new javax.swing.JLabel();
        btnKonversi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 85, 59));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI KONVERSI SUHU");
        jLabel1.setAlignmentY(0.0F);

        txtSuhu.setBorder(null);

        rbCelcius.setBackground(getBackground());
        rbCelcius.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbCelcius.setForeground(new java.awt.Color(255, 255, 255));
        rbCelcius.setText("Celcius");

        rbFahrenheit.setBackground(getBackground());
        rbFahrenheit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbFahrenheit.setForeground(new java.awt.Color(255, 255, 255));
        rbFahrenheit.setText("Fahrenheit");

        rbKelvin.setBackground(getBackground());
        rbKelvin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbKelvin.setForeground(new java.awt.Color(255, 255, 255));
        rbKelvin.setText("Kelvin");

        rbReamur.setBackground(getBackground());
        rbReamur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbReamur.setForeground(new java.awt.Color(255, 255, 255));
        rbReamur.setText("Reamur");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("HASIL KONVERSI :");

        lblReamur.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        lblReamur.setForeground(java.awt.Color.white);
        lblReamur.setText("Reamur");

        lblFahrenheit.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        lblFahrenheit.setForeground(java.awt.Color.white);
        lblFahrenheit.setText("Fahrenheit");

        lblKelvin.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        lblKelvin.setForeground(java.awt.Color.white);
        lblKelvin.setText("Kelvin");

        lblCelcius.setFont(new java.awt.Font("Sitka Small", 1, 10)); // NOI18N
        lblCelcius.setForeground(java.awt.Color.white);
        lblCelcius.setText("Celcius");

        btnKonversi.setBackground(new java.awt.Color(102, 204, 0));
        btnKonversi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKonversi.setForeground(new java.awt.Color(51, 0, 51));
        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 0, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(51, 0, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKelvin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReamur, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnKonversi)
                                        .addComponent(btnReset))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFahrenheit)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rbKelvin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnKonversi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(rbReamur))
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelcius)
                    .addComponent(lblKelvin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFahrenheit)
                    .addComponent(lblReamur))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
     if(rbCelcius.isSelected()){
         Celcius();
     }else if(rbFahrenheit.isSelected()){
         Fahrenheit();
     }else if(rbKelvin.isSelected()){
         Kelvin();
     }else if(rbReamur.isSelected()){
         Reamur();
     }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       txtSuhu.setText("");
       lblCelcius.setText("Celcius");
       lblFahrenheit.setText("Fahrenheit");
       lblKelvin.setText("kelvin");
       lblReamur.setText("Reamur");
       rbCelcius.setSelected(false);
       rbFahrenheit.setSelected(false);
       rbKelvin.setSelected(false);
       rbReamur.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonversi;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCelcius;
    private javax.swing.JLabel lblFahrenheit;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblReamur;
    private javax.swing.JRadioButton rbCelcius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JRadioButton rbReamur;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
