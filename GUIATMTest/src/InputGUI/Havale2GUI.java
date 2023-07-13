package InputGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import View.ArayuzGUI;
import View.DukkanGUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Havale2GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "", "");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "", "");
	ArayuzGUI aGUI = new ArayuzGUI();
	private JPanel contentPane;
	private JTextField fld_havale2;
	private JTextArea txt_kasaHavale;
	private JRadioButton rdb_hesap1;
	private JRadioButton rdb_dukkan;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Havale2GUI frame = new Havale2GUI(bankaHesap1, bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Havale2GUI(BankaHesap1 bankaHesap1, BankaHesap2 bankaHesap2) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		fld_havale2 = new JTextField();
		fld_havale2.setColumns(10);
		fld_havale2.setBounds(10, 81, 193, 30);
		contentPane.add(fld_havale2);

		rdb_hesap1 = new JRadioButton(ArayuzGUI.getBankaHesap1().getHesapnumarasi());
		rdb_hesap1.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_hesap1.setBounds(209, 81, 103, 21);
		contentPane.add(rdb_hesap1);

		rdb_dukkan = new JRadioButton("Dükkan");
		rdb_dukkan.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_dukkan.setBounds(209, 104, 103, 21);
		contentPane.add(rdb_dukkan);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdb_dukkan);
		bg.add(rdb_hesap1);

		JButton btn_HavaleOnayla2 = new JButton("Onayla");
		btn_HavaleOnayla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int havale2 = Integer.parseInt(fld_havale2.getText());
				if (bankaHesap2.getMiktar2() >= havale2 && rdb_hesap1.isSelected()) {
					bankaHesap2.setMiktar2(bankaHesap2.getMiktar2() - havale2);
					bankaHesap1.setMiktar(bankaHesap1.getMiktar() + havale2);
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							havale2 + "TL " + ArayuzGUI.getBankaHesap1().getHesapnumarasi() + " hesabınıza aktarıldı.");
				} else if (bankaHesap2.getMiktar2() >= havale2 && rdb_dukkan.isSelected()) {
					bankaHesap2.setMiktar2(bankaHesap2.getMiktar2() - havale2);
					DukkanGUI.getDukkan().setKasa(DukkanGUI.getDukkan().getKasa() + havale2);
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, havale2 + " TL dükkan kasanıza yüklenmiştir.");
				} else {
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, "Hesabınızda yeterli bakiye yoktur!!", "Hata",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_HavaleOnayla2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_HavaleOnayla2.setBounds(10, 121, 193, 31);
		contentPane.add(btn_HavaleOnayla2);

		txt_kasaHavale = new JTextArea(ArayuzGUI.getBankaHesap2().getHesapnumarasi2()
				+ " numaralı hesaptan para göndermek \nistediğiniz hesabı işaretleyin ve göndereceğiniz \ntutarı giriniz:");
		txt_kasaHavale.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_kasaHavale.setEditable(false);
		txt_kasaHavale.setBounds(10, 10, 386, 61);
		contentPane.add(txt_kasaHavale);

	}

}
