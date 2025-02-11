package com.spr3;
import org.springframework.jdbc.core.*;
import org.springframework.dao.*;
import java.sql.*;
import java.util.List;

public class BranchDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save a new Branch
    public int save(Branch b) {
        String qry = "INSERT INTO Branch VALUES (" + b.getBid() + ", '" + b.getBname() + "')";
        return jdbcTemplate.update(qry);
    }

    // Save using PreparedStatement
    public Boolean savePS(Branch b) {
        String qry = "INSERT INTO Branch VALUES (?, ?)";
        return jdbcTemplate.execute(qry, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, b.getBid());
                ps.setString(2, b.getBname());
                return ps.execute();
            }
        });
    }

    // Retrieve all Branches
    public List<Branch> getAllBranches() {
        String sql = "SELECT * FROM Branch";
        return jdbcTemplate.query(sql, new BranchMapper());
    }
}

// RowMapper for Branch
class BranchMapper implements RowMapper<Branch> {
    @Override
    public Branch mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Branch(rs.getInt("bid"), rs.getString("bname"));
    }
}
