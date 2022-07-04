package com.muhammet;

import com.muhammet.entity.Ceo;
import com.muhammet.entity.Hizmetli;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhendis;
import com.muhammet.entity.Mutemetlik;


public class Runner {

	public static void main(String[] args) {
		Mutemetlik mutemetlik= new Mutemetlik();
		Mudur mudur = new Mudur("Kenan",30000);
		mutemetlik.MaasHesapla(mudur);
		
		Muhendis muhendis  = new Muhendis("Canan", 0);
		mutemetlik.MaasHesapla(muhendis);
		
		mutemetlik.MaasHesapla(new Hizmetli("Derya", 0));
		
		mutemetlik.MaasHesapla(new Ceo(null, 0, null));
	}

}
