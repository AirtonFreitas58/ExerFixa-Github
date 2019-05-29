package entities;
// para aprender a gerar construtores automaticamente, getters e setters

public class Product2 {
	// Atributos - 'PRIVATE' = Encapsula os atrubutos	
		private String name;			//
		private double price;		//	atributos
		private int quantity;		//
	
		public Product2() {
		}
	// como gerar automatico os construtores: 
		// 1) botão direito do mause, 2) opção 'source' 3) 'generate constructor using fields
		// Gerando os Getters e Setters: botão direito do mause, 2) opção 'source' 3) 'Generate Getters and Setters
		public Product2(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		public Product2(String name, double price) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public String getName() {
			return name;
		}

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
		//Metodos	
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