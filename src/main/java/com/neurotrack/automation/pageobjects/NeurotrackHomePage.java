package com.neurotrack.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neurotrack.automation.base.BasePage;



public class NeurotrackHomePage extends BasePage {

	private static final Logger logger = LoggerFactory.getLogger(NeurotrackHomePage.class);

	By searchTextBox = By.name("q");
	By googleSearchButton = By.name("btnK");

	public NeurotrackHomePage(WebDriver driver) {
		super(driver);
	}

	public void clickOnMenu(String menu) {
		driver.findElement(By.xpath("//nav[@class='app-nav']//li//p[text()='"+menu+"']")).click();
		logger.info(menu +" menu clicked.");
	}
}
