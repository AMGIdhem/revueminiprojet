package ma.ensa.revueminiprojet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.revueminiprojet.dao.ArticleRepository;
import ma.ensa.revueminiprojet.entities.Article;
import ma.ensa.revueminiprojet.security.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}

}
