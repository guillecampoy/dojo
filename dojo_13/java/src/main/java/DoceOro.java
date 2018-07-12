public class DoceOro implements Carta {
    @Override
    public Carta truco(Carta carta) {
        return null;
    }

    @Override
    public String palo() {
        return "ORO";
    }

    @Override
    public Integer numero() {
        return 12;
    }

    @Override
    public Integer numeroEnvido() {
        return 0;
    }
}
