package com.omaisss.pmsclient.restcontrollers;

import java.util.List;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.omaisss.pmsclient.restdomainobjects.GuestProfileVO;
import com.omaisss.pmsclient.restentity.GuestAddress;
import com.omaisss.pmsclient.restentity.GuestMembership;
import com.omaisss.pmsclient.restentity.GuestPaymentCard;
import com.omaisss.pmsclient.restentity.GuestPreferences;
import com.omaisss.pmsclient.restentity.GuestProfile;
import com.omaisss.pmsclient.restservices.GuestAddressService;
import com.omaisss.pmsclient.restservices.GuestMembershipService;
import com.omaisss.pmsclient.restservices.GuestPaymentCardService;
import com.omaisss.pmsclient.restservices.GuestPreferencesService;
import com.omaisss.pmsclient.restservices.GuestProfileService;

@RestController
@CrossOrigin
@RequestMapping("/api/pms/guestController")
public class GuestRestController {

	@Autowired
	private GuestProfileService guestProfileService;

	@Autowired
	private GuestAddressService guestAddressService;

	@Autowired
	private GuestMembershipService guestMembershipService;

	@Autowired
	private GuestPaymentCardService guestPaymentCardService;

	@Autowired
	private GuestPreferencesService guestPreferencesService;
	
	/*
	@Autowired
	private RoomMasterService roomMasterService;
	*/
	// --------------------Guest Address------------------------//

	@GetMapping("/getGuestAddresses")
	public List<GuestAddress> getGuestAddress() {
		//System.out.println("GuestAddress Customers Get Mapping Method");
		return guestAddressService.getGuestAddress();
	}

	@GetMapping("/getGuestAddress/{guestAddressId}")
	public GuestAddress getGuestAddress(@PathVariable String guestAddressId) {
		//System.out.println("GuestAddress Get Mapping Method using Room Number");
		GuestAddress guestAddress = guestAddressService.getGuestAddress(guestAddressId);
		return guestAddress;
	}

	@PostMapping("/postGuestAddress")
	public GuestAddress addGuestAddress(@RequestBody GuestAddress guestAddress) {
		//System.out.println("GuestAddress Post Mapping Method");
		guestAddressService.saveGuestAddress(guestAddress);

		return guestAddress;
	}

	@PutMapping("/updateGuestAddress")
	public GuestAddress updateGuestAddress(@RequestBody GuestAddress guestAddress) {
		//System.out.println("GuestAddress Put Mapping Method");
		guestAddressService.saveGuestAddress(guestAddress);
		return guestAddress;
	}

	@DeleteMapping("/deleteGuestAddress/{guestAddressId}")
	public String deleteGuestAddress(@PathVariable String guestAddressId) {
		//System.out.println("GuestAddress Delete Mapping Method");
		guestAddressService.deleteGuestAddress(guestAddressId);
		return "Delete Guest Address id :" + guestAddressId;
	}
//--------------------Guest Membership------------------------//

	@GetMapping("/getGuestMemberships")
	public List<GuestMembership> getGuestMembership() {
		//System.out.println("Customers Get Mapping Method");
		return guestMembershipService.getGuestMembership();
	}

	@GetMapping("/getGuestMembership/{guestMembershipId}")
	public GuestMembership getGuestMembership(@PathVariable String guestMembershipId) {
		//System.out.println("GuestMembership Get Mapping Method using Id");
		GuestMembership guestMembership = guestMembershipService.getGuestMembership(guestMembershipId);
		return guestMembership;
	}

	@PostMapping("/postGuestMembership")
	public GuestMembership addGuestMembership(@RequestBody GuestMembership guestMembership) {
		//System.out.println("GuestMembership Post Mapping Method");
		guestMembershipService.saveGuestMembership(guestMembership);

		return guestMembership;
	}

	@PutMapping("/updateGuestMembership")
	public GuestMembership updateGuestMembership(@RequestBody GuestMembership guestMembership) {
		//System.out.println("GuestMembership Put Mapping Method");
		guestMembershipService.saveGuestMembership(guestMembership);
		return guestMembership;
	}

	@DeleteMapping("/deleteGuestMembership/{guestMembershipId}")
	public String deleteGuestMembership(@PathVariable String guestMembershipId) {
		//System.out.println("GuestMembership Delete Mapping Method");
		guestMembershipService.deleteGuestMembership(guestMembershipId);
		return "Deleted Guest Membership id :" + guestMembershipId;

	}

	// --------------------Guest PaymentCard------------------------//

	@GetMapping("/getGuestPaymentCard")
	public List<GuestPaymentCard> getGuestPaymentCard() {
		//System.out.println("GuestPaymentCard Get Mapping Method");
		return guestPaymentCardService.getGuestPaymentCard();
	}

