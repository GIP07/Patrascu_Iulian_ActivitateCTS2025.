package teste;

import clase.Persoana;
import exceptii.ExceptieCNPInvalid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSexTest {

    @Test

    public void getSexRIGHT(){
        Persoana persoana =  new Persoana ("Maria", "2860308113311");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexRIGHT2(){
        Persoana persoana = new Persoana ("Ion", "1860308113311");
        assertEquals("M", persoana.getSex());

    }
    @Test
    public void getSexBoundryInferioara(){
        Persoana persoana =  new Persoana ("Mircea", "1560308113311");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexBoundrySuperior(){
        Persoana persoana = new Persoana ("Maria", "8860308113311");
        assertEquals("F",persoana.getSex());
    }

    private String getSexParitate(String CNP){
        if(CNP.charAt(0) % 2 == 0){
            return "F";
        }else{
            return "M";
        }
    }

    @Test
    public void getSexCrossCheck(){
        String CNP = "2860308113311";
        Persoana persoana =  new Persoana ("Maria", CNP);
        assertEquals(getSexParitate(CNP),persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)

    public void getSexError(){
        Persoana persoana =  new Persoana ("Maria", "0860308113311");
        persoana.getSex();
    }

    @Test (expected = ExceptieCNPInvalid.class)
    public void getSexError2(){
        Persoana persoana = new Persoana ("Ion", "9860308113311");
        persoana.getSex();
    }

}
