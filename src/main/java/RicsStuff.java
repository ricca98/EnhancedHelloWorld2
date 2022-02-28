public class RicsStuff {

  private final String name;


  public RicsStuff(String name) {
    this.name = name;
  }

  public String doComlicatedStuff() {
    return HelloWorld.hello(name);
  }

  public String getName() {
    return name;
  }

}
