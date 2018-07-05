public class Envido {
    private Carta carta1;
    private Carta carta2;
    private Carta carta3;

    public Envido(Carta carta1, Carta carta2, Carta carta3) {
        this.carta1 = carta1;
        this.carta2 = carta2;
        this.carta3 = carta3;
    }

    public Integer valor() {
        Carta carta = this.carta1;
        Integer resultado = this.carta1.numero();

        if( carta.palo().equals(this.carta2.palo()) ){
            resultado = resultado + this.carta2.numero();
        }
        if( carta.palo().equals(this.carta3.palo()) ){
            resultado = resultado + this.carta3.numero();
        }
        return resultado;
    }
}
