package de.csp.fileio.to;

import java.util.ArrayList;
import java.util.List;

public class StandardCSVFileIoTo {

	private List<String> header;
	private List<List<String>> data;
	
	public StandardCSVFileIoTo() {
		this.header = new ArrayList<>();
		this.data = new ArrayList<>();
	}
	
	public StandardCSVFileIoTo(List<String> header, List<List<String>> allData) {
		this.header = header;
		this.data = allData;
	}
	
	public List<String> getHeader() {
		return header;
	}
	public void setHeader(List<String> header) {
		this.header = header;
	}
	public void addHeader(String header) {
		this.header.add(header);
	}
	public List<List<String>> getData() {
		return data;
	}
	public void setData(List<List<String>> data) {
		this.data = data;
	}
	public void addDataSet(List<String> dataSet) {
		this.data.add(dataSet);
	}
	
}
