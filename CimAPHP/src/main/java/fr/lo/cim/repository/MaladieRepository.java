package fr.lo.cim.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lo.cim.DTO.MaladieDTO;
import fr.lo.cim.entity.Maladie;

@Repository
public interface MaladieRepository extends CrudRepository<Maladie, Integer> {
	
	 //public Maladie findOne(String code);
	
	@Query("select m from Maladie m where m.code = ?1")
	 Maladie findByCode(String code);

	@Query("select p from Maladie p where p.parent =?1 ")
	 List<Maladie> findById_parent(Maladie parent);
}
