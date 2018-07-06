public interface Carta {
    Carta truco(Carta carta);

    boolean equals(Object other);

    String palo();

    Integer numero();

    Integer numeroEnvido();
}
