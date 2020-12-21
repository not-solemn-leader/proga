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
    public void eat (Person p,Portion portion){
        portion.setValue(2);
        portion.setName(" порции ");
        System.out.println(this.toString() + " уплетал "+portion.getValue()+portion.getName());
    }
    public void makeSoundUsing(Sound sound, BaseObject o){
        makeSound(sound);
    }
    public void praise(Person p2){
        System.out.println(this.toString()+" хвалил еду "+p2.toString());
    }

    @Override
    public void sad(Person p) {
        System.out.println(p.toString()+" была несчастна");
    }
    public class TVprogram {
        private String name = " телепередача ";
        public TVprogram(String name){
            this.name=name;
        }
        public void down(Person p){
            System.out.println(name+p.toString()+" провалилась ");
        }
    }
    public void see(String thing){
        System.out.println(this.toString()+" посмотрел на "+thing);
    }
    public class Sign{
        private String name="знаки";
        public void Give(Person p){
            System.out.println(p.toString()+" давал "+name);
        }
        public void notAnderstand(Person p){
            System.out.println(p.toString()+" не понимал "+name);
        }
    }
}
