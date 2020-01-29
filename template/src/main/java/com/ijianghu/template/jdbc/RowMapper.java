package com.ijianghu.template.jdbc;

import java.sql.ResultSet;

/**
 * @author kai on
 * @date 2019/3/18 20:32
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs,int rowNum) throws Exception;

}
