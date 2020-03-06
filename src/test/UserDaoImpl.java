package test;

import dao.UserDao;
import domain.User;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

public class UserDaoImpl {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void test1(){
        User user = null;
        try {
            String sql ="select * from user where username = ? and password = ?";
            user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), "ff", 999);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user != null){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

    @Test
    public void test2(){
        String sql = "insert into customer values(null, ?, ?, ?, ?, ?, ?)";
        int count = template.update(sql, "job", "nan", 13, "hubei", "7368", "68787@2681");
        System.out.println(count);
    }
}
