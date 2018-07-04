package it.si2001.springangular.service;

import it.si2001.springangular.dao.MaritalStatusDao;
import it.si2001.springangular.model.MaritalStatus;
import it.si2001.springangular.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("MaritalStatusService")
@Transactional
public class MaritalStatusServiceImpl implements MaritalStatusService {
    String u = new Utils("MaritalService Impl", "class").toString();

    @Autowired
    private MaritalStatusDao dao;

    public List<MaritalStatus> allMaritalStatus() {

        return dao.allMaritalStatus();
    }

    @Override
    public MaritalStatus findById(Integer maritalStatusId) {
       return dao.findById(maritalStatusId);
    }
    @Override
    public MaritalStatus findByName(String maritalStatus){
        return dao.findByName(maritalStatus);
    }


}
