package com.start.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.start.domain.ScencData;
import com.start.mapper.SceneDataMapper;

@Service
public class ScencDataService {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    private SceneDataMapper sceneDataMapper;
    
    
    public List<ScencData> getScencData(){
        String sql ="select * from scene_data  limit 10";
        return (List<ScencData>) jdbcTemplate.query(sql, new RowMapper<ScencData>(){
            @Override
            public ScencData mapRow(ResultSet rs, int rowNum) throws SQLException {
                ScencData stu = new ScencData();
                stu.setMobile(rs.getString("MOBILE"));
                stu.setName(rs.getString("NAME"));
                stu.setScene(rs.getString("SCENE"));
                return stu;
            }

        });
    }
    
    @Transactional
    public List<ScencData> getList(){
      return   sceneDataMapper.getList();
    }
}
