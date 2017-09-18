package testjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ GraphGeneratorTest.class, GraphGeneratorTestVerticeCount.class })

public class AllTests {}
