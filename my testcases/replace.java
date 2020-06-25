import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.x1c1b.jcontacts.Launcher;
import org.x1c1b.jcontacts.ui.view.CreatorView;
import org.x1c1b.jcontacts.ui.view.HomeView;
import org.x1c1b.jcontacts.ui.view.WindowView;
import org.x1c1b.jcontacts.util.Contact;

public class replace {
	Launcher l;
	HomeView hv;
	WindowView wv;
	CreatorView cv;
	@Before
	public void setUp() throws Exception {
		l=new Launcher();
		l.main(null);
		hv=new HomeView();
		//wv=new WindowView();
		cv=new CreatorView();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
		Contact contact=new  Contact("mohammed", "zainati", "mhzinati@just.edu.jo", "7201000", "http://www.just.edu.jo/~mhzinati/", "jordan");
		hv.addContactToList(contact);
	hv.replaceContactAtList(contact);
	}

}
