package com.bilgeadam.etüt.Constructor.akdemihoca;

public abstract class Calisan {
	//en tepedeki ana sýnýf çalýþan
	public String ad;
	public String soyad;
	public int telNo;
	public String ePosta;
	
	public Calisan(String ad, String soyad, int telNo, String ePosta) {
		
		this.ad = ad;
		this.soyad = soyad;
		this.telNo = telNo;
		this.ePosta = ePosta;
	}

}
