package ma.ensa.revueminiprojet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.ensa.revueminiprojet.dao.ArticleRepository;
import ma.ensa.revueminiprojet.entities.Article;
import ma.ensa.revueminiprojet.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}

	@Override
	public void deleteArticle(Long id) {
		articleRepository.deleteById(id);
		
	}

	@Override
	public Optional<Article> updateArticle(Long id, Article theArticle) {
		Optional<Article> article = articleRepository.findById(id);
		article.setTitre(theArticle.getTitre());
		article.setAffiliation(theArticle.getAffiliation());
		article.setResume(theArticle.getResume());
		articleRepository.save(article);
		return article;
	}

	@Override
	public Optional<Article> getArticle(Long id) {
		Optional<Article> article = articleRepository.findById(id);
		return article;
	}

	@Override
	public List<Article> getArticles() {
		return articleRepository.findAll();
	}

	
}
