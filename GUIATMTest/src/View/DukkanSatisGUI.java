package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import Model.Dukkan;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class DukkanSatisGUI extends JFrame {
	Random r = new Random();

	int musteri = 1;
	int i = r.nextInt(10) + 1;
	static int j = 1;

	DukkanGUI dGUI = new DukkanGUI();

	static Dukkan dukkan;
	private JPanel contentPane;
	private JTextField fld_adet;
	private JTextField fld_id;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DukkanSatisGUI frame = new DukkanSatisGUI(dukkan);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DukkanSatisGUI(Dukkan dukkan) {
		setTitle("DÜKKAN");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 21, 261, 47);
		contentPane.add(menuBar);

		JMenu mnI_icecekler = new JMenu("İçecekler");
		mnI_icecekler.setHorizontalAlignment(SwingConstants.CENTER);
		mnI_icecekler.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnI_icecekler);

		JMenu mnI_su = new JMenu("Su");
		mnI_icecekler.add(mnI_su);

		JLabel lbl_suKod = new JLabel("Ürün kodu:1");
		lbl_suKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_su.add(lbl_suKod);

		JLabel lbl_suFiyat = new JLabel("2 TL");
		lbl_suFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_su.add(lbl_suFiyat);

		JLabel lbl_suAdet = new JLabel(DukkanGUI.dukkan.getSu() + " adet var");
		lbl_suAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_su.add(lbl_suAdet);

		JMenu mnI_meyveSuyu = new JMenu("Meyve suyu");
		mnI_icecekler.add(mnI_meyveSuyu);

		JLabel lbl_meyveSuyuKod = new JLabel("Ürün kodu:2");
		lbl_meyveSuyuKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_meyveSuyu.add(lbl_meyveSuyuKod);

		JLabel lbl_meyveSuyuFiyat = new JLabel("7 TL");
		lbl_meyveSuyuFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_meyveSuyu.add(lbl_meyveSuyuFiyat);

		JLabel lbl_meyveSuyuAdet = new JLabel(DukkanGUI.dukkan.getMeyveSuyu() + " adet var");
		lbl_meyveSuyuAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_meyveSuyu.add(lbl_meyveSuyuAdet);

		JMenu mnI_süt = new JMenu("Süt");
		mnI_icecekler.add(mnI_süt);

		JLabel lbl_sutKod = new JLabel("Ürün kodu:3");
		lbl_sutKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_süt.add(lbl_sutKod);

		JLabel lbl_sutFiyat = new JLabel("25 TL");
		lbl_sutFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_süt.add(lbl_sutFiyat);

		JLabel lbl_sutAdet = new JLabel(DukkanGUI.dukkan.getSut() + " adet var");
		lbl_sutAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_süt.add(lbl_sutAdet);

		JMenu mnI_atistirmaliklar = new JMenu("Atıştırmalıklar");
		mnI_atistirmaliklar.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnI_atistirmaliklar);

		JMenu mnI_cikolata = new JMenu("Çikolata");
		mnI_atistirmaliklar.add(mnI_cikolata);

		JLabel lbl_cikolataKod = new JLabel("Ürün kodu:4");
		lbl_cikolataKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_cikolata.add(lbl_cikolataKod);

		JLabel lbl_cikolataFiyat = new JLabel("5 TL");
		lbl_cikolataFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_cikolata.add(lbl_cikolataFiyat);

		JLabel lbl_cikolataAdet = new JLabel(DukkanGUI.dukkan.getCikolata() + " adet var");
		lbl_cikolataAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_cikolata.add(lbl_cikolataAdet);

		JMenu mnI_biskuvi = new JMenu("Bisküvi");
		mnI_atistirmaliklar.add(mnI_biskuvi);

		JLabel lbl_biskuviKod = new JLabel("Ürün kodu:5");
		lbl_biskuviKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_biskuvi.add(lbl_biskuviKod);

		JLabel lbl_biskuviFiyat = new JLabel("10 TL");
		lbl_biskuviFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_biskuvi.add(lbl_biskuviFiyat);

		JLabel lbl_biskuviAdet = new JLabel(DukkanGUI.dukkan.getBiskuvi() + " adet var");
		lbl_biskuviAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_biskuvi.add(lbl_biskuviAdet);

		JMenu mnI_kek = new JMenu("Kek");
		mnI_atistirmaliklar.add(mnI_kek);

		JLabel lbl_kekKod = new JLabel("Ürün kodu:6");
		lbl_kekKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_kek.add(lbl_kekKod);

		JLabel lbl_kekFiyat = new JLabel("3 TL");
		lbl_kekFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_kek.add(lbl_kekFiyat);

		JLabel lbl_kekAdet = new JLabel(DukkanGUI.dukkan.getKek() + " adet var");
		lbl_kekAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_kek.add(lbl_kekAdet);

		JMenu mnI_meyve = new JMenu("Meyveler");
		mnI_meyve.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(mnI_meyve);

		JMenu mnI_elma = new JMenu("Elma");
		mnI_meyve.add(mnI_elma);

		JLabel lbl_elmaKod = new JLabel("Ürün kodu:7");
		lbl_elmaKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_elma.add(lbl_elmaKod);

		JLabel lbl_elmaFiyat = new JLabel("8 TL");
		lbl_elmaFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_elma.add(lbl_elmaFiyat);

		JLabel lbl_elmaAdet = new JLabel(DukkanGUI.dukkan.getElma() + " adet var");
		lbl_elmaAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_elma.add(lbl_elmaAdet);

		JMenu mnI_armut = new JMenu("Armut");
		mnI_meyve.add(mnI_armut);

		JLabel lbl_armutKod = new JLabel("Ürün kodu:8");
		lbl_armutKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_armut.add(lbl_armutKod);

		JLabel lbl_armutFiyat = new JLabel("8 TL");
		lbl_armutFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_armut.add(lbl_armutFiyat);

		JLabel lbl_armutAdet = new JLabel(DukkanGUI.dukkan.getArmut() + " adet var");
		lbl_armutAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_armut.add(lbl_armutAdet);

		JMenu mnI_portakal = new JMenu("Portakal");
		mnI_meyve.add(mnI_portakal);

		JLabel lbl_portakalKod = new JLabel("Ürün kodu:9");
		lbl_portakalKod.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_portakal.add(lbl_portakalKod);

		JLabel lbl_portakalFiyat = new JLabel("10 TL");
		lbl_portakalFiyat.setFont(new Font("Tahoma", Font.BOLD, 12));
		mnI_portakal.add(lbl_portakalFiyat);

		JLabel lbl_portakalAdet = new JLabel(DukkanGUI.dukkan.getPortakal() + " adet var");
		lbl_portakalAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		mnI_portakal.add(lbl_portakalAdet);

		JLabel lblNewLabel = new JLabel("KASA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 40));
		lblNewLabel.setBounds(342, 21, 204, 46);
		contentPane.add(lblNewLabel);

		JLabel lbl_urunAdet = new JLabel("Ürün kodu girdiğiniz üründen kaç adet almak istiyorsunuz:");
		lbl_urunAdet.setEnabled(false);
		lbl_urunAdet.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl_urunAdet.setBounds(293, 146, 298, 24);
		contentPane.add(lbl_urunAdet);

		JLabel lbl_urunKodu = new JLabel("Ürün Kodu:");
		lbl_urunKodu.setEnabled(false);
		lbl_urunKodu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_urunKodu.setBounds(411, 77, 78, 24);
		contentPane.add(lbl_urunKodu);

		fld_adet = new JTextField();
		fld_adet.setEnabled(false);

		fld_adet.setBounds(383, 180, 123, 24);
		contentPane.add(fld_adet);
		fld_adet.setColumns(10);

		JButton btn_geriDön = new JButton("Geri Dön");
		btn_geriDön.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DukkanGUI.dukkan.setJ(1);
				dGUI.setVisible(true);
				dispose();
			}
		});

		JButton btn_satinAl = new JButton("Onayla");
		btn_satinAl.setEnabled(false);

		btn_satinAl.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btn_satinAl.addMouseListener(new MouseListener() {

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void mouseClicked(MouseEvent e) {
						int adet = Integer.parseInt(fld_adet.getText());
						int id = Integer.parseInt(fld_id.getText());
						boolean mesajGosterildi = false;
						while (DukkanGUI.dukkan.getJ() <= i) {
							if (!mesajGosterildi) {
								JOptionPane.showMessageDialog(null,
										DukkanGUI.dukkan.getJ() + ". müşteri satın almak için geliyor.");
								mesajGosterildi = true;
							}
							if (DukkanGUI.dukkan.getJ() <= i) {
								int secim = JOptionPane.showConfirmDialog(null, "Seçili üründen " + adet
										+ " adet almak için YES\nSatın alımı iptal etmek için NO\nDükkandan çıkmak için CANCEL'a tıklayınız.",
										"Bekleme", JOptionPane.YES_NO_CANCEL_OPTION);
								if (secim == JOptionPane.NO_OPTION) {
									if (DukkanGUI.dukkan.getJ() > i) {
										JOptionPane.showMessageDialog(null,
												"Müşteri kalmadı. Dükkanı kapatabilirsiniz.");
										fld_adet.setEditable(false);
										fld_id.setEditable(false);
										btn_satinAl.setVisible(false);
									}
									break;
								} else if (secim == JOptionPane.CANCEL_OPTION) {
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() + 1);
									if (DukkanGUI.dukkan.getJ() > i) {
										JOptionPane.showMessageDialog(null,
												"Müşteri kalmadı. Dükkanı kapatabilirsiniz.");
										fld_adet.setEditable(false);
										fld_id.setEditable(false);
										btn_satinAl.setVisible(false);
									}
									break;
								}

							}

							switch (id) {
							case 1:

								if (DukkanGUI.dukkan.getSu() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda su yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_suAdet.setText(DukkanGUI.dukkan.getSu() - adet + " adet su var");
									DukkanGUI.dukkan.setSu(DukkanGUI.dukkan.getSu() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 2));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki su adedi: " + DukkanGUI.dukkan.getSu()
													+ " olmuştur.");
								}
								break;
							case 2:
								if (DukkanGUI.dukkan.getMeyveSuyu() - adet < 0) {
									JOptionPane.showMessageDialog(null,
											"Dükkanda istenilen miktarda meyvesuyu yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_meyveSuyuAdet
											.setText(DukkanGUI.dukkan.getMeyveSuyu() - adet + " adet meyvesuyu var");
									DukkanGUI.dukkan.setMeyveSuyu(DukkanGUI.dukkan.getMeyveSuyu() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki meyvesuyu adedi: "
													+ DukkanGUI.dukkan.getMeyveSuyu() + " olmuştur.");

								}
								break;
							case 3:
								if (DukkanGUI.dukkan.getSut() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda süt yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_sutAdet.setText(DukkanGUI.dukkan.getSut() - adet + " adet süt var");
									DukkanGUI.dukkan.setSut(DukkanGUI.dukkan.getSut() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki süt adedi: " + DukkanGUI.dukkan.getSut()
													+ " olmuştur.");

								}
								break;
							case 4:
								if (DukkanGUI.dukkan.getCikolata() - adet < 0) {
									JOptionPane.showMessageDialog(null,
											"Dükkanda istenilen miktarda çikolata yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_cikolataAdet
											.setText(DukkanGUI.dukkan.getCikolata() - adet + " adet çikolata var");
									DukkanGUI.dukkan.setCikolata(DukkanGUI.dukkan.getCikolata() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki çikolata adedi: "
													+ DukkanGUI.dukkan.getCikolata() + " olmuştur.");

								}
								break;
							case 5:
								if (DukkanGUI.dukkan.getBiskuvi() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda bisküvi yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_biskuviAdet.setText(DukkanGUI.dukkan.getBiskuvi() - adet + " adet bisküvi var");
									DukkanGUI.dukkan.setBiskuvi(DukkanGUI.dukkan.getBiskuvi() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki bisküvi adedi: "
													+ DukkanGUI.dukkan.getBiskuvi() + " olmuştur.");

								}
								break;
							case 6:
								if (DukkanGUI.dukkan.getKek() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda kek yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_kekAdet.setText(DukkanGUI.dukkan.getKek() - adet + " adet kek var");
									DukkanGUI.dukkan.setKek(DukkanGUI.dukkan.getKek() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki kek adedi: " + DukkanGUI.dukkan.getKek()
													+ " olmuştur.");

								}
								break;
							case 7:
								if (DukkanGUI.dukkan.getElma() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda elma yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_elmaAdet.setText(DukkanGUI.dukkan.getElma() - adet + " adet elma var");
									DukkanGUI.dukkan.setElma(DukkanGUI.dukkan.getElma() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki elma adedi: " + DukkanGUI.dukkan.getElma()
													+ " olmuştur.");

								}
								break;
							case 8:
								if (DukkanGUI.dukkan.getArmut() - adet < 0) {
									JOptionPane.showMessageDialog(null, "Dükkanda istenilen miktarda bisküvi yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_armutAdet.setText(DukkanGUI.dukkan.getArmut() - adet + " adet armut var");
									DukkanGUI.dukkan.setArmut(DukkanGUI.dukkan.getArmut() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki armut adedi: "
													+ DukkanGUI.dukkan.getArmut() + " olmuştur.");

								}
								break;
							case 9:
								if (DukkanGUI.dukkan.getPortakal() - adet < 0) {
									JOptionPane.showMessageDialog(null,
											"Dükkanda istenilen miktarda portakal yoktur!!", "Hata" , JOptionPane.WARNING_MESSAGE);
									DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								} else {
									lbl_portakalAdet
											.setText(DukkanGUI.dukkan.getPortakal() - adet + " adet portakal var");
									DukkanGUI.dukkan.setPortakal(DukkanGUI.dukkan.getPortakal() - adet);
									DukkanGUI.dukkan.setKasa(DukkanGUI.dukkan.getKasa() + (adet * 7));
									JOptionPane.showMessageDialog(null,
											"Dükkan bakiyesi: " + DukkanGUI.dukkan.getKasa()
													+ " olmuştur. Dükkandaki portakal adedi: "
													+ DukkanGUI.dukkan.getPortakal() + " olmuştur.");

								}
								break;
							default:
								JOptionPane.showMessageDialog(null, "Hatalı veya eksik giriş yaptınız!!", "Hata",
										JOptionPane.ERROR_MESSAGE);
								DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() - 1);
								break;
							}

							mesajGosterildi = false;
							DukkanGUI.dukkan.setJ(DukkanGUI.dukkan.getJ() + 1);
							if (DukkanGUI.dukkan.getJ() > i) {
								JOptionPane.showMessageDialog(null, "Müşteri kalmadı. Dükkanı kapatabilirsiniz.",
										"Uyarı", JOptionPane.INFORMATION_MESSAGE);
								btn_satinAl.setVisible(false);
								fld_adet.setEditable(false);
								fld_id.setEditable(false);
							}

						}

					}
				});

			}
		});

		btn_satinAl.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_satinAl.setBounds(350, 214, 184, 31);
		contentPane.add(btn_satinAl);

		JButton btn_dukkanKapat = new JButton("Dükkanı kapat");
		btn_dukkanKapat.setEnabled(false);
		btn_dukkanKapat.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DukkanGUI.dukkan.setGun(DukkanGUI.dukkan.getGun() + 1);
				JOptionPane.showMessageDialog(null, DukkanGUI.dukkan.getGun() + ". gün bitti.");
				DukkanGUI.dukkan.setJ(1);
				dGUI.setVisible(true);
				dispose();
			}
		});

		JButton btn_dukkanAc = new JButton("Dükkanı aç");
		btn_dukkanAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, i + " Müşteri dükkana gelmiştir.");
				btn_dukkanAc.setVisible(false);
				btn_satinAl.setEnabled(true);
				btn_dukkanKapat.setEnabled(true);
				btn_geriDön.setEnabled(false);
				fld_adet.setEnabled(true);
				fld_id.setEnabled(true);
				lbl_urunAdet.setEnabled(true);
				lbl_urunKodu.setEnabled(true);
			}
		});

		btn_dukkanAc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_dukkanAc.setBounds(10, 306, 146, 47);
		contentPane.add(btn_dukkanAc);

		btn_dukkanKapat.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_dukkanKapat.setBounds(166, 306, 146, 47);
		contentPane.add(btn_dukkanKapat);

		fld_id = new JTextField(10);
		fld_id.setEnabled(false);
		fld_id.setBounds(383, 111, 123, 24);
		contentPane.add(fld_id);

		btn_geriDön.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_geriDön.setBounds(477, 306, 114, 36);
		contentPane.add(btn_geriDön);

	}
}
