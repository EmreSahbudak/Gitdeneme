package com.bilgeadam.etüt.Constructor.akdemihoca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabAsistani labAsistani=new LabAsistani("emre","sahbudak", 343, "dfsdf", "fdda", "dfsfd", 44);
        System.out.println(labAsistani);
        labAsistani.derseGir();
        //labAsistani.deneyYap();
        labAsistani.quizYap();
        labAsistani.labDersinegir();
        //labAsistani.yemekhaneyiKullan();
        labAsistani.deneyYap();
        labAsistani.yemekhaneyiKullan();
	}

}
