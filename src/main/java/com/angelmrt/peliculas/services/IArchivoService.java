package com.angelmrt.peliculas.services;


import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.io.InputStream;

public interface IArchivoService {

    public void guardar (String archivo, InputStream bytes);
    public void eliminar (String string);
    public ResponseEntity<Resource> get(String archivo);
}
