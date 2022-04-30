package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeSearchPage extends CommonMethods {

    @FindBy(id= "menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(id= "menu_pim_viewEmployeeList")
    public WebElement employeeList;

    @FindBy(id= "empsearch_id")
    public WebElement employeeID;

    @FindBy(id= "searchBtn")
    public WebElement searchButton;

    @FindBy(id= "empsearch_employee_name_empName")
    public WebElement employeeName;

    public EmployeeSearchPage (){
        PageFactory.initElements(driver, this);
    }


}
