class FeeAccount {

    void pay() {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount {

    void pay() {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class Main {
    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        int hostel = 0;
        int dayScholar = 0;

        for (int i = 0; i < accounts.length; i++) {

            accounts[i].pay();

            if (accounts[i] instanceof HostelFeeAccount) {
                hostel++;
            } else {
                dayScholar++;
            }
        }

        System.out.println("Hostel accounts processed: " + hostel);
        System.out.println("Day-scholar accounts processed: " + dayScholar);
    }
}