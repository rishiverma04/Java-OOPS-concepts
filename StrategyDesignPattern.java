/*class PaymentProcessor{
      public void processpayment(String paymentmethod){
            if(paymentmethod.equals("CreditCard")){
                  System.out.println("CreditCard Payment");
            }
            else if(paymentmethod.equals("Paypal")){
                  System.out.println("Paypal Payment");
            }
            else if(paymentmethod.equals("crypto")){
                  System.out.println("Crypto");
            }
            else{
                  System.out.println("Payment not accepted");
            }
      }
}
      public class StrategyDesignPattern{
public static void main(String[] args) {
      PaymentProcessor payment=new PaymentProcessor();
      payment.processpayment("Paypal");


}
      }*/
      /**
       * StrategyDesignPattern
       */
      
             
       interface PaymentMethod{
            void ProcessPayment();
      }
       class creditcardpayment implements PaymentMethod{
            public void ProcessPayment(){
                  System.out.println("Creditcard payment processing");
            }
      }
       class paypalpayment implements PaymentMethod{
            public void ProcessPayment(){
                  System.out.println("Processing paypal Payment");
            }
      }
       class Crypto implements PaymentMethod{
            public void ProcessPayment(){
                  System.out.println("Processing crypto Payment");
            }
      }
       class Online implements PaymentMethod{
            public void ProcessPayment(){
                  System.out.println("Processing online payment");
            }
      }       class PaymentProcessor{
            private PaymentMethod paymentmethod;

            public PaymentProcessor(PaymentMethod paymentmethod){
                  this.paymentmethod=paymentmethod;
            }
            public void process(){
                  paymentmethod.ProcessPayment();
            }
      }
      public class StrategyDesignPattern {
      public static void main(String[] args) {
            PaymentProcessor p1=new PaymentProcessor(new creditcardpayment());
            p1.process();

            PaymentProcessor p2=new PaymentProcessor(new paypalpayment());
            p2.process();
      }
            
      }

