package ProgrammingKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void AdddTest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(300,200);
		assertEquals(500, result);
	}

}
