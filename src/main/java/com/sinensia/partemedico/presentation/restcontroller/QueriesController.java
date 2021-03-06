package com.sinensia.partemedico.presentation.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.partemedico.integration.model.DTO.*;
import com.sinensia.partemedico.integration.repositories.QueriesRepository;

@Controller
@RequestMapping("query")
public class QueriesController {

	@Autowired
	private QueriesRepository QR;

	@GetMapping("/1")
	public Query1DTO primeraQuery() {
		Query1DTO dto = QR.Quey1();

		System.out.println("La media de las mediciones es: " + dto);

		return dto;
	}

	@GetMapping("/2")
	public void segundaQuery() {

		double peso = QR.Quey2();

		System.out.println("El peso es: " + peso);
	}

}
