class Product{
	public static void main(String[] products){
	  System.out.println("Started executing main method:");
	  String name=products[0];
	  String type=products[1];
	  String price=products[2];
	  String quantity=products[3];
	  String quality=products[4];
	  
	  System.out.println("product name:"+name);
	  
	  
	 System.out.println("product name:"+type);
	 
	 System.out.println("product name:"+price);
	 
	 
	 System.out.println("product name:"+quantity);
	  
	  System.out.println("product name:"+quality);
	
	  
	  int convertedPrice=Integer.parseInt(price);
	  
	  System.out.println("converted Price:"+convertedPrice);
	  
	  int convertedquantity=Integer.parseInt(quantity);
	  
	  System.out.println("Converted Quanity:"+convertedquantity);
	  
	
	  float convertedQuality=Float.parseFloat(quality);
	  
	  System.out.println("converted Quality:"+convertedQuality);
	  
	  int totalPrice=convertedPrice*convertedquantity;
	    
	  System.out.println("Total price:"+totalPrice);
	  
	  
	  System.out.println("Exit main method:");
	  
	  
	  
	   
	}
}