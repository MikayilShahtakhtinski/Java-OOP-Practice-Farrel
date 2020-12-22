package Books;
abstract class Book{
	private String title;
	protected double price;
	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public abstract void setPrice();
}
class Fiction extends Book{
	public Fiction(String title) {
		super(title);
		setPrice();
	}

	@Override
	public void setPrice() {
		this.price = 24.99d;
		
	}
	
}
class NonFiction extends Book{

	public NonFiction(String title) {
		super(title);
		setPrice();
	}

	@Override
	public void setPrice() {
		this.price = 37.99d;
		
	}
	
}
public class UseBook {

	public static void main(String[] args) {
		Fiction fiction = new Fiction("Lost in a forest");
		System.out.println(fiction.getPrice()+", Title: "+ fiction.getTitle());
		NonFiction nonFiction = new NonFiction("Found");
		System.out.println(nonFiction.getPrice());
		

	}

}
