public class AnchoBasto extends CartaBO implements Carta{
    @Override
    public Carta truco(Carta primerCarta, Carta segundaCarta) {
        return null;
    }

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
