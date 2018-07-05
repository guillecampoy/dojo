public class AnchoBasto implements Carta{
    @Override
    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }

    @Override
    public String palo() {
        return "BASTO";
    }

    @Override
    public Integer numero() {
        return 1;
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
