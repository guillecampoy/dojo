public class TresOro implements Carta {
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
        return 3;
    }

}
