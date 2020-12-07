public class Person extends Entity {
    public Person(String n) {
        this.name = n;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Person && ((Person) o).name.equals(this.name));
    }

    public void forgetAbout(Person p) {
        System.out.println(this.toString() + " забыл про " + p.toString());
    }

    public void notice(Person p, Boolean noticed) {
        String really = noticed? "": " не ";
        System.out.println(this.toString() + really + " заметил " + p.toString());
    }
}
