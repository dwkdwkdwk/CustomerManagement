package service;

import domain.Customer;
import domain.PageBean;
import domain.User;

import java.util.List;
import java.util.Map;

public interface CustomerService {

    List<Customer> findAll();

    int addCustomer(Customer customer);

    void deleteCustomer(String id);

    User findCustomerById(String id);

    void updateCustomer(Customer customer);

    /**
     * 批量删除用户
     * @param ids
     */
    void delSelectedCustomer(String[] ids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<Customer> findCustomerByPage(String currentPage, String rows, Map<String, String[]> condition);
}
