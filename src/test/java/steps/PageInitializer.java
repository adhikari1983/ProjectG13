package steps;

import pages.*;
import utils.CommonMethods;
import utils.CommonMethods;

public class PageInitializer {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddPersonalDetails addPersonalDetails;
    public static AddMembershipPage addMembershipPage;
    public static EmployeeWorkExperiencePage employeeWorkExperiencePage;
    public static AddLanguageProficiencyPage addLanguageProficiencyPage;

    public static JobPage jobPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeSearchPage = new EmployeeSearchPage();
        addPersonalDetails = new AddPersonalDetails();
        addMembershipPage = new AddMembershipPage();
        employeeWorkExperiencePage = new EmployeeWorkExperiencePage();
        addLanguageProficiencyPage = new AddLanguageProficiencyPage();
        jobPage = new JobPage();
    }
}
