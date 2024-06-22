package org.example.utils;

import io.cucumber.java.*;
import org.example.utilities.Logs;

public class GlobalHooks {

    @BeforeAll
    public static void beforeAllHook(){
        Logs.info("Yo me ejecuto al inicio de todo");
    }

    @Before
    public static void beforeHook(){
        Logs.info("Yo me ejecuto al inicio de cada scenario ");
    }
    @After
    public static void afterHook(Scenario scenario){
        Logs.info("Yo me ejecuto al final de cada sceneario %s ", scenario.getStatus());
    }
    @AfterAll
    public static void afterAllHook(){
        Logs.info("Yo me ejecuto al final de todo ");
    }
}
