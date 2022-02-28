import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RicsStuffTest {

  static private String NAME = "Riccardo";
  private RicsStuf ricsStuf = new RicsStuf(NAME);

  @Test
  void testGetters() {
    assertEquals(NAME, ricsStuf.getName());
  }

  @Test
  void testDoComplicatedStuff() {
    assertEquals("Hello "+ NAME, ricsStuf.doComlicatedStuff());
  }
}
