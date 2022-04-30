package steps;

import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializers {

    public static LoginPage login;
    public static EmployeeSearchPage EmpSearchPage;

    public static void initializePageObjects() {
        login = new LoginPage();
        EmpSearchPage = new EmployeeSearchPage();
    }



}
