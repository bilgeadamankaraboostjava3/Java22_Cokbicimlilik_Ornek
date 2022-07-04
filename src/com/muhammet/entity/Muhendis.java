package com.muhammet.entity;

public class Muhendis extends Personel {

	public Muhendis(String isim, double maas) {
		super(isim, maas, "Mühendis");
		
	}
	public void hesapla() {
		setMaas(15000);
	}
}
