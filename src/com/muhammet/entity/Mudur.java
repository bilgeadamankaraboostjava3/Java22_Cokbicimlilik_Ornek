package com.muhammet.entity;

public class Mudur extends Personel{

	public Mudur(String isim, double maas) {
		super(isim, maas, "M�d�r");
		
	}
	public void hesapla() {
		setMaas(20000);
	}
}
