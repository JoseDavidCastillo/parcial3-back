package eci.cvds.parcial3_back.repository;

import eci.cvds.parcial3_back.model.*;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends MongoRepository<Cita,String> {
    public List<Cita> findByEstado(Boolean estado);
}