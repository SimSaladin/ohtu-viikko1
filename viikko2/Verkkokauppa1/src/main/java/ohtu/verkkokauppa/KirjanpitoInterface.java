
package ohtu.verkkokauppa;

import java.util.ArrayList;

interface KirjanpitoInterface {

    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
