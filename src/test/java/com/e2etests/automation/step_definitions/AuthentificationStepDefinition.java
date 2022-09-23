package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthentificationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	public WebDriver driver;
	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();

	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		authentificationPage.goToUrl();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authentificationPage.fillUserName(name);

	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authentificationPage.fillPassword(password);

	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentificationPage.clickOnBtnSubmit();

	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.message.getText();
		Assert.assertEquals(text, message);

	}

}
