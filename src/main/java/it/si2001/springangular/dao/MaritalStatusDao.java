package it.si2001.springangular.dao;


import it.si2001.springangular.model.MaritalStatus;

import java.util.List;

public interface MaritalStatusDao {

    List<MaritalStatus> allMaritalStatus();

    MaritalStatus findById(Integer id);

    MaritalStatus findByName(String name);

}
