package br.com.cwi.apitestcwiresetqa.utils;

public class Utils {
    public static String getSchemaBasePath (String pack, String nameSchema){
        return System.getProperty("user.dir")
                + "/src/test/java/br/com/cwi/apitestcwiresetqa/tests/"
                + pack
                + "/schema/"
                + nameSchema
                + ".json";
    }
}
