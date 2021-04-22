package ma.ensa.revueminiprojet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.revueminiprojet.entities.Article;
import ma.ensa.revueminiprojet.security.ArticleService;

@RestController
public class ArticleController {
	@Autowired
	ArticleService articleService;
	
	@PostMapping
	public Article addArticle(@RequestBody Article article) {
		return articleService.addArticle(article);
	}

}
