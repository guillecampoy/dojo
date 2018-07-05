public class CuatroCopas implements Carta{
    @Override
    public boolean equals(Object other){
        return this.getClass().equals(other.getClass());
    }

    @Override
    public String palo() {
        return "COPAS";
    }

    @Override
    public Integer numero() {
        return 4;
    }

    @Override
    public Carta truco(Carta carta) {
        return this;
    }
}
