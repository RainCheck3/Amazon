package com.sapient.client.shop;

/**
 * 
 * @author jxu1, mohit, shivam A single item in an order, interacts with
 *         orderDetail, includes information about price, shipping weight
 *
 */

class InValidLengthException extends Exception
{
    public InValidLengthException(String message)
    {
        super(message);
    }
}


class InValidShippingWeightException extends Exception
{
    public InValidShippingWeightException(String message)
    {
        super(message);
    }
}


class InValidPriceException extends Exception
{
    public InValidPriceException(String message)
    {
        super(message);
    }
}

class InValidItemWeightException extends Exception
{
    public InValidItemWeightException(String message)
    {
        super(message);
    }
}

public class Item {
	private double price;
	private double weight;
	private String itemName;


	private double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName)throws Exception {
		if(itemName.length()>1){
			this.itemName = itemName;
		}
		else{
			throw new InValidLengthException("The item name is not valid.");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {
		if(price>0){
			this.price = price;
		}
		else{
			throw new InValidPriceException("The price of the item is less than or equal to zero.");
		}
		
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) throws Exception {
		if(shippingWeight>weight){
			this.shippingWeight = shippingWeight;
		}
		else{
			throw new InValidShippingWeightException("shipping weight is less than or equal to weight of item");
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description)throws Exception {
		if(description.length()<50){
			throw new InValidLengthException("Description is not of valid length.");
		}
		else{
			this.description=description;
		}
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) throws Exception {
		if(orderDetail !=null)
		{
		this.orderDetail = orderDetail;
	}
<<<<<<< HEAD
		else{
			throw new NullPointerException();
			
		}
		
	}	
	
=======

>>>>>>> 7cdac223507a39c786672d1bfd85349c693326bd
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) throws Exception {
	if(weight>2){
		this.weight = weight;
	}
	else{
		throw new InValidItemWeightException("The weight of item can't be less than 1.");
	}
	}
	
	
	
}
