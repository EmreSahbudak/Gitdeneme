package com.bilgeadam.et�t.Constructor;

public class Calisan {
	public String ad;
	public String soyad;
	public int yas;
	public int maas;
	
	// 4 PARAMETREL� OVERLOAD T�P1
	public Calisan(String ad, String soyad, int yas, int maas) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.maas = maas;
	}
	//2 PARAMETREL� OVERLOAD T�P2
	public Calisan(String ad, String soyad, int yas) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	//PARAMETRES�Z OVERLOAD T�P3
	public Calisan() {
		
	}
	////yukardakilerin hepsi overloaddd�rrrrrrr
	//hepsini alt shift s ile de�i�kenleri secerek veya bo� b�rakarak
}
