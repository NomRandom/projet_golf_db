package org.rix.golf.controller;

import java.util.Optional;

import org.rix.golf.model.Golfeur;
import org.rix.golf.model.ModelApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;

@RestController()
@RequestMapping(path = "gerer/golfeur")
public class GolfeurController implements GolfeurApi {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return GolfeurApi.super.getRequest();
	}

	@Override
	public ResponseEntity<Golfeur> addGolfeur(@Valid Golfeur golfeur) {
		// TODO Auto-generated method stub
		return GolfeurApi.super.addGolfeur(golfeur);
	}

	@Override
	public ResponseEntity<ModelApiResponse> deleteGolfeur(Long golfeurId) {
		// TODO Auto-generated method stub
		return GolfeurApi.super.deleteGolfeur(golfeurId);
	}

	@Override
	public ResponseEntity<Golfeur> getGolfeurById(Long golfeurId) {
		// TODO Auto-generated method stub
		return GolfeurApi.super.getGolfeurById(golfeurId);
	}

	@Override
	public ResponseEntity<ModelApiResponse> updateGolfeurWithForm(Long golfeurId, @Valid Golfeur golfeur) {
		// TODO Auto-generated method stub
		return GolfeurApi.super.updateGolfeurWithForm(golfeurId, golfeur);
	}

}
