package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import Model.Dukkan;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;


@SuppressWarnings({ "unused", "serial" })
public class ArayuzGUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(100, "admin", "1234");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(0, "admin", "5678");
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArayuzGUI frame = new ArayuzGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ArayuzGUI() {
		setBackground(new Color(255, 255, 255));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<< 1. Hesap");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(190, 65, 65));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BankaHesap1GUI b1GUI = new BankaHesap1GUI(bankaHesap1 , bankaHesap2);
				b1GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(10, 256, 313, 60);
		contentPane.add(btnNewButton);
		
		JButton btnParaGnder = new JButton("<< 2. Hesap");
		btnParaGnder.setHorizontalAlignment(SwingConstants.LEFT);
		btnParaGnder.setBackground(new Color(190, 65, 65));
		btnParaGnder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BankaHesap2GUI b2GUI = new BankaHesap2GUI(bankaHesap1, bankaHesap2);
				b2GUI.setVisible(true);
				dispose();
			}
		});
		btnParaGnder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaGnder.setBounds(10, 326, 313, 60);
		contentPane.add(btnParaGnder);
		
		JButton btnParaYatr = new JButton("<< Dükkan");
		btnParaYatr.setHorizontalAlignment(SwingConstants.LEFT);
		btnParaYatr.setBackground(new Color(190, 65, 65));
		btnParaYatr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DukkanGUI dGUI = new DukkanGUI();
				dGUI.setVisible(true);
				dispose();
			}
		});
		btnParaYatr.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnParaYatr.setBounds(10, 396, 313, 60);
		contentPane.add(btnParaYatr);
		
		JButton btnHesapBilgileri = new JButton("Çıkış >>");
		btnHesapBilgileri.setHorizontalAlignment(SwingConstants.RIGHT);
		btnHesapBilgileri.setBackground(new Color(190, 65, 65));
		btnHesapBilgileri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnHesapBilgileri.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnHesapBilgileri.setBounds(417, 479, 313, 60);
		contentPane.add(btnHesapBilgileri);
		
		JLabel lblNewLabel = new JLabel("İşlem yapmak istediğiniz hesabı seçiniz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 193, 518, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOŞGELDİNİZ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 50));
		lblNewLabel_1.setBounds(153, 36, 410, 124);
		contentPane.add(lblNewLabel_1);
	}

	public static BankaHesap1 getBankaHesap1() {
		return bankaHesap1;
	}

	public static void setBankaHesap1(BankaHesap1 bankaHesap1) {
		ArayuzGUI.bankaHesap1 = bankaHesap1;
	}

	public static BankaHesap2 getBankaHesap2() {
		return bankaHesap2;
	}

	public static void setBankaHesap2(BankaHesap2 bankaHesap2) {
		ArayuzGUI.bankaHesap2 = bankaHesap2;
	}

}
