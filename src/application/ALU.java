package application;
import java.util.ArrayList;
import java.util.Collections;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

//mohand idrees 1212236 6L
public class ALU extends Application {
	@Override
	public void start(Stage primaryStage) {
		    Font x=Font.font("myfont",FontPosture.ITALIC,17);
			BorderPane root = new BorderPane();
			VBox firstPane=new VBox(15);//this pane will contain the horizontal panes than contains label field and textfield
		
			FlowPane customer=new FlowPane();///////////////////////////////
			Label customername=new Label("customername");
			customername.setPadding(new Insets(0,45,0,10));
			customername.setFont(x);
			TextField name=new TextField();               //this part for customer name
			customer.getChildren().addAll(customername,name);/////////////
			    
			
			
			FlowPane order=new FlowPane();//////////////////////////////
			Label orderlabel= new Label("Ordertype");
			orderlabel.setFont(x);
			orderlabel.setPadding(new Insets(0,80,0,10));
		    ComboBox ordertype=new ComboBox();
		    ordertype.getItems().addAll("Delivery","Seated","ToGo");//this part for orderType
		    ordertype.setValue("ToGo");
		    order.getChildren().addAll(orderlabel,ordertype);///////////////
		    ArrayList<PizzaOrder> orders=new ArrayList();
		    
		       
			FlowPane size=new FlowPane(10,10);//////////////////////////////////////////
			   ToggleGroup tg=new ToggleGroup();
		       Label pizzasize=new Label("Pizzasize");
		       pizzasize.setFont(x);
		       pizzasize.setPadding(new Insets(0,77,0,10));
		       RadioButton small=new RadioButton("small");
		       small.setSelected(true);
		       RadioButton medium=new RadioButton("medium");
		       RadioButton large=new RadioButton("large");///////////this part for prizaSize
		       small.setToggleGroup(tg);
		       medium.setToggleGroup(tg);
		       large.setToggleGroup(tg);
		       size.getChildren().addAll(pizzasize,small,medium,large);//////////////
		    
		       
			FlowPane toppings=new FlowPane(10,10);///////////////////////////////////////////////
		       Label listoftoppings=new Label("toppings");
		       listoftoppings.setFont(x);
		       listoftoppings.setPadding(new Insets(0,80,0,10));
		       CheckBox onions=new CheckBox("onions");
		       CheckBox Olives=new CheckBox("Olives");///////////this part for toppings
		       CheckBox greenPapers=new CheckBox("Green Peppers ");
		       toppings.getChildren().addAll(listoftoppings,onions,Olives,greenPapers);/////
		    
		       
		    FlowPane toppingsPrice=new FlowPane();///////////////////////
		       Label toppingPrice =new Label("toppingPrice");
		       toppingPrice.setPadding(new Insets(0,60,0,10));
		       toppingPrice.setFont(x);
		       TextField price=new TextField("10");               //this part used to add the toppingsPrice
		       toppingsPrice.getChildren().addAll(toppingPrice,price);///
		       
		    
			
		    FlowPane orderorice=new FlowPane();/////////////////////////////
		       Label orderorices =new Label("orderPrice");
		       orderorices.setPadding(new Insets(0,82,0,10));
		       orderorices.setFont(x);
		       TextField orderprice=new TextField("0.0");//this part used to add the toppingsPrice
		       orderorice.getChildren().addAll(orderorices,orderprice);////
		       
		     firstPane.getChildren().addAll(customer,order,size,toppings,toppingsPrice);
		    //here the first pane ends that contains from customer name to order price//
		       
		    //////////////////////////part 2
		     
			VBox newfield=new VBox(15);//////////////////
			newfield.setPadding(new Insets(10,0,0,0));
			FlowPane s1=new FlowPane();
		       Label triprate_Or_ServiceCharge__label =new Label("TripRate");
		       triprate_Or_ServiceCharge__label.setPadding(new Insets(0,90,0,10));
		       triprate_Or_ServiceCharge__label.setFont(x);
		       TextField triprate_Or_ServiceCharge=new TextField();
		       triprate_Or_ServiceCharge__label.setVisible(false);
		       triprate_Or_ServiceCharge.setVisible(false);
		       s1.getChildren().addAll(triprate_Or_ServiceCharge__label,triprate_Or_ServiceCharge);//////////////////
		       
		                                       
		    FlowPane s2=new FlowPane();/////////////////////////
		       Label zone_or_numberofpeople__label =new Label("Zone");
		       zone_or_numberofpeople__label.setPadding(new Insets(0,115,0,10));
		       zone_or_numberofpeople__label.setFont(x);
		       TextField zone_or_numberofpeople=new TextField();
		       zone_or_numberofpeople__label.setVisible(false);
		       zone_or_numberofpeople.setVisible(false);
		       s2.getChildren().addAll(zone_or_numberofpeople__label,zone_or_numberofpeople);
		    newfield.getChildren().addAll(s1,s2,orderorice);////////////////
		    
		  //here the next pane ends that contains field and textarea that depend on the 
		    
		    
			FlowPane buttons=new FlowPane(10,10);///////////////////////////
			Button but1=new Button("ProcessOrder");
			Button but2=new Button("PrintOrders");           //this part for bottom buttons
			Button but3=new Button("Reset ");
			buttons.setPadding(new Insets(0,0,25,85));
			buttons.getChildren().addAll(but1,but2,but3);//////////////
			//part3 done
			
			
		    //////Actions
			ordertype.setOnAction(e->{//an shot description for what happen here is that we detremine which feild should appear and it's place
				if(ordertype.getValue()=="Delivery"){
					triprate_Or_ServiceCharge__label.setText("TripRate");
					zone_or_numberofpeople__label.setText("Zone");
					triprate_Or_ServiceCharge__label.setVisible(true);
					zone_or_numberofpeople__label.setVisible(true);
					triprate_Or_ServiceCharge.setVisible(true);
				    zone_or_numberofpeople.setVisible(true);
				    triprate_Or_ServiceCharge__label.setPadding(new Insets(0,90,0,10));
				    zone_or_numberofpeople__label.setPadding(new Insets(0,115,0,10));
				}
				else if(ordertype.getValue()=="Seated"){
					triprate_Or_ServiceCharge__label.setText("serviceCharge");
					zone_or_numberofpeople__label.setText("numberOfPeople");
					triprate_Or_ServiceCharge__label.setVisible(true);
					zone_or_numberofpeople__label.setVisible(true);
					triprate_Or_ServiceCharge.setVisible(true);
				    zone_or_numberofpeople.setVisible(true);
				    zone_or_numberofpeople__label.setPadding(new Insets(0,30,0,10));
				    triprate_Or_ServiceCharge__label.setPadding(new Insets(0,52,0,10));
				}
				else {
					
					 zone_or_numberofpeople__label.setVisible(false);
				     zone_or_numberofpeople.setVisible(false);
				     triprate_Or_ServiceCharge__label.setVisible(false);
				     triprate_Or_ServiceCharge.setVisible(false);
				}
			});
			
			
			but1.setOnAction(e->{//in this part we will determine which type of orders and then create an object depending of the ordertype
				String name1=name.getText();
				int pizzasize1=(small.isSelected())?1:(medium.isSelected())?2:3;
				int numberoftoppings=0;
				if(onions.isSelected())numberoftoppings+=1;
				if(Olives.isSelected())numberoftoppings+=1;
				if(greenPapers.isSelected())numberoftoppings+=1;
				double toppingsprice=Double.parseDouble(price.getText());
				double OrderPrice=Double.parseDouble(orderprice.getText());

				if(ordertype.getValue()=="Delivery") {
					double triprate_Or_ServiceCharge1=Double.parseDouble(triprate_Or_ServiceCharge.getText());
					int zone_or_numberofpeople1=Integer.parseInt(zone_or_numberofpeople.getText());
					orders.add(new Delivery(name1,pizzasize1,numberoftoppings,toppingsprice,triprate_Or_ServiceCharge1,zone_or_numberofpeople1));
					orderprice.setText(""+orders.get(orders.size()-1).calculateOrderPrice());
				}
				else if(ordertype.getValue()=="Seated"){
					double triprate_Or_ServiceCharge1=Double.parseDouble(triprate_Or_ServiceCharge.getText());
					int zone_or_numberofpeople1=Integer.parseInt(zone_or_numberofpeople.getText());
					orders.add(new Seated(name1,pizzasize1,numberoftoppings,toppingsprice,triprate_Or_ServiceCharge1,zone_or_numberofpeople1));
					orderprice.setText(""+orders.get(orders.size()-1).calculateOrderPrice());
				}
				else { orders.add(new ToGo(name1,pizzasize1,numberoftoppings,toppingsprice));//the reason why we did not take the first two line in if statment above because we can not assign empty value to integer.parsInt() or double.parsDouble()
				orderprice.setText(""+orders.get(orders.size()-1).calculateOrderPrice());
				}	
			});
			
			
			
			but2.setOnAction(e->{//this part will work if the printorders clicked
				Stage stage=new Stage();
				Collections.sort(orders);
				stage.setTitle("Orders");
	            VBox stagevbox = new VBox();
	            Scene scene1 = new Scene(stagevbox,200,200);
	            stagevbox.setPadding(new Insets(10, 10, 10, 10));
	            
	            // Add the customer name and order price for each order to the stage
	            for (PizzaOrder x1 : orders) {
	                Label label = new Label(x1.getCustomername() + ":           	$" + x1.calculateOrderPrice());
	                stagevbox.getChildren().add(label);
	            }
	            stage.setScene(scene1);
	            stage.show();
			});//
			
			
			but3.setOnAction(e->{//////this part will work if the button Reset clicked and  will reset all variables to the default value.
				orders.clear();
				name.setText("");
				price.setText("10");
				ordertype.setValue("ToGo");
				small.setSelected(true);
				medium.setSelected(false);
				large.setSelected(false);
				triprate_Or_ServiceCharge.setText("");
				zone_or_numberofpeople.setText("");
				orderprice.setText("0.0");
				onions.setSelected(false);
				Olives.setSelected(false);
				greenPapers.setSelected(false);//////
			
			});
			
			
			root.setTop(firstPane);
			root.setCenter(newfield);
			root.setBottom(buttons);
			Scene scene = new Scene(root,400,400);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
