
import java.util.ArrayList;
import java.util.List;

public class ShCart {
	private List<Books> BookList = new ArrayList<Books>();
	private double totalCartValue;
	public int getbookCount() {
		// TODO Auto-generated method stub
		return BookList.size();
	}

	public double getTotalCartValue() {
		// TODO Auto-generated method stub
		if (BookList.size() > 0) {
			for (Books book : BookList) {
				totalCartValue = totalCartValue + book.getTotalPrice();
			}
		}
		return totalCartValue;
	}

	public void add(Books java) {
		// TODO Auto-generated method stub
		BookList.add(java);
	}

}
