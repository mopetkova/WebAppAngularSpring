package it.si2001.springangular.dao;


import it.si2001.springangular.model.UserProfile;
import it.si2001.springangular.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("UserProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile> implements UserProfileDao {


    @Override
    public UserProfile findById(Integer id) {
        String u = new Utils("UserProfileDaoImpl", "findById").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        return (UserProfile) criteria.uniqueResult();
    }

    @Override
    public UserProfile findByType(String type){
        String u = new Utils("UserProfileDaoImpl", "findByType").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("type", type));
        return (UserProfile) criteria.uniqueResult();
    }

    @Override
    public List<UserProfile> allUserProfiles(){
        String u = new Utils("UserProfileDaoImpl", "allUserProfiles").toString();
        Criteria criteria = createEntityCriteria();
        List<UserProfile> userProfiles = (List<UserProfile>) criteria.list();
        return  userProfiles;
    }


}