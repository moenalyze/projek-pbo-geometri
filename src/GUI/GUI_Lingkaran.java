/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import bendageometri.Lingkaran;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class GUI_Lingkaran extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Lingkaran
     */
    public GUI_Lingkaran() {
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
        jButtonKembali1 = new javax.swing.JButton();
        jLabelPanjang = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jJariJariField = new javax.swing.JTextField();
        jButtonHitungLuasKeliling = new javax.swing.JButton();
        jLabelHasilLuas = new javax.swing.JLabel();
        jLabelHasilKeliling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 236, 221));

        jLabel1.setBackground(new java.awt.Color(0, 128, 157));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 128, 157));
        jLabel1.setText("Lingkaran");

        jButtonKembali1.setText("Kembali");
        jButtonKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKembali1ActionPerformed(evt);
            }
        });

        jLabelPanjang.setText("Jari-Jari (cm) :");

        jLabel3.setText("Hitung Luas dan Keliling");

        jButtonHitungLuasKeliling.setText("Hitung");
        jButtonHitungLuasKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungLuasKelilingActionPerformed(evt);
            }
        });

        jLabelHasilLuas.setText("Luas Lingkaran     : ");

        jLabelHasilKeliling.setText("Keliling Lingkaran : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonKembali1)
                .addGap(61, 61, 61)
                .addComponent(jButtonHitungLuasKeliling)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHasilKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jJariJariField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelHasilLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jJariJariField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPanjang))
                .addGap(61, 61, 61)
                .addComponent(jLabelHasilLuas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHasilKeliling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKembali1)
                    .addComponent(jButtonHitungLuasKeliling))
                .addGap(22, 22, 22))
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

    private void jButtonKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKembali1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        GUIPage mainPage = new GUIPage();
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonKembali1ActionPerformed

    private void jButtonHitungLuasKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungLuasKelilingActionPerformed
        try {
            double jariJari = Double.parseDouble(jJariJariField.getText());
            
            // Validasi input: panjang dan lebar harus positif
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari jari lebih besar dari 0.");
            }

            // Buat objek dan hitung luas dan keliling
            Lingkaran lingkaran = new Lingkaran(jariJari);
            double luas = lingkaran.hitungLuas(jariJari);
            double keliling = lingkaran.hitungKeliling(jariJari);

            // Tampilkan hasil
            jLabelHasilLuas.setText("Luas Lingkaran     : " + String.format("%.2f", luas) + " cm²"); // Format ke 2 desimal
            jLabelHasilKeliling.setText("Keliling Lingkaran : " + String.format("%.2f", keliling) + " cm"); // Format ke 2 desimal

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Masukkan angka yang valid untuk jari-jari.", // Pesan error lebih spesifik
                "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,
                e.getMessage(), // Pesan error dari validasi negatif atau nol
                "Perhitungan Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonHitungLuasKelilingActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Lingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Lingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHitungLuasKeliling;
    private javax.swing.JButton jButtonKembali1;
    private javax.swing.JTextField jJariJariField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelHasilKeliling;
    private javax.swing.JLabel jLabelHasilLuas;
    private javax.swing.JLabel jLabelPanjang;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
