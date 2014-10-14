package junit;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import tdd.Exemple;
import tdd.Roman;

public class Tdd {
	Roman rom;
	String num;
	@Before
	public void setUp() throws Exception{
		rom=new Roman();
		num="";
	}
	@Test
	public void testI(){
		num="I";
		assertEquals(1, rom.decode(num));
	}
	@Test
	public void testII(){
		num="II";
		assertEquals(2, rom.decode(num));
	}
	@Test
	public void testV(){
		num="V";
		assertEquals(5, rom.decode(num));
	}
	@Test
	public void testX(){
		num="X";
		assertEquals(10, rom.decode(num));
	}
	@Test
	public void testL(){
		num="L";
		assertEquals(50, rom.decode(num));
	}
	@Test
	public void testC(){
		num="C";
		assertEquals(100, rom.decode(num));
	}
	@Test
	public void testD(){
		num="D";
		assertEquals(500, rom.decode(num));
	}
	@Test
	public void testM(){
		num="M";
		assertEquals(1000, rom.decode(num));
	}
}
