package com.data.collection.sample.data_collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.Authorization;
import twitter4j.conf.ConfigurationBuilder;




public class Twitterr {

<<<<<<< HEAD
    public static void main(String[] args) throws IOException {
try{
=======
    public static void main(String[] args) throws IOException, SQLException {
        
    	try{
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
    		
    		try{
    			
    		
    	try {
        	ConfigurationBuilder cb = new ConfigurationBuilder();
        	cb.setDebugEnabled(true)
        	  .setOAuthConsumerKey("37RxL0ssR8Rzznlcf6jkph9lB")
        	  .setOAuthConsumerSecret("iodDGgI15xp538Z4mvOdUlM0jyLZMKFhp8Df7DI5GOBW1vGljG")
        	  .setOAuthAccessToken("904044658484854785-C60ZPDdhwlL0fUNzoLlmXAr0K4EWD61")
        	  .setOAuthAccessTokenSecret("VzXGXpN8Elh14O4Asn98ZS8WWwIdMYLLClEQGsJ0dfgTG");
        	System.setProperty("twitter4j.http.useSSL", "true"); 
        	TwitterFactory tf = new TwitterFactory(cb.build());
        	Twitter twitter = tf.getInstance();
        	Authorization auth = twitter.getAuthorization();	
        	
        	Paging paging = new Paging();
        	paging.count(400);
        	Long id = 0L;
        	float score = 0f;
        	HashSet<String> uniqueTweets = new HashSet<String>();
        	int size = 0;
        	List<List<String>> companies = new ArrayList<List<String>>();
        	List<String> company = new ArrayList<String>();
<<<<<<< HEAD

=======
/*        	company.add("hudson_BE");
        	company.add("@Hudson_BE");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("HudsonRPO");
        	company.add("@HudsonRPO");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("HudsonFrance");
        	company.add("@HudsonFrance");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("Hudson_Spain");
        	company.add("@Hudson_Spain");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("HudsonITUK_I");
        	company.add("@HudsonITUK_I");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("Hudson_NL");
        	company.add("@Hudson_NL");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("werkenbijusg");
        	company.add("@werkenbijusg");
        	companies.add(company);
        	company = new ArrayList<String>();*/
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
        	/*company.add("practicushealth");//last portion of url
        	company.add("@PracticusHealth");//profile name twitter
        	companies.add(company);*/
        	/*company = new ArrayList<String>();
        	company.add("practicuscareer");
        	company.add("@PracticusCareer");
        	companies.add(company);
        	company = new ArrayList<String>();
        	company.add("practicusltd");
        	company.add("@PracticusLtd");
        	companies.add(company);*/
        	
        	company = new ArrayList<String>();
<<<<<<< HEAD
<<<<<<< HEAD
        	company.add("robertwalterspr");
        	company.add("@RobertWaltersPR");
        	companies.add(company);
        	
        	Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Dell\\ITORBITAL\\ITOrbital\\data-collection\\data.txt"), "utf-8"));
        	
        	
=======
        	company.add("tbstaffing");
        	company.add("@TBStaffing");
        	companies.add(company);
        	
        	Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\TRIPARNA\\ITOrbital\\ITOrbital\\data-collection\\data.txt"), "utf-8"));
>>>>>>> b6fb2d806843f6b4c03d62c32baa7044f3c900b8
=======
        	//company.add("practicushealth");
        	
        	company.add("tbstaffing");
        	//company.add("@PracticusHealth");
        	company.add("@TBStaffing");
        	companies.add(company);
        	
        	Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\orbital java temp and resources\\orbital_project\\ITOrbital\\data-collection\\data.txt"), "utf-8"));
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
        	
        	
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Welcome1234");
		
			//con.setAutoCommit(false);
			
			//Statement stmt=con.createStatement();
			        	
        	for(List<String> compan:companies){
        		writer.write("============================== "+compan+" ==================================\r\n");
        		System.out.println("============================== "+compan+" ==================================");
        		for(String comp:compan){
        			paging = new Paging();
        			paging.count(400);
        			
	        	while(true){
		        	List<Status> statuses = twitter.getUserTimeline(comp, paging);

		        	if(statuses.size()==0)
		        		break;
		        	
		        	for (Status status : statuses) {
		        		id = status.getId();
		        		size = uniqueTweets.size();
		        		uniqueTweets.add(status.getText());
		        		if(size < uniqueTweets.size()){
		        			writer.write("@" + status.getUser().getScreenName() + " - " + status.getText() + " ::: liked By::: " + status.getFavoriteCount() + " ::: retwitted By::: " + status.getRetweetCount()+"\r\n	");
			                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText() + " ::: liked By::: " + status.getFavoriteCount() + " ::: retwitted By::: " + status.getRetweetCount());
			                score++;
			                score = (float) (score + (status.getFavoriteCount()*0.5));
			                score = score + (status.getRetweetCount());
			                
<<<<<<< HEAD
			                PreparedStatement stm=con.prepareStatement("insert into Tweet_info values(?,?,?,?,?,?)");
=======
			                PreparedStatement stm=con.prepareStatement("insert into Tweet_info2 values(?,?,?,?,?,?)");
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
			    			
			                stm.setLong(1, status.getId());
			                stm.setString(2,comp);
			                stm.setString(3, status.getUser().getScreenName());
			                stm.setString(4,status.getText());
			                stm.setInt(5, status.getFavoriteCount());
			                stm.setInt(6,status.getRetweetCount());
			                
<<<<<<< HEAD
			                stm.addBatch();
			            	stm.executeBatch();
=======
			                /*stm.addBatch();
<<<<<<< HEAD
			            	stm.executeBatch(); */
=======
			            	stm.executeBatch();*/
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
			    			
		        		}
		        		
		        		
		            }
		        	paging.maxId(id-1);
<<<<<<< HEAD
		        		
=======
		        	
>>>>>>> 7d6b417f7506951bc624e805226d163fc3150b31
	        	}
	        	
    			con.commit();
        		}
        	
        		writer.write("Final Count =============== "+score+ " for "+ compan.get(0)+"\r\n");
        		System.out.println("Final Count =============== "+score+ " for "+ compan.get(0));
        		score = 0;
        		uniqueTweets = new HashSet<String>();
        		
        	}
        	con.close();
        	writer.close();
        	/*Query query = new Query("practicus OR practicusltd");
        	query.setCount(100);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText() + " ::: liked By::: " + tweet.getFavoriteCount() + " ::: retwitted By::: " + tweet.getRetweetCount());
                }
            } while ((query = result.nextQuery()) != null);
	        	*/
        	
            /*ResponseList<User> users = twitter.lookupUsers("practicusltd");
            for (User user : users) {
                if (user.getStatus() != null) {
                    System.out.println("@" + user.getScreenName() + " - " + user.getStatus().getText());
                } else {
                    // the user is protected
                    System.out.println("@" + user.getScreenName());
                }
            }*/
        	
            System.exit(0);
            
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to lookup users: " + te.getMessage());
            System.exit(-1);
        }
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}catch(Exception e){
			e.printStackTrace();
		}
    	
        
		
    }

}

