package test.java.runners;

import com.intuit.karate.junit5.Karate;

class TestRunner {

  /**
   * Run any particular test case with tags and feature file name.
   */
  @Karate.Test
  Karate testTags() {
    return Karate.run("classpath:features").tags("@TestUI1").relativeTo(getClass());
  }

  /**
   * Run all the test cases of all the feature files.
   */
  /*
   * @Karate.Test Karate testAll() { return Karate.run().relativeTo(getClass()); }
   */

}
