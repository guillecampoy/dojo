public class Mano {
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    @Override
    public boolean equals(Object other){
        Mano another = (Mano) other;
        return carta1.equals(another.carta1) && carta2.equals(another.carta2) && carta3.equals(another.carta3);
    }
    public Mano(Carta sieteOro, Carta cincoOro, Carta anchoBasto) {
        this.carta1 = sieteOro;
        this.carta2 = cincoOro;
        this.carta3 = anchoBasto;
    }

    public Mano envido(Mano other) {
        if(this.valorEnvido() < other.valorEnvido()){
            return other;
        }else {
            return this;
        }
    }

    public Integer valorEnvido() {
        Envido envido = new Envido(this.carta1, this.carta2, this.carta3);
        return envido.valor();

    }
}
