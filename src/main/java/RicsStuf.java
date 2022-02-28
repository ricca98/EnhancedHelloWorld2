public class RicsStuf {

  private String name;


  public RicsStuf(String name) {
    this.name = name;
  }

  public String doComlicatedStuff() {
    return HelloWorld.hello(name);
  }


  public String getName() {
    return name;
  }

}
