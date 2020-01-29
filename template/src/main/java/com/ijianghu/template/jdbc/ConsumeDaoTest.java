package com.ijianghu.template.jdbc;

import com.ijianghu.template.jdbc.dao.ConsumeDao;
import com.mysql.jdbc.Driver;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.List;

/**
 * @author kai on
 * @date 2019/3/18 22:35
 */
public class ConsumeDaoTest {

    public static void main(String[] args) throws Exception {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mes1");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        ConsumeDao consumeDao = new ConsumeDao(dataSource);
        List<?> list = consumeDao.selectAll();
        System.out.println(list);
    }

}
