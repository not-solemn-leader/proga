import ru.ifmo.se.pokemon.*;

class Facade extends StatusMove{
    protected Facade(){super(Type.NORMAL, 70, 1.);}
     
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.PARALYZE || pokemon.getCondition() == Status.POISON){
            pokemon.setMod(Stat.ATTACK, 2);
        }
    }
    protected String describe(){
        return "Мощность удваивается если игрок горит, парализован или отравлен";
    }
}

class Confide extends PhysicalMove{
    protected Confide(){super(Type.NORMAL, 0, 1.);}
    protected void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    protected String describe(){
        return "Понижает специальную атаку цели на 1 пункт";
    }
}

class AirSlash extends PhysicalMove{
    protected AirSlash(){
        super(Type.FLYING, 75, 0.95);
    }
     
    protected void applyOppEffects(Pokemon opp){
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        opp.addEffect(e);
    }
     
    protected String describe(){
        return "30% шанс парализовать оппонента";
    }
}

class BrutalSwing extends PhysicalMove{
    protected BrutalSwing(){super(Type.DARK, 60, 1.0);}
     
    protected void applyOppDamage(Pokemon p, double d){
        p.setMod(Stat.HP, -(int)p.getStat(Stat.ATTACK));
    }
     
    protected String describe(){
        return "Просто наносит регулярный урон.";
    }
}

class FlameCharge extends PhysicalMove{
    protected FlameCharge(){super(Type.FIRE, 50, 1.);}

    
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 1);
    }

    
    protected void applyOppDamage(Pokemon p, double d){
        p.setMod(Stat.HP, -(int)p.getStat(Stat.ATTACK));
    }
    
    protected String describe(){
        return "Наносит регулярный урон, поднимает скорость на 1 пункт.";
    }
}

class FireBlast extends PhysicalMove{
    protected FireBlast(){super(Type.FIRE, 110, 0.85);}

    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).condition(Status.BURN);
        pokemon.addEffect(e);
    }
    protected String describe(){
        return "10% шанс поджечь противника";
    }
}

class Psychic extends StatusMove {
    protected Psychic() {
        super(Type.PSYCHIC, 90, 0.67);
    }

    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return "10% шанс понизить на 1 пункт спец защиту цели";
    }
}

class FocusBlast extends StatusMove {
    protected FocusBlast() {
        super(Type.FIGHTING, 90, 0.67);
    }
    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return "10% шанс понизить на 1 пункт спец защиту цели";
    }
}

class ShadowBall extends StatusMove {
    protected ShadowBall() {
        super(Type.GHOST, 80, 0.55);
    }
    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return "20% шанс понизить на 1 пункт спец защиту цели";
    }
}

class MudBomb extends StatusMove {
    protected MudBomb() {
        super(Type.GROUND, 65, 0.85);
    }
    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.3).stat(Stat.ACCURACY, -1);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return "30% шанс понизить на 1 пункт точность цели";
    }
}

class ThunderWave extends StatusMove {
    protected ThunderWave() {
        super(Type.ELECTRIC, 0, 0.9);
    }
    
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.PARALYZE);
        pokemon.addEffect(e);
    }

    protected String describe() {
        return "Парализует цель";
    }
}
