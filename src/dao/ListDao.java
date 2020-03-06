package dao;

import domain.Customer;

import java.util.List;

public interface ListDao {
    /**
     * 查询所有客户展示
     * @return
     */
    public List<Customer> findAll();

}
