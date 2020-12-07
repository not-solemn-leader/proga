public abstract class Entity implements Soundable, Concious, Fallable{
    public void showEmotion(Emotion emotion){

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

    public void getOnFeet() {
        System.out.println(this.toString() + " встает на ноги");
    };
}
