/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_123220198;

import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class FramePertama extends JFrame{
    
    JLabel header = new JLabel("Selamat Datang!");
    JLabel infoLogin = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel jenisKelamin = new JLabel("Jenis Kelamin");
    
    JTextField userName = new JTextField();
    JPasswordField passWord = new JPasswordField();
    
    JRadioButton jenisKelLaki = new JRadioButton("Laki-Laki");
    JRadioButton jenisKelPerempuan = new JRadioButton("Perempuan");
    
    JButton tombolLogin = new JButton("Login");
    
    FramePertama(){
        setVisible(true);
        setSize(500, 525);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
    // tampilkan Label
        add(header);
        header.setFont(new Font("Arial", Font.PLAIN, 20));
        header.setBounds(25,25,150,35);
       
        add(infoLogin);
        infoLogin.setFont(new Font("Arial", Font.PLAIN, 14));
        infoLogin.setBounds(25,50,250,35);
        
        add(username);
        //username.setFont(new Font("Arial", Font.PLAIN, 15));
        username.setBounds(25,80,150,35);
        
        add(password);
        //username.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setBounds(25,140,150,35);
        
        add(jenisKelamin);
        jenisKelamin.setBounds(25,200,150,35);
        
        
    // tampilkan text field
        add(userName);
        userName.setBounds(25,110,435,25);
        
        add(passWord);
        passWord.setBounds(25,170,435,25);
        passWord.setEchoChar('*');
        
        
    //  tampilkan radiobutton
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(jenisKelLaki);
        pilihJenisKelamin.add(jenisKelPerempuan);
        
        add(jenisKelLaki);
        jenisKelLaki.setBounds(25, 225, 100, 25);
        
        add(jenisKelPerempuan);
        jenisKelPerempuan.setBounds(200, 225, 100, 25);
        
        
    // tampilkan login
        add(tombolLogin);
        tombolLogin.setBounds(15, 275, 455, 35);
        
    }
}



class FrameKedua extends JFrame{
    
    JLabel header = new JLabel("Welcome, [Mr./Mrs.][username]");
    JLabel infoHalaman = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luasPersegi = new JLabel("Luas Persegi");
    JLabel kelilingPersegi = new JLabel("Keliling Persegi");
    JLabel volumeBalok = new JLabel("Volume Balok");
    JLabel LPermukaanBalok = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuasP = new JLabel("[Hasil berupa angka]");
    JLabel hasilKelP = new JLabel("[Hasil berupa angka]");
    JLabel hasilVolB = new JLabel("[Hasil berupa angka]");
    JLabel hasilLuasPerB = new JLabel("[Hasil berupa angka]");
    
    
    JTextField Panjang = new JTextField();
    JTextField Lebar = new JTextField();
    JTextField Tinggi = new JTextField();
    
    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");
    
    FrameKedua(){
        setVisible(true);
        setSize(525, 550);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
    // tampilkan Label
        add(header);
        header.setFont(new Font("Arial", Font.PLAIN, 22));
        header.setBounds(25,25,310,35);
        
        add(infoHalaman);
        infoHalaman.setFont(new Font("Arial", Font.PLAIN, 13));
        infoHalaman.setBounds(25,50,400,35);
        
        add(panjang);
        panjang.setBounds(25,100,50,15);
        
        add(lebar);
        lebar.setBounds(25,140,50,15);
        
        add(tinggi);
        tinggi.setBounds(25,180,50,15);
        
        add(hasil);
        hasil.setBounds(241,330,50,15);
        
        add(luasPersegi);
        luasPersegi.setBounds(25,360,100,15);
        
        add(hasilLuasP);
        hasilLuasP.setBounds(195,360,150,15);
        
        add(kelilingPersegi);
        kelilingPersegi.setBounds(25,385,100,15);
        
        add(hasilKelP);
        hasilKelP.setBounds(195,385,150,15);
        
        add(volumeBalok);
        volumeBalok.setBounds(25,410,100,15);
        
        add(hasilVolB);
        hasilVolB.setBounds(195,410,150,15);
        
        add(LPermukaanBalok);
        LPermukaanBalok.setBounds(25,435,150,15);
        
        add(hasilLuasPerB);
        hasilLuasPerB.setBounds(195,435,150,15);
        
    // tampilkan text field
        add(Panjang);
        Panjang.setBounds(150,95,335,30);
        
        add(Lebar);
        Lebar.setBounds(150,135,335,30);
        
        add(Tinggi);
        Tinggi.setBounds(150,175,335,30);
        
        
    // tampilkan button
        add(hitung);
        hitung.setBounds(25,230,460,35);
        
        add(reset);
        reset.setBounds(25,275,460,35);
    
    }
}

public class Tugas1_123220198 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FramePertama FrameSatu = new FramePertama();
        FrameKedua FrameDua = new FrameKedua();
    }
    
}