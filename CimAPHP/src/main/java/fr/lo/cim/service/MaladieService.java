package fr.lo.cim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.lo.cim.DTO.MaladieDTO;
import fr.lo.cim.entity.Maladie;
import fr.lo.cim.repository.MaladieRepository;

@Service
public class MaladieService {
	
	@Autowired
	private MaladieRepository maladieRepository;
	

	@Transactional(readOnly = true)
	public Maladie searchService(String malsc) {
		
		return maladieRepository.findByCode(malsc);		
	}
	
	@Transactional(readOnly = true)
	public List<Maladie> enfantService(Maladie parent){
		
		return maladieRepository.findById_parent(parent);
	}
	
}
