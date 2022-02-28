import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RicsStuffTest {

  private final String NAME = "Riccardo";
  private final RicsStuff ricsStuff = new RicsStuff(NAME);

  @Test
  void testGetters() {
    assertEquals(NAME, ricsStuff.getName());
  }

  @Test
  void testDoComplicatedStuff() {
    assertEquals("Hello "+ NAME, ricsStuff.doComlicatedStuff());
  }
}
