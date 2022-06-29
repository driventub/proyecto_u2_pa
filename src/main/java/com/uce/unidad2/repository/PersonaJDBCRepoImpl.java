package com.uce.unidad2.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.to.PersonaTo;

@Repository
public class PersonaJDBCRepoImpl implements IPersonaJDBCRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public PersonaTo buscarId(Integer id) {
        
            return this.jdbcTemplate.queryForObject("select * from persona where id=?", new Object[] { id}, new BeanPropertyRowMapper<PersonaTo>(PersonaTo.class));
    }

    @Override
    public void insertar(PersonaTo p) {
        this.jdbcTemplate.update("insert into persona (id, nombre, apellido) values (?,?,?)",
                new Object[] { p.getId(), p.getNombre(), p.getApellido() });

    }

    @Override
    public void actualizar(PersonaTo p) {
        this.jdbcTemplate.update("update persona set nombre=?, apellido=? where id=?",
                new Object[] { p.getNombre(), p.getApellido(), p.getId() });

    }

    @Override
    public void eliminar(Integer id) {
        this.jdbcTemplate.update("delete from  persona where  id=?",
                new Object[] { id });

    }

    @Override
    public List<PersonaTo> buscarTodos() {
        
        return this.jdbcTemplate.query("select * from persona order by id desc", new PersonaRowMapper() );
    }

    class PersonaRowMapper implements RowMapper <PersonaTo>{

        @Override
        public PersonaTo mapRow(ResultSet rs, int rowNum) throws SQLException {
            PersonaTo p = new PersonaTo();
            p.setId(rs.getInt("id"));
            p.setNombre(rs.getString("nombre"));
            p.setApellido(rs.getString("apellido"));
            return p;
        }

    }
}
