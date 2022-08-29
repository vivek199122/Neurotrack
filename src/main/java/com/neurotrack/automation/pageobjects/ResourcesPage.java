package com.neurotrack.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.neurotrack.automation.base.BasePage;

public class ResourcesPage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(ResourcesPage.class);

	By searchTextBox = By.name("q");
	By googleSearchButton = By.name("btnK");
	By topics = By.xpath("//div[@class='flex flex-wrap -mx-4 w-full']//a");
	By pageTitle = By.xpath("//h1");

	public ResourcesPage(WebDriver driver) {
		super(driver);
	}

	public int countNumberofTopics() {
		return driver.findElements(topics).size();
	}

	public void verifyPagenameIsEqualtoTopicName(String topicName, String pageName) {

		driver.findElement(
				By.xpath("//div[@class='flex flex-wrap -mx-4 w-full']//a//h3[contains(text(),'" + topicName + "')]"))
				.click();
		
		System.out.println(driver.findElement(pageTitle).getText());
		Assert.assertEquals(driver.findElement(pageTitle).getText(),pageName);
	}

}
