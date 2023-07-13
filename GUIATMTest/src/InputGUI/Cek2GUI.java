package InputGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import View.ArayuzGUI;
import View.BankaHesap2GUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Cek2GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "salihterzi", "5678");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "salihterzi", "5678");
	BankaHesap2GUI bGUI = new BankaHesap2GUI(bankaHesap1 , bankaHesap2);
	ArayuzGUI aGUI = new ArayuzGUI();
	private JPanel contentPane;
	private JTextField fld_cek2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cek2GUI frame = new Cek2GUI(bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cek2GUI(BankaHesap2 bankaHesap2) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_cek2 = new JLabel("Çekmek istediğiniz tutarı giriniz:");
		lbl_cek2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_cek2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_cek2.setBounds(10, 33, 306, 22);
		contentPane.add(lbl_cek2);
		
		fld_cek2 = new JTextField();
		fld_cek2.setColumns(10);
		fld_cek2.setBounds(64, 65, 193, 30);
		contentPane.add(fld_cek2);
		
		JButton btn_CekOnayla2 = new JButton("Onayla");
		btn_CekOnayla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double kesim = 0.001;
				int paraCek1 = Integer.parseInt(fld_cek2.getText());

				if (paraCek1 > bankaHesap2.getMiktar2()) {
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, "Yeterli Bakiye Bulunmamaktadır!!", "Hata",
							JOptionPane.WARNING_MESSAGE);
				} else if (paraCek1 >= 5000) {
					if ((paraCek1 * kesim) + paraCek1 > bankaHesap2.getMiktar2()) {
						dispose();
						aGUI.setVisible(true);
						JOptionPane.showMessageDialog(null, "Hesabınızda kesim ücretini karşılayacak bakiye yoktur!!",
								"Hata", JOptionPane.WARNING_MESSAGE);
					}else {
						bankaHesap2.setMiktar2(bankaHesap2.getMiktar2() - (paraCek1 * kesim) - paraCek1);
						dispose();
						aGUI.setVisible(true);
						JOptionPane.showMessageDialog(null, (paraCek1 * kesim) + "TL kesilmiştir.");
					}
				}else {
					bankaHesap2.setMiktar2(bankaHesap2.getMiktar2() - paraCek1);
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null, paraCek1 + "TL hesabınızdan çekilmiştir.");
				}
			}
		});
		btn_CekOnayla2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_CekOnayla2.setBounds(64, 105, 193, 31);
		contentPane.add(btn_CekOnayla2);
	}

}
