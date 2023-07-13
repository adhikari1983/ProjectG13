package steps;

import Utils.CommonMethods;
import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializer extends CommonMethods {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;

    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeSearchPage = new EmployeeSearchPage();
    }
}
