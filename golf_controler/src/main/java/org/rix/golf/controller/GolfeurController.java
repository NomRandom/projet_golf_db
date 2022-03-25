package org.rix.golf.controller;

import org.rix.entitys.pojo.Golfeur;
import org.rix.jdbc.services.GolfeurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "gerer/golfeur")
public class GolfeurController {

	@Autowired
	private GolfeurRepository golfeurRepository;

	@GetMapping(path = "getByName/{name}")
	Golfeur getGolfeurByName(@PathVariable(name = "name") String name) {

		return golfeurRepository.findByNom(name);

	}

	@PostMapping(path = "/save")
	Golfeur saveGolfeur(@RequestBody Golfeur golfeur) {

		return golfeurRepository.save(golfeur);
	}

}
