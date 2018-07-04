package it.si2001.springangular.service;

import it.si2001.springangular.model.MaritalStatus;
import it.si2001.springangular.utils.Utils;

import java.util.List;

public interface MaritalStatusService {
    String u = new Utils("MaritalService Interface", "class").toString();

    List<MaritalStatus> allMaritalStatus();

    MaritalStatus findById(Integer maritalStatusId);

    MaritalStatus findByName(String maritalStatus);
}
