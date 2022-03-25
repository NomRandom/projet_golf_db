package org.rix.jdbc.services;

import org.rix.entitys.pojo.Golfeur;
import org.springframework.data.repository.CrudRepository;

public interface GolfeurRepository extends CrudRepository<Golfeur, Integer> {

	Golfeur findByNom(String nom);

}
