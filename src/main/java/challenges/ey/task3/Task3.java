package challenges.ey.task3;

// Wojt3kS

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Task3 {

    class Hero {
    }

    class Wizard {
        private String gandalf;

        public Wizard(String shirius, int first, int second) {
            gandalf = shirius;
        }

        public Object GetName() {
            return null;
        }

        public int GetHealth() {
            return 0;
        }

        public int GetDamage() {
            return 0;
        }

        public boolean GetAliveStatus() {
            return true;
        }

        public Object[] GetSpellBook() {
            Object[] spellBook = new Object[0];
            return spellBook;
        }
    }

    class Knight {
        public Knight(String gandalf, int first, int second) {

        }
    }

    public void test1() {
        Wizard wizard1 = new Wizard("Sirius", 100, 20);
        Knight knight1 = new Knight("Rolf the Hawk", 200, 50);

        assertEquals("Sirius", wizard1.GetName());
        assertEquals(100, wizard1.GetHealth());
        assertEquals(20, wizard1.GetDamage());
        assertEquals(true, wizard1.GetAliveStatus());
        assertTrue(Arrays.equals(wizard1.GetSpellBook(), new String[0]));
    }
}


