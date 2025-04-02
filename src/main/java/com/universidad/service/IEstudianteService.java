package com.universidad.service; // Define el paquete al que pertenece esta interfaz

import java.util.List; // Importa la clase EstudianteDTO del paquete dto

import com.universidad.dto.EstudianteDTO; // Importa la interfaz List para manejar listas

public interface IEstudianteService { // Define la interfaz IEstudianteService
    
    List<EstudianteDTO> obtenerTodosLosEstudiantes(); // Método para obtener una lista de todos los EstudianteDTO
    EstudianteDTO obtenerEstudiantePorId(Long id); 
    EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO); 
    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO); 
    void eliminarEstudiante(Long id);

}