package com.groupeisi.ExamenEJB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table (name="cv") // Création de la table appuser dans la base de donnée
public class cv implements Serializable {

	@Id // Clé primaire
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (name="nom", nullable=false, length=200)
	private String nom;
	
	@Column (name="prenom", nullable=false, length=200)
	private String prenom;
	
	@Column (name="age", nullable=false, length=200)
	private String age;
	
	@Column (name="adresse", nullable=false, length=200)
	private String adresse;
	
	@Column (name="email", nullable=false, length=200)
	private String email;
	
	@Column (name="password", nullable=false, length=200)
	private String password;
	
	@Column (name="telephone", nullable=false, length=200)
	private String telephone;
	
	@Column (name="specialite", nullable=false, length=200)
	private String specialite;
	
	@Column (name="niveauEtude", nullable=false, length=200)
	private String niveauEtude;
	
	@Column (name="experienceProfessionnelle", nullable=false, length=200)
	private String experienceProfessionnelle;

	public cv() {
		super();
	}

	public cv(int id, String nom, String prenom, String age, String adresse, String email, String password,
			String telephone, String specialite, String niveauEtude, String experienceProfessionnelle) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.specialite = specialite;
		this.niveauEtude = niveauEtude;
		this.experienceProfessionnelle = experienceProfessionnelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public String getExperienceProfessionnelle() {
		return experienceProfessionnelle;
	}

	public void setExperienceProfessionnelle(String experienceProfessionnelle) {
		this.experienceProfessionnelle = experienceProfessionnelle;
	}
	
	
}
