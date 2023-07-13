package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Dukkan;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JLabel;

public class ToptanciGUI extends JFrame {
	ArayuzGUI aGUI = new ArayuzGUI();
	static Dukkan dukkan;
	DukkanGUI dGUI = new DukkanGUI();
	private JPanel contentPane;
	private JTextField fld_adet;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToptanciGUI frame = new ToptanciGUI(dukkan);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ToptanciGUI(Dukkan dukkan) {
		setResizable(false);
		setTitle("TOPTANCI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 10, 417, 47);
		contentPane.add(menuBar);

		JMenu mnI_icecekler = new JMenu("İçecekler");
		mnI_icecekler.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_icecekler.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnI_icecekler);

		JMenu mnI_su = new JMenu("Su");
		mnI_icecekler.add(mnI_su);

		JMenu mnI_suFiyat = new JMenu("1 TL");
		mnI_su.add(mnI_suFiyat);

		JRadioButtonMenuItem rdb_suSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_suFiyat.add(rdb_suSatinAl);

		JMenu mnI_meyveSuyu = new JMenu("Meyve suyu");
		mnI_icecekler.add(mnI_meyveSuyu);

		JMenu mnI_meyveSuyuFiyat = new JMenu("5 TL");
		mnI_meyveSuyu.add(mnI_meyveSuyuFiyat);

		JRadioButtonMenuItem rdb_meyveSuyuSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_meyveSuyuFiyat.add(rdb_meyveSuyuSatinAl);

		JMenu mnI_süt = new JMenu("Süt");
		mnI_icecekler.add(mnI_süt);

		JMenu mnI_sütFiyat = new JMenu("20 TL");
		mnI_süt.add(mnI_sütFiyat);

		JRadioButtonMenuItem rdb_sutSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_sütFiyat.add(rdb_sutSatinAl);

		JMenu mnI_atistirmaliklar = new JMenu("Atıştırmalıklar");
		mnI_atistirmaliklar.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnI_atistirmaliklar);

		JMenu mnI_cikolata = new JMenu("Çikolata");
		mnI_atistirmaliklar.add(mnI_cikolata);

		JMenu mnI_cikolataFiyat = new JMenu("3 TL");
		mnI_cikolata.add(mnI_cikolataFiyat);

		JRadioButtonMenuItem rdb_cikolataSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_cikolataFiyat.add(rdb_cikolataSatinAl);

		JMenu mnI_biskuvi = new JMenu("Bisküvi");
		mnI_atistirmaliklar.add(mnI_biskuvi);

		JMenu mnI_biskuviFiyat = new JMenu("7 TL");
		mnI_biskuvi.add(mnI_biskuviFiyat);

		JRadioButtonMenuItem rdb_biskuviSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_biskuviFiyat.add(rdb_biskuviSatinAl);

		JMenu mnI_kek = new JMenu("Kek");
		mnI_atistirmaliklar.add(mnI_kek);

		JMenu mnI_kekFiyat = new JMenu("2 TL");
		mnI_kek.add(mnI_kekFiyat);

		JRadioButtonMenuItem rdb_kekSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_kekFiyat.add(rdb_kekSatinAl);

