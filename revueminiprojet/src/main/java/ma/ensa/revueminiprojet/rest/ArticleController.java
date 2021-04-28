package ma.ensa.revueminiprojet.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.revueminiprojet.entities.Article;
import ma.ensa.revueminiprojet.service.ArticleService;

@RestController
@RequestMapping("/articles")
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@PostMapping
	public Article addArticle(@RequestBody Article article) {
		return articleService.addArticle(article);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articleService.deleteArticle(id);
	}
	
	@PutMapping(path="/{id}")
	public Article updateArticle(@PathVariable Long id, @RequestBody Article theArticle) {
		return articleService.updateArticle(id, theArticle);
	}
	
	@GetMapping(path="/{id}")
	public Optional<Article> getArticle(@PathVariable Long id) {
		return articleService.getArticle(id);
	}
	
	@GetMapping
	public List<Article> getArticles() {
		return articleService.getArticles();
	}
	
	

}
