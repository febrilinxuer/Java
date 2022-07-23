package program.data.mahasiswa;

import Database_IndukKoneksi.Koneksi;
import Database_Mahasiswa.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Signin_Masuk extends javax.swing.JFrame{
    public Signin_Masuk(){
        initComponents();
    }
    @SuppressWarnings("uncheked")
    
    private void initComponents(){
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isinama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        isipassword = new javax.swing.JPasswordField();
        masuk = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Masuk");
        
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 39));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");
       
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 103, 39));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, 39));
        isinama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isinamaActionPerformed(evt);
            }
        });
        
        getContentPane().add(isinama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 215, 29));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password");
        
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 103, 39));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");
        
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 39));
        getContentPane().add(isipassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 215, 28));
        masuk.setText("Masuk");
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        
        getContentPane().add(masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));
        keluar.setText("Tutup");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 70, -1));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pendidikan Informatika Angkatan 2014");
        
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Data Febri\\Kuliah
        Universitas Trunojoyo Madura\\Ilmu dasar untuk Pendidikan\\Semester
        2\\Cetak Kartu Hasil Studi - Portal Akademik_files\\logo.jpg")); // NOI18N
        jLabel4.setText("Universitas Trunojoyo Madura");
        
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Image\\linux\\bestlinux-desktop-52.jpg")); // NOI18N
        jLabel10.setText(" ");
        
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 250));
    }
}
