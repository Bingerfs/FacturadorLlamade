package Proyecte;

import java.util.List;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlCDRRepository implements ICDRRepository {

    

    @Override
    public void addCallRecord(CallRecord callRecord) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<CallRecord> getAllCallRecords() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallRecord getCallRecordById() {
        // TODO Auto-generated method stub
        return null;
    }
    
    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:/sqlite/db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public SqlCDRRepository(String fileName) {
        createNewDatabase(fileName);
    }

}