package de.csp.fileio.csv;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.csvreader.CsvReader;

import de.csp.fileio.to.StandardCSVFileIoTo;

public class CSVReader {

	private static Log LOGGER = LogFactory.getLog(CSVReader.class);
	
	public StandardCSVFileIoTo readFile(InputStream inputStream, char delimiter) throws IOException {
		StandardCSVFileIoTo returnTo = new StandardCSVFileIoTo();
		CsvReader reader = new CsvReader(inputStream, delimiter, Charset.defaultCharset());
		reader.readHeaders();
		String[] headersStrings = reader.getHeaders();
		returnTo.setHeader(this.convertHeaders(headersStrings));
		while(reader.readRecord()) {
			String[] dataSet = reader.getValues();
			returnTo.addDataSet(this.convertDataSet(dataSet));
		}
		return returnTo;
	}
	
	public StandardCSVFileIoTo readFile(InputStream inputStream) throws IOException {
		return this.readFile(inputStream, ';');
	}
	
	public StandardCSVFileIoTo readFile(String fileName, char delimiter) throws IOException {
		return this.readFile(new FileInputStream(fileName), ';');
	}
	
	public StandardCSVFileIoTo readFile(String fileName) throws IOException {
		return this.readFile(new FileInputStream(fileName), ';');
	}
	
	private List<String> convertDataSet(String[] dataSet) {
		List<String> returnList = new ArrayList<>();
		for(String dataBlock:dataSet) {
			returnList.add(dataBlock);
		}
		return returnList;
	}
	
	private List<String> convertHeaders(String[] headers) {
		List<String> returnList = new ArrayList<>();
		for(String header:headers) {
			returnList.add(header);
		}
		return returnList;
	}
}
