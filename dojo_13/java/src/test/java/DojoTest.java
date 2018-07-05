import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {
	
	@Before
	public void setup() {

	}

    @Test
    public void test_ancho_de_espada_mata_siete_espada(){
        AnchoEspada anchoEspada = new AnchoEspada();
        SieteEspada sieteEspada = new SieteEspada();

        Assert.assertEquals (anchoEspada, anchoEspada.truco(anchoEspada,sieteEspada) );
	}

	@Test
    public void test_ancho_de_basto_mata_siete_espada(){
        AnchoBasto anchoBasto = new AnchoBasto();
        SieteEspada sieteEspada = new SieteEspada();

        Assert.assertEquals (anchoBasto, anchoBasto.truco(sieteEspada) );
    }

    @Test
    public void test_ancho_de_basto_pierde_ancho_espada(){
        AnchoBasto anchoBasto = new AnchoBasto();
        AnchoEspada anchoEspada = new AnchoEspada();

        Assert.assertEquals (anchoEspada, anchoBasto.truco(anchoEspada) );
    }

    @Test
    public void test_siete_espada_pierde_con_ancho_espada(){
        AnchoEspada anchoEspada = new AnchoEspada();
        SieteEspada sieteEspada = new SieteEspada();

        Assert.assertEquals (anchoEspada, anchoEspada.truco(sieteEspada,anchoEspada) );
    }

    @Test
    public void test_siete_espada_pierde_con_ancho_basto(){
        AnchoBasto anchoBasto = new AnchoBasto();
        SieteEspada sieteEspada = new SieteEspada();

        Assert.assertEquals (anchoBasto, anchoBasto.truco(sieteEspada) );
    }

    @Test
    public void test_ancho_espada_mata_ancho_de_basto(){
        AnchoBasto anchoBasto = new AnchoBasto();
        AnchoEspada anchoEspada = new AnchoEspada();

        Assert.assertEquals (anchoEspada, anchoBasto.truco(anchoEspada) );
    }

	@Test
    public void test_envido_triada_jugador_uno_veintiocho_pierde_contra_triada_jugador_dos_treintaidos(){
	    Mano manoJugadorUno = new Mano(new AnchoEspada(),new TresOro(), new CincoOro());
	    Mano manoJugadorDos = new Mano(new AnchoBasto(), new SieteEspada(), new CincoEspadas());

	    Envido actual = manoJugadorUno.compiteEnvido(manoJugadorDos);
	    Envido envidoResultante = new Envido(new );

	    Assert.assertEquals( manoJugadorDos , manoJugadorUno.envido(manoJugadorDos));


    }


}
