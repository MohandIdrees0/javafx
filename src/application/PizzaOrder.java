package application;
//mohand idrees 1212236 6L
import java.util.*;
public class PizzaOrder implements Comparable<PizzaOrder>{
	String customername;
	Date dateOrderd;
	final static int SMALL=1;
	final static int MEDIUM=2;
	final static int LARGE=3;
	int pizzaSize = 0;
	int numberOfToppings;
	double toppingPrice;
	String size="";
	public PizzaOrder() {//non_arg_construct
		
	}
	public PizzaOrder(String customername,int pizzaSize, int numberOfToppings, double toppingPrice) {
		this.customername = customername;
		this.pizzaSize=pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
		this.dateOrderd=new Date();
		if(pizzaSize==1) {//HERE WE DETREMINE THE SIZE IN STRING TO PRINT IT IN THE REPORT
			size="small";
		}
		else if(pizzaSize==2) {
			size="medium";
		}
		else {
			size="large";
		}
	}
	public String getCustomername() {//get method used to returned customer name
		return customername;
	}
	public void setCustomername(String customername) {//set method used to replace Customername 
		this.customername = customername;
	}
	public  int getPizzaSize() {//get method used to returned PizzaSize 
		return pizzaSize;
	}
	public void setPizzaSize(int pizzaSize) {//set method used to replace PizzaSize 
		this.pizzaSize = pizzaSize;
	}
	public int getNumberOfToppings() {//get method used to returned NumberOfToppings 
		return numberOfToppings;
	}
	public void setNumberOfToppings(int numberOfToppings) {//set method used to replace NumberOfToppings 
		this.numberOfToppings = numberOfToppings;
	}
	public double getToppingPrice() {//get method used to returned ToppingPrice
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {//set method used to replace ToppingPrice
		this.toppingPrice = toppingPrice;
	}
	public double calculateOrderPrice() {//used to return the orderprice
		return numberOfToppings*toppingPrice*pizzaSize;
	}
	
	public void printOrderInfo() {//print the name and the orderprice
		System.out.println("customer'name= "+customername+" OrderPrice= "+calculateOrderPrice());
	}
	@Override
	public String toString() {//print orderinfo such as name date etc..
		return "customername=" +customername + "\n dateOrderd=" +dateOrderd +"\nPizza Size= "+size+ "\nnumberOfToppings="
				+ numberOfToppings + "\n toppingPrice=" + toppingPrice+"\norder Price= "+calculateOrderPrice();
	}
    
	public int compareTo(PizzaOrder o) {//here we made a method called compareTo to help us sort the object depending on the orderprice
		if(this.calculateOrderPrice()==o.calculateOrderPrice())
			return 0;
		else if(this.calculateOrderPrice()>o.calculateOrderPrice())
			return 1;
		return -1;
	}
}
