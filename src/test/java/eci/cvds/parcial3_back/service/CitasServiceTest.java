package eci.cvds.parcial3_back.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import eci.cvds.parcial3_back.model.Cita;
import eci.cvds.parcial3_back.model.Espe;
import eci.cvds.parcial3_back.model.Usuario;
import eci.cvds.parcial3_back.repository.CitaRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class CitasServiceTest {
    
    @Mock
    private CitaRepository citaRepository;

    @InjectMocks
    private CitasService citasService;

    private Cita cita;

    @BeforeEach
    void setup(){
        cita = new Cita();
        cita.setId("i1");
        cita.setFecha(LocalDateTime.now());
        cita.setEstado(true);
        cita.setUsuario(new Usuario("a@mail.com","prueba","1234567890"));
        cita.setEspecialidad(Espe.ortopedia);
        cita.setNombreDoctor("martin");
        cita.setUbicacion("bogota");
    }

    @Test
    void testGetAll(){
        when(citaRepository.findAll()).thenReturn(List.of(cita));
        assertEquals(1, citaRepository.findAll().size());
    }

    @Test
    void testAdd(){
    }

}
