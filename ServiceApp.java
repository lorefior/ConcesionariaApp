package com.escuela.usuario.service;
import com.escuela.usuario.service.valido.Mappers.ConcesionariaRowMapper;
import com.escuela.usuario.valido.model.Vehiculo;
import com.example.handlingformsubmission.model.Airline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceApp<JdbcTemplate> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public  List<Vehiculo> getConcecionaria(){
        String sql="select * from VEHICULO";
        List<Vehiculo> query = jdbcTemplate.query(sql, new ConcesionariaRowMapper());
        query.forEach(item->System.out.println(item.getVehculoMarca()));
        return query;
    }

    public Integer getPrecioFromVehiculo(String marca, String modelo){
        String query="select * from VEHICULO where MARCA=?  and MODELO=? ;";
        List<Vehiculo> vehiculo= jdbcTemplate.query(query,new Object[]{marca,modelo},new ConcesionariaRowMapper());
        if(!vehiculo.isEmpty()){
            Vehiculo a= vehiculo.get(0);
            return a.getPrecio();
        }
        return 0;
    }
}