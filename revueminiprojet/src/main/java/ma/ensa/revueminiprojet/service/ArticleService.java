package ma.ensa.revueminiprojet.service;

import java.util.List;
import java.util.Optional;

import ma.ensa.revueminiprojet.entities.Article;

public interface ArticleService {
	public Article addArticle(Article article);
	public void deleteArticle(Long id);
	public Optional<Article> updateArticle(Long id, Article article);
	public Optional<Article> getArticle(Long id);
	public List<Article> getArticles();
}
