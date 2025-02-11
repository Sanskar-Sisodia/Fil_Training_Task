package com.spr2;
import org.springframework.jdbc.core.*;
import org.springframework.dao.*;
import java.sql.*;

public class CourseBranchDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(CourseBranch cb) {
        String qry1 = "INSERT INTO Course VALUES (" + cb.getCid() + ", '" + cb.getCname() + "', " + cb.getDuration() + ")";
        String qry2 = "INSERT INTO Branch VALUES (" + cb.getBid() + ", '" + cb.getBname() + "')";
        int result1 = jdbcTemplate.update(qry1);
        int result2 = jdbcTemplate.update(qry2);
        return result1 + result2;
    }

    public Boolean savePS(CourseBranch cb) {
        String qry1 = "INSERT INTO Course VALUES (?, ?, ?)";
        String qry2 = "INSERT INTO Branch VALUES (?, ?)";
        
        Boolean courseInserted = jdbcTemplate.execute(qry1, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, cb.getCid());
                ps.setString(2, cb.getCname());
                ps.setInt(3, cb.getDuration());
                return ps.execute();
            }
        });

        Boolean branchInserted = jdbcTemplate.execute(qry2, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, cb.getBid());
                ps.setString(2, cb.getBname());
                return ps.execute();
            }
        });

        return courseInserted && branchInserted;
    }
}
