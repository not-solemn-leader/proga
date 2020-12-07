import ru.ifmo.se.pokemon.*;

public class Rayquaza extends Pokemon{
    public Rayquaza(String name, int level) {
        super(name, level);
        setStats(105, 150, 90, 150, 90, 95);
        setType(Type.DRAGON, Type.FLYING);
        setMove(
                new Facade(), new Confide(),
                new AirSlash(), new BrutalSwing()
        );
    }
}
