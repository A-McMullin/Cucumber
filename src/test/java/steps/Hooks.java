package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(Scenario scenario){
        byte[] pic;
        //Scenario class from cucumber holds the complete information of our execution
        if(scenario.isFailed()){
           pic = takeScreenShot("failed/"+ scenario.getName());
        } else {
           pic = takeScreenShot("passed/" + scenario.getName());
        }

        //It will attach the pic in the report
        scenario.attach(pic, "image/png", scenario.getName());


        tearDown();
    }

}

