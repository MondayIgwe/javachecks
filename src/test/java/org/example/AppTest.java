package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.checks.All;
import org.example.checks.Box;
import org.example.checks.Pojo;
import org.example.utility.CommonUtils;
import org.example.utility.RunBatFile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    All all;

    @BeforeMethod
    public void setUp() {
        all = new All();
    }



    @Test
    public void testJsonData() throws IOException {
        Pojo pojo = CommonUtils.getDatFromJson("src/main/resources/learnToProgram/person.json.json");
        System.out.println(pojo.getName());
    }

    @Test
    public void testBoxApp() throws IOException {
        Box box = new Box();
        Box.cost = 2000.0;
        box.reduceCost();
        box.accessCost();

    }

    @Test(invocationCount = 1)
    public void testAppOne() throws Exception {
        RunBatFile.execute();
        All.runData();
        List<CommonUtils> commonUtilsList = CommonUtils.modelMultipleCommonUtils();
        boolean isContained = commonUtilsList.contains(all) ? true : false;
        System.out.println(isContained);
    }

    @Test
    public void testAppTwo() {

    }

    @Test
    public void testAppThree() {

    }

    @Test
    public void testAppFour() {

    }
}
