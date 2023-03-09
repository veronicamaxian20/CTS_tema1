package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertDataDB {
    void insertData(Connection connection) throws SQLException;
}
