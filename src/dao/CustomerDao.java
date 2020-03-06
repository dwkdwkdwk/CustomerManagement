package dao;

import domain.Customer;
import domain.User;

import java.util.List;
import java.util.Map;

public interface CustomerDao {

    List<User> findAll();

    int add(Customer customer);

    void delete(Customer customer);

    void update(Customer customer);

    Customer findById(int i);

    /**
     *查询总记录数
     */
    int findTotalCount(Map<String, String[]> condition);

    /**
     * 分页查询每页记录
     */
    List<Customer> findByPage(int start, int rows, Map<String, String[]> condition);
}
