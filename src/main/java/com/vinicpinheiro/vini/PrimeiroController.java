package com.vinicpinheiro.vini;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinicpinheiro.vini.dto.Resposta;

import entities.Billionaires;
import repository.BillionairesRepository;



@RestController
@RequestMapping("cervejaria")
class PrimeiroWsController {
	@Autowired
	CervejaService cs;
	
	@Autowired
	BillionairesService bs;
	
	@Autowired
	BillionairesRepository respository;
	
	
	//http://localhost:8080/cervejarias/cerveja
	@RequestMapping(value = "/cerveja", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
	public ResponseEntity<List<Resposta>> methodVini() {
		List<Resposta> listaResp = new ArrayList<>();
		listaResp.add(new Resposta("A","B"));
		listaResp.add(new Resposta("A","B"));
		return ResponseEntity.ok(listaResp);
    }
	
	
	@RequestMapping(value = "/cervejas", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
	public ResponseEntity<List<Resposta>> methodVini2() {
		List<Resposta> listaResp = new ArrayList<>();
		listaResp.add(new Resposta("C","D"));
		listaResp.add(new Resposta("E","F"));
		
		
		cs.lancarErro();
		return ResponseEntity.ok(listaResp);
    }
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces="application/json")
    public Iterable<Billionaires> list() {
		bs.insertBill("AAAAAAAA", "BBBB");
        return respository.findAll();
    }
}