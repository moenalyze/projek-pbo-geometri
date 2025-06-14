/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import bendageometri.BelahKetupat;
import bendageometri.LimasBelahKetupat;
import bendageometri.PersegiPanjang;
import bendageometri.PrismaBelahKetupat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class GUI_LimasBelahKetupat extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PersegiPanjang
     */
    public GUI_LimasBelahKetupat() {
        initComponents();
//        updateFormBasedOnSelection();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonKembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RadioButton = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonKembali1 = new javax.swing.JButton();
        jLabelDiagonal1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDiagonal1Field = new javax.swing.JTextField();
        jLabelDiagonal2 = new javax.swing.JLabel();
        jDiagonal2Field = new javax.swing.JTextField();
        jButtonHitungVolumeLuas = new javax.swing.JButton();
        jLabelHasilVolume = new javax.swing.JLabel();
        jLabelHasilLuasPermukaan = new javax.swing.JLabel();
        jLabelDiagonal3 = new javax.swing.JLabel();
        jTinggiLimasField = new javax.swing.JTextField();
        jLabelDiagonal4 = new javax.swing.JLabel();
        jTinggiSisiTegakField = new javax.swing.JTextField();
        jRadioButtonDesimal = new javax.swing.JRadioButton();
        jRadioButtonBulat = new javax.swing.JRadioButton();

        jButtonKembali.setText("Kembali");
        jButtonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembaliActionPerformed(evt);
            }
        });

        jLabel2.setText("Hitung Luas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 236, 221));

        jLabel1.setBackground(new java.awt.Color(0, 128, 157));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 128, 157));
        jLabel1.setText("Limas Belah Ketupat");

        jButtonKembali1.setText("Kembali");
        jButtonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembali1ActionPerformed(evt);
            }
        });

        jLabelDiagonal1.setText("Diagonal 1 (cm) :");

        jLabel3.setText("Hitung Volume dan Luas Permukaan");

        jLabelDiagonal2.setText("Diagonal 2 (cm) : ");

        jButtonHitungVolumeLuas.setText("Hitung");
        jButtonHitungVolumeLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungVolumeLuasActionPerformed(evt);
            }
        });

        jLabelHasilVolume.setText("Volume Limas Belah Ketupat      : ");

        jLabelHasilLuasPermukaan.setText("Luas Permukaan Limas Belah Ketupat : ");

        jLabelDiagonal3.setText("Tinggi Limas (cm) : ");

        jTinggiLimasField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTinggiLimasFieldActionPerformed(evt);
            }
        });

        jLabelDiagonal4.setText("Tinggi Sisi Tegak (cm) : ");

        jTinggiSisiTegakField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTinggiSisiTegakFieldActionPerformed(evt);
            }
        });

        RadioButton.add(jRadioButtonDesimal);
        jRadioButtonDesimal.setText("Gunakan bilangan desimal");

        RadioButton.add(jRadioButtonBulat);
        jRadioButtonBulat.setText("Gunakan bilangan bulat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelHasilLuasPermukaan, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHasilVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jButtonKembali1)
                                .addGap(62, 62, 62)
                                .addComponent(jButtonHitungVolumeLuas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                                        .addComponent(jRadioButtonBulat))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelDiagonal2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDiagonal2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelDiagonal1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDiagonal1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDiagonal4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDiagonal3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(jRadioButtonDesimal)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTinggiLimasField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTinggiSisiTegakField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDesimal)
                    .addComponent(jRadioButtonBulat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDiagonal1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiagonal1)
                    .addComponent(jLabelDiagonal3)
                    .addComponent(jTinggiLimasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiagonal2)
                    .addComponent(jDiagonal2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDiagonal4)
                    .addComponent(jTinggiSisiTegakField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabelHasilVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHasilLuasPermukaan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKembali1)
                    .addComponent(jButtonHitungVolumeLuas))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void updateFormBasedOnSelection() {
//        // Panjang lebar
//        jLabelPanjang.setVisible(isVisible(true)); 
//        jLabelLebar.setVisible(isVisible(true)); 
//
//    }
    
    private void jButtonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembaliActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GUIPage mainPage = new GUIPage();
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonKembaliActionPerformed

    private void jButtonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembali1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GUIPage mainPage = new GUIPage();
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonKembali1ActionPerformed

    private void jButtonHitungVolumeLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungVolumeLuasActionPerformed
        try {
            if(jRadioButtonDesimal.isSelected()) {
                double diagonal1 = Double.parseDouble(jDiagonal1Field.getText());
                double diagonal2 = Double.parseDouble(jDiagonal2Field.getText());
                double tinggiLimas = Double.parseDouble(jTinggiLimasField.getText());
                double tinggiSisiTegak = Double.parseDouble(jTinggiSisiTegakField.getText());

                // Buat objek dan hitung luas dan keliling
                BelahKetupat limas = new LimasBelahKetupat(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak);
                
                double volume = 0;
                double luasPermukaan = 0;

                if(limas instanceof LimasBelahKetupat) {
                    volume = ((LimasBelahKetupat)limas).hitungVolume(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak); // overloaded
                    luasPermukaan = ((LimasBelahKetupat)limas).hitungLuasPermukaan(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak); // overloaded
                }

                // Tampilkan hasil
                jLabelHasilVolume.setText("Volume Limas Belah Ketupat : " + String.format("%.2f", volume) + " cm³"); // Format ke 2 desimal
                jLabelHasilLuasPermukaan.setText("Luas Permukaan Limas Belah Ketupat : " + String.format("%.2f", luasPermukaan) + " cm²"); // Format ke 2 desimal
            } else if (jRadioButtonBulat.isSelected()) {
                int diagonal1 = Integer.parseInt(jDiagonal1Field.getText());
                int diagonal2 = Integer.parseInt(jDiagonal2Field.getText());
                int tinggiLimas = Integer.parseInt(jTinggiLimasField.getText());
                int tinggiSisiTegak = Integer.parseInt(jTinggiSisiTegakField.getText());

                // Buat objek dan hitung luas dan keliling
                BelahKetupat limas = new LimasBelahKetupat(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak);
                double volume = limas.hitungVolume();
                double luasPermukaan = limas.hitungLuasPermukaan();

                // Tampilkan hasil
                jLabelHasilVolume.setText("Volume Limas Belah Ketupat : " + String.format("%.2f", volume) + " cm³"); // Format ke 2 desimal
                jLabelHasilLuasPermukaan.setText("Luas Permukaan Limas Belah Ketupat : " + String.format("%.2f", luasPermukaan) + " cm²"); // Format ke 2 desimal
            }
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Masukkan angka yang valid untuk kedua diagonal, tinggi limas, dan tinggi sisi tegak", // Pesan error lebih spesifik
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,
                e.getMessage(), // Pesan error dari validasi negatif atau nol
                "Perhitungan Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonHitungVolumeLuasActionPerformed

    private void jTinggiSisiTegakFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTinggiSisiTegakFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTinggiSisiTegakFieldActionPerformed

    private void jTinggiLimasFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTinggiLimasFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTinggiLimasFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_LimasBelahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_LimasBelahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_LimasBelahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_LimasBelahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_LimasBelahKetupat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioButton;
    private javax.swing.JButton jButtonHitungVolumeLuas;
    private javax.swing.JButton jButtonKembali;
    private javax.swing.JButton jButtonKembali1;
    private javax.swing.JTextField jDiagonal1Field;
    private javax.swing.JTextField jDiagonal2Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDiagonal1;
    private javax.swing.JLabel jLabelDiagonal2;
    private javax.swing.JLabel jLabelDiagonal3;
    private javax.swing.JLabel jLabelDiagonal4;
    private javax.swing.JLabel jLabelHasilLuasPermukaan;
    private javax.swing.JLabel jLabelHasilVolume;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonBulat;
    private javax.swing.JRadioButton jRadioButtonDesimal;
    private javax.swing.JTextField jTinggiLimasField;
    private javax.swing.JTextField jTinggiSisiTegakField;
    // End of variables declaration//GEN-END:variables
}
