package entities;

public class Product {
	public String name;			//
	public double price;		//	atributos
	public int quantity;		//			 
	
	public Product(String name, double price, int quantity) { 
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	} 	
	
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
