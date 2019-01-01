# Assignment


The Project Scrapes the newspaper website and gives the desired result

Apis:
1. <host>/authors/availableAuthors
      aim: This Api provide the available authors on that newspaper website
      request_param: <Newspaper String>
      response:
            <Set>
                <item>shreyaramachandran</item>
                <item>neelammohan</item>
                <item>kapilsubramanian</item>
            </Set>

  2. <host>/articles/byAuthorName
        aim: This Api provide the articles written by the author
        request_param: <Author name String>
        response:
            <Set>
              <item>Budget talk at the dinner table</item>
              <item>Here's how you explain GST to your grandma</item>
            </Set>
      
      
      
      
 Instruction to run:
 1. Import the project in IDE you are using
 2. Run Maven build, or use mvn cleam compile install
 3. Run the /Users/niharika/Assignment/src/main/java/NewsFeed/Assignment/Application.java as Java Application
 
 
 
 Design Pattern Used:
      1.Factory Design Pattern
      The Newspaper Factory and ScraperStrategy Factory are the two classes used to give the object of the newspaper and the         strategy used to complete a task
      
      The Project is flexible enough to include other websites and the strategy involved.The Scraping Strategy is independent of the newspaper used.
  
  
  

  
  
