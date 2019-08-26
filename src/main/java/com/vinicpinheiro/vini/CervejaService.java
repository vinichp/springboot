package com.vinicpinheiro.vini;

import org.springframework.stereotype.Service;

@Service
public class CervejaService {

		public void lancarErro() {
			throw new RuntimeException("Mensagem de erro vvvvvv");
		}
		
		public void insertPessoa() {
			
		}
}
