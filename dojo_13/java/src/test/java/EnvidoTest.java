import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EnvidoTest {

    @Test
    public void envido_de_mano_uno_pierde_contra_envido_de_mano_dos(){
        Envido envido1 = new Envido(new TresOro(), new CincoOro(), new AnchoEspada());
        Envido envido2 = new Envido(new SieteEspada(), new CincoEspadas(), new AnchoBasto());

        Integer valor1 = envido1.valor();
        Integer valor2 = envido2.valor();

        assertTrue( valor1 < valor2);
    }

    @Test
    public void envido_es_igual_independientemente_del_orden_de_sus_cartas(){
        Envido envido1 = new Envido(new SieteEspada(), new CincoEspadas(), new AnchoBasto());
        Envido envido2 = new Envido(new SieteEspada(), new AnchoBasto(), new CincoEspadas());

        assertEquals( envido1, envido2);
    }

    @Test
    public void envido_valor_debe_ser_igual_para_cualquier_orden_de_cartas(){
        Envido envido1 = new Envido(new SieteEspada(), new CincoEspadas(), new AnchoBasto());
        Envido envido2 = new Envido(new SieteEspada(), new AnchoBasto(), new CincoEspadas());
        Envido envido3 = new Envido(new AnchoBasto(), new SieteEspada(), new CincoEspadas());
        Envido envido4 = new Envido(new CincoEspadas(), new AnchoBasto(), new SieteEspada());

        Integer valor1 = envido1.valor();
        Integer valor2 = envido2.valor();
        Integer valor3 = envido3.valor();
        Integer valor4 = envido4.valor();

        assertEquals(valor1, new Integer(32));
        assertEquals(valor1, valor2);
        assertEquals(valor2, valor3);
        assertEquals(valor3, valor4);
    }

    @Test
    public void envido_valor_veinte_triada_dos_negras_mismo_palo_oro_uno_basto(){
        Envido envido1 = new Envido(new OnceCopas(), new DoceCopas(), new AnchoBasto());
        Integer valor1 = envido1.valor();

        assertEquals(new Integer(20) ,valor1);
    }

}

