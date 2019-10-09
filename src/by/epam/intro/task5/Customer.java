package by.epam.intro.task5;

public class Customer {
    private int id;
    private String secondName;
    private String name;
    private String thirdName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String secondName, String name, String thirdName,
                    String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.thirdName = thirdName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAddress() {
        return address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }
}
