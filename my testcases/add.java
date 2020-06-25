import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.x1c1b.jcontacts.Launcher;
import org.x1c1b.jcontacts.ui.view.HomeView;
import org.x1c1b.jcontacts.util.Contact;

public class add {
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
	public void testaddcontact() {
		//fail("Not yet implemented");
		Contact contact=new  Contact("mohammed", "zainati", "mhzinati@just.edu.jo", "7201000", "http://www.just.edu.jo/~mhzinati/", "jordan");
		hv.addContactToList(contact);
	}
	
	

}
