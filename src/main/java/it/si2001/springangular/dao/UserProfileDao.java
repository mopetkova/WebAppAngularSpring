package it.si2001.springangular.dao;


import it.si2001.springangular.model.UserProfile;

import java.util.List;

public interface UserProfileDao {

    UserProfile findByType(String type);

    UserProfile findById(Integer id);

    List<UserProfile> allUserProfiles();

}