	@GetMapping("/getGuestPaymentCard/{guesPaymentCardId}")
	public GuestPaymentCard getGuestPaymentCard(@PathVariable String guestPaymentCardId) {
		//System.out.println("GuestPaymentCard Get Mapping Method using Id");
		GuestPaymentCard guestPaymentCard = guestPaymentCardService.getGuestPaymentCard(guestPaymentCardId);
		return guestPaymentCard;
	}

	@PostMapping("/postGuestPaymentCard")
	public GuestPaymentCard addGuestPaymentCard(@RequestBody GuestPaymentCard guestPaymentCard) {
		//System.out.println("GuestPaymentCard Post Mapping Method");
		guestPaymentCardService.saveGuestPaymentCard(guestPaymentCard);

		return guestPaymentCard;
	}

	@PutMapping("/updateGuestPaymentCard")
	public GuestPaymentCard updateGuestPaymentCard(@RequestBody GuestPaymentCard guestPaymentCard) {
		//System.out.println("GuestPaymentCard Put Mapping Method");
		guestPaymentCardService.saveGuestPaymentCard(guestPaymentCard);
		return guestPaymentCard;
	}

	@DeleteMapping("/deleteGuestPaymentCard/{guestPaymentCardId}")
	public String deleteGuestPaymentCard(@PathVariable String guestPaymentCardId) {
		//System.out.println("GuestPaymentCard Delete Mapping Method");
		guestPaymentCardService.deleteGuestPaymentCard(guestPaymentCardId);
		return "Delete Guest Payment Card id :" + guestPaymentCardId;
	}

	// --------------------Guest Preferences------------------------//

	@GetMapping("/getGuestPreferences")
	public List<GuestPreferences> getGuestPreferences() {
		//System.out.println("GuestPreferences Get Mapping Method");
		return guestPreferencesService.getGuestPreferences();
	}

	@GetMapping("/getGuestPreferences/{guestPreferencesId}")
	public GuestPreferences getGuestPreferences(@PathVariable String guestPreferencesId) {
		//System.out.println("Guest Preferences Get Mapping Method using Id");
		GuestPreferences guestPreferences = guestPreferencesService.getGuestPreferences(guestPreferencesId);
		return guestPreferences;
	}

	@PostMapping("/postGuestPreferences")
	public GuestPreferences addGuestPreferences(@RequestBody GuestPreferences guestPreferences) {
		//System.out.println("GuestPreferences Post Mapping Method");
		guestPreferencesService.saveGuestPreferences(guestPreferences);
		return guestPreferences;
	}

	@PutMapping("/updateGuestPreferences")
	public GuestPreferences updateGuestPreferences(@RequestBody GuestPreferences guestPreferences) {
		//System.out.println("GuestPreferences Put Mapping Method");
		guestPreferencesService.saveGuestPreferences(guestPreferences);
		return guestPreferences;
	}

	@DeleteMapping("/deleteGuestPreferences/{guestPreferencesId}")
	public String deleteGuestPreferences(@PathVariable String guestPreferencesId) {
		//System.out.println("GuestPreferences Delete Mapping Method");
		guestPreferencesService.deleteGuestPreferences(guestPreferencesId);
		return "Delete Guest Preferences id :" + guestPreferencesId;
	}

	// --------------------Guest Profile------------------------//

	@GetMapping("/getGuestProfiles")
	public List<GuestProfile> getGuestProfile() {
		System.out.println("Guest Profile Page");
		return guestProfileService.getGuestProfile();
	}

	@GetMapping("/getGuestProfile/{guestProfileId}")
	public GuestProfile getGuestProfile(@PathVariable int guestProfileId) {
		GuestProfile guestProfile = guestProfileService.getGuestProfile(guestProfileId);
		return guestProfile;
	}

	@PostMapping("/postGuestProfile")
	public String addGuestProfile(@RequestBody GuestProfileVO guestProfileVO) {
		guestProfileService.saveGuestProfile(guestProfileVO);
		return "created successfully";
	}

	@PutMapping("/updateGuestProfile")
	public String updateGuestProfile(@RequestBody GuestProfileVO guestProfileVO) {
		guestProfileService.saveGuestProfile(guestProfileVO);
		return "Updated successfully";
	}

	@DeleteMapping("/deleteGuestProfile/{guestProfileId}")
	public String deleteGuestProfile(@PathVariable int guestProfileId) {
		guestProfileService.deleteGuestProfile(guestProfileId);
		return "Delete Guest Profile id :" + guestProfileId;
	}
}