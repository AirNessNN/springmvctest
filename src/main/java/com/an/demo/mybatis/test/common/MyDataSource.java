package com.an.demo.mybatis.test.common;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.session.SqlSessionFactory;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author Airness
 * @email huhaowei16@hotmail.com
 * @date 2020/10/16 11:10 下午
 * @description
 */
public class MyDataSource implements DataSource {

    private final MySqlSessionFactory sqlSessionFactory = new MySqlSessionFactory();

    @Override
    public Connection getConnection() throws SQLException {
        return sqlSessionFactory.getSession().getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
