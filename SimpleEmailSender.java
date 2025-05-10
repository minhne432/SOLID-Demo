//this is a simple email sender implementation
public class SimpleEmailSender implements EmailSender {
  public void sendEmail(String content){
    System.out.println("Send simple email: " + content);
  };
}
