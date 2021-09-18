package com.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/coinmarket/features/",
                 glue = {"com.coinmarket.stepDefs","utils"}
                 )
public class CoinMarketRunner {
}
