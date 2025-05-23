package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BangunDatar extends JFrame {
    public JButton belahKetupatBTN;
    public JButton segitigaBTN;
    public JButton persegiBTN;
    public JButton persegiPanjangBTN;
    public JButton layangLayangBTN;
    public JButton trapesiumBTN;
    public JButton jajarGenjangBTN;
    public JButton juringLingkaranBTN;

    public BangunDatar() {
        // Inisialisasi tombol
        belahKetupatBTN = new JButton("Belah Ketupat");
        segitigaBTN = new JButton("Segitiga");
        persegiBTN = new JButton("Persegi");
        persegiPanjangBTN = new JButton("Persegi Panjang");
        layangLayangBTN = new JButton("Layang-Layang");
        trapesiumBTN = new JButton("Trapesium");
        jajarGenjangBTN = new JButton("Jajar Genjang");
        juringLingkaranBTN = new JButton("Juring Lingkaran");

        // Buat panel dan tambahkan tombol ke panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 baris, 2 kolom, jarak 10px

        panel.add(belahKetupatBTN);
        panel.add(segitigaBTN);
        panel.add(persegiBTN);
        panel.add(persegiPanjangBTN);
        panel.add(layangLayangBTN);
        panel.add(trapesiumBTN);
        panel.add(jajarGenjangBTN);
        panel.add(juringLingkaranBTN);

        // Tambahkan panel ke frame
        add(panel);
        
        belahKetupatBTN.addActionListener(new Action());
        juringLingkaranBTN.addActionListener(new Action());

        // Atur properti frame
        setTitle("Bangun Datar");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == belahKetupatBTN){
//                new JuringLingkaranFrame();
            } else if(e.getSource() == juringLingkaranBTN){
                new JuringLingkaranFrame();
            }
        }
        
    }
}
