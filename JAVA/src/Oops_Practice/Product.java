package oops_practice;


class ProductDetails
{
	
	private int product_Id;
	private String product_Name;
	private String product_Description;
	private double product_Price;	
	
	public ProductDetails( int product_Id,  String product_Name , String product_Description, double product_Price )
	{
		 this.product_Id = product_Id;
		 this.product_Name = product_Name;
		 this.product_Description = product_Description;
		 this.product_Price = product_Price;
		
	}
	
	public int getProduct_Id()
	{
		return product_Id;
	}
	
	public void setProduct_Id(int product_Id)
	{
		this.product_Id = product_Id;
	}
	
	public String getProduct_Name()
	{
		return product_Name;
	}
	
	public void setProduct_Name(String product_Name )
	{
		this.product_Name = product_Name;
	}
		
	public String getProduct_Description()
	{
		return product_Description;
	}
	
	public void setProduct_Description(String product_Description)
	{
		this.product_Description = product_Description;
	}
	
	public double getProduct_Price()
	{
		return product_Price;
	}
	
	public void setProduct_Price(double product_Price)
	{
		this.product_Price = product_Price;
	}
	
	
	void Display_Product_Details()
	{
		System.out.println("The Product Is : " + product_Id );
		System.out.println("The Name Of The Product Is : " + product_Name );
		System.out.println("The Description Of The Product Is : " + product_Description );
		System.out.println("The Price Of The Product Is : " + product_Price );
	}
}






public class Product {

	public static void main(String[] args) {
		
		
		ProductDetails productdetails = new ProductDetails(101 , "Apple", "It is an Fruit", 50.0);
		
		productdetails.setProduct_Id(101);
		
		productdetails.Display_Product_Details();
		
		
		
		

	}

}
