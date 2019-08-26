package com.vinicpinheiro.vini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Billionaires;
import repository.BillionairesRepository;

@Service
public class BillionairesService {
	@Autowired
	BillionairesRepository bR;

		public void lancarErro() {
			throw new RuntimeException("Mensagem de erro vvvvvv");
		}
		
		public void insertBill(String name, String lastName) {
			Billionaires b = new Billionaires();
			b.setFirst_name(name);
			b.setLast_name(lastName);
			bR.save(b);
		}
}
