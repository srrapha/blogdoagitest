package utils;

import com.github.javafaker.Faker;

public class DataFaker extends Setup{

    public static String getSearchValueRandom() { return brFk.regexify("[A-Z0-9]{10}"); }

}
