package NewsFeed.Assignment.servicesimpl;

import org.springframework.stereotype.Service;

import NewsFeed.Assignment.services.ScrapingService;


@Service
public class ScrapingStrategyFactory {
	
	
	public static ScrapingService getScrapingStrategy(String strategy) {
		ScrapingService scrapingService;
		
		switch (strategy.trim()) {
		case "availableauthors":
			scrapingService = new TheHinduScraping();
			break;

		default:
			scrapingService = null;
			break;
		}
		return scrapingService;
	}

}
