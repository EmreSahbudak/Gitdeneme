package com.bilgeadam.et�t.Constructor.akademi;

public class OgretimG�revlisi extends Akademisyen implements IAkademisyenFonksiyonlar� {

	public OgretimG�revlisi(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta, bolum, unvan, kapiNo);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void derseGir() {
		// TODO Auto-generated method stub
		System.out.println(" ��retim g�revlisi derse girdi");
	}

	@Override
	public void quizYap() {
		// TODO Auto-generated method stub
		System.out.println(" ��retim g�revlisi quiz yapt�");
	}

	@Override
	public void sinavYap() {
		// TODO Auto-generated method stub
		System.out.println(" ��retim g�revlisi s�nav yapt�");
	}

}
