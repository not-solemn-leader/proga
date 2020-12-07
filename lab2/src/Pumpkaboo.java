import ru.ifmo.se.pokemon.*;

public class Pumpkaboo extends Pokemon{
    public Pumpkaboo(String name, int level) {
        super(name, level);
        setStats(49, 66, 70, 44, 55, 51);
        setType(Type.GHOST, Type.GRASS);
        setMove(
                new FlameCharge(), new FireBlast(),
                new Psychic()
        );
    }
}
