package de.csp.fileio.csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.csvreader.CsvReader;

import de.csp.fileio.to.StandardFileIoTo;

public class CSVReader {

	private static Log LOGGER = LogFactory.getLog(CSVReader.class);
	
	public StandardFileIoTo readFile(String fileName) throws IOException {
		StandardFileIoTo returnTo = new StandardFileIoTo();
		CsvReader reader = new CsvReader(fileName);
		reader.readHeaders();
		String[] headers = reader.getHeaders();
		returnTo.setHeader(this.getHeaders(headers));
		return returnTo;
	}
	
	private List<String> getHeaders(String[] headers) {
		List<String> returnList = new ArrayList<>();
		for(String header:headers) {
			returnList.add(header);
		}
		return returnList;
	}
}
