package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import projekpbo.bangunDatar.*;

public class JuringLingkaranFrame extends JFrame {
    private JLabel jariJariLabel;
    private JLabel sudutLabel;
    private JTextField jariJariTextField;
    private JTextField sudutTextField;
    private JButton submitBTN;
    private JLabel hasilLuasLabel;
    private JLabel hasilKelilingLabel;

    public JuringLingkaranFrame() {
        // Inisialisasi komponen
        jariJariLabel = new JLabel("Jari-jari:");
        sudutLabel = new JLabel("Sudut (°):");
        
        jariJariTextField = new JTextField();
        sudutTextField = new JTextField();
        
        submitBTN = new JButton("Hitung");
        hasilLuasLabel = new JLabel("Luas Juring: -");
        hasilKelilingLabel = new JLabel("Keliling Juring: -");

        // Panel input
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));
        formPanel.add(jariJariLabel);
        formPanel.add(jariJariTextField);
        formPanel.add(sudutLabel);
        formPanel.add(sudutTextField);
        formPanel.add(new JLabel()); // spasi kosong
        formPanel.add(submitBTN);

        // Panel hasil
        JPanel hasilPanel = new JPanel(new GridLayout(2, 1));
        hasilPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        hasilPanel.add(hasilLuasLabel);
        hasilPanel.add(hasilKelilingLabel);

        // Panel utama
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(hasilPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // Event tombol
        submitBTN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double jariJari = Double.parseDouble(jariJariTextField.getText());
                    double sudut = Double.parseDouble(sudutTextField.getText());
                    JuringLingkaran juringLingkaran = new JuringLingkaran(jariJari,sudut);
                    
//                    System.out.println(jariJari);
//                    System.out.println(sudut);
                    
                    System.out.println(juringLingkaran.jariJari);
                    System.out.println(juringLingkaran.sudut);
                    
                    double luas = juringLingkaran.hitungLuas();
                    double keliling = juringLingkaran.hitungKeliling();
                    
                    System.out.println(luas);
                    System.out.println(keliling);

                    hasilLuasLabel.setText(String.format("Luas Juring: %.2f", luas));
                    hasilKelilingLabel.setText(String.format("Keliling Juring: %.2f", keliling));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(JuringLingkaranFrame.this, "Input harus angka!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set frame
        setTitle("Juring Lingkaran");
        setSize(360, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
