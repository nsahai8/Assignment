package NewsFeed.Assignment.services;

import java.util.Map;
import java.util.Set;


public interface Newspaper {
	public Map<String, String> getAuthorLinkMapping();

	public Set<String> getAriclesByAuthorName(String authorName);

	public Set<String> getArticlesByTitleAndDescription(String title, String description);
}
