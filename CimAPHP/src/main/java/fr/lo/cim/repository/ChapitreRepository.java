package fr.lo.cim.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.lo.cim.entity.Chapitre;


@Repository
public interface ChapitreRepository extends CrudRepository<Chapitre, Integer>{

	
}
