package quiz02;

public class PersonalContact extends Contact {
    private String relationship;

    PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 관계: " + getRelationship());
    }
}
