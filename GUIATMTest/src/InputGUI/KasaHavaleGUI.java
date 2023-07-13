package InputGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import Model.Dukkan;
import View.ArayuzGUI;
import View.DukkanGUI;
import View.ToptanciGUI;

import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class KasaHavaleGUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "", "");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "", "");
	static Dukkan dukkan = new Dukkan(10, 10, 10, 10, 10, 10, 10, 10, 10, 50, 0, 1);
	ArayuzGUI aGUI = new ArayuzGUI();
	DukkanGUI dGUI = new DukkanGUI();
	private JPanel contentPane;
	private JTextField fld_kasaHavale;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KasaHavaleGUI frame = new KasaHavaleGUI(bankaHesap1, dukkan);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public KasaHavaleGUI(BankaHesap1 bankaHesap1, Dukkan dukkan) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		fld_kasaHavale = new JTextField();
		fld_kasaHavale.setColumns(10);
		fld_kasaHavale.setBounds(63, 81, 193, 30);
		contentPane.add(fld_kasaHavale);

		JRadioButton rdb_hesap1 = new JRadioButton(ArayuzGUI.getBankaHesap1().getHesapnumarasi());
		rdb_hesap1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_hesap1.setBounds(262, 81, 86, 21);
		contentPane.add(rdb_hesap1);

		JRadioButton rdb_hesap2 = new JRadioButton(ArayuzGUI.getBankaHesap2().getHesapnumarasi2());
		rdb_hesap2.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_hesap2.setBounds(262, 105, 86, 21);
		contentPane.add(rdb_hesap2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdb_hesap1);
		bg.add(rdb_hesap2);

		JButton btn_kasaHavaleOnayla = new JButton("Onayla");
		btn_kasaHavaleOnayla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int havale = Integer.parseInt(fld_kasaHavale.getText());
				if (DukkanGUI.getDukkan().getKasa() >= havale && rdb_hesap1.isSelected()) {
					DukkanGUI.getDukkan().setKasa(DukkanGUI.getDukkan().getKasa() - havale);
					ArayuzGUI.getBankaHesap1().setMiktar(ArayuzGUI.getBankaHesap1().getMiktar() + havale);
					dispose();
					dGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, havale + "TL " + ArayuzGUI.getBankaHesap1().getHesapnumarasi()
							+ " numaralı hesabınıza yüklenmiştir.");
				} else if (DukkanGUI.getDukkan().getKasa() >= havale && rdb_hesap2.isSelected()) {
					DukkanGUI.getDukkan().setKasa(DukkanGUI.getDukkan().getKasa() - havale);
					ArayuzGUI.getBankaHesap2().setMiktar2(ArayuzGUI.getBankaHesap2().getMiktar2() + havale);
					dispose();
					dGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, havale + "TL " + ArayuzGUI.getBankaHesap2().getHesapnumarasi2()
							+ " numaralı hesabınıza yüklenmiştir.");
				} else {
					dispose();
					dGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							"Hesap seçiminizi gözden geçiriniz ya da bakiyenizi kontrol ediniz.", "hata",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_kasaHavaleOnayla.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_kasaHavaleOnayla.setBounds(63, 120, 193, 31);
		contentPane.add(btn_kasaHavaleOnayla);

		JTextArea txt_kasaHavale = new JTextArea(
				"Dükkan kasasından para göndermek \n istediğiniz hesabı işaretleyin \n ve göndereceğiniz tutarı giriniz:");
		txt_kasaHavale.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_kasaHavale.setEditable(false);
		txt_kasaHavale.setBounds(63, 10, 285, 61);
		contentPane.add(txt_kasaHavale);

	}
}
