public class OnceCopas implements Carta {
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
        return 11;
    }

    @Override
    public Integer numeroEnvido() {
        return 0;
    }
}
