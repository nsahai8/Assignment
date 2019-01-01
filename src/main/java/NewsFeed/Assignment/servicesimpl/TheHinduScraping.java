package NewsFeed.Assignment.servicesimpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import NewsFeed.Assignment.services.ScrapingService;


@Service
public class TheHinduScraping implements ScrapingService {

//	@Autowired
//	JsoupDocument jdocument;
	
	@Override
	public Map<String, String> getAllAvailableAuthors() {
		String authorsUrl = "https://www.thehindu.com/thread/authors/";
		Map<String, String> authorLink = new HashMap<String, String>();
		int i=0;
		while(i<10) {
			i++;
			Document document;
			try {
				//Get Document object after parsing the html from given url.
				document = Jsoup.connect(authorsUrl+"?page="+i).get();
				
				Map<String, String> map = extractAuthorNameAndLink(document);
				if(map.size() == 0) {
					break;
				}
				authorLink.putAll(map);
				System.out.println();


			} catch(Exception e) {
				e.printStackTrace();
				break;
			}
		}
		
		System.out.println(i+" "+authorLink.size());
		return authorLink;
		
    		
	}

	private static Map<String, String> extractAuthorNameAndLink(Document document) {
		Map<String, String> authorLink = new HashMap<String, String>();
		
		Elements eles = document.getElementsByClass("authorwidgethome");
		for(Element e :eles) {
			Element m = e.getElementsByTag("h4").first();
			String author = m.text().trim().toLowerCase().replace(" ", "");
			String link = m.getElementsByAttribute("href").first().attr("href");
			authorLink.put(author, link);
			
		}
		return authorLink;
	}

	@Override
	public Set<String> getAriticlesByAuthorName(String authorPage) {
		Map<String, String> articleLinkMaping = new HashMap<>();
		try {
			Document document = Jsoup.connect(authorPage).get();
			Elements eles = document.getElementsByClass("searchAuthRt");
			for(Element ele: eles) {
				String artcle =  ele.getElementsByTag("a").text();
				String link =  ele.getElementsByTag("a").attr("href");
				articleLinkMaping.put(artcle, link);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//add logs
			e.printStackTrace();
		}
		return articleLinkMaping.keySet();
	}

	@Override
	public Set<String> getArticlesByTitleAndDescription(String authorPage,String title, String description) {
		try {
			Document document = Jsoup.connect(authorPage).get();
			System.out.println(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
}
