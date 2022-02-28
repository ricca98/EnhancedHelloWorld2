import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

  @ParameterizedTest
  @CsvSource({"Hello Riccardo, Riccardo", "Hello Antonio, Antonio", "Hello Stranger, Stranger"})
  void TestWithCSVParameters(String expected, String actual){
    assertEquals(expected, HelloWorld.hello(actual));
  }

}