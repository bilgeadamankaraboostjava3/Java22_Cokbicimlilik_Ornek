package com.muhammet.entity;

public class Hizmetli  extends Personel{

	public Hizmetli(String isim, double maas) {
		super(isim, maas, "Hizmetli");
		
	}
	public void hesapla() {
		setMaas(4500);
	}
}
