
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PenghitungHari extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungHari
     */
    public PenghitungHari() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fldTahun = new javax.swing.JTextField();
        cmbBulan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btHapus = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btHitung = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        lbJumlah = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Penghitung Hari 0.1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("PENGHITUNG JUMLAH HARI");

        fldTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldTahunActionPerformed(evt);
            }
        });
        fldTahun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fldTahunKeyTyped(evt);
            }
        });

        cmbBulan.setBackground(new java.awt.Color(255, 255, 153));
        cmbBulan.setEditable(true);
        cmbBulan.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        cmbBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TAHUN");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BULAN");

        btHapus.setBackground(new java.awt.Color(255, 153, 153));
        btHapus.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        btHapus.setText("HAPUS");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btSimpan.setBackground(new java.awt.Color(51, 255, 0));
        btSimpan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        btSimpan.setText("SIMPAN");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btHitung.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        btHitung.setText("HITUNG");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        btKeluar.setBackground(new java.awt.Color(255, 102, 102));
        btKeluar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 10)); // NOI18N
        btKeluar.setText("KELUAR");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        lbJumlah.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbJumlah.setForeground(new java.awt.Color(255, 255, 255));
        lbJumlah.setText("Jumlah hari adalah : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btHapus)
                .addGap(18, 18, 18)
                .addComponent(btHitung)
                .addGap(18, 18, 18)
                .addComponent(btSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btKeluar)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbJumlah)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHapus)
                    .addComponent(btHitung)
                    .addComponent(btKeluar)
                    .addComponent(btSimpan))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldTahunActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fldTahunActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
     lbJumlah.setText("Jumlah Hari Adalah");
        fldTahun.setText("");
        cmbBulan.setSelectedItem("Januari");
    }//GEN-LAST:event_btHapusActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        // TODO add your handling code here:
       try{
            try (BufferedWriter out = new BufferedWriter(new FileWriter("jumlah hari.txt"))) {
                out.write(lbJumlah.getText());
                JOptionPane.showMessageDialog(null,"Berhasil disimpan dalam file");
            }
        }catch(IOException | HeadlessException e){
            System.err.println("Error :"+e.getMessage());
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        // TODO add your handling code here:
         if(fldTahun.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Error : isian tahun kososng!",
                    "Error:isian tahun kosong!",JOptionPane.WARNING_MESSAGE);
        }else{
            int tahun = Integer.parseInt(fldTahun.getText());
            int jumlahHari;
            if(cmbBulan.getSelectedItem().equals("Februari")){
                if (((tahun % 4== 0)&&!(tahun % 100 == 0))||(tahun % 400 == 0))
                    jumlahHari=29;
                else jumlahHari=28;
            }else if(cmbBulan.getSelectedItem().equals("April")||
                     cmbBulan.getSelectedItem().equals("Juni")||
                     cmbBulan.getSelectedItem().equals("September")||
                    cmbBulan.getSelectedItem().equals("November")){
                     jumlahHari=30;
        }else{
    jumlahHari=31;
        }
         lbJumlah.setText("Jumlah Hari Pada Bulan "+
                cmbBulan.getSelectedItem()+
                 " Tahun "+tahun+" adalah "+jumlahHari);
         }
    }//GEN-LAST:event_btHitungActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
    System.exit(0);
    }//GEN-LAST:event_btKeluarActionPerformed

    private void fldTahunKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldTahunKeyTyped
        // TODO add your handling code here:
         char c =evt.getKeyChar();
        if (!((Character.isDigit(c)||(c== KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE))
                )){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan hanya bilangan angka !");
         
            evt.consume();
        }
    }//GEN-LAST:event_fldTahunKeyTyped

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
            java.util.logging.Logger.getLogger(PenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btHitung;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JTextField fldTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbJumlah;
    // End of variables declaration//GEN-END:variables
}
