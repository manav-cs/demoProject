package stepDef;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.*;

public class Upgrade_Recently_Viewed_steps {
    TestContext testContext;
    Upgrade_Registration_SignIn_page Upgrade_SignIn;
    CSE_Garage_Saved_Deals_page CSESD;
    Upgrade_Appointments_page Upgrade_Appointment;
    Upgrade_SavedDeals_page Upgrade_SavedDeals;
    Upgrade_Recently_Viewed_page Upgrade_RecentlyViewed;

    public Upgrade_Recently_Viewed_steps(TestContext context) {
        testContext = context;
        Upgrade_SignIn = context.getPageObjectManager().getUpgrade_page();
        Upgrade_Appointment = context.getPageObjectManager().getUpgrade_Appointments_page();
        Upgrade_SavedDeals = context.getPageObjectManager().getUpgrade_SavedDeals_page();
        CSESD = context.getPageObjectManager().getCseSavedDealsPage();
        Upgrade_RecentlyViewed = context.getPageObjectManager().getUpgrade_Recently_Viewed_page();
    }
    @Then("the Upgrade user doesn't see any vehicle in the recently viewed vehicles")
    public void theUpgradeUserDoesnTSeeAnyVehicleInTheRecentlyViewedVehicles() {
        Upgrade_RecentlyViewed.upVerifyNoVehicle();
    }
    @And("the Upgrade user clicks on shop new cars")
    public void theUpgradeUserClicksOnShopNewCars() {
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_SignIn.upShowNewCarsHamburgerBtn();
        Upgrade_Appointment.upPopUp1();
        Upgrade_Appointment.upCar1();
        Upgrade_Appointment.upPopUp2();
    }
    @When("the Upgrade user returns to recently viewed vehicles")
    public void theUpgradeUserReturnsToRecentlyViewedVehicles() {
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
    }
    @Then("the Upgrade user can see the most recently viewed vehicle")
    public void theUpgradeUserCanSeeTheMostRecentlyViewedVehicle() {
        Upgrade_RecentlyViewed.upVerifyViewDeal();
        Upgrade_RecentlyViewed.upVerifyStockType();
        Upgrade_RecentlyViewed.upVerifyMilage();
        Upgrade_RecentlyViewed.upVerifyColor();
        Upgrade_RecentlyViewed.upVerifyDealer();
    }
    @When("the Upgrade user returns to recently viewed vehicles to save vehicle")
    public void theUpgradeUserReturnsToRecentlyViewedVehiclesToSaveVehicle() {
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
        Upgrade_SavedDeals.upViewDealBtn();
        Upgrade_SavedDeals.upUserIncomeBirthYearInfo();
        Upgrade_SavedDeals.upOfferCloseBtn();
        Upgrade_SavedDeals.upSaveBtn();
        Upgrade_SavedDeals.upClearDealName();
        Upgrade_Appointment.upDealName();
        Upgrade_Appointment.upConfirmBtn();
    }
    @Then("the Upgrade user verifies vehicle is saved to the saved vehicle section")
    public void theUpgradeUserVerifiesVehicleIsSavedToTheSavedVehicleSection() {
        Upgrade_SignIn.upHamburgerBtn();
        Upgrade_Appointment.upMyGarageHamburgerBtn();
        Upgrade_Appointment.upVerifyMyGarage();
        Upgrade_RecentlyViewed.upVerifySavedDeals();
        Upgrade_SavedDeals.upNewVerify();
        Upgrade_SavedDeals.upVerifyDealNameInSavedDeals();
        Upgrade_RecentlyViewed.upRecentlyViewedVehicleBtn();

    }
    @When("the Upgrade user deletes the recently viewed vehicle")
    public void theUpgradeUserDeletesTheRecentlyViewedVehicle() {
        CSESD.cseMyGarageSavedDealDeleteDeal();
    }
}
