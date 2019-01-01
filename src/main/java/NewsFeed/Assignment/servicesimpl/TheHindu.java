package NewsFeed.Assignment.servicesimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NewsFeed.Assignment.services.Newspaper;
import NewsFeed.Assignment.services.ScrapingService;

@Service
public class TheHindu implements Newspaper{
	
	static Map<String, String> authorLinkMapping = new HashMap<>();
	
	@Autowired
	ScrapingService scrapingService;
	
	TheHindu(){
		this.scrapingService  = ScrapingStrategyFactory.getScrapingStrategy("availableauthors");
		
	}
	
	public Map<String, String> getAuthorLinkMapping(){
		
		Map<String, String> result = scrapingService.getAllAvailableAuthors();
		authorLinkMapping.putAll(result);
		return result;
	}

	@Override
	public Set<String> getAriclesByAuthorName(String authorName) {
//		String authorPage = authorLinkMapping.get(authorName);
		authorPage = "https://www.thehindu.com/thread/author/Aarati-Krishnan/";
		return null;
	}
}
