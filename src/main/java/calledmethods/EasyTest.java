package calledmethods;

import org.checkerframework.checker.calledmethods.qual.CalledMethods;

public class EasyTest {

  void a() {}

  void b(@CalledMethods("a") EasyTest this) {}

  static void test() {
    EasyTest e = new EasyTest();
    e.a(); // comment out this line to see the error
    e.b();
  }
}
