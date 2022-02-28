import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
  @Test
  void TestHello() {
    assertEquals("Hello", HelloWorld.hello());
  }

  @ParameterizedTest
  @CsvSource({"Hello Ricardo, Riccardo", "Hello Antonio, Antonio", "Hello Stranger, Stranger"})
  void TestWithCSVParameters(String expected, String actual){
    assertEquals(expected, HelloWorld.hello(actual));
  }

}