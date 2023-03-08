package application;
//mohand idrees 1212236 6L
public class Delivery extends PizzaOrder{
	double tripRate;
	int zone;
	public Delivery() {//non_arg_construct
		super();
	}
	public Delivery(String customername, int pizzaSize, int numberOfToppings, double toppingPrice,double tripRate,int zone) {
		super(customername, pizzaSize, numberOfToppings, toppingPrice);
		this.tripRate=tripRate;
		this.zone=zone;
		
	}
	public double gettripRate() {//get method used to returned tripRate 
		return tripRate;
	}
	public void settripRate(double tipRate) {//set method used to replace tripRate with new value
		this.tripRate = tipRate;
	}
	public int getZone() {//get method used to returned the person'szone 
		return zone;
	}
	public void setZone(int zone) {//set method used to replace zone with new value
		this.zone = zone;
	}
	@Override
	public String toString() {//print order'info such as name date etc..
		return "Customer name=" + customername + "\nDate Orderd="
				+ dateOrderd +" \nPizza Size= "+size+ "\nnumber Of Toppings=" + numberOfToppings + "\ntopping Price=" + toppingPrice + "\ntip Rate= " + tripRate + "\nzone = " + zone+
				"\norder Price= "+calculateOrderPrice();
	}
	public double calculateOrderPrice() {//used to return the orderprice
		return super.calculateOrderPrice()+(tripRate/100 *zone*super.calculateOrderPrice());
	}
	
	
}
