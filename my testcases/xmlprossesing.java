import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.x1c1b.jcontacts.Launcher;
import org.x1c1b.jcontacts.ui.view.HomeView;
import org.x1c1b.jcontacts.util.Contact;
import org.x1c1b.jcontacts.util.ContactXmlFormatException;
import org.x1c1b.jcontacts.util.XmlContactExport;
import org.x1c1b.jcontacts.util.XmlContactImport;
import org.xml.sax.SAXException;

public class xmlprossesing {
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
		Contact contact=new  Contact("mohammed", "zainati", "mhzinati@just.edu.jo", "7201000", "http://www.just.edu.jo/~mhzinati/", "jordan");
try {
	XmlContactExport.exportContact(Paths.get("").toAbsolutePath().toString(), contact);
} catch (ParserConfigurationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (TransformerException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	XmlContactImport.importContact(Paths.get("").toAbsolutePath().toString());
} catch (ParserConfigurationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ContactXmlFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//fail("Not yet implemented");
	}

}
