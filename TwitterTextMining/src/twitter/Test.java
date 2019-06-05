package twitter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class Test {

	/**
	 * @param args
	 * @throws TwitterException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws TwitterException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("java.net.useSystemProxies", "true");
		ConfigurationBuilder cb = new ConfigurationBuilder();

		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("XT3JeSpz1672PDeKL9kvBjOz8")
		.setOAuthConsumerSecret("giq4SLxPJb1hht2TkzGj5c9k3UcMpjWBO7A3bNaWtOlaGpSOsP")
		.setOAuthAccessToken("1028676450625445888-hWZDstIkvyMXhWZXNik0FhT5kwdG6H")
		.setOAuthAccessTokenSecret("PtFPwCm9mPMFASnCng4rSEqvgSDCyAeU4ENtkL3bJ9prL");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		ArrayList<String> usuarios = new ArrayList<String>();
		usuarios.add("CFKArgentina");
		usuarios.add("alferdez");
		usuarios.add("mauriciomacri");
		usuarios.add("mariuvidal");
		usuarios.add("FernandezAnibal");
		usuarios.add("Facundo_Moyano");
		usuarios.add("SergioMassa");
		usuarios.add("elisacarrio");
		usuarios.add("JuanGrabois");


		String cadena = "";
		for(String u:usuarios){
			List<Status> status = twitter.getUserTimeline(u);
			for(Status s:status){
				cadena+=s.getText()+"\n";
			}
		}
		System.out.println(cadena);
		//File file = new File("text/twitters.txt");
                File file = new File("C:\\Windows\\Temp\\twitters.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		out.write(cadena);
		out.newLine();
		
		out.flush();
		out.close();
		

		
	}

}

