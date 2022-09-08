package stepdefination;

import com.summer.action.HomepageAction;
import com.summer.utility.summer_baseparent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class contactsummer extends summer_baseparent {
	HomepageAction HomepageActionb= new HomepageAction();
	
	@Given("^Launch \"([^\"]*)\" for demoblaze$")
	public void launch_for_demoblaze(String URL) throws Throwable {
		getURL(URL);
		
	}

	@Then("^Click contact link$")
	public void click_contact_link() throws Throwable {
		HomepageActionb.Clickcontactlink();
		
	    
	}

	@Then("^Insert Contact email in contact email field and contact name on contact name field$")
	public void insert_Contact_email_in_contact_email_field_and_contact_name_on_contact_name_field() throws Throwable {
	    
	}

	@Then("^Type messasge in send message box$")
	public void type_messasge_in_send_message_box() throws Throwable {
	    
	}

}
