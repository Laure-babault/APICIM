package fr.lo.cim.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import fr.lo.cim.entity.Maladie;

public class MaladieDTO {

	private String code;
	private String libelleCourt;
	private String libelle;
	
	
	public String getCode() {
		return code;
	}
	public String getLibelleCourt() {
		return libelleCourt;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setLibelleCourt(String libelleCourt) {
		this.libelleCourt = libelleCourt;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public MaladieDTO(Maladie maladie) {
        this.code = maladie.getCode();
        this.libelleCourt = maladie.getLibelleCourt();
        this.libelle = maladie.getLibelle();
       
    }

	
	
}
