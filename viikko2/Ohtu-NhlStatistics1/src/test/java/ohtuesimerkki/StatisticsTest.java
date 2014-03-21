package ohtuesimerkki;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class StatisticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    public StatisticsTest() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void searchYieldsAnExistingPlayer() {
        assertNotNull(stats.search("Semenko"));
    }

    @Test
    public void searchYieldsNullForNonExistingPlayer() {
        assertNull(stats.search("No-one"));
    }

    @Test
    public void teamEDMHas3Players() {
        assertEquals(stats.team("EDM").size(), 3);
    }

    @Test
    public void topScorersExist() {
        assertEquals(stats.topScorers(2).size(), 3);
    }
    
}
