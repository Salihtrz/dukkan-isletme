package Model;

public class BankaHesap1 {
	
	 private double miktar;
	 private String adsoyad, hesapnumarasi;

	public BankaHesap1(double miktar, String adsoyad, String hesapnumarasi) {
		super();
		this.miktar = miktar;
		this.adsoyad = adsoyad;
		this.hesapnumarasi = hesapnumarasi;
	}
	
	public double getMiktar() {
		return miktar;
	}

	public void setMiktar(double miktar) {
		this.miktar = miktar;
	}

	public String getAdsoyad() {
		return adsoyad;
	}

	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}

	public String getHesapnumarasi() {
		return hesapnumarasi;
	}

	public void setHesapnumarasi(String hesapnumarasi) {
		this.hesapnumarasi = hesapnumarasi;
	}
}
