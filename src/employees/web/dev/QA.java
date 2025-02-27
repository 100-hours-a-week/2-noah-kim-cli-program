package employees.web.dev;

import employees.web.Developer;
import java.util.List;

public class QA extends Developer {

  private static String role = "Quality-Assurance";

  private int testingLevel;
  private int bugTrackingLevel;

  public QA(int salary, int experienceYears, String domain, int communationLevel,
      List<String> stacks, int testingLevel, int bugTrackingLevel) {
    super(salary, experienceYears, domain, communationLevel, stacks);
    this.testingLevel = testingLevel;
    this.bugTrackingLevel = bugTrackingLevel;
  }

  public int getTestingLevel() {
    return testingLevel;
  }

  public void setTestingLevel(int testingLevel) {
    this.testingLevel = testingLevel;
  }

  public int getBugTrackingLevel() {
    return bugTrackingLevel;
  }

  public void setBugTrackingLevel(int bugTrackingLevel) {
    this.bugTrackingLevel = bugTrackingLevel;
  }

}
