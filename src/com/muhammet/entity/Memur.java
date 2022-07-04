package com.muhammet.entity;

public class Memur extends Personel {

	public Memur(String isim, double maas) {
		super(isim, maas, "Memur");
	
	}
	
	public void hesapla() {
		setMaas(5000);
	}

}
