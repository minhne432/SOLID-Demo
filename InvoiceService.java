public class InvoiceService {
  private InvoicePrinter invoicePrinter;

  public InvoiceService(InvoicePrinter invoicePrinter){
    this.invoicePrinter = invoicePrinter;
  }

  public void process(Invoice invoice){
    invoicePrinter.print(invoice);
  }
}
