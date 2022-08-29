package com.neurotrack.automation.API.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.neurotrack.automation.base.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIValidation extends BaseTest {

	@Test
	public void getUserDetails() throws IOException, InterruptedException {

		RestAssured.baseURI = "https://randomuser.me/api/";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "");

		System.out.println("Status code received => " + response.getStatusCode());
		test.log(Status.INFO, "Response=>" + response.prettyPrint());
	}

	@Test
	public void verifyStatusCode() throws IOException, InterruptedException {

		RestAssured.baseURI = "https://randomuser.me/api/";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "");
		System.out.println("Status code received => " + response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		test.log(Status.PASS, "API return 200 Status code");

	}

	@Test
	public void verifyFirstNameNotNull() throws IOException, InterruptedException {

		RestAssured.baseURI = "https://randomuser.me/api/";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET, "");

		JsonPath jsonPathEvaluator = response.jsonPath();

		System.out.println(jsonPathEvaluator.getString("results[0].name.first"));
		Assert.assertNotNull(jsonPathEvaluator.getString("results[0].name.first"));
		test.log(Status.PASS, "In API response first name is not null");

	}

}
