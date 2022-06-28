package com.uce.unidad2.tarea13.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uce.unidad2.tarea13.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Estudiante buscarId(Integer id) {

        return this.jdbcTemplate.queryForObject("select * from estudiante where id=?", new Object[] { id },
                new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
    }

    @Override
    public void insertar(Estudiante estu) {
        this.jdbcTemplate.update("insert into estudiante (id, nombre, apellido, curso, valor_matricula) values (?,?,?,?,?)",
                new Object[] { estu.getId(), estu.getNombre(), estu.getApellido(), estu.getCurso(), estu.getValorMatricula() });

    }

    @Override
    public void actualizar(Estudiante estu) {
        this.jdbcTemplate.update("update estudiante set nombre=?, apellido=?, curso=?, valor_matricula=?  where id=?",
                new Object[] { estu.getNombre(), estu.getApellido(), estu.getCurso(), estu.getValorMatricula(),estu.getId() });

    }

    @Override
    public void eliminar(Integer id) {
        this.jdbcTemplate.update("delete from  estudiante where  id=?",
                new Object[] { id });

    }
}
