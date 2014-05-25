package de.csp.fileio;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.csp.fileio.csv.AllTestsForCSV;
import de.csp.fileio.to.AllTestsForTo;

@RunWith(Suite.class)
@SuiteClasses({AllTestsForCSV.class,
	AllTestsForTo.class})
public class OverAllSuite {

}
