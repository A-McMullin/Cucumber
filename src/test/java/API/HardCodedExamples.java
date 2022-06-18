package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HardCodedExamples {

    String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NTUyNDg1NDMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY1NTI5MTc0MywidXNlcklkIjoiMzc5NiJ9.dT7LDs0hSweVyOO4O5Q0t_kOrTI4bHLbo3i8XtPXfnA";
    static String employee_id;

    @Test
    public void createEmployee(){

        RequestSpecification request = given().header("Content-Type", "application/json").
                header("Authorization", token).body("{\n" +
                        "  \"emp_firstname\": \"Jim\",\n" +
                        "  \"emp_lastname\": \"Pam\",\n" +
                        "  \"emp_middle_name\": \"MS\",\n" +
                        "  \"emp_gender\": \"F\",\n" +
                        "  \"emp_birthday\": \"1988-06-11\",\n" +
                        "  \"emp_status\": \"Full Time\",\n" +
                        "  \"emp_job_title\": \"Dev\"\n" +
                        "}");

                Response response = request.when().post("/createEmployee.php");
                //response.prettyPrint();
                response.then().assertThat().statusCode(201);

                response.then().assertThat().body("Message", equalTo("Employee Created"));
                response.then().assertThat().body("Employee.emp_firstname", equalTo("Jim"));

                employee_id=response.jsonPath().getString("Employee.employee_id");
                System.out.println(employee_id);
    }
    @Test
    public void getCreatedEmployee(){
        RequestSpecification request = given().header("Content-Type", "application/json").
                header("Authorization", token).queryParam("employee_id",employee_id);

        Response response = request.when().get("/getOneEmployee.php");
        response.prettyPrint();

        response.then().assertThat().statusCode(200);
        String tempId = response.jsonPath().getString("employee.employee_id");
        System.out.println(tempId);
        Assert.assertEquals(tempId,employee_id);

    }
}
