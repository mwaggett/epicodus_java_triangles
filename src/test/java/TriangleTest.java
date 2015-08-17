import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_whenTriangle_true() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle.isTriangle());
  }

  @Test
  public void isTriangle_whenNotTriangle_false() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isTriangle());
  }

  @Test
  public void isEquilateralTriangle_whenAllSidesEqual_true() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(true, testTriangle.isEquilateralTriangle());
  }

  @Test
  public void isEquilateralTriangle_whenSidesNotEqual_false() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(false, testTriangle.isEquilateralTriangle());
  }

  @Test
  public void isEquilateralTriangle_whenSidesAreZero_false() {
    Triangle testTriangle = new Triangle(0, 0, 0);
    assertEquals(false, testTriangle.isEquilateralTriangle());
  }

  @Test
  public void isIsoscelesTriangle_whenTwoSidesEqual_true() {
    Triangle testTriangle = new Triangle(3, 3, 5);
    assertEquals(true, testTriangle.isIsoscelesTriangle());
  }

  @Test
  public void isIsoscelesTriangle_whenThreeSidesEqual_false() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(false, testTriangle.isIsoscelesTriangle());
  }

  @Test
  public void isIsoscelesTriangle_whenNoSidesEqual_false() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(false, testTriangle.isIsoscelesTriangle());
  }

  @Test
  public void isScaleneTriangle_whenNoSidesEqual_true() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals(true, testTriangle.isScaleneTriangle());
  }

  @Test
  public void isScaleneTriangle_whenTwoSidesEqual_false() {
    Triangle testTriangle = new Triangle(3, 3, 5);
    assertEquals(false, testTriangle.isScaleneTriangle());
  }

  @Test
  public void isScaleneTriangle_whenAllSidesEqual_false() {
    Triangle testTriangle = new Triangle(3, 3, 3);
    assertEquals(false, testTriangle.isScaleneTriangle());
  }

  @Test
  public void isScaleneTriangle_whenNotTriangle_false() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals(false, testTriangle.isScaleneTriangle());
  }

  @Test
  public void whatKindOfTriangle_equilateral() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals("Your triangle is equilateral!", testTriangle.whatKindOfTriangle());
  }

  @Test
  public void whatKindOfTriangle_isosceles() {
    Triangle testTriangle = new Triangle(5, 5, 7);
    assertEquals("Your triangle is isosceles!", testTriangle.whatKindOfTriangle());
  }

  @Test
  public void whatKindOfTriangle_scalene() {
    Triangle testTriangle = new Triangle(3, 4, 5);
    assertEquals("Your triangle is scalene!", testTriangle.whatKindOfTriangle());
  }

  @Test
  public void whatKindOfTriangle_notTriangle() {
    Triangle testTriangle = new Triangle(2, 2, 8);
    assertEquals("That is not a triangle!", testTriangle.whatKindOfTriangle());
  }



}
