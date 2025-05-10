public class Main {
  public static void main(String [] args){
    Invoice invoiceOne = new Invoice("BookOne", 2, 150.0);
    Invoice invoiceTwo = new Invoice("BookTwo", 2, 200.0);

    InvoicePrinter invoicePrinter = new ConsolePrinter();

    InvoiceService invoiceService = new InvoiceService(invoicePrinter);

    invoiceService.process(invoiceOne);
    invoiceService.process(invoiceTwo);
  }
}
