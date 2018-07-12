public class DiezBasto implements Carta {
    @Override
    public Carta truco(Carta carta) {
        return null;
    }

    @Override
    public String palo() {
        return "BASTO";
    }

    @Override
    public Integer numero() {
        return 10;
    }

    @Override
    public Integer numeroEnvido() {
        return 0;
    }
}
