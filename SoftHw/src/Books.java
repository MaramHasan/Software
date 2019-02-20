
public class Books {
	private String BookName;
	private int quantity;
	private double totalPrice;
	
	public Books( int quantity,String BookName, double totalPrice) {
		this.quantity = quantity;
		
		this.BookName =BookName;
		
		this.totalPrice = totalPrice;
	}
	public String getBookName() {
		return BookName;
	}
 
	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
 
	public int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	public double getTotalPrice() {
		return totalPrice;
	}
 
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}