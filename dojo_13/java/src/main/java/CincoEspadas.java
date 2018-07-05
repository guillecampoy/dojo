public class CincoEspadas implements Carta{
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
        return 5;
    }

    @Override
    public Carta truco(Carta carta) {
        return this;
    }
}
