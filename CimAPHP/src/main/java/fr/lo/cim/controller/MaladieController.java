package fr.lo.cim.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import fr.lo.cim.DTO.MaladieDTO;
import fr.lo.cim.entity.Maladie;
import fr.lo.cim.service.MaladieService;

@RestController
public class MaladieController {

	private Maladie maladie;
	@Autowired
	private MaladieService maladieService;

	@GetMapping(value = "/maladies/{code}")
	@ResponseBody
	public MaladieDTO searchMaladie(@PathVariable String code) {

		Maladie maladie = maladieService.searchService(code);

		MaladieDTO maladiedto = new MaladieDTO(maladie);

		return maladiedto;

	}

	@GetMapping(value = "/maladies/{code}/enfants")
	public List<MaladieDTO> maladieEnfant(@PathVariable String code) {
		
		Maladie maladie = maladieService.searchService(code);
		
		List<Maladie> lmaladie = maladieService.enfantService(maladie);
		
		List<MaladieDTO> ldtomaladie = new ArrayList<MaladieDTO>();
		
		for (int i = 0; i < lmaladie.size(); i++) {
		      
				MaladieDTO dtomal =	new MaladieDTO(lmaladie.get(i));
				ldtomaladie.add(dtomal);
		    }
				
		return ldtomaladie;
	}

	
	 // @GetMapping(value="/maladies/{code}/enfants") 
	 // public List<Maladie> maladieEnfant(@PathVariable String code){ 
	 // return maladieService.enfantService(maladieService.searchService(code)); 
	 //}
	 

	/*
	 * private MaladieDTO convertToDto(Maladie maladie) { MaladieDTO maladieDto =
	 * ModelMapper.map(maladie, MaladieDTO.class);
	 * 
	 * return maladieDto; }
	 */

}
