class FeeAccount {
    String regNo;
    double fee;

    FeeAccount(String regNo, double fee) {
        this.regNo = regNo;
        this.fee = fee;
    }

    final void printFee(int daysLate) {
        if (daysLate <= 0) {
            System.out.println(regNo + " - On time, no late fee");
        } else {
            double lateFee = fee * daysLate / 100;
            System.out.println(regNo + " | Total Fee: Rs " + fee
                    + " | Late Fee: Rs " + lateFee);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new FeeAccount("RA001", 200000),
            new FeeAccount("RA002", 150000),
            new FeeAccount("RA003", 180000),
            new FeeAccount("RA004", 220000)
        };

        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < accounts.length; i++) {
            accounts[i].printFee(daysLate[i]);
        }
    }
}