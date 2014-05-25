package de.csp.fileio.csv;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

import de.csp.fileio.to.StandardFileIoTo;

public class CSVReaderTest {

	@Test
	public void testReadFile() {
		String fileName = "readertestsemicolon.csv";
		CSVReader csvReader = new CSVReader();
		StandardFileIoTo to = csvReader.readFile(fileName);
		assertEquals(3, to.getHeader().size());
		List<String> header = to.getHeader();
		assertTrue(header.contains("header1"));
		assertTrue(header.contains("header2"));
		assertTrue(header.contains("header3"));
		assertEquals(1, to.getData().size());
		List<Object> dataSet = to.getData().get(0);
		assertEquals(3, dataSet.size());
		assertTrue(dataSet.contains("data1"));
		assertTrue(dataSet.contains("data2"));
		assertTrue(dataSet.contains("data3"));
	}

}
