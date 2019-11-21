package com.escuela.usuario.valido.Mappers;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.escuela.usuario.valido.model.Vehiculo;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class ConcesionariaRowMapper  implements RowMapper<Vehiculo> {
    @Override
    public Concesionaria mapRow(ResultSet resultSet, int i) throws SQLException {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(resultSet.getString("MARCA"));
        vehiculo.setModelo(resultSet.getString("MODELO"));
        vehiculo.setId(resultSet.getInt("ID"));
        vehiculo.setPrecio(resultSet.getInt("PRECIO"));
        vehiculo.setAño(resultSet.getInt("AÑO"));
        vehiculo.setColor(resultSet.getString("COLOR"));
  
        return  vehiculo;
    }


}