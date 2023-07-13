package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import InputGUI.Cek2GUI;
import InputGUI.Havale2GUI;
import InputGUI.Yatir2GUI;
import Model.BankaHesap1;
import Model.BankaHesap2;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class BankaHesap2GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(10000, "salihterzi", "5678");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(9000, "salihterzi", "5678");
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
					BankaHesap2GUI frame = new BankaHesap2GUI(bankaHesap1 , bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BankaHesap2GUI(BankaHesap1 bankaHesap1, BankaHesap2 bankaHesap2) {
		setTitle(bankaHesap2.getHesapnumarasi2() + " numaralı hesap");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnParacek2 = new JButton("<< Para Çek");
		btnParacek2.setHorizontalAlignment(SwingConstants.LEFT);
		btnParacek2.setBackground(new Color(196, 60, 60));
		btnParacek2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cek2GUI cGUI = new Cek2GUI(bankaHesap2);
				cGUI.setVisible(true);
				dispose();
			}
		});
		btnParacek2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParacek2.setBounds(10, 303, 300, 60);
		contentPane.add(btnParacek2);
		
		JButton btnParaGonder2 = new JButton("<< Para Gönder");
		btnParaGonder2.setHorizontalAlignment(SwingConstants.LEFT);
		btnParaGonder2.setBackground(new Color(196, 60, 60));
		btnParaGonder2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Havale2GUI hGUI = new Havale2GUI(bankaHesap1 , bankaHesap2);
				hGUI.setVisible(true);
				dispose();
			}
		});
		btnParaGonder2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaGonder2.setBounds(10, 373, 300, 60);
		contentPane.add(btnParaGonder2);
		
		JButton btnParaYatir2 = new JButton("Para Yatır >>");
		btnParaYatir2.setHorizontalAlignment(SwingConstants.RIGHT);
		btnParaYatir2.setBackground(new Color(196, 60, 60));
		btnParaYatir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yatir2GUI yGUI = new Yatir2GUI(bankaHesap2);
				yGUI.setVisible(true);
				dispose();
			}
		});
		btnParaYatir2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaYatir2.setBounds(420, 303, 300, 60);
		contentPane.add(btnParaYatir2);
		
		JButton btnHesapBilgileri2 = new JButton("Hesap Bilgileri >>");
		btnHesapBilgileri2.setHorizontalAlignment(SwingConstants.RIGHT);
		btnHesapBilgileri2.setBackground(new Color(196, 60, 60));
		btnHesapBilgileri2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnHesapBilgileri2,
						"Hesabınızdaki bakiye: " + bankaHesap2.getMiktar2() + "\n" + "Hesap numaranız: "
								+ bankaHesap2.getHesapnumarasi2() + "\n" + "Hesaba kayıtlı adsoyad: "
								+ bankaHesap2.getAdsoyad2());
			}
		});
		btnHesapBilgileri2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnHesapBilgileri2.setBounds(420, 373, 300, 60);
		contentPane.add(btnHesapBilgileri2);
		
		JButton btnGeriDon2 = new JButton("Geri Dön >>");
		btnGeriDon2.setHorizontalAlignment(SwingConstants.RIGHT);
		btnGeriDon2.setBackground(new Color(196, 60, 60));
		btnGeriDon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				aGUI.setVisible(true);
			}
		});
		btnGeriDon2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnGeriDon2.setBounds(420, 468, 300, 60);
		contentPane.add(btnGeriDon2);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\muazc\\OneDrive\\Masaüstü\\banka2.png"));
		lblNewLabel.setBounds(235, 10, 261, 265);
		contentPane.add(lblNewLabel);
	}
}
