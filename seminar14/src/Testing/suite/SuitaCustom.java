package Testing.suite;

import Testing.PachetTuristicTest;
import Testing.PersoanaTest;
import Testing.suite.categorii.TestErrorConditions;
import Testing.suite.categorii.TestRange;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({TestRange.class})
@Categories.ExcludeCategory({TestErrorConditions.class})
public class SuitaCustom {
}
