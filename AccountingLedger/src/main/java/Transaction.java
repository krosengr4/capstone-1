
public class Transaction {
    //declare variables for constructor
    String date;
    String time;
    String description;
    String vendor;
    double amount;

    //Constructor to create new Transaction (instances of)
    public Transaction(String date, String time, String description, String vendor, double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    //region Getters and Setters
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    //Used for sorting
    public String getDateTime() {
        return date + "-" + time;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //endregion

//    @Override
//    public int compareTo(Transaction other) {
//        return this.getLocalDateTime.compareTo(other.localDateTime);
//    }
}
