package fr.lo.cim.entity;

import java.util.*;

import javax.persistence.*;


@Entity
public class Maladie {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "code", length= 40, nullable = true)
	private String code;
	@Column(name = "libelle_cort", length=1000, nullable = true)
	private String libelleCourt;
	@Column(name = "libelle", length=1000, nullable = true)
	private String libelle;


	@ManyToOne
	@JoinColumn(name = "id_chapitre", nullable = true)
	private Chapitre chapitre;

	@ManyToOne
	@JoinColumn(name = "id_parent", nullable = true)
	private Maladie parent;

	@OneToMany(mappedBy = "parent")
	private List<Maladie> enfants;

	// Constructeur

	public Maladie() {}
	

	public Maladie(int id, String code, String libelleCourt, String libelle, Chapitre chapitre, Maladie parent,
			List<Maladie> enfants) {
		super();
		this.id = id;
		this.code = code;
		this.libelleCourt = libelleCourt;
		this.libelle = libelle;
		this.chapitre = chapitre;
		this.parent = parent;
		this.enfants = enfants;
	}


	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelleCourt() {
		return libelleCourt;
	}

	public String getLibelle() {
		return libelle;
	}

	

	public void setId(int id) {
		this.id = id;
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

	

	public Chapitre getChapitre() {
		return chapitre;
	}

	public void setChapitre(Chapitre chapitre) {
		this.chapitre = chapitre;
	}



	public List<Maladie> getEnfants() {
		return enfants;
	}

	public void setEnfants(List<Maladie> enfants) {
		this.enfants = enfants;
	}


	public Maladie getParent() {
		return parent;
	}


	public void setParent(Maladie parent) {
		this.parent = parent;
	}








}
