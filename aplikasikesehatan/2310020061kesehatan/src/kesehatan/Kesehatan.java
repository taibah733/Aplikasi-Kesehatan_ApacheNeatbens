package kesehatan;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import kesehatan.Input_User;
import kesehatan.framePoliklinik;
import kesehatan.frameDokter;
import kesehatan.framePasien;
import kesehatan.frameInput_User;
import kesehatan.frameKunjungan;
import kesehatan.frameLogin;

public class Kesehatan extends JFrame {
    ArrayList<Input_User> daftarkesehatan = new ArrayList<>();

    public Kesehatan() {
        setTitle("Menu Utama Aplikasi Kesehatan");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Tampilkan di tengah layar
        setLayout(new BorderLayout());

        // Judul
        JLabel title = new JLabel("MENU UTAMA", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(title, BorderLayout.NORTH);

        // Panel tombol
        JPanel panelTombol = new JPanel(new GridLayout(6, 1, 10, 10));
        panelTombol.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

        JButton btnPoliklinik = new JButton("Poliklinik");
        JButton btnDokter = new JButton("Dokter");
        JButton btnPasien = new JButton("Pasien");
        JButton btnUser = new JButton("User");
        JButton btnKunjungan = new JButton("Kunjungan");
        JButton btnLogin = new JButton("Login");

        panelTombol.add(btnPoliklinik);
        panelTombol.add(btnDokter);
        panelTombol.add(btnPasien);
        panelTombol.add(btnUser);
        panelTombol.add(btnKunjungan);
        panelTombol.add(btnLogin);

        add(panelTombol, BorderLayout.CENTER);

        // Aksi tombol
        btnPoliklinik.addActionListener(e -> new framePoliklinik().setVisible(true));
        btnDokter.addActionListener(e -> new frameDokter().setVisible(true));
        btnPasien.addActionListener(e -> new framePasien().setVisible(true));
        btnUser.addActionListener(e -> new frameInput_User().setVisible(true));
        btnKunjungan.addActionListener(e -> new frameKunjungan().setVisible(true));
        btnLogin.addActionListener(e -> new frameLogin().setVisible(true));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Kesehatan().setVisible(true);
        });
    }
}
