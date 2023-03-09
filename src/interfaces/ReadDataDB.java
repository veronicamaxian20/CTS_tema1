package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ReadDataDB {
    void readData(Connection connection) throws SQLException;
}
