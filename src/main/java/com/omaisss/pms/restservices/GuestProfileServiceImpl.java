package com.omaisss.pms.restservices;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.omaisss.pms.restdomainobjects.GuestProfileVO;
import com.omaisss.pms.restentity.GuestProfile;
import com.omaisss.pms.restrepository.GuestProfileRepository;

@Service
@Component
public class GuestProfileServiceImpl implements GuestProfileService {

	@Autowired
	private GuestProfileRepository guestProfileRepository;

	@Override
	@Transactional
	public void saveGuestProfile(GuestProfileVO guestProfileVO) {
		GuestProfile guestProfile = convertVOtoEntity(guestProfileVO, true);
		guestProfileRepository.save(guestProfile);
	}

	private GuestProfile convertVOtoEntity(GuestProfileVO guestProfileVO, boolean isCreate) {
		GuestProfile guestProfile = new GuestProfile();
		guestProfile.setGuestProfileId(guestProfileVO.getGuestProfileId());
		guestProfile.setFolioNo(guestProfileVO.getFolioNo());
		guestProfile.setGuestProfileSourceId(guestProfileVO.getGuestProfileSourceId());
		guestProfile.setContractProfileId(guestProfileVO.getContractProfileId());
		guestProfile.setTitleId(guestProfileVO.getTitleId());
		guestProfile.setFirstName(guestProfileVO.getFirstName());
		guestProfile.setMiddleName(guestProfileVO.getMiddleName());
		guestProfile.setLastName(guestProfileVO.getLastName());
		guestProfile.setGender(guestProfileVO.getGender());
		guestProfile.setAge(guestProfileVO.getAge());
		guestProfile.setAgeUnit(guestProfileVO.getAgeUnit());
		guestProfile.setCivilStatus(guestProfileVO.getCivilStatus());
		guestProfile.setMobile(guestProfileVO.getMobile());
		guestProfile.setNationalIdType(guestProfileVO.getNationalIdType());
		guestProfile.setNationalId(guestProfileVO.getNationalId());
		guestProfile.setNationalIdImage(guestProfileVO.getNationalIdImage());
		guestProfile.setNationality(guestProfileVO.getNationality());
		guestProfile.setGuestProfileStatus(guestProfileVO.getGuestProfileStatus());
		guestProfile.setRemarks(guestProfileVO.getRemarks());
		guestProfile.setIsContract(guestProfileVO.getIsContract());
		guestProfile.setCreatedOn(LocalDateTime.now());
		guestProfile.setCreatedBy(guestProfileVO.getCreatedBy());
		guestProfile.setModifiedOn(LocalDateTime.now());
		guestProfile.setModifiedBy(guestProfileVO.getModifiedBy());
		
		
//		if(isCreate) {
//			guestProfile.setCreatedOn(LocalDateTime.now());
//			guestProfile.setCreatedBy(guestProfileVO.getCreatedBy());
//		}
//		else {
//			guestProfile.setModifiedOn(LocalDateTime.now());
//			guestProfile.setModifiedBy(guestProfileVO.getModifiedBy());
//		}
		
		return guestProfile;
	}

	@Override
	@Transactional
	public List<GuestProfile> getGuestProfile() {
		return (List<GuestProfile>) guestProfileRepository.findAll();
	}

	@Override
	@Transactional
	public GuestProfile getGuestProfile(int guestProfileId) {
		Optional<GuestProfile> guestProfileOptional = guestProfileRepository.findById(guestProfileId);
		return guestProfileOptional.get();
	}

	@Override
	public void deleteGuestProfile(int guestProfileId) {
		guestProfileRepository.deleteById(guestProfileId);
	}

}
