package com.ijianghu.template.jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kai on
 * @date 2019/3/18 20:27
 */
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){

        try{
            //1、获取连接
            Connection conn = this.getConnection();
            //2、创建语句集
            PreparedStatement pstm = this.createPreparedStatement(conn, sql);
            //3、执行语句集
            ResultSet rs = this.executeQuery(pstm, values);
            //4、处理结果集
            List<?> result = this.parseResultSet(rs,rowMapper);
            //5、关闭结果集
            this.closeResultSet(rs);
            //6、关闭语句集
            this.closeStatement(pstm);
            //7、关闭连接
            this.closeConnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    protected  void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected  void closeStatement(PreparedStatement pstm){
        try {
            pstm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected  List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        ArrayList<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum));
        }
        return result;
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        return preparedStatement;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    protected ResultSet executeQuery(PreparedStatement pstm,Object[] values) throws SQLException {
        if(null != values){
            for(int i=0;i<values.length;i++){
                pstm.setObject(i,values[i]);
            }
        }

        return pstm.executeQuery();
    }
}
