package NewsFeed.Assignment.services;

import java.util.Map;
import java.util.Set;

public interface ScrapingService {
	Map<String, String> getAllAvailableAuthors();

	Set<String> getAriticlesByAuthorName(String authorPage);

	Set<String> getArticlesByTitleAndDescription(String authorPage, String title, String description);
}
