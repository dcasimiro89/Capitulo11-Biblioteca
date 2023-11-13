package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {	
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
		
		String username = "";
		String password = "";
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com"); 
		email.setSmtpPort(587); 
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(true);
		email.setFrom("");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();
	}
	
}
