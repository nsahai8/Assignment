package NewsFeed.Assignment.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.servicesimpl.NewspaperFactory;

@RestController
@RequestMapping(value="/articles")
public class ArticlesController {
	
	@Autowired
	private Newspaper newspaper;
	
	@RequestMapping(value="byAuthorName")
	public Set<String> getArticlesByAuthorName(String newspaperStr, String authorName){
		newspaper = NewspaperFactory.getNewspaper("hindu");
		Set<String> articles = newspaper.getAriclesByAuthorName("aaratikrishnan");
		return articles;
	}
	
	@RequestMapping(value="bytitleAndDescription")
	public Set<String> getArticlesByTitleAndDescription(String newspaperStr, String title, String description){
		newspaper = NewspaperFactory.getNewspaper("hindu");
		Set<String> articles = newspaper.getArticlesByTitleAndDescription( title, description);
		return articles;
	}
	
	

}
