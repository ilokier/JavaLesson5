public class Actor {
    private String name;
    private String lastName;


    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
