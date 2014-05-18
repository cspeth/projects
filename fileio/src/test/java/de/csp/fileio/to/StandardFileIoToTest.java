package de.csp.fileio.to;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StandardFileIoToTest {

	@Test
	public final void testSetHeader() {
		List<String> header = new ArrayList<>();
		header.add("A");
		header.add("Header");
		header.add("Test");
		StandardFileIoTo to = new StandardFileIoTo();
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
		StandardFileIoTo to = new StandardFileIoTo(header, null);
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
		List<List<Object>> data = new ArrayList<>();
		List<Object> dataSet = new ArrayList<>();
		dataSet.add(new Integer(1));
		dataSet.add(new String("Data"));
		StandardFileIoTo to = new StandardFileIoTo();
		data.add(dataSet);
		to.setData(data);
		assertEquals(1, to.getData().size());
		List<Object> dataRet = to.getData().get(0);
		assertEquals(2, dataRet.size());
		assertTrue(dataRet.contains(new Integer(1)));
		assertTrue(dataRet.contains("Data"));
	}

	@Test
	public final void testAddDataSet() {
		List<Object> dataSet = new ArrayList<>();
		dataSet.add(new Integer(1));
		dataSet.add(new String("Data"));
		StandardFileIoTo to = new StandardFileIoTo();
		to.addDataSet(dataSet);
		assertEquals(1, to.getData().size());
		List<Object> dataRet = to.getData().get(0);
		assertEquals(2, dataRet.size());
		assertTrue(dataRet.contains(new Integer(1)));
		assertTrue(dataRet.contains("Data"));
	}

}
