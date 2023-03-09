package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateTableDB {
    void createTable(Connection connection) throws SQLException;
}
