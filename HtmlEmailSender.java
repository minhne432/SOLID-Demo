// this class is used to send HTML emails
public class HtmlEmailSender implements EmailSender{
  public  void sendEmail(String content){
    System.out.println("Send HTML email: " + content);
  };
};

