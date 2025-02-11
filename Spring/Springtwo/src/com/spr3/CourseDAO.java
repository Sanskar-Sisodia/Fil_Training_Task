package com.spr3;
import org.springframework.jdbc.core.*;
import org.springframework.dao.*;
import java.sql.*;
import java.util.List;

public class CourseDAO {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save a new course
    public int save(Course c) {
        String qry = "INSERT INTO Course VALUES (" + c.getCid() + ", '" + c.getCname() + "', " + c.getDuration() + ")";
        return jdbcTemplate.update(qry);
    }

    // Save using PreparedStatement
    public Boolean savePS(Course c) {
        String qry = "INSERT INTO Course VALUES (?, ?, ?)";
        return jdbcTemplate.execute(qry, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setInt(1, c.getCid());
                ps.setString(2, c.getCname());
                ps.setInt(3, c.getDuration());
                return ps.execute();
            }
        });
    }

    // Retrieve all courses
    public List<Course> getAllCourses() {
        String sql = "SELECT * FROM Course";
        return jdbcTemplate.query(sql, new CourseMapper());
    }
}

// RowMapper for Course
class CourseMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Course(rs.getInt("cid"), rs.getString("cname"), rs.getInt("duration"));
    }
}
