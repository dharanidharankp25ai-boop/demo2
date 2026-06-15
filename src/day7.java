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
/*
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
*/


public class day7 Interface {
    interface Employee {
        void solveProblem();
        void work();
    }

    static class BankEmployee implements Employee{
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is solving banking problems");
        }

        @Override
        public void work() {
            System.out.println(name + " is working in the bank");
        }
    }

    static class CheckingEmployee implements Employee {

        String name;
        String id;
        int salary;

        CheckingEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is checking customer accounts");
        }

        @Override
        public void work() {
            System.out.println(name + " is performing checking operations");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new BankEmployee("ravi", "B101", 50000);
        Employee emp2 = new CheckingEmployee("Kumar", "C102", 45000);
        System.out.println("--------------------------------");
        emp1.work();
        System.out.println();
        emp1.solveProblem();
        System.out.println("--------------------------------");
        emp2.work();
        System.out.println();
        emp2.solveProblem();
        System.out.println("--------------------------------")
    }
}
