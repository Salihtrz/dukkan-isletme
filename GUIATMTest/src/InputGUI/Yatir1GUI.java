package InputGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.BankaHesap1;
import Model.BankaHesap2;
import View.ArayuzGUI;
import View.BankaHesap1GUI;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "serial", "unused" })
public class Yatir1GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "salihterzi", "1234");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "salihterzi", "1234");
	BankaHesap1GUI b1GUI = new BankaHesap1GUI(bankaHesap1 , bankaHesap2);
	ArayuzGUI aGUI = new ArayuzGUI();

	private JPanel contentPane;
	private JTextField fld_yatir1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yatir1GUI frame = new Yatir1GUI(bankaHesap1);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Yatir1GUI(BankaHesap1 bankaHesap1) {
		setTitle("Yatır1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 185);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fld_yatir1 = new JTextField();
		fld_yatir1.setBounds(64, 65, 193, 30);
		contentPane.add(fld_yatir1);
		fld_yatir1.setColumns(10);

		JLabel lbl_yatir1 = new JLabel("Yatırmak istediğiniz tutarı giriniz:");
		lbl_yatir1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_yatir1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_yatir1.setBounds(10, 33, 306, 22);
		contentPane.add(lbl_yatir1);
		
		

		JButton btn_YatirOnayla1 = new JButton("Onayla");
		btn_YatirOnayla1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int paraYukle1 = Integer.parseInt(fld_yatir1.getText());

				if (paraYukle1 >= 5000) {
					JOptionPane.showMessageDialog(null, "Tek seferde 5000 TL veya daha fazla yüklenememektedir!", "Hata",
							JOptionPane.WARNING_MESSAGE);
					dispose();
					aGUI.setVisible(true);
				} else {
					bankaHesap1.setMiktar((paraYukle1 + bankaHesap1.getMiktar()));
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							"Hesabınızdaki bakiye: " + bankaHesap1.getMiktar() + " TL olmuştur.");
					
				}
			}
		});
		btn_YatirOnayla1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_YatirOnayla1.setBounds(64, 105, 193, 31);
		contentPane.add(btn_YatirOnayla1);

	}
}
