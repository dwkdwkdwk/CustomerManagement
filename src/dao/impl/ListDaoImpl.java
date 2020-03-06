package dao.impl;

import dao.ListDao;
import domain.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import java.util.List;

public class ListDaoImpl implements ListDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<Customer> findAll() {
        String sql = "select * from customer";
        return template.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
    }
}
