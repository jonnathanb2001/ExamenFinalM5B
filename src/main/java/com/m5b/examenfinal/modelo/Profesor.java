/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.m5b.examenfinal.modelo;

import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jonny
 */
@Data
@Document(collection = "Profesor")
public class Profesor {
    
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String direccion;
    
    
}
