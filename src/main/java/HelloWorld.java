public class HelloWorld {

  public static String hello() {
    return hello("");
  }

  public static String hello(String name) {
    return "Hello" + (name.length() != 0 ? " " + name : "");
  }
}
