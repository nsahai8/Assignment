package NewsFeed.Assignment.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NewsFeed.Assignment.servicesimpl.NewspaperFactory;

@Service
public class ArticleService {

	@Autowired
	private Newspaper newspaper;
	
	public Set<String> getArticlesByAuthorName(String newspaperStr, String authorName){
		newspaper = NewspaperFactory.getNewspaper(newspaperStr);
		Set<String> articles = newspaper.getAriclesByAuthorName(authorName);
		return articles;
	}
	
	public Set<String> getArticlesByTitleAndDescription(String newspaperStr, String title, String description){
		newspaper = NewspaperFactory.getNewspaper(newspaperStr);
		Set<String> articles = newspaper.getArticlesByTitleAndDescription( title, description);
		return articles;
	}
}
