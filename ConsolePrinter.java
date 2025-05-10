public class ConsolePrinter implements InvoicePrinter{
  //this class is used to print the invoice to the console
  public void print(Invoice invoice){
    System.out.println("Invoice: " + invoice.getDetails());
  };
}
