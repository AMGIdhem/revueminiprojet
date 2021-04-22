package ma.ensa.revueminiprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.revueminiprojet.entities.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}
