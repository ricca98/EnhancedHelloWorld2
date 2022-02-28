import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
  @Test
  void TestHello() {
    assertEquals("Hello", HelloWorld.hello());
  }

  @Test
  void TestHelloWithParameter() {
    assertEquals("Hello Riccardo", HelloWorld.hello("Riccardo"));
  }
}