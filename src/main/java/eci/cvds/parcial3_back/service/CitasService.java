package eci.cvds.parcial3_back.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eci.cvds.parcial3_back.model.Cita;
import eci.cvds.parcial3_back.model.Espe;
import eci.cvds.parcial3_back.repository.CitaRepository;

public class CitasService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> getAll(){
        return citaRepository.findAll();
    }

    public Cita create(Cita cita){
        cita.setEstado(true);
        return citaRepository.save(cita);
    }
    
    public Cita update(String id,Cita cita){
        cita.setId(id);
        return citaRepository.save(cita);
    }

    public Cita cancelar(Cita cita){
        cita.setEstado(false);
        return citaRepository.save(cita);
    }

    public void delete(String id){
        citaRepository.deleteById(id);
    }

    public List<Cita> getByEstado(Boolean estado){
        return citaRepository.findByEstado(estado);
    }

    public ArrayList<Espe> getEspeList() {
        ArrayList<Espe> espeList = new ArrayList<>();
        espeList.add(Espe.medicina_general);
        espeList.add(Espe.odontologia);
        espeList.add(Espe.ortopedia);
        espeList.add(Espe.psicología);
        return espeList;
    }
}