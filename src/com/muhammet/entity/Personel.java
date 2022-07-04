package com.muhammet.entity;

public class Personel {
	
	private String isim;
	private double maas;
	private String uvan;

	public void hesapla(){
		
	}
	
	public Personel(String isim, double maas, String uvan) {
		super();
		this.isim = isim;
		this.maas = maas;
		this.uvan = uvan;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
	public String getUvan() {
		return uvan;
	}
	public void setUvan(String uvan) {
		this.uvan = uvan;
	}
	
	
	

}
