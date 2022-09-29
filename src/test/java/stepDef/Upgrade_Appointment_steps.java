package stepDef;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CSE_Registration_SignIn_page;
import pageObject.Upgrade_Appointments_page;
import pageObject.Upgrade_Registration_SignIn_page;
import pageObject.Upgrade_SavedDeals_page;

public class Upgrade_Appointment_steps {
        TestContext testContext;
        Upgrade_Registration_SignIn_page Upgrade_SignIn;
        Upgrade_Appointments_page Upgrade_Appointment;
        CSE_Registration_SignIn_page CSE;
        Upgrade_SavedDeals_page Upgrade_SavedDeals;
        public Upgrade_Appointment_steps(TestContext context) {
            testContext = context;
            Upgrade_SignIn = context.getPageObjectManager().getUpgrade_page();
            CSE = context.getPageObjectManager().getCsEcommercePage();
            Upgrade_Appointment = context.getPageObjectManager().getUpgrade_Appointments_page();
            Upgrade_SavedDeals = context.getPageObjectManager().getUpgrade_SavedDeals_page();
        }
    @And("the Upgrade user login to the account")
    public void theUserSignIntoUP() {
        CSE.clickOnSignInHereLink();
        Upgrade_SignIn.upLoginEnterEmail();
        Upgrade_SignIn.upEnterValidPassword();
        CSE.cseClickSignInButton("Sign In");
        //Upgrade_Appointment.upClickMyGarage();
    }
    @And("the user clicks on {string}")
    public void theUserClicksOn(){Upgrade_Appointment.upMyGarageHamburgerBtn();
    }
    @When("the user clicks on my appointments link from the left nev in Upgrade")
    public void theUserClicksOnLinkFromTheLeftNevInUP(){Upgrade_Appointment.upClickMyAppointments();
    }
    @Then("the user should verify no appointment found message")
    public void theUserShouldVerify(){Upgrade_Appointment.verifyNoAppointments();
    }
    @When("the Upgrade user selects vehicle and schedules test drive")
    public void theUserSelectsVehicleAndSchedulesTestDrive() {
        Upgrade_Appointment.upPopUp1();
        Upgrade_Appointment.upCar1();
        Upgrade_Appointment.upPopUp2();
        Upgrade_Appointment.upOfferDetails();
        Upgrade_SavedDeals.upUserIncomeBirthYearInfo();
        Upgrade_SavedDeals.upOfferCloseBtn();
        Upgrade_Appointment.upPopUp1();
        Upgrade_Appointment.upTestDrive();
        Upgrade_Appointment.upCalenderClick();
        Upgrade_Appointment.upAppointmentDate();
        Upgrade_Appointment.upAppointmentTime();
        Upgrade_Appointment.upSendBtn();
    }
    @And("the Upgrade user clicks on my garage from the hamburger menu")
    public void theUserClicksOnMyGarageFromHamburgerMenu() {
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
    }
    @Then("the user should verify appointment is scheduled")
    public void theUserShouldVerifyMessageInUP(){
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
        Upgrade_Appointment.upClickMyAppointments();
    }
    @And("the user clicks on my appointments link from the left nev")
    public void theUserClicksOnLinkFromTheLeftNev(){
        Upgrade_SignIn.upLoginEnterEmail();
        Upgrade_SignIn.upEnterValidPassword();
        CSE.cseClickSignInButton("Sign In");
        Upgrade_SignIn.UpWelcomeBackPageWithHardCodeFirstName();
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_SignIn.upShowNewCarsHamburgerBtn();
        Upgrade_Appointment.upPopUp1();
        Upgrade_Appointment.upCar1();
        Upgrade_Appointment.upPopUp2();
        Upgrade_Appointment.upOfferDetails();
        Upgrade_Appointment.upPopUp1();
        Upgrade_Appointment.upTestDrive();
        Upgrade_Appointment.upCalenderClick();
        Upgrade_Appointment.upAppointmentDate();
        Upgrade_Appointment.upAppointmentTime();
        Upgrade_Appointment.upSendBtn();
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
        Upgrade_Appointment.upClickMyAppointments();
    }
    @When("the user clicks on get directions link from my appointments")
    public void theUserClicksOnLinkFromMyAppointments(){Upgrade_Appointment.upGetDirectionBtn();
    }
    @When("the user clicks on view details link on my appointments")
    public void theUserClicksOnLinkOnMyAppointments(){Upgrade_Appointment.upViewDetailsBtn();
    }
    @Then("the user copy deal and saves the deal")
    public void theUserCopyDealAndSavesTheDeal() {
        Upgrade_Appointment.upCopyDealBtn();
        Upgrade_Appointment.upDealName();
        Upgrade_Appointment.upConfirmBtn();
        Upgrade_Appointment.upVerifyDealName();
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
        Upgrade_Appointment.upMySavedDealsBtn();
    }
    @Then("the user should be navigated to google map page")
    public void theUserShouldBeNavigatedToGoogleMapPage(){Upgrade_Appointment.upVerifyLandedOnGoogleMap();
    }
}