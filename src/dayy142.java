public class dayy142 {
    interface Notification{
        void send(String to, String message);
    }
    class CreditNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Credited 10: "+message+", to"+to);
        }

    }
    class DebitNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Debited 10: "+message+", to"+to);
        }
    }
    static Notification getNotification(dayy142 factory, String type){
        return switch (type){
            case"Credit"-> factory.new CreditNotification();
            case"Debit"-> factory.new DebitNotification();
            default -> throw new IllegalArgumentException("Invalid account type:"+ type);
        };
    }
    static void main(){
        dayy142 factory = new dayy142


                ();
        String type = "Credit";
        getNotification(factory,type).send(" _MR_DHARANII_","Amount 10 credited");
    }
}
