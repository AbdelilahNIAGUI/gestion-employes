package com.gestionemployes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestionemployes.dao.IEmployeDao;
import com.gestionemployes.entities.Employe;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/gestion-employes")
public class GestionEmploye {
	
	@Autowired
	IEmployeDao empDao;
	
	/**
	 * Recuperer tous les employes
	 * @return liste employes
	 */
	@GetMapping(value = "/liste", produces = {"application/json"})
	@ResponseBody
	public List<Employe> getAllEmployes() {
		
		return empDao.findAll();
	}
	
	/**
	 * Recuperer un employe par son id
	 * @param id
	 * @return Employe
	 */
	@GetMapping(value = "/id/{id}", produces = {"application/json"})
	public Employe findById(@PathVariable("id") int id) {
		return empDao.findById(id);
		
	}
	
	/**
	 * Recuperer la liste des employes par leurs noms
	 * @param nom
	 * @return la liste des employes ayant ce nom
	 */
	@GetMapping(value = "/nom/{nom}", produces = {"application/json"})
	public List<Employe> findByNom(@PathVariable("nom") String nom) {
		return empDao.findByNom(nom);
		
	}
	
	/**
	 * Recuperer la liste des employes d un departement
	 * @param departement
	 * @return la liste des employes dans ce departement
	 */
	@GetMapping(value = "/departement/{departement}", produces = {"application/json"})
	public List<Employe> findByDepartement(@PathVariable("departement") String departement) {
		return empDao.findByDepartement(departement);
		
	}
	
	/**
	 * Recuperer un employe par son num de poste
	 * @param numPoste
	 * @return Emloye dans le poste specifie
	 */
	@GetMapping(value = "/numposte/{numPoste}", produces = {"application/json"})
	public Employe findByNumPoste(@PathVariable("numPoste") int numPoste) {
		return empDao.findByNumPoste(numPoste);
		
	}
	
	/**
	 * Ajouter un employe
	 * @param employe
	 * @return l employe ajoute
	 */
	@PostMapping(value = "/", consumes = {"application/json"})
	public Employe addEmploye(@RequestBody Employe employe) {
		return empDao.save(employe);
	}
	
	/**
	 * Modifier un employe
	 * @param employe
	 * @return employe modifie
	 */
	@PutMapping(value = "/", consumes = {"application/json"})
	public Employe updateEmploye(@RequestBody Employe employe) {
		return empDao.save(employe);
	}
	
	/**
	 * Supprimer un employe par son id
	 * @param id
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteEmploye(@PathVariable int id) {
		empDao.deleteById(id);
	}
}
