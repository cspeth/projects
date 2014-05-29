package de.csp.fileio.to;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StandardCSVFileIoToTest {

	@Test
	public final void testSetHeader() {
		List<String> header = new ArrayList<>();
		header.add("A");
		header.add("Header");
		header.add("Test");
		StandardCSVFileIoTo to = new StandardCSVFileIoTo();
		to.setHeader(header);
		assertEquals(3, to.getHeader().size());
		assertTrue(to.getHeader().contains("A"));
		assertTrue(to.getHeader().contains("Header"));
		assertTrue(to.getHeader().contains("Test"));
	}

	@Test
	public final void testAddHeader() {
		List<String> header = new ArrayList<>();
		header.add("A");
		header.add("Header");
		header.add("Test");
		StandardCSVFileIoTo to = new StandardCSVFileIoTo(header, null);
		String headerAppend = "Append";
		to.addHeader(headerAppend);
		assertEquals(4, to.getHeader().size());
		assertTrue(to.getHeader().contains("A"));
		assertTrue(to.getHeader().contains("Header"));
		assertTrue(to.getHeader().contains("Test"));
		assertTrue(to.getHeader().contains("Append"));
	}

	@Test
	public final void testSetData() {
		List<List<String>> data = new ArrayList<>();
		List<String> dataSet = new ArrayList<>();
		dataSet.add(new String("1"));
		dataSet.add(new String("Data"));
		StandardCSVFileIoTo to = new StandardCSVFileIoTo();
		data.add(dataSet);
		to.setData(data);
		assertEquals(1, to.getData().size());
		List<String> dataRet = to.getData().get(0);
		assertEquals(2, dataRet.size());
		assertTrue(dataRet.contains(new String("1")));
		assertTrue(dataRet.contains("Data"));
	}

	@Test
	public final void testAddDataSet() {
		List<String> dataSet = new ArrayList<>();
		dataSet.add(new String("1"));
		dataSet.add(new String("Data"));
		StandardCSVFileIoTo to = new StandardCSVFileIoTo();
		to.addDataSet(dataSet);
		assertEquals(1, to.getData().size());
		List<String> dataRet = to.getData().get(0);
		assertEquals(2, dataRet.size());
		assertTrue(dataRet.contains(new String("1")));
		assertTrue(dataRet.contains("Data"));
	}

}
