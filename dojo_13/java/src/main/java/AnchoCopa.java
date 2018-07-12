public class AnchoCopa implements Carta {
    @Override
    public Carta truco(Carta carta) {
        return null;
    }

    @Override
    public String palo() {
        return "COPA";
    }

    @Override
    public Integer numero() {
        return 1;
    }

    @Override
    public Integer numeroEnvido() {
        return 1;
    }
}
