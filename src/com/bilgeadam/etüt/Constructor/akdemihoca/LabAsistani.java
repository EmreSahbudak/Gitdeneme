package com.bilgeadam.et�t.Constructor.akdemihoca;

public class LabAsistani extends AkademisyenAbstract implements IAkadenisyenFonksiyonlar {

	public LabAsistani(String ad, String soyad, int telNo, String ePosta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telNo, ePosta, bolum, unvan, kapiNo);
		
	}

	@Override
	public void derseGir() {
		System.out.println("lab asistan� derse girdi");
		
	}

	@Override
	public void quizYap() {
		System.out.println("lab asistan� quiz yapt�");
		
	}

	@Override
	public void sinavYap() {
		System.out.println("lab asistan� s�nav yapt�");
		
	}
	
	@Override
	public void labDersinegir() {
		// lab dersine girin i�indeki soutua gider super key word ile
		super.labDersinegir();
		
	}
    
	@Override
	public String toString() {
		return "LabAsistani [bolum=" + bolum + ", unvan=" + unvan + ", kapiNo=" + kapiNo + ", ad=" + ad + ", soyad="
				+ soyad + ", telNo=" + telNo + ", ePosta=" + ePosta + "]";
	}
	

}
