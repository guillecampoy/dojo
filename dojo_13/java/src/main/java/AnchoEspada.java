public class AnchoEspada extends CartaBO implements Carta{
    @Override
    public Carta truco(Carta primerCarta, Carta segundaCarta) {
        return this;
    }

    @Override
    public Carta truco(Carta carta) {
        return null;
    }

}
