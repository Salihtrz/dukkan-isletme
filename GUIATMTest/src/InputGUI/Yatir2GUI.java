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
public class Yatir2GUI extends JFrame {
	static BankaHesap1 bankaHesap1 = new BankaHesap1(1, "salihterzi", "5678");
	static BankaHesap2 bankaHesap2 = new BankaHesap2(2, "salihterzi", "5678");
	BankaHesap2GUI b2GUI = new BankaHesap2GUI(bankaHesap1 , bankaHesap2);
	ArayuzGUI aGUI = new ArayuzGUI();
	
	private JPanel contentPane;
	private JTextField fld_yatir2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yatir2GUI frame = new Yatir2GUI(bankaHesap2);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Yatir2GUI(BankaHesap2 bankaHesap2) {
		setTitle("Yatır2");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Yatırmak istediğiniz tutarı giriniz:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 33, 306, 22);
		contentPane.add(lblNewLabel);
		
		fld_yatir2 = new JTextField();
		fld_yatir2.setColumns(10);
		fld_yatir2.setBounds(64, 65, 193, 30);
		contentPane.add(fld_yatir2);
		
		JButton btn_YatirOnayla2 = new JButton("Onayla");
		btn_YatirOnayla2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int paraYukle2 = Integer.parseInt(fld_yatir2.getText());

				if (paraYukle2 >= 5000) {
					JOptionPane.showMessageDialog(null, "Tek seferde 5000 TL veya daha fazla yüklenememektedir!", "Hata",
							JOptionPane.WARNING_MESSAGE);
					dispose();
					aGUI.setVisible(true);
				} else {
					bankaHesap2.setMiktar2((paraYukle2 + bankaHesap2.getMiktar2()));
					dispose();
					aGUI.setVisible(true);
					JOptionPane.showMessageDialog(null,
							"Hesabınızdaki bakiye: " + bankaHesap2.getMiktar2() + " TL olmuştur.");
				}
			}
		});
		btn_YatirOnayla2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_YatirOnayla2.setBounds(64, 105, 193, 31);
		contentPane.add(btn_YatirOnayla2);
	}

}
