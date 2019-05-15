package com.enderecos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enderecos.model.EnderecosModel;

public interface EnderecosRepository extends JpaRepository<EnderecosModel, String>{

	EnderecosModel findByCep(String cep);
}
