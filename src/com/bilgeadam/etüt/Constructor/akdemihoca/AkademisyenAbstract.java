package com.bilgeadam.etüt.Constructor.akdemihoca;

public abstract class AkademisyenAbstract extends Calisan {
	
	    public String bolum;
	    public String unvan;
	    public int kapiNo;
	
	public AkademisyenAbstract(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan,
			int kapiNo) {
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
	
	//public abstract void yemekhaneyiKullan();
	public void deneyYap() {
		System.out.println("öðrencilerle beraber deney yapýldý");
		
	}

}
