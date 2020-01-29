package com.ijianghu.template.jdbc.dao;

import com.ijianghu.template.jdbc.Consume;
import com.ijianghu.template.jdbc.JdbcTemplate;
import com.ijianghu.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author kai on
 * @date 2019/3/18 22:20
 */
public class ConsumeDao extends JdbcTemplate{
    public ConsumeDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from consume";
        List<?> consumes = super.executeQuery(sql, new RowMapper<Consume>() {
            public Consume mapRow(ResultSet rs, int rowNum) throws Exception {
                Consume consume = new Consume();
                consume.setId(rs.getInt("id"));
                consume.setConsumeName(rs.getString("consume_name"));
                consume.setConsumeType(rs.getInt("consume_type"));
                consume.setAmount(rs.getDouble("amount"));
                consume.setCreateTime(rs.getDate("create_time"));
                consume.setUpdateTime(rs.getDate("update_time"));
                return consume;
            }
        }, null);
        return consumes;
    }
}
