public class SieteOro implements Carta{
    @Override
    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }

    @Override
    public String palo() {
        return "ORO";
    }

    @Override
    public Integer numero() {
        return 7;
    }

    @Override
    public Carta truco(Carta carta) {
        return this;
    }
}
