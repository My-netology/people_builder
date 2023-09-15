public class PersonBuilder {
    protected String firstName;
    protected String secondName;
    protected int age;
    protected String address;

    public PersonBuilder() {
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalStateException("Вы забыли указать \"Имя\".");
        }
        if (secondName == null || secondName.isEmpty()) {
            throw new IllegalStateException("Вы забыли указать \"Фамилию\".");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0.");
        }
        return new Person(this);
    }
}