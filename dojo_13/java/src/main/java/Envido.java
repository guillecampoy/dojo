import java.util.ArrayList;
import java.util.Arrays;

public class Envido {
    private final ArrayList<Carta> cartas;

    public Envido(Carta carta1, Carta carta2, Carta carta3) {
        this.cartas = new ArrayList<Carta>( Arrays.asList(carta1,carta2,carta3));
    }

    public Integer valor() {
        Integer maximo = 1;

        for(int i = 0; i < this.cartas.size(); ++i) {
            Integer valor = this.valorTomandoCarta(i);

            if ( valor >= maximo) {
                maximo = valor;
            }
        }

        return maximo + 20;

    }

    private Integer valorTomandoCarta(int i) {
        Carta carta = this.cartas.get(i);
        Integer resultado = carta.numero();

        ArrayList<Carta> restantes = (ArrayList<Carta>) this.cartas.clone();
        restantes.remove(i);


        if( carta.palo().equals(restantes.get(0).palo() ) ){
            resultado = resultado + restantes.get(0).numero();
        }
        if( carta.palo().equals(restantes.get(1).palo()) ){
            resultado = resultado + restantes.get(1).numero();
        }

        return resultado;
    }

    @Override
    public boolean equals(Object other) {
        Envido another = (Envido)other;

        return this.cartas.containsAll( another.cartas );
    }
}
