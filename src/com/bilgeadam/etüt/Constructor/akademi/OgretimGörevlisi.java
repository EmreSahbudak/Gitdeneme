package com.bilgeadam.etüt.Constructor.akademi;

public class OgretimGörevlisi extends Akademisyen implements IAkademisyenFonksiyonlarý {

	public OgretimGörevlisi(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta, bolum, unvan, kapiNo);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void derseGir() {
		// TODO Auto-generated method stub
		System.out.println(" Öðretim görevlisi derse girdi");
	}

	@Override
	public void quizYap() {
		// TODO Auto-generated method stub
		System.out.println(" Öðretim görevlisi quiz yaptý");
	}

	@Override
	public void sinavYap() {
		// TODO Auto-generated method stub
		System.out.println(" Öðretim görevlisi sýnav yaptý");
	}

}
