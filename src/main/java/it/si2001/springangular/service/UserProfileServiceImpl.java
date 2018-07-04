package it.si2001.springangular.service;

import it.si2001.springangular.dao.UserProfileDao;
import it.si2001.springangular.model.UserProfile;
import it.si2001.springangular.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("UserProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {
    String u = new Utils("UserProfileService Impl", "class").toString();

    @Autowired
    private UserProfileDao dao;

    @Override
    public UserProfile findByType(String type) {
        return dao.findByType(type);
    }

    @Override
    public UserProfile findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public List<UserProfile> allUserProfiles(){
        return dao.allUserProfiles();
    }

}
