package com.enderecos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enderecos.model.EnderecosModel;
import com.enderecos.repository.EnderecosRepository;
import com.enderecos.response.Response;

@RestController
@RequestMapping(value="/junior")
public class EnderecosResource {
	
	@Autowired
	EnderecosRepository pr;
	
	@GetMapping(value="/enderecos")
	public List<EnderecosModel> produto(){
		return pr.findAll();
		
	}
	
	@GetMapping(value="/enderecos/{cep}")
	public EnderecosModel busca(@PathVariable(value="cep") String cep) {
		EnderecosModel pm = pr.findByCep(cep);
		return pm;
	}
	
	@PostMapping(value="/enderecos")
	@ResponseBody
	public ResponseEntity<Response> enderecoAdicionado(@RequestBody EnderecosModel endereco) {
		
		try {
		EnderecosModel novo = pr.save(endereco);
		Response r = new Response("Sucesso");
		return ResponseEntity.status(201).body(r);	
		
		}catch(Exception e) {
			Response r = new Response("Erro", e.getMessage());
			return ResponseEntity.status(500).body(r);
		}
	}
	
	@DeleteMapping(value="/enderecos/{cep}")
	public ResponseEntity<Response> deletarEndereco(@PathVariable(value="cep") String cep) {
		
		try {
		EnderecosModel pm = pr.findByCep(cep);
		pr.delete(pm);
		Response r = new Response("Sucesso");
		return ResponseEntity.status(201).body(r);
		
		}catch(Exception e) {
			Response res = new Response("Erro", e.getMessage());
			return ResponseEntity.status(500).body(res);
		}
	}
	
	@PutMapping(value="/enderecos")
	public EnderecosModel atualiza(@RequestBody EnderecosModel endereco) {
		return pr.save(endereco);
		 
	}
}
