public class Person {
    private final String firstName;
    private final String secondName;
    private int age;
    private String address;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String firstName, String secondName, int age, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public boolean hasAge() {
        return age > 0;
    }

    public void happyBirthday() {
        ++age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        return address != null && !address.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSecondName(secondName).setAddress(address);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder().append(firstName).append(" ").append(secondName);
        if (hasAge()) {
            builder.append(" ").append(getAge()).append(" лет");
        }
        if (hasAddress()) {
            builder.append(" из ").append(getAddress());
        }
        return builder.toString();
    }
}