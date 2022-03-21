public class Actor {
    private String name;
    private String lastName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return getName().equals(actor.getName()) && getLastName().equals(actor.getLastName());
    }


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
