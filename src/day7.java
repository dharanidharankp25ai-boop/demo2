/*
static class Request {

    String name;
    String date;
    String reason;

    Request(String name, String date, String reason) {
        this.name = name;
        this.date = date;
        this.reason = reason;
    }

    void approve() {
    }

    void reject() {
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("Leave request approved.");
        }

        void reject() {
            System.out.println("Leave request rejected.");
        }
    }

    static class LoanRequest extends Request {

        LoanRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approve() {
            System.out.println("Loan request approved.");
        }

        void reject() {
            System.out.println("Loan request rejected.");
        }
    }

    static void main(String[] args) {

        LeaveRequest leaveRequest =
    }
}
*/

public class day7 {
    static class payment {

        int amount;

        void transfer() {
            System.out.println("bob");
        }
    }

    static class upipayment extends payment {

        @Override
        void transfer() {
            System.out.println("transfer the amount");
        }
    }

    static class cardpayment extends payment {

        @Override
        void transfer() {
            System.out.println("easy transfer");
        }

        static class nbpayment extends payment {

            @Override
            void transfer() {
                System.out.println("easy way to transfer");
            }
        }

        static void main() {
            upipayment upipayment = new upipayment();
            upipayment.transfer();

            cardpayment cardpayment = new cardpayment();
            cardpayment.transfer();

            nbpayment nbpayment = new nbpayment();
            nbpayment.transfer();

        }
    }
}
