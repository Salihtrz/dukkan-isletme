package Model;

public class BankaHesap2 {

	private double miktar2;
	private String adsoyad2, hesapnumarasi2;

	public BankaHesap2(double miktar2, String adsoyad2, String hesapnumarasi2) {
		super();
		this.miktar2 = miktar2;
		this.adsoyad2 = adsoyad2;
		this.hesapnumarasi2 = hesapnumarasi2;
	}
	
	public double getMiktar2() {
		return miktar2;
	}


	public void setMiktar2(double miktar2) {
		this.miktar2 = miktar2;
	}


	public String getAdsoyad2() {
		return adsoyad2;
	}


	public void setAdsoyad2(String adsoyad2) {
		this.adsoyad2 = adsoyad2;
	}


	public String getHesapnumarasi2() {
		return hesapnumarasi2;
	}


	public void setHesapnumarasi2(String hesapnumarasi2) {
		this.hesapnumarasi2 = hesapnumarasi2;
	}
}
