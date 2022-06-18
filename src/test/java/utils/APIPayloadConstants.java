package utils;

public class APIPayloadConstants {

    public static String createEmployeePayload(){
        String createEmployee = "{\n" +
                "  \"emp_firstname\": \"Jim\",\n" +
                "  \"emp_lastname\": \"Pam\",\n" +
                "  \"emp_middle_name\": \"MS\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"1989-08-16\",\n" +
                "  \"emp_status\": \"Full Time\",\n" +
                "  \"emp_job_title\": \"Supervisor\"\n" +
                "}";

        return createEmployee;
    }



}
