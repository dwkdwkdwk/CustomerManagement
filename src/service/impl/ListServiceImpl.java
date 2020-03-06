package service.impl;

import dao.ListDao;
import dao.impl.ListDaoImpl;
import domain.Customer;
import service.ListService;

import java.util.List;

public class ListServiceImpl implements ListService {

    private ListDao listDao = new ListDaoImpl();

    @Override
    public List<Customer> findAll() {
        return listDao.findAll();
    }
}
