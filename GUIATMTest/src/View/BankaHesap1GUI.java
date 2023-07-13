package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import InputGUI.Cek1GUI;
import InputGUI.Havale1GUI;
import InputGUI.Yatir1GUI;
import Model.BankaHesap1;
import Model.BankaHesap2;
import Model.Dukkan;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.Icon;

@SuppressWarnings({ "serial", "unused" })
public class BankaHesap1GUI extends JFrame {
	static BankaHesap1 bankaHesap1;
	static BankaHesap2 bankaHesap2;
	ArayuzGUI aGUI = new ArayuzGUI();
	@SuppressWarnings("unused")
	private double miktar;
	@SuppressWarnings("unused")
	private String isim, hesapnumarasi;
	
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankaHesap1GUI frame = new BankaHesap1GUI(bankaHesap1 , bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public BankaHesap1GUI(BankaHesap1 bankaHesap1, BankaHesap2 bankaHesap2) {
		setTitle(bankaHesap1.getHesapnumarasi() + " numaralı hesap");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnHesapBilgileri = new JButton("Hesap Bilgileri >>");
		btnHesapBilgileri.setHorizontalAlignment(SwingConstants.RIGHT);
		btnHesapBilgileri.setBackground(new Color(196, 60, 60));
		btnHesapBilgileri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Hesabınızdaki bakiye: " + (bankaHesap1.getMiktar()) + "\n" + "Hesap numaranız: "
								+ bankaHesap1.getHesapnumarasi() + "\n" + "Hesaba kayıtlı adsoyad: "
								+ bankaHesap1.getAdsoyad());
			}
		});
		btnHesapBilgileri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnHesapBilgileri.setBounds(420, 373, 300, 60);
		contentPane.add(btnHesapBilgileri);

		JButton btnParaYatir = new JButton("Para Yatır >>");
		btnParaYatir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnParaYatir.setBackground(new Color(196, 60, 60));
		btnParaYatir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yatir1GUI yGUI = new Yatir1GUI(bankaHesap1);
				yGUI.setVisible(true);
				dispose();
			}
		});
		btnParaYatir.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaYatir.setBounds(420, 303, 300, 60);
		contentPane.add(btnParaYatir);

		JButton btnParacek = new JButton("<< Para Çek");
		btnParacek.setHorizontalAlignment(SwingConstants.LEFT);
		btnParacek.setBackground(new Color(196, 60, 60));
		btnParacek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cek1GUI cGUI = new Cek1GUI(bankaHesap1);
				cGUI.setVisible(true);
				dispose();
			}
		});
		btnParacek.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParacek.setBounds(10, 303, 300, 60);
		contentPane.add(btnParacek);

		JButton btnParaGonder = new JButton("<< Para Gönder");
		btnParaGonder.setBackground(new Color(196, 60, 60));
		btnParaGonder.setHorizontalAlignment(SwingConstants.LEFT);
		btnParaGonder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Havale1GUI hGUI = new Havale1GUI(bankaHesap1 , bankaHesap2);
				hGUI.setVisible(true);
				dispose();
			}
		});
		btnParaGonder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaGonder.setBounds(10, 373, 300, 60);
		contentPane.add(btnParaGonder);
		
		JButton btnGeriDon = new JButton(" Geri Dön >>");
		btnGeriDon.setHorizontalAlignment(SwingConstants.RIGHT);
		btnGeriDon.setBackground(new Color(196, 60, 60));
		btnGeriDon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				aGUI.setVisible(true);
			}
		});
		btnGeriDon.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGeriDon.setBounds(420, 468, 300, 60);
		contentPane.add(btnGeriDon);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\muazc\\OneDrive\\Masaüstü\\banka2.png"));
		lblNewLabel.setText("");
		lblNewLabel.setBounds(235, 10, 261, 265);
		contentPane.add(lblNewLabel);
		
		
	}
}
