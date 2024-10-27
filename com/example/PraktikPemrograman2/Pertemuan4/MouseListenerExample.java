package com.example.PraktikPemrograman2.Pertemuan4;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        // Membuat Frame
        JFrame frame = new JFrame("MouseListener Example");

        // Membuat label untuk menampilkan pesan
        JLabel label = new JLabel("Arahkan dan klik mouse pada area ini.");
        label.setBounds(58, 50, 300, 30);

        // Menambahkan MouseListener ke label
        label.addMouseListener(new MouseListener() {
            // Dijalankan ketika mouse diklik
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: (" + e.getX() + "," + e.getY() + ")");
            }

            // Dijalankan ketika mouse ditekan
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed at: (" + e.getX() + "," + e.getY() + ")");
            }

            // Dijalankan ketika mouse dilepaskan
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released at: (" + e.getX() + "," + e.getY() + ")");
            }

            // Dijalankan ketika mouse masuk ke area label
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the area.");
            }

            // Dijalankan ketika mouse keluar dari area label
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the area.");
            }
        });

        // Menambahkan label ke frame
        frame.add(label);

        // Mengatur ukuran frame dan properti lainnya
        frame.setSize(400, 280);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}