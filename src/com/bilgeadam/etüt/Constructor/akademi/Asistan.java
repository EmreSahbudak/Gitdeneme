package com.bilgeadam.et�t.Constructor.akademi;

public class Asistan extends Akademisyen implements IAkademisyenFonksiyonlar�{

	public Asistan(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta, bolum, unvan, kapiNo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void derseGir() {
		// TODO Auto-generated method stub
		System.out.println(" asistan derse girdi");
	}

	@Override
	public void quizYap() {
		// TODO Auto-generated method stub
		System.out.println(" asistan qu�z yapt�");
	}

	@Override
	public void sinavYap() {
		// TODO Auto-generated method stub
		System.out.println(" asistan s�nav yapt�");
	}

}
