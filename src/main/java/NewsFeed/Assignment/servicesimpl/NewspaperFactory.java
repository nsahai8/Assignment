package NewsFeed.Assignment.servicesimpl;


import org.springframework.stereotype.Service;

import NewsFeed.Assignment.services.Newspaper;





@Service
public class NewspaperFactory {
	
	public  static Newspaper getNewspaper(String newspaperStr) {
		Newspaper newspaper;
		switch (newspaperStr.trim()) {
		case "hindu":
			newspaper = new TheHindu();
			break;

		default:
			newspaper = null;
			break;
		}
	return newspaper;	
	}

}
