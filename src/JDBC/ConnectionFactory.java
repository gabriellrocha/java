package JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public final class ConnectionFactory {

    private static final HikariDataSource hikariDataSource;

    static {
        hikariDataSource = new HikariDataSource(getHikariConfig());
    }

    private ConnectionFactory() {}

    public static Connection getConnection() throws SQLException {

       return hikariDataSource.getConnection();

    }

    private static HikariConfig getHikariConfig() {

        HikariConfig hikariConfig = new HikariConfig(getProperties());
        hikariConfig.setMinimumIdle(10);
        hikariConfig.setMaximumPoolSize(50);
        hikariConfig.setAutoCommit(false);

        return hikariConfig;
    }


    public static Properties getProperties() {

        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/jdbc/config.properties"));
            return properties;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
