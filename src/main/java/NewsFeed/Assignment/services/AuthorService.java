package NewsFeed.Assignment.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NewsFeed.Assignment.servicesimpl.NewspaperFactory;

@Service
public class AuthorService {
	
	@Autowired
	private Newspaper newspaper;
	
	public Set<String> getAllAvailableAuthors(String newspaperStr){
		newspaper = NewspaperFactory.getNewspaper(newspaperStr);
		Set<String> authors = newspaper.getAuthorLinkMapping().keySet();
		return authors;
	}

}
