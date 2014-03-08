package ohtu.ohtuvarasto;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testi() {
        Main.main( new String[] { "" } );
    }

    @Test
    public void konstr() {
        Main main = new Main();
        main.toString();
    }
}
