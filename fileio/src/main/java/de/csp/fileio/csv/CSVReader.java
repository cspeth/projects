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

import de.csp.fileio.to.StandardFileIoTo;

public class CSVReader {

	private static Log LOGGER = LogFactory.getLog(CSVReader.class);
	
	
	public StandardFileIoTo readFile(InputStream inputStream) throws IOException {
		StandardFileIoTo returnTo = new StandardFileIoTo();
		CsvReader reader = new CsvReader(inputStream, ';', Charset.defaultCharset());
		reader.readHeaders();
		String[] headersStrings = reader.getHeaders();
		returnTo.setHeader(this.convertHeaders(headersStrings));
		while(reader.readRecord()) {
			String[] dataSet = reader.getValues();
			returnTo.addDataSet(this.convertDataSet(dataSet));
		}
		return returnTo;
	}
	
	public StandardFileIoTo readFile(String fileName) throws IOException {
		InputStream inputStream = new FileInputStream(fileName);
		return this.readFile(inputStream);
	}
	
	private List<Object> convertDataSet(String[] dataSet) {
		List<Object> returnList = new ArrayList<>();
		for(Object dataBlock:dataSet) {
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
