package sfBugs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bug1629176 {
    private static final String INSERT_FIELD_AUDIT = "foo";

    void f() throws SQLException {
    PreparedStatement insertFieldAudit = null;

    try {
    for ( int i = 1; i <= 10; i++ ) {


    insertFieldAudit = getConnection().prepareStatement(INSERT_FIELD_AUDIT );

    insertFieldAudit.executeUpdate();

    }
    } finally {
        insertFieldAudit.close();
    // closeStatement( insertFieldAudit );
    }
    }

    private void closeStatement(PreparedStatement insertFieldAudit) {
        // TODO Auto-generated method stub
        
    }

    private Connection getConnection() {
        
        return null;
    }

}
