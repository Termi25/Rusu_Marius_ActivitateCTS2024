package Testing.suite;

import Testing.PachetTuristicTest;
import Testing.PersoanaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
public class SuitaCompleta {
}
