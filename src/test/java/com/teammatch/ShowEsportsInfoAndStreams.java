package com.teammatch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowEsportsInfoAndStreams {
    private boolean click;
    private String response;

    private boolean esports;
    private boolean clickStreams;
    private String responseStreams;

    @Given("I am in the website")
    public void iAmInTheWebsite() {
    }

    @When("I {} the Esports section")
    public void iClickTheEsportsSection(boolean click) {
        this.click = click;
    }

    @Then("I should see a {string} Esports Information screen")
    public void iShouldSeeAResponseEsportsInformationScreen(String response) {
        if (this.click) {
            this.response = "Welcome to the Esports information and streams page!";
        } else {
            this.response = "No response";
        }
        assertEquals(this.response, response);
    }

    @Given("I am in the {} section")
    public void iAmInTheEsportsSection(boolean esports) {
        this.esports = esports;
    }

    @When("I {} the Streams section")
    public void iClickTheStreamsSection(boolean clickStreams) {
        this.clickStreams = clickStreams;
    }

    @Then("I should see a {string} Livestreams response screen")
    public void iShouldSeeAResponseLivestreamsResponseScreen(String responseStreams) {
        if (this.esports && this.clickStreams) {
            this.responseStreams = "You can choose to watch any of the following streams:";
        } else {
            this.responseStreams = "No response";
        }
        assertEquals(this.responseStreams, responseStreams);
    }
}
