package entities;

public class ProductB {
	public String name;			//
	public double price;		//	atributos
	public int quantity;		//			 
// construtor 1	
	public ProductB(String name, double price, int quantity) { 
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	} 
	
// construtor 2	
	public ProductB(String name, double price) { 
		this.name = name; 
		this.price = price; 
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
