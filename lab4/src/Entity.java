public abstract class Entity extends BaseObject implements Soundable, Concious, Fallable,Sadness {

    public void showEmotion(Emotion emotion) {
        String s = null;
        switch (emotion) {
            case EYE_BLEAKING:
                s = " блестят глаза";
                break;
            case TERRIFIYING:
                s = " проявляется страх";
                break;
            case DELISIOUS:
                s = " было восхищение едой";
                break;
            case CRY:
                s = " катились слезы";
                break;
            case NOCRY:
                s = " небыло слез";
                break;
        }
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
        String silentPostfix = silent ? " затаив дыхание" : "";
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
    public void fallDown() {
        this.makeSound(Sound.CLAP);
    }

    @Override
    public void getOnFeet() {
        System.out.println(this.toString() + " встает на ноги");
    }

    ;

    public void relocateTo(Places place,int near) {
        String s;
        switch (place) {
            case BOX:
                s = "ящик";
                break;
            case HALL:
                s = "Прихожая";
                break;
            case TABLE:
                s = " за Столом";
                break;
            default:
                s = "Кухня";
        }
        if (near == 0){
        System.out.println(this.toString() + " находится в " + s);
        this.place = place;}
        else{
            System.out.println(this.toString() + " приближался к " + s);
            this.place = place;
        }
    }

    public void itsKarloson(String question) throws ItsKarloson {
        if (question == null) {
            throw new ItsKarloson("никто не знал что это");
        }
        System.out.println("это был "+this.toString());
        System.out.println("это не был "+this.toString());
    }
    public void like(String sth){
        System.out.println(this.toString()+" был похож на "+sth);
    }
    public void wear(){
        System.out.println(this.toString()+" надел "+Clothes.SKIRT.getName()+Clothes.TULL1.getName()+" и "+Clothes.TULL2.getName());
    }

}

