package com.muhammet.entity;

public class Mudur extends Personel{

	public Mudur(String isim, double maas) {
		super(isim, maas, "Müdür");
		
	}
	public void hesapla() {
		setMaas(20000);
	}
}
