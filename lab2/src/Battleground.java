import ru.ifmo.se.pokemon.*;

public class Battleground {
    public static void main(String[] args) {
        System.out.println("Minimal Battle");
        minimal_bg();

        System.out.println("Normal Battle");
        normal_bg();
    }

    public static void normal_bg(){
        Battle field = new Battle();
        field.addAlly(new Rayquaza("Я", 2));
        field.addAlly(new Pumpkaboo("Сделал", 1));
        field.addAlly(new Gourgeist("Не", 3));
        field.addFoe(new Happiny("Свой", 2));
        field.addFoe(new Chansey("Вариант", 3));
        field.addFoe(new Blissey("ААААААААААААААААА", 2));
        field.go();
    }

    public static void minimal_bg(){
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}
