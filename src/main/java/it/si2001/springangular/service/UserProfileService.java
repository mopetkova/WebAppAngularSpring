package it.si2001.springangular.service;

import it.si2001.springangular.model.UserProfile;
import it.si2001.springangular.utils.Utils;

import java.util.List;


public interface UserProfileService {
    String u = new Utils("UserProfileService Interface", "class").toString();

    UserProfile findByType(String type);
    UserProfile findById(Integer id);
    List<UserProfile> allUserProfiles();
}
