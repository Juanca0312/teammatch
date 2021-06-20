package com.teammatch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AchivementRewards {
    private boolean loggedIn;
    private int completed;
    private int numberOfRequirements;
    private String rewardMsg;

    private boolean achievementClick;
    private String achievementResponse;

    @Given("I have {} logged in to my account")
    public void iHaveLoggedInLoggedInToMyAccount(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    @When("I complete {int} all {int} requirements for an achievement")
    public void iCompleteCompletedAllNumberOfRequirementsRequirementsForAnAchievement(int completed, int numberofRequirements) {
        this.completed = completed;
        this.numberOfRequirements = numberofRequirements;
    }

    @Then("I should see a reward available {string}")
    public void iShouldSeeARewardAvailableMessage(String rewardMsg) {
        if (this.loggedIn){
            if ( this.completed == this.numberOfRequirements){
                this.rewardMsg = "Achievement complete. Reward available!";
            } else this.rewardMsg = "No response";
        } else this.rewardMsg = "No response";
        assertEquals(this.rewardMsg, rewardMsg);
    }

    @Given("I am viewing my profile")
    public void iAmViewingMyProfile() {
    }

    @When("I click {} on the See achievements section")
    public void iClickClickOnTheSeeAchievementsSection(boolean achievementClick) {
        this.achievementClick = achievementClick;
    }

    @Then("I should see a {string} Achievements response screen")
    public void iShouldSeeAResponseAchievementsResponseScreen(String achievementResponse) {
        if (this.achievementClick){
            this.achievementResponse = "Achievement progress:";
        } else
            this.achievementResponse = "No response";
        assertEquals(this.achievementResponse, achievementResponse);
    }
}
