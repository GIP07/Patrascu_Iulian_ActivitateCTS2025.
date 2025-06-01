package teste;

import clase.Persoana;
import exceptii.ExceptieCNPInexistent;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {

    Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();

    }

    @org.junit.Test
    public void getVarstaRIGHT() {

        persoana= new Persoana("Aria","2920109112140");
        assertEquals(33,persoana.getVarsta());
    }

    @Test
    public void getVarstaRIGHT2() {
        persoana= new Persoana("Marius","5010109117280");
        assertEquals(24,persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundry(){
        persoana  = new Persoana("Mircea","1991231457234");
        assertEquals(25,persoana.getVarsta());
    }
    @Test
    public void getVarstaBoundry2(){
        persoana = new Persoana("Maria","60001025673778");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaError(){
        persoana = new Persoana("Mari","4563863fdg356");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
        public void getVarstaEroareLuna(){
            persoana = new Persoana("Mircea","1999991457234");
            persoana.getVarsta();

    }

}