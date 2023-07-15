package steps;

import pages.*;
import utils.CommonMethods;
import utils.CommonMethods;

public class PageInitializer  {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AddEmployeePage addEmployeePage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddMembershipPage addMembershipPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        addEmployeePage = new AddEmployeePage();
        employeeSearchPage = new EmployeeSearchPage();
        addMembershipPage=new AddMembershipPage();
    }
}
