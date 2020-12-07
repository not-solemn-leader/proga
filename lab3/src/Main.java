public class Main {

    public static void main(String[] args) {
        Person frekenBock = new Person("Фрекен Бок");
        Person youngMan = new Person("Малыш");
        Person karlson = new Person("Карлсон");
        Person pek = new Person("Пек");
        frekenBock.loseConcious();
        frekenBock.fallDown();
        frekenBock.getConcious();
        frekenBock.getOnFeet();
        frekenBock.showEmotion(Emotion.EYE_BLEAKING);
        youngMan.listen(true);
        youngMan.forgetAbout(karlson);
        karlson.makeSound(Sound.CREAK);
        youngMan.showEmotion(Emotion.TERRIFIYING);
        karlson.walk();
    }
}
