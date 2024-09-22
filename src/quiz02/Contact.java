package quiz02;

public class Contact {
    private String name;
    private String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void display() {
        System.out.print("이름: " + getName() + ", 전화번호: " + getPhoneNumber());
    }
}
