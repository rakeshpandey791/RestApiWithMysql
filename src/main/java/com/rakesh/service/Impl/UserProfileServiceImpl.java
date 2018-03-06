package com.rakesh.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rakesh.entity.OffAlertSound;
import com.rakesh.entity.User;
import com.rakesh.entity.UserProfile;
import com.rakesh.repository.UserProfileRepository;
import com.rakesh.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Resource
	UserProfileRepository userProfileRepository;

	@Override
	public void CreateUserProfile(User user) {

		UserProfile userProfile = new UserProfile();

		userProfile.setChatWallpaperColor("rgb(237, 233, 228)");
		userProfile.setDesktopAlerts("false");
		userProfile.setOffAlertTime(OffAlertSound.NO.name());
		userProfile.setSound("true");
		userProfile.setUserId(user.getId());
		userProfile.setUserIcon(user.getCreatedOn().getTime() + "image.jpg");	

		userProfileRepository.save(userProfile);
	}

}
