package IBMGPac;

import java.util.Properties;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException {
		

	Email email = new SimpleEmail();
	Properties props = new Properties();
	props.getProperty("mail.smtp.ssl.trust", "smtp.office365.com");
	email.setHostName("smtp.office365.com");
	email.setSmtpPort(587);	
	email.setStartTLSRequired(true);
	email.setAuthenticator(new DefaultAuthenticator("jeevak.kumar@panamoure.com", "Jee#@121"));
	email.setSSLOnConnect(true);
	email.setFrom("jeevakk507@gmail.com");
	email.setSubject("Selenium test report");
	email.setMsg("Hey this is selenium mail");
	email.addTo("jeevakj507@gmail.com");
	email.send();
  
	System.out.println("Email sent");
	
	}
}  