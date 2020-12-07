public class Person extends Entity {
    public final String name;

    public Person(String n) {
        this.name = n;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person && ((Person) o).name.equals(this.name));
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public void forgetAbout(Person p) {
        System.out.println(this.toString() + " забыл про " + p.toString());
    }
    public void walk() {
        System.out.println(this.toString() + " гуляет");
    }
}
