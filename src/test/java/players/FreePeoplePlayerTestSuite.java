package players;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreePeoplePlayerTestSuite {

    @Test
    public void testReinforcementsLists() {
        FreePeoplePlayer freePeoplePlayer = new FreePeoplePlayer();
        freePeoplePlayer.init();

        int dwarvesEliteReinforcements = freePeoplePlayer.getDwarvesEliteReinforcements().size();

        assertEquals(dwarvesEliteReinforcements, 5);

    }
}
