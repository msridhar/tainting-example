/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tainting;

import org.checkerframework.checker.optional.qual.Present;
import org.checkerframework.checker.tainting.qual.PolyTainted;
import org.checkerframework.checker.tainting.qual.Tainted;
import org.checkerframework.checker.tainting.qual.Untainted;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TaintExample {
  public boolean someLibraryMethod() {
    return true;
  }

  void execute(@Untainted String s) {}

//  void stringRef(@Untainted String ref) {
//    execute(ref.substring(3, 5)); // error
//  }

  void testRCE(@Tainted String s) throws IOException {
    Runtime.getRuntime().exec(s);
//    ProcessBuilder p = new ProcessBuilder(s);
//    p = new ProcessBuilder(Arrays.asList(s));
//    List<@Untainted String> l = new ArrayList<>();
//    l.add(s);
//    p = new ProcessBuilder(l);
  }
//
//  @PolyTainted String id(@PolyTainted String input) {
//    return input;
//  }
//
//  void usePoly(String ref) {
//    execute(id("untainted"));
//    execute(id(ref));
//  }

//  void testList(String ref) {
//    List<@Untainted String> l = new ArrayList<>();
//    l.add(ref);
//  }

//  void useOptional() {
//    Optional<String> opt = Optional.empty();
//    if (opt.isPresent()) {
//      opt.get();
//    }
//  }
}
