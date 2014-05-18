package de.csp.fileio.csv;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import de.csp.fileio.to.StandardFileIoTo;

public class CSVReader {

	private static Log LOGGER = LogFactory.getLog(CSVReader.class);
	
	public StandardFileIoTo readFile(String fileName) {
		StandardFileIoTo returnTo = new StandardFileIoTo();
		return returnTo;
	}
}
