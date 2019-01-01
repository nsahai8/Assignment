package NewsFeed.Assignment.servicesimpl;

import java.util.HashMap;
import java.util.Map;

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
		
		Elements eles = document.getElementsByClass("authorwidgethome col-md-3 col-sm-4 col-xs-6 clearfix");
		for(Element e :eles) {
			Element m = e.getElementsByTag("h4").first();
			String author = m.text();
			String link = m.getElementsByAttribute("href").first().attr("href");
			authorLink.put(author, link);
//			System.out.println(author+" "+link);
			
		}
		System.out.println(authorLink.size());
		return authorLink;
	}

	
	
}
