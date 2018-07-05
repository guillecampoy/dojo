public class AnchoBasto implements Carta{
    @Override
    public Carta truco(Carta carta) {
        return null;
    }

    public Carta truco(SieteEspada sieteEspada) {
        return this;
    }

    public Carta truco(AnchoEspada anchoEspada) {
        return anchoEspada;
    }
}
