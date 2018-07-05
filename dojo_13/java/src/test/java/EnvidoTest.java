import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EnvidoTest {

    @Test
    public void envido_de_mano_uno_pierde_contra_envido_de_mano_dos(){
        Mano manoUno = new Mano(new TresOro(), new CincoOro(), new AnchoEspada());
        Mano manoDos = new Mano(new SieteEspada(), new CincoEspadas(), new AnchoBasto());

        Integer envidoUno = manoUno.valorEnvido();
        Integer envidoDos = manoDos.valorEnvido();

        assertTrue( envidoUno < envidoDos);
    }



}

