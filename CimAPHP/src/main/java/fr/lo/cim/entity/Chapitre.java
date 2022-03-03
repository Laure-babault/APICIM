package fr.lo.cim.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Chapitre {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "code", length= 40, nullable = true)
	private String code;
	@Column(name = "LIBELLE", length= 150, nullable = true)
	private String libelle;
	@Column(name = "code_chapitre", length= 40, nullable = true)
	private String codeChapitre;

	@OneToMany(mappedBy = "chapitre")
	private List <Maladie> maladies;

	// Constructeurs
	public Chapitre() {}
	
	public Chapitre(int id, String code, String libelle, String codeChapitre) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.codeChapitre = codeChapitre;
	}

	public int getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getCodeChapitre() {
		return codeChapitre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setCodeChapitre(String codeChapitre) {
		this.codeChapitre = codeChapitre;
	}

	@Override
	public String toString() {
		return "{" + id + ", " + code + ", " + libelle + "}";
	}

	public List<Maladie> getMaladies() {
		return maladies;
	}

	public void setMaladies(List<Maladie> maladies) {
		this.maladies = maladies;
	}
}
