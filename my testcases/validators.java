import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.x1c1b.jcontacts.Launcher;
import org.x1c1b.jcontacts.ui.view.HomeView;
import org.x1c1b.jcontacts.util.Contact;
import org.x1c1b.jcontacts.util.EmailValidator;
import org.x1c1b.jcontacts.util.UrlValidator;

public class validators {
	HomeView hv;
	Launcher l;
	@Before
	public void setUp() throws Exception {
		l=new Launcher();
		l.main(null);
		hv=new HomeView();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
		Contact contact=new  Contact("mohammed", "zainati", "mhzinati@just.edu.jo", "7201000", "http://www.just.edu.jo/~mhzinati/", "jordan");

		EmailValidator e =new EmailValidator();
		e.validate(contact.getEmailAddress());
		UrlValidator ur=new UrlValidator();
		ur.validate(contact.getHomepage());
	}

}
