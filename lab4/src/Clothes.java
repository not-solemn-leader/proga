public enum Clothes {
    SKIRT(" юбку ,"),
    TULL1(" тюль спереди"),
    TULL2(" тюль сзади ");

    private final String name;

    Clothes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

