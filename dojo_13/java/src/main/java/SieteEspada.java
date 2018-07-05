public class SieteEspada implements Carta{
    @Override
    public Carta truco(Carta carta) {
        return this;
    }

    public Carta truco(AnchoBasto anchoBasto){
        return anchoBasto;
    }

    public Carta truco(AnchoEspada anchoEspada){
        return anchoEspada;
    }
}
