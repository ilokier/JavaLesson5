public class Director {
    private String name;
    private String lastName;

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Director() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return name + " " + lastName;
    }
}
