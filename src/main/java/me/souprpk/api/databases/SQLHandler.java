package me.souprpk.api.databases;

import java.sql.*;

public class SQLHandler {

    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    private Connection connection;
    public SQLHandler(String host, String port, String database, String username, String password){

    }

    public boolean isConnected() {
        return (connection == null ? false : true);
    }

    public void connect() throws ClassNotFoundException, SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://" +
                        host + ":" + port + "/" + database + "?useSSL=false",
                username, password);
    }

    public void disconnect() {
        if(isConnected()) {
            try {
                connection.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void executeStatement(String statement) throws SQLException {
        connection.prepareStatement(statement).execute();
    }

    public void executeStatement(PreparedStatement statement) throws SQLException {
        statement.execute();
    }

    public ResultSet getResultsQuery(String statement) throws SQLException {
        return connection.prepareStatement(statement).executeQuery();
    }

    public ResultSet getResultsQuery(PreparedStatement statement) throws SQLException {
        return statement.executeQuery();
    }
}
