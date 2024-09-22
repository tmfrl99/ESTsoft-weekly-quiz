package quiz02;

public class BusinessContact extends Contact {
    private String company;

    BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 회사명: " + getCompany());
    }
}
