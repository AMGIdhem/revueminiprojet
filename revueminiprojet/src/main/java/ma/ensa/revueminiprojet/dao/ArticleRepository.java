package ma.ensa.revueminiprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ensa.revueminiprojet.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
