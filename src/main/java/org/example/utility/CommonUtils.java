package org.example.utility;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.checks.All;
import org.example.checks.Pojo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface CommonUtils {
    public static final String BAT_FILE_PATH = "src/main/resources/learnToProgram/startup.bat";

    public static List<CommonUtils> modelMultipleCommonUtils() {
        List<CommonUtils> commonUtilsList = new ArrayList<CommonUtils>();
        commonUtilsList.add(new All()); // position 0 - 2 raise power 0
        commonUtilsList.add(new All()); // position 1 - 2 raise power 1
        commonUtilsList.add(new All()); // position 2 - 2 raise power 2
        return commonUtilsList;
    }

    public static Pojo getDatFromJson(String jsonFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(jsonFile), Pojo.class);
    }
}
