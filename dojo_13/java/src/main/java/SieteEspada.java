public class SieteEspada implements Carta{
    @Override
    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }

    @Override
    public String palo() {
        return "ESPADA";
    }

    @Override
    public Integer numero() {
        return 7;
    }

    @Override
    public Integer numeroEnvido() {
        return 7;
    }

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
