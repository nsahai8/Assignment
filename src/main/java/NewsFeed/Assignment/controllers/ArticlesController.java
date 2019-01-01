package NewsFeed.Assignment.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NewsFeed.Assignment.services.ArticleService;
import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.servicesimpl.NewspaperFactory;

@RestController
@RequestMapping(value="/articles")
public class ArticlesController {
	
	
	@Autowired
	private ArticleService articleService;
	
//	http://localhost:8080/articles/byAuthorName
	@RequestMapping(value="byAuthorName")
	public Set<String> getArticlesByAuthorName(String newspaperStr, String authorName){
		//param check and rendor error if any
		return articleService.getArticlesByAuthorName(newspaperStr, authorName);
	}
	
	@RequestMapping(value="bytitleAndDescription")
	public Set<String> getArticlesByTitleAndDescription(String newspaperStr, String title, String description){
		//param check and rendor error if anySet<String> articles = newspaper.getArticlesByTitleAndDescription( title, description);
		return articleService.getArticlesByTitleAndDescription(newspaperStr, title, description);
	}
	
	

}
