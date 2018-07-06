public class DoceCopas implements Carta {
    @Override
    public Carta truco(Carta carta) {
        return null;
    }

    @Override
    public String palo() {
        return "COPA";
    }

    @Override
    public Integer numero() {
        return 12;
    }


    public Integer numeroEnvido() {
        return 0;
    }
}
