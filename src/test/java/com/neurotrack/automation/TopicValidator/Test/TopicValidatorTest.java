package com.neurotrack.automation.TopicValidator.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import com.neurotrack.automation.base.BaseTest;
import com.neurotrack.automation.pageobjects.NeurotrackHomePage;
import com.neurotrack.automation.pageobjects.ResourcesPage;

public class TopicValidatorTest extends BaseTest{
	
	NeurotrackHomePage neurotrackHomePage;
	ResourcesPage resourcesPage;

	@Test
	public void topicValidationTest() throws IOException, InterruptedException {

		neurotrackHomePage = webPageGenerator.GetInstance(NeurotrackHomePage.class);
		resourcesPage = webPageGenerator.GetInstance(ResourcesPage.class);
		neurotrackHomePage.clickOnMenu("Resources");
		test.log(Status.INFO, "Resources menu clicked.");
		test.log(Status.INFO, "Total Number of topics:- " + String.valueOf(resourcesPage.countNumberofTopics()));
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Cognitive Science","Cognitive Science");
		test.log(Status.PASS, "Clicking on Cognitive Science open Cognitive Science page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Building Habits","Building Habits");
		test.log(Status.PASS, "Clicking on Building Habits open Building Habits page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Nutrition","Nutrition");
		test.log(Status.PASS, "Clicking on Nutrition open Nutrition page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Exercise","Exercise");
		test.log(Status.PASS, "Clicking on Exercise open Exercise page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Sleep","Sleep");
		test.log(Status.PASS, "Clicking on Sleep open Sleep page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Social Engagement","Social Engagement");
		test.log(Status.PASS, "Clicking on Social Engagement open Social Engagement page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Stress Management","Stress Management");
		test.log(Status.PASS, "Clicking on Stress Management open Stress Management page.");
		
		resourcesPage.verifyPagenameIsEqualtoTopicName("Cognitive Training","Cognitive Training");
		test.log(Status.PASS, "Clicking on Cognitive Training open Cognitive Training page.");
	}
}
