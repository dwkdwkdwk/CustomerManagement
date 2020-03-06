package dao.impl;

import dao.CustomerDao;
import domain.Customer;
import domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.List;
import java.util.Map;

public class CustomerDaoImpl implements CustomerDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public int add(Customer customer) {
        int count = 0;
        String sql = "insert into customer values(null, ?, ?, ?, ?, ?, ?)";
        count = template.update(sql, customer.getName(), customer.getGender(), customer.getAge(), customer.getAddress(), customer.getQq(), customer.getEmail());
        return count;
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public Customer findById(int i) {
        return null;
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        return 0;
    }

    @Override
    public List<Customer> findByPage(int start, int rows, Map<String, String[]> condition) {
        return null;
    }
}
