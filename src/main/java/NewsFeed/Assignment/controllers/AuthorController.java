package NewsFeed.Assignment.controllers;

import java.util.Set;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.servicesimpl.NewspaperFactory;



@RestController
@RequestMapping(value="/authors")
public class AuthorController {
	
	private Newspaper newspaper;
	
	@RequestMapping(value="/availableAuthors")
	public Set<String> getAllAvailableAuthors(String newspaperStr){
		newspaper = NewspaperFactory.getNewspaper("hindu");
		Set<String> authors = newspaper.getAuthorLinkMapping().keySet();
		return authors;
		
	}
	
	
	
	

}
