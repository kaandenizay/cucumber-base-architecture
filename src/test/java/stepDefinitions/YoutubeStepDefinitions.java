package stepDefinitions;

import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.YoutubePage;
import utils.Utils;

import static config.ConfigurationManager.configuration;
public class YoutubeStepDefinitions {

    final YoutubePage youtubePage = new YoutubePage(DriverManager.getThreadDriver());
    @Given("Go to Youtube Page")
    public void userGoesYoutubePage(){
        Utils.goPage(configuration().youtubeUrl());
        System.out.println("Youtube Page is opened");
    }

    @When("User types {string} to search box on Youtube")
    public void userTypesToSearchBox(String text) {
        youtubePage.searchByText(text);
    }


    @And("User clicks the video after search")
    public void userClicksTheVideoAfterSearch() {
        youtubePage.clickVideo();
    }


}
