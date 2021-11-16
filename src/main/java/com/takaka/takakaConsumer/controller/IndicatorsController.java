package com.takaka.takakaConsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takaka.takakaConsumer.model.IndicatorsModel;
import com.takaka.takakaConsumer.repository.IndicatorsRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/relatorio")
public class IndicatorsController {
	
	@Autowired
	IndicatorsRepository indicatorsRepository;

	
	@GetMapping()
	@ApiOperation(value = "Lista de indicators")
	public ResponseEntity<List<IndicatorsModel>> findAll() {

		List<IndicatorsModel> indicators = indicatorsRepository.findAll();
		return ResponseEntity.ok(indicators);
	}

}
