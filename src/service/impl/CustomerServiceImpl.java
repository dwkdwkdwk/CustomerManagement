package service.impl;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import domain.Customer;
import domain.PageBean;
import domain.User;
import service.CustomerService;

import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao dao = new CustomerDaoImpl();

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public int addCustomer(Customer customer) {
        return dao.add(customer);
    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public User findCustomerById(String id) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void delSelectedCustomer(String[] ids) {

    }

    @Override
    public PageBean<Customer> findCustomerByPage(String currentPage, String rows, Map<String, String[]> condition) {
        return null;
    }
}
