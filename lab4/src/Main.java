public class Main {

    public static void main(String[] args) throws ItsKarloson {
        Person frekenBock = new Person("Фрекен Бок");
        Person youngMan = new Person("Малыш");
        Person karlson = new Person("Карлсон");
        Person pek = new Person("Пек");
        Door door = new Door(Places.HALL, Places.KITCHEN, false);
        Portion portion = new Portion(2);
        Person.TVprogram tVprogram = frekenBock.new TVprogram("телепередача ");
        Person.Sign sign= youngMan.new Sign();
        pek.relocateTo(Places.TABLE,0);
        pek.eat(pek,portion);
        pek.showEmotion(Emotion.DELISIOUS);
        pek.showEmotion(Emotion.NOCRY);
        frekenBock.showEmotion(Emotion.CRY);
        pek.praise(frekenBock);
        tVprogram.down(frekenBock);
        frekenBock.sad(frekenBock);
        pek.see("потолок");
        frekenBock.see(pek.toString());
        frekenBock.loseConcious();
        frekenBock.fallDown();
        frekenBock.getConcious();
        frekenBock.getOnFeet();
        karlson.relocateTo(Places.BOX,0);
        frekenBock.showEmotion(Emotion.EYE_BLEAKING);
        youngMan.listen(true);
        youngMan.forgetAbout(karlson);
        karlson.makeSound(Sound.CREAK);
        karlson.relocateTo(Places.KITCHEN,0);
        door.setOpen(true);
        youngMan.showEmotion(Emotion.TERRIFIYING);

        Noticing noticeF = new Noticing() {
            @Override
            public void notNotice(Person p) {
                frekenBock.notice(karlson, false);
            }
        };
        Noticing noticeP = new Noticing() {
            @Override
            public void notNotice(Person p) {
                pek.notice(karlson, false);
            }
        };
        noticeF.notNotice(frekenBock);
        noticeP.notNotice(pek);
        try {
            karlson.itsKarloson("be");
        }
        catch (ItsKarloson itsKarloson){
            System.out.println(itsKarloson.getMessage());
        }
        finally {
            karlson.like(" маленькую бойкую девочку");
        }
        karlson.wear();
        karlson.relocateTo(Places.KITCHEN,10);
        sign.Give(youngMan);
        sign.notAnderstand(karlson);
        karlson.relocateTo(Places.KITCHEN,10);
        TheEndExeption theEndExeption=new TheEndExeption("Это конец рассказа");
        End end = new End() {
            @Override
            public void ending() {
                throw new TheEndExeption(theEndExeption.getMessage());
            }
        };
        end.ending();
    }
}
