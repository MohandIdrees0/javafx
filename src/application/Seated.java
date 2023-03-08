package application;

//mohand idrees 1212236 6L
public class Seated extends PizzaOrder {
	double serviceCharge;
	int numberOfPeople;
	public Seated() {//non_arg_construct
		super();
		
	}
	public Seated(String customername, int pizzaSize, int numberOfToppings, double toppingPrice,double serviceCharge,int numberOfPeople) {
		super(customername, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge=serviceCharge;
		this.numberOfPeople=numberOfPeople;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public int getNumberOfPeople() {
		return numberOfPeople;
	}
	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}
	@Override
	public String toString() {//print order'info such as name date etc..
		return "customername="
				+ customername +"\nnumberOfPeople=" + numberOfPeople +  "\ndateOrderd=" + dateOrderd +"\nPizza Size= "+size+ "\nnumberOfToppings=" + numberOfToppings
				+ "\ntoppingPrice=" + toppingPrice + "\nserviceCharge=" + serviceCharge +"\norder Price= "+calculateOrderPrice();
	}
	public double calculateOrderPrice() {//used to return the order'sprice
		return super.calculateOrderPrice()+(serviceCharge*numberOfPeople);
	}
	
}
