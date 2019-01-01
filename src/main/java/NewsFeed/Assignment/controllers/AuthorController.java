package NewsFeed.Assignment.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NewsFeed.Assignment.services.AuthorService;
import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.servicesimpl.NewspaperFactory;



@RestController
@RequestMapping(value="/authors")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
//	http://localhost:8080/authors/availableAuthors
	@RequestMapping(value="/availableAuthors")
	public Set<String> getAllAvailableAuthors(String newspaperStr){
		//param check and rendor error if any
		return authorService.getAllAvailableAuthors(newspaperStr);
		
	}
	

	
	
	
	

}
