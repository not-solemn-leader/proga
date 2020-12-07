import ru.ifmo.se.pokemon.*;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setStats(67, 58, 57, 81, 67, 101);
        setType(Type.NORMAL);
        setMove(
                new ShadowBall(), new Psychic()
        );
    }
}
