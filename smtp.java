package smtp;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail; 

public class smtp {

	public static void main (String[] args) {
		String meuEmail = "fenannaa@gmail.com";
	    String minhaSenha = "lucas777"; 
	    String emailDele = "lucasamaanimais@gmail.com";
	    
	    org.apache.commons.mail.SimpleEmail email = new SimpleEmail();
	    email.setHostName("smtp.gmail.com");
	    email.setSmtpPort(465);
	    email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
	    email.setSSLOnConnect(true);
	
	try {
		email.setFrom(meuEmail);
		email.setSubject("Matheus e gey");
		email.setMsg("Gay");
		email.addTo(emailDele);
		email.send();
		System.out.println("Victory Royale"); 
	
	}catch(Exception e){
		e.printStackTrace();
						}
											}
				}
