import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.x1c1b.jcontacts.Launcher;
import org.x1c1b.jcontacts.ui.dialog.SettingsDialog;
import org.x1c1b.jcontacts.ui.view.CreatorView;
import org.x1c1b.jcontacts.ui.view.HomeView;
import org.x1c1b.jcontacts.ui.view.WindowView;

public class settings {
SettingsDialog sd;
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
		sd=new SettingsDialog();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		sd.run();
		sd.getPropertyLanguage();
		
		//fail("Not yet implemented");
	}

}
