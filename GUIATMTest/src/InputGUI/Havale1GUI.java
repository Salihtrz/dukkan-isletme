package InputGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import Model.Dukkan;
import View.ArayuzGUI;
import View.DukkanGUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.JobAttributes;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

@SuppressWarnings({ "serial", "unused" })
public class Havale1GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "", "");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "", "");
	ArayuzGUI aGUI = new ArayuzGUI();
	private JPanel contentPane;
	private JTextField fld_havale1;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JScrollBar scrollBar;
	private JTextArea textArea_2;
	private JTextArea textArea_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Havale1GUI frame = new Havale1GUI(bankaHesap1, bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Havale1GUI(BankaHesap1 bankaHesap1, BankaHesap2 bankaHesap2) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		fld_havale1 = new JTextField();
		fld_havale1.setColumns(10);
		fld_havale1.setBounds(10, 77, 193, 30);
		contentPane.add(fld_havale1);
		
		JRadioButton rdb_hesap2 = new JRadioButton(ArayuzGUI.getBankaHesap2().getHesapnumarasi2());
		rdb_hesap2.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_hesap2.setBounds(220, 81, 103, 21);
		contentPane.add(rdb_hesap2);

		JRadioButton rdb_dukkan = new JRadioButton("Dükkan");
		rdb_dukkan.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdb_dukkan.setBounds(220, 104, 103, 21);
		contentPane.add(rdb_dukkan);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdb_dukkan);
		bg.add(rdb_hesap2);

		JButton btn_HavaleOnayla1 = new JButton("Onayla");
		btn_HavaleOnayla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int havale = Integer.parseInt(fld_havale1.getText());
				if (bankaHesap1.getMiktar() >= havale && rdb_hesap2.isSelected()) {
					bankaHesap1.setMiktar(bankaHesap1.getMiktar() - havale);
					bankaHesap2.setMiktar2(bankaHesap2.getMiktar2() + havale);
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							havale + "TL " + bankaHesap2.getHesapnumarasi2() + " numaralı hesabınıza yüklenmiştir.");
				}else if(bankaHesap1.getMiktar() >= havale && rdb_dukkan.isSelected()) {
					bankaHesap1.setMiktar(bankaHesap1.getMiktar() - havale);
					DukkanGUI.getDukkan().setKasa(DukkanGUI.getDukkan().getKasa() + havale);
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							havale + " TL dükkan kasanıza yüklenmiştir.");
				}
				else {
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, "Hesabınızda yeterli bakiye yoktur!!", "Hata",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_HavaleOnayla1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_HavaleOnayla1.setBounds(10, 117, 193, 31);
		contentPane.add(btn_HavaleOnayla1);

		

		JTextArea txt_kasaHavale = new JTextArea(ArayuzGUI.getBankaHesap1().getHesapnumarasi()
				+ " numaralı hesaptan para göndermek \nistediğiniz hesabı işaretleyin ve göndereceğiniz \ntutarı giriniz:");
		txt_kasaHavale.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_kasaHavale.setEditable(false);
		txt_kasaHavale.setBounds(10, 10, 386, 61);
		contentPane.add(txt_kasaHavale);
		
		

	}
}
