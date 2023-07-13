package Model;

import java.util.Random;

public class Dukkan {
	private int cikolata = 10, biskuvi = 10, kek = 10, su=10, meyveSuyu=10, sut=10, elma=10, armut=10, portakal=10;
	private double kasa = 0;
	private int gun=0, j=1;

	public Dukkan(int cikolata, int biskuvi, int kek, int su, int meyveSuyu, int sut, int elma, int armut, int portakal, int kasa, int gun, int j) {
		super();
		this.j = j;
		this.gun = gun;
		this.meyveSuyu = meyveSuyu;
		this.sut = sut;
		this.elma = elma;
		this.armut = armut;
		this.portakal = portakal;
		this.su = su;
		this.cikolata = cikolata;
		this.biskuvi = biskuvi;
		this.kek = kek;
		this.kasa = kasa;
	}
	public int getCikolata() {
		return cikolata;
	}

	public void setCikolata(int cikolata) {
		this.cikolata = cikolata;
	}

	public int getBiskuvi() {
		return biskuvi;
	}

	public void setBiskuvi(int biskuvi) {
		this.biskuvi = biskuvi;
	}

	public int getKek() {
		return kek;
	}

	public void setKek(int kek) {
		this.kek = kek;
	}

	public double getKasa() {
		return kasa;
	}

	public void setKasa(double kasa) {
		this.kasa = kasa;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getMeyveSuyu() {
		return meyveSuyu;
	}
	public void setMeyveSuyu(int meyveSuyu) {
		this.meyveSuyu = meyveSuyu;
	}
	public int getSut() {
		return sut;
	}
	public void setSut(int sut) {
		this.sut = sut;
	}
	public int getElma() {
		return elma;
	}
	public void setElma(int elma) {
		this.elma = elma;
	}
	public int getArmut() {
		return armut;
	}
	public void setArmut(int armut) {
		this.armut = armut;
	}
	public int getPortakal() {
		return portakal;
	}
	public void setPortakal(int portakal) {
		this.portakal = portakal;
	}
	public int getGun() {
		return gun;
	}
	public void setGun(int gun) {
		this.gun = gun;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}

