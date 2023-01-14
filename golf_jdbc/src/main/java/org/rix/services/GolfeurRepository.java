package org.rix.services;

import org.rix.entity.GolfeurEntity;
import org.springframework.data.repository.CrudRepository;

public interface GolfeurRepository extends CrudRepository<GolfeurEntity, Integer> {

	GolfeurEntity findByNom(String nom);

}
