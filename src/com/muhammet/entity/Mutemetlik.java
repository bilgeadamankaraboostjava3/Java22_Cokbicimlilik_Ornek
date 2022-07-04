package com.muhammet.entity;

public class Mutemetlik {

	
	public void MaasHesapla(Personel personel) {
		personel.hesapla();
		System.out.println(personel.getUvan()+ " Maaþ Bilgisi: ");
		System.out.println("ad.......: "+personel.getIsim());
		System.out.println("maaþ.....: "+ personel.getMaas());
	}
	
	/*
	public void MaasHesapla(Mudur mudur) {
		
		System.out.println("Müdür Maaþ Bilgisi: ");
		System.out.println("ad.......: "+mudur.getIsim());
		System.out.println("maaþ.....: "+ mudur.getMaas());
	}
	
	public void MaasHesapla(Muhendis muhendis) {
		muhendis.hesapla();
		System.out.println("Muhendis Maaþ Bilgisi: ");
		System.out.println("ad.......: "+muhendis.getIsim());
		System.out.println("maaþ.....: "+ muhendis.getMaas());
	}
	
	public void MaasHesapla(Hizmetli hizmetli) {
		hizmetli.hesapla();
		System.out.println("Hizmetli Maaþ Bilgisi: ");
		System.out.println("ad.......: "+hizmetli.getIsim());
		System.out.println("maaþ.....: "+ hizmetli.getMaas());
	}
	
	public void MaasHesapla(Memur memur) {
		memur.hesapla();
		System.out.println("Memur Maaþ Bilgisi: ");
		System.out.println("ad.......: "+memur.getIsim());
		System.out.println("maaþ.....: "+ memur.getMaas());
	}
	 */
}
