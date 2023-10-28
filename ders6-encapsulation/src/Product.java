
public class Product {
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private String _kod;
	
	public Product() {
		System.out.println("constructor çalıştı");
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStock() {
		return _stock;
	}

	public void setStock(int stock) {
		_stock = stock;
	}

	private int _stock;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public void setKod(String kod) {
		_kod = kod;
	}

	public String getKod() {
		return _name.substring(0, 1) + "-" + _id;
	}

}
