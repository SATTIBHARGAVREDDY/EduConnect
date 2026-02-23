package com.edutech.progressive.config;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DatabaseConnectionManager {

    private static final Properties properties = new Properties();
    private static boolean loaded = false;

    private DatabaseConnectionManager() {}

    private static synchronized void loadProperties() {
        if (loaded) return;
        try (InputStream in = DatabaseConnectionManager.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {

            if (in == null) {
                throw new RuntimeException("application.properties not found on classpath");
            }
            properties.load(in);

            String driver = properties.getProperty("db.driver");
            if (driver != null && !driver.isBlank()) {
                Class.forName(driver);
            }
            loaded = true;
        } catch (Exception e) {
            throw new RuntimeException("Failed to load DB properties: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        if (!loaded) loadProperties();
        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.username");
        String pass = properties.getProperty("db.password");
        if (url == null || user == null) {
            throw new SQLException("Database URL/username is missing in application.properties");
        }
        return DriverManager.getConnection(url, user, pass);
    }
}
