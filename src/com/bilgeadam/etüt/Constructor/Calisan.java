package com.bilgeadam.etüt.Constructor;

public class Calisan {
	public String ad;
	public String soyad;
	public int yas;
	public int maas;
	
	// 4 PARAMETRELÝ OVERLOAD TÝP1
	public Calisan(String ad, String soyad, int yas, int maas) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.maas = maas;
	}
	//2 PARAMETRELÝ OVERLOAD TÝP2
	public Calisan(String ad, String soyad, int yas) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}
	//PARAMETRESÝZ OVERLOAD TÝP3
	public Calisan() {
		
	}
	////yukardakilerin hepsi overloadddýrrrrrrr
	//hepsini alt shift s ile deðiþkenleri secerek veya boþ býrakarak
}
