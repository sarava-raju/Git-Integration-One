package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void ConCattest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.ConCat("Hello","World");
		assertEquals("Hello World", result);;
	}

}
