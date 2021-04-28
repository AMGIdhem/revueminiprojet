package ma.ensa.revueminiprojet.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Article {
	@Id
	@GeneratedValue
	private Long idArticle;
	private String titre;
	private String resume;
	private String affiliation;
	@ElementCollection
	@CollectionTable(name = "keywords")
	private List<String> keyWord;
	private String contenu;
	
	@OneToOne
	private Auteur auteur;
	
	@ManyToMany
	private List<Auteur> coAuteur;
	
	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public List<String> getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(List<String> keyWord) {
		this.keyWord = keyWord;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public List<Auteur> getCoAuteur() {
		return coAuteur;
	}

	public void setCoAuteur(List<Auteur> coAuteur) {
		this.coAuteur = coAuteur;
	}
	
}
