package com.muhammet.entity;

public class Mutemetlik {

	
	public void MaasHesapla(Personel personel) {
		personel.hesapla();
		System.out.println(personel.getUvan()+ " Maa� Bilgisi: ");
		System.out.println("ad.......: "+personel.getIsim());
		System.out.println("maa�.....: "+ personel.getMaas());
	}
	
	/*
	public void MaasHesapla(Mudur mudur) {
		
		System.out.println("M�d�r Maa� Bilgisi: ");
		System.out.println("ad.......: "+mudur.getIsim());
		System.out.println("maa�.....: "+ mudur.getMaas());
	}
	
	public void MaasHesapla(Muhendis muhendis) {
		muhendis.hesapla();
		System.out.println("Muhendis Maa� Bilgisi: ");
		System.out.println("ad.......: "+muhendis.getIsim());
		System.out.println("maa�.....: "+ muhendis.getMaas());
	}
	
	public void MaasHesapla(Hizmetli hizmetli) {
		hizmetli.hesapla();
		System.out.println("Hizmetli Maa� Bilgisi: ");
		System.out.println("ad.......: "+hizmetli.getIsim());
		System.out.println("maa�.....: "+ hizmetli.getMaas());
	}
	
	public void MaasHesapla(Memur memur) {
		memur.hesapla();
		System.out.println("Memur Maa� Bilgisi: ");
		System.out.println("ad.......: "+memur.getIsim());
		System.out.println("maa�.....: "+ memur.getMaas());
	}
	 */
}
