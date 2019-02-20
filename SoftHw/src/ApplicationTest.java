

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
// test case 1 
	@Test
	public void testcreateEmptyShopcart() {
	//creating empty cart 
		ShCart cart = new ShCart ();
		Assert.assertEquals(0, cart.getbookCount());
	}
//test case 2
	@Test
	public void testaddonebook() {
	ShCart cart = new ShCart();
	Books java = new Books(1,"Java Book", 127.0);
	cart.add(java);
	Assert.assertEquals(1, cart.getbookCount());
	Assert.assertEquals(127.0, cart.getTotalCartValue(),0.0);
	}
	 // test case 3 
	@Test
	public void testaddtwobook() {
	ShCart cart = new ShCart();
	Books java = new Books(1,"Java Book", 127.0);
	Books Web = new Books(1,"Web Book", 100.0);
	cart.add(java);
	cart.add(Web);
	Assert.assertEquals(2, cart.getbookCount());
	Assert.assertEquals(227.0, cart.getTotalCartValue(),0.0);
	}
}
