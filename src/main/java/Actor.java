public class Actor {
    private String name;
    private String lastName;

    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Actor() {
    }

    public String toString() {
        return "name: "+name +"lastName"+lastName;
    }
}
