package ru.netology.diplom.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLHelper {
    private static final QueryRunner QUERY_RUNNER = new QueryRunner();

    private SQLHelper() {

    }

    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(System.getProperty("db.url"),"app", "pass");
    }

    @SneakyThrows
    public static String getStatusPayment() {
    var codeSQL = "SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1";
    var conn = getConn();
    return QUERY_RUNNER.query(conn, codeSQL, new ScalarHandler<>());
    }

    @SneakyThrows
    public static String getStatusCredit() {
        var codeSQL = "SELECT status FROM credit_request_entity ORDER BY created DESC LIMIT 1";
        var conn = getConn();
        return QUERY_RUNNER.query(conn, codeSQL, new ScalarHandler<>());
    }
}


