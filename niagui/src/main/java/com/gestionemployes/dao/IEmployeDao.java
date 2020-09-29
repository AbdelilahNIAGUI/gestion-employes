package com.gestionemployes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionemployes.entities.Employe;

public interface IEmployeDao extends JpaRepository<Employe, Integer> {

	List<Employe> findByNom(String nom);
	Employe findById(int id);
	List<Employe> findByDepartement(String departement);
	Employe findByNumPoste(int numPoste);

}
