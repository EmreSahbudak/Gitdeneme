package com.bilgeadam.etüt.Constructor.akademi;

public class Akademisyen extends Calisan {
	public String bolum;
	public String unvan;
	public int kapiNo;
	
	public Akademisyen(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta);
		this.bolum = bolum;
		this.unvan = unvan;
		this.kapiNo = kapiNo;
	}
	public void labDersinegir() {
		System.out.println("Lab dersine gidildi");
		
	}
	public void yemekhaneyiKullan() {
		System.out.println("yemek yemeye yemekhaneye gidildi");
	}
	public void deneyYap() {
		System.out.println("öðrencilerle beraber deney yapýldý");
		
	}
	
}