		JMenu mnI_meyve = new JMenu("Meyveler");
		mnI_meyve.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnI_meyve);

		JMenu mnI_elma = new JMenu("Elma");
		mnI_meyve.add(mnI_elma);

		JMenu mnI_elmaFiyat = new JMenu("6 TL");
		mnI_elma.add(mnI_elmaFiyat);

		JRadioButtonMenuItem rdb_elmaSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_elmaFiyat.add(rdb_elmaSatinAl);

		JMenu mnI_armut = new JMenu("Armut");
		mnI_meyve.add(mnI_armut);

		JMenu mnI_armutFiyat = new JMenu("6 TL");
		mnI_armut.add(mnI_armutFiyat);

		JRadioButtonMenuItem rdb_armutSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_armutFiyat.add(rdb_armutSatinAl);

		JMenu mnI_portakal = new JMenu("Portakal");
		mnI_meyve.add(mnI_portakal);

		JMenu mnI_portakalFiyat = new JMenu("8 TL");
		mnI_portakal.add(mnI_portakalFiyat);

		JRadioButtonMenuItem rdb_portakalSatinAl = new JRadioButtonMenuItem("Almak için tıklayınız");
		mnI_portakalFiyat.add(rdb_portakalSatinAl);
		JButton btnGeriDn = new JButton("Geri Dön");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dGUI.setVisible(true);
				dispose();
			}
		});
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdb_portakalSatinAl);
		bg.add(rdb_armutSatinAl);
		bg.add(rdb_elmaSatinAl);
		bg.add(rdb_kekSatinAl);
		bg.add(rdb_biskuviSatinAl);
		bg.add(rdb_cikolataSatinAl);
		bg.add(rdb_meyveSuyuSatinAl);
		bg.add(rdb_sutSatinAl);
		bg.add(rdb_suSatinAl);

		JButton btnNewButton = new JButton("Onayla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int adet = Integer.parseInt(fld_adet.getText());
				if (DukkanGUI.dukkan.getKasa() >= (adet * 1) && rdb_suSatinAl.isSelected()) {
					DukkanGUI.dukkan.setSu(adet + DukkanGUI.dukkan.getSu());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 1));
					JOptionPane.showMessageDialog(null, (adet * 1) + " TL'ye " + adet + " su aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 5) && rdb_meyveSuyuSatinAl.isSelected()) {
					DukkanGUI.dukkan.setMeyveSuyu(adet + DukkanGUI.dukkan.getMeyveSuyu());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 5));
					JOptionPane.showMessageDialog(null, (adet * 5) + " TL'ye " + adet + " meyse suyu aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 20) && rdb_sutSatinAl.isSelected()) {
					DukkanGUI.dukkan.setSut(adet + DukkanGUI.dukkan.getSut());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 20));
					JOptionPane.showMessageDialog(null, (adet * 20) + " TL'ye " + adet + " süt aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 3) && rdb_cikolataSatinAl.isSelected()) {
					DukkanGUI.dukkan.setCikolata(adet + DukkanGUI.dukkan.getCikolata());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 3));
					JOptionPane.showMessageDialog(null, (adet * 3) + " TL'ye " + adet + " çikolata aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 7) && rdb_biskuviSatinAl.isSelected()) {
					DukkanGUI.dukkan.setBiskuvi(adet + DukkanGUI.dukkan.getBiskuvi());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 7));
					JOptionPane.showMessageDialog(null, (adet * 7) + " TL'ye " + adet + " bisküvi aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 2) && rdb_kekSatinAl.isSelected()) {
					DukkanGUI.dukkan.setKek(adet + DukkanGUI.dukkan.getKek());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 2));
					JOptionPane.showMessageDialog(null, (adet * 2) + " TL'ye " + adet + " kek aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 6) && rdb_elmaSatinAl.isSelected()) {
					DukkanGUI.dukkan.setElma(adet + DukkanGUI.dukkan.getElma());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 6));
					JOptionPane.showMessageDialog(null, (adet * 6) + " TL'ye " + adet + " elma aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 6) && rdb_armutSatinAl.isSelected()) {
					DukkanGUI.dukkan.setArmut(adet + DukkanGUI.dukkan.getArmut());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 6));
					JOptionPane.showMessageDialog(null, (adet * 6) + " TL'ye " + adet + " armut aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else if (DukkanGUI.dukkan.getKasa() >= (adet * 8) && rdb_portakalSatinAl.isSelected()) {
					DukkanGUI.dukkan.setPortakal(adet + DukkanGUI.dukkan.getPortakal());
					DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() - (adet * 8));
					JOptionPane.showMessageDialog(null, (adet * 8) + " TL'ye " + adet + " portakal aldiniz.");
					dispose();
					dGUI.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"Hesap seçiminizi gözden geçiriniz ya da bakiyenizi kontrol ediniz.", "Hata",
							JOptionPane.WARNING_MESSAGE);
					dispose();
					dGUI.setVisible(true);

				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(103, 248, 105, 35);
		contentPane.add(btnNewButton);

		fld_adet = new JTextField();
		fld_adet.setBounds(103, 217, 221, 25);
		contentPane.add(fld_adet);
		fld_adet.setColumns(10);

		btnGeriDn.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGeriDn.setBounds(218, 248, 105, 35);
		contentPane.add(btnGeriDn);
		
		JLabel lblNewLabel = new JLabel("Seçtiğiniz üründen kaç tane almak istiyorsunuz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(70, 194, 343, 19);
		contentPane.add(lblNewLabel);
	}

	public static Dukkan getDukkan() {
		return dukkan;
	}

	public static void setDukkan(Dukkan dukkan) {
		ToptanciGUI.dukkan = dukkan;
	}
}
