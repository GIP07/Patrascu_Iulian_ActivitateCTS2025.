package teste;

import clase.Persoana;
import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetVarstaTest {

    Persoana persoana;

    @Before

    public void setUP()throws Exception{
        persoana = new Persoana();
    }
@Test
    public void getVarstaRIGHT(){
        persoana = new Persoana("Adrian", "1860308413313");
        assertEquals(39,persoana.getVarsta());
    }

    @Test
    public void getVarstaRIGHT2(){
        persoana = new Persoana("Adrian", "1360308413313");
        assertEquals(39,persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundrySuperior(){
        persoana = new Persoana ("Ana", "2860308113311");
                assertEquals(39, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundryInferior(){
        persoana = new Persoana ("Maria", "2860308113311");
        assertEquals(39, persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEraoreCaracter(){
        persoana = new Persoana ("Ana", "290g910dg00001");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareLuna() {
        persoana = new Persoana ("Maria", "2145600000001");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformace(){
        persoana = new Persoana ("Maria", "2145600000001");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaInexistent(){
        persoana = new Persoana ("Maria", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana = new Persoana ("Mihaela", "6240101115266");
        assertEquals(1,persoana.getVarsta());
    }
    @Test
    public void getVarstaCardinality2(){
        persoana = new Persoana ("Mihaaela", "6230101110201");
        assertEquals(2,persoana.getVarsta());
    }
}
