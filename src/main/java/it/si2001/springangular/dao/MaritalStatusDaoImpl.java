package it.si2001.springangular.dao;


import it.si2001.springangular.model.MaritalStatus;
import it.si2001.springangular.utils.Utils;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("MaritalStatusDao")
public class MaritalStatusDaoImpl extends AbstractDao<Integer, MaritalStatus> implements MaritalStatusDao {


    public List<MaritalStatus> allMaritalStatus(){
        String u = new Utils("MaritalStatusDaoImpl", "allMaritalStatus").toString();
        Criteria criteria = createEntityCriteria();
        List<MaritalStatus> maritalStatusList = (List<MaritalStatus>) criteria.list();
        return  maritalStatusList;
    }

    @Override
    public MaritalStatus findById(Integer id) {
        return getByKey(id);
//        String u = new Utils("MaritalStatusDaoImpl", "findById").toString();
//        Criteria criteria = createEntityCriteria();
//        criteria.add(Restrictions.eq("maritalStatusId", id));
//        return (MaritalStatus) criteria.uniqueResult();
    }

    @Override
    public MaritalStatus findByName(String name){
        String u = new Utils("MaritalStatusDaoImpl", "findByName").toString();
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("status", name));
        return (MaritalStatus) criteria.uniqueResult();
    }


}