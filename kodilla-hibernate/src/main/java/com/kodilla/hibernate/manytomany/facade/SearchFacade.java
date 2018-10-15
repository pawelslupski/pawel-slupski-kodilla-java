package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> findCompaniesBasedOnTheNameFragment(String arg) {
        LOGGER.info("Searching for companies based on the name fragment: " + arg + "");
        return companyDao.retrieveCompaniesWithTheNameContaining(arg);
    }

    public List<Employee> findEmployeesBasedOnTheNameFragment(String arg) {
        LOGGER.info("Searching for employees based on the name fragment: " + arg + "");
        return employeeDao.retrieveEmployeesWithTheNameContaining(arg);
    }

}
