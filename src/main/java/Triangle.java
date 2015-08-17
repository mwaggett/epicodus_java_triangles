public class Triangle {

  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle(int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public boolean isTriangle() {
    return ((mSideA + mSideB > mSideC) && (mSideB + mSideC > mSideA)
              && (mSideA + mSideC > mSideB));
  }

  public boolean isEquilateralTriangle() {
    if (isTriangle()) {
      return ((mSideA == mSideB) && (mSideB == mSideC));
    } else {
      return false;
    }
  }

  public boolean isIsoscelesTriangle() {
    if (isTriangle()) {
      if (isEquilateralTriangle()) {
        return false;
      } else {
        return ((mSideA == mSideB) || (mSideB == mSideC)
                || (mSideC == mSideA));
      }
    } else {
      return false;
    }
  }

  public boolean isScaleneTriangle() {
    if (isTriangle()) {
      if ((isEquilateralTriangle()) || (isIsoscelesTriangle())) {
        return false;
      } else {
        return true;
      }
    } else {
      return false;
    }
  }

  public String whatKindOfTriangle() {
    if (isEquilateralTriangle()) {
      return "Your triangle is equilateral!";
    } else if (isIsoscelesTriangle()) {
      return "Your triangle is isosceles!";
    } else if (isScaleneTriangle()) {
      return "Your triangle is scalene!";
    } else {
      return "That is not a triangle!";
    }
  }


}
