package entities;

public class Product {
	// Atributos - 'PRIVATE' = Encapsula os atrubutos	
	private String name;			//
	private double price;		//	atributos
	private int quantity;		//
	
	// este é o construtor padrão
	public Product() {
	}

//construtor 1	
	public Product(String name, double price, int quantity) { 
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	} 
	// construtor 2	
		public Product(String name, double price) { 
			this.name = name; 
			this.price = price; 
		}
		// encapsulamento name
		public String getName() {
			return name;
		}
	
		// encapsulamento	
		public void setName(String name) {
			this.name = name;	
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;	
		}

		public int getQuantity() {
			return quantity;
		}
		
		// Metodos	
		public double totalValueInStock() {
			return price * quantity;
		}
		public void addProducts(int quantity) {		// este é um parametro recebido desta classe
			this.quantity += quantity;
		}
		
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
		
		 // toString() Converte objetoS para uma "string" 
		public String toString() {
			return name
				+ ", $ "
				+ String.format("%.2f", price)   //coloca 2 casas decimais
				+ ", "
				+ quantity	
				+ " units, total: $ "
				+ String.format("%.2f", totalValueInStock()); //coloca 2 casas decimais
		}
}
