package de.csp.fileio.csv;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import de.csp.fileio.to.StandardCSVFileIoTo;

public class CSVReaderTest {
	
	private static Log LOGGER = LogFactory.getLog(CSVReaderTest.class);

	@Test
	public void testReadFile() {
		String fileName = "de/csp/fileio/csv/readertestsemicolon.csv";
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
		CSVReader csvReader = new CSVReader();
		StandardCSVFileIoTo to;
		try {
			to = csvReader.readFile(inputStream);
			assertEquals(3, to.getHeader().size());
			List<String> header = to.getHeader();
			assertTrue(header.contains("header1"));
			assertTrue(header.contains("header2"));
			assertTrue(header.contains("header3"));
			assertEquals(1, to.getData().size());
			List<String> dataSet = to.getData().get(0);
			assertEquals(3, dataSet.size());
			assertTrue(dataSet.contains("data1"));
			assertTrue(dataSet.contains("data2"));
			assertTrue(dataSet.contains("data3"));
		} catch (IOException e) {
			LOGGER.error(e);
			fail(e.toString());
		}
		
	}

}
