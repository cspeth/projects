package de.csp.fileio.to;

import java.util.ArrayList;
import java.util.List;

public class StandardFileIoTo {

	private List<String> header;
	private List<List<Object>> data;
	
	public StandardFileIoTo() {
		this.header = new ArrayList<>();
		this.data = new ArrayList<>();
	}
	
	public StandardFileIoTo(List<String> header, List<List<Object>> allData) {
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
	public List<List<Object>> getData() {
		return data;
	}
	public void setData(List<List<Object>> data) {
		this.data = data;
	}
	public void addDataSet(List<Object> dataSet) {
		this.data.add(dataSet);
	}
	
}
