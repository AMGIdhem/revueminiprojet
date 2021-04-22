package ma.ensa.revueminiprojet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Auteur {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String mdp;
	
	public Auteur() {
		
	}
}
