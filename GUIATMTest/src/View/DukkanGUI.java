package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import InputGUI.Havale1GUI;
import InputGUI.KasaHavaleGUI;
import Model.BankaHesap1;
import Model.BankaHesap2;
import Model.Dukkan;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DukkanGUI extends JFrame {
	ArayuzGUI aGUI = new ArayuzGUI();
	static Dukkan dukkan = new Dukkan(5, 6, 4, 10, 9, 3, 7, 5, 15, 50, 0, 1);
	BankaHesap1 bankahesap1;
	BankaHesap2 bankahesap2;
	
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DukkanGUI frame = new DukkanGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public DukkanGUI() {
		setTitle("DÜKKAN");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("<< Dükkanda ürün satışı");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DukkanSatisGUI dsGUI = new DukkanSatisGUI(dukkan);
				dsGUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(196, 60, 60));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(28, 159, 250, 77);
		contentPane.add(btnNewButton);

		JButton btnDkkanarnAl = new JButton("<< Dükkana ürün alışı");
		btnDkkanarnAl.setHorizontalAlignment(SwingConstants.LEFT);
		btnDkkanarnAl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ToptanciGUI tGUI = new ToptanciGUI(dukkan);
				JOptionPane.showMessageDialog(null, "Toptancıya her girişte yalnızca bir ürün alınabilmektedir!!",
						"Uyarı", JOptionPane.INFORMATION_MESSAGE);
				tGUI.setVisible(true);
				dispose();
			}
		});
		btnDkkanarnAl.setBackground(new Color(196, 60, 60));
		btnDkkanarnAl.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDkkanarnAl.setBounds(28, 246, 250, 80);
		contentPane.add(btnDkkanarnAl);

		JButton btnDkkanBilgileri = new JButton("<< Dükkan Bilgileri");
		btnDkkanBilgileri.setHorizontalAlignment(SwingConstants.LEFT);
		btnDkkanBilgileri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Kasanızdaki toplam bakiye: " + DukkanGUI.dukkan.getKasa() + " TL"
						+ "\nKalan çikolata sayısı: " + DukkanGUI.dukkan.getCikolata() + "\nKalan bisküvi sayısı: "
						+ DukkanGUI.dukkan.getBiskuvi() + "\nKalan kek sayısı: " + DukkanGUI.dukkan.getKek()
						+ "\nKalan su sayısı: " + DukkanGUI.dukkan.getSu() + "\nKalan Meyve suyu sayısı: "
						+ DukkanGUI.dukkan.getMeyveSuyu() + "\nKalan süt sayısı: " + DukkanGUI.dukkan.getSut()
						+ "\nKalan elma sayısı: " + DukkanGUI.dukkan.getElma() + "\nKalan armut sayısı: "
						+ DukkanGUI.dukkan.getArmut() + "\nKalan portakal sayısı: "
						+ DukkanGUI.dukkan.getPortakal(), "DÜKKAN VERİLERİNİZ", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnDkkanBilgileri.setBackground(new Color(196, 60, 60));
		btnDkkanBilgileri.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDkkanBilgileri.setBounds(28, 336, 250, 80);
		contentPane.add(btnDkkanBilgileri);

		JButton btnHesabaPara = new JButton("<< Hesaba para transferi ");
		btnHesabaPara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KasaHavaleGUI kGUI = new KasaHavaleGUI(bankahesap1, dukkan);
				kGUI.setVisible(true);
				dispose();
			}
		});
		btnHesabaPara.setHorizontalAlignment(SwingConstants.LEFT);
		btnHesabaPara.setBackground(new Color(196, 60, 60));
		btnHesabaPara.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnHesabaPara.setBounds(28, 426, 250, 77);
		contentPane.add(btnHesabaPara);

		JButton btnDkkandank = new JButton("Dükkandan çık >>");
		btnDkkandank.setHorizontalAlignment(SwingConstants.RIGHT);
		btnDkkandank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aGUI.setVisible(true);
				dispose();
			}
		});
		btnDkkandank.setBackground(new Color(196, 60, 60));
		btnDkkandank.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDkkandank.setBounds(457, 425, 250, 80);
		contentPane.add(btnDkkandank);
	}

	public static Dukkan getDukkan() {
		return dukkan;
	}

	public static void setDukkan(Dukkan dukkan) {
		DukkanGUI.dukkan = dukkan;
	}


}
