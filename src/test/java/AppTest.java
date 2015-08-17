import org.fluentlenium.adapter.FluentTest;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {

  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  // ~~INTEGRATION TESTING~~
  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Input three lengths");
  }

  @Test
  public void newPage_equilateral() {
    goTo("http://localhost:4567/");
    fill("#userSideA").with("4");
    fill("#userSideB").with("4");
    fill("#userSideC").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("equilateral");
  }

  @Test
  public void newPage_isosceles() {
    goTo("http://localhost:4567/");
    fill("#userSideA").with("5");
    fill("#userSideB").with("5");
    fill("#userSideC").with("7");
    submit(".btn");
    assertThat(pageSource()).contains("isosceles");
  }

  @Test
  public void newPage_scalene() {
    goTo("http://localhost:4567/");
    fill("#userSideA").with("3");
    fill("#userSideB").with("4");
    fill("#userSideC").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("scalene");
  }

  @Test
  public void newPage_notTriangle() {
    goTo("http://localhost:4567/");
    fill("#userSideA").with("2");
    fill("#userSideB").with("2");
    fill("#userSideC").with("8");
    submit(".btn");
    assertThat(pageSource()).contains("not a triangle");
  }

  @Test
  public void newPage_notNumbers() {
    goTo("http://localhost:4567/");
    fill("#userSideA").with("a");
    fill("#userSideB").with("b");
    fill("#userSideC").with("c");
    submit(".btn");
    assertThat(pageSource()).contains("try again");
  }
}
