package org.rix.entitys.pojo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Golfeur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(length = 50, name = "prenom")
	@NotBlank
	private String prenom;

	@Column(length = 50, name = "nom")
	@NotBlank
	private String nom;

	@Column(length = 50, name = "numero_licence")
	private String numeroLicence;

	@Column(name = "date_naissance")
	private LocalDate dateNaissance;

	@Column(scale = 1, precision = 1, name = "classement")
	@Min(0)
	private Double index;

	@Email
	@Column(name = "email")
	private String email;

}
