package org.example.utilities;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected SoftAssert softAssert;
    protected final String regression = "regression";
    protected final String smoke = "smoke";
    protected final String funcional = "funcional";

    @BeforeMethod
    public void masterSetUp() {


    }
}
