public abstract class Entity extends BaseObject implements Soundable, Concious, Fallable{

    public void showEmotion(Emotion emotion){
        String s = (emotion.equals(Emotion.EYE_BLEAKING))? " блестят глаза": " проявляется страх";
        System.out.println("У " + this.toString() + s);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public void walk() {
        System.out.println(this.toString() + " гуляет");
    }

    @Override
    public void getConcious() {
        System.out.println(this.toString() + " пришел в себя");
    }

    @Override
    public void loseConcious() {
        System.out.println(this.toString() + " теряет сознание");
    }

    @Override
    public void listen(boolean silent) {
        String silentPostfix = silent ? " затаив дыхание": "";
        System.out.println(this.toString() + " слушает" + silentPostfix);
    }

    @Override
    public void makeSound(Sound sound) {
        String s;
        switch (sound) {
            case CLAP:
                s = "ХЛОП!";
                break;
            case CREAK:
                s = "*БЕСЯЧИЙ СКРИП";
                break;
            default:
                s = "JFSDLKFJDS";
        }
        System.out.println(s);
    }

    @Override
    public void fallDown(){
        this.makeSound(Sound.CLAP);
    }

    @Override
    public void getOnFeet() {
        System.out.println(this.toString() + " встает на ноги");
    };

    public void relocateTo(Places place) {
        String s;
        switch (place) {
            case BOX:
                s = "ящик";
                break;
            case HALL:
                s = "Прихожая";
                break;
            default:
                s = "Кухня";
        }
        System.out.println(this.toString() + " находится в " + s);
        this.place = place;
    }
}
