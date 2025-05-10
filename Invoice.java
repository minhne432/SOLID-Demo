//this class is used to create an invoice for a product
//it contains the product name, quantity and price per unit
//it also contains a method to calculate the total price and a method to get the details of the invoice
public class Invoice{
  private String product;
  private int quality;
  private double pricePerUnit;

  public Invoice(String product, int quality, double pricePerUnit){
    this.product = product;
    this.quality = quality;
    this.pricePerUnit = pricePerUnit;
  }

  public double calculateTotal(){
    return quality * pricePerUnit;
  }

  public String getDetails(){
    return product + " x " + quality + " =$" + calculateTotal();
  }
}