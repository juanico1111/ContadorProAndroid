package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad para cargar un documento.
 * Permite al usuario seleccionar una imagen y luego cargarla.
 */
public class UploadDocumentActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y define el comportamiento de los botones para seleccionar y cargar una imagen.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_document);

        // Encuentra los elementos de la interfaz de usuario
        ImageView previewImage = findViewById(R.id.preview_image);
        Button selectImageButton = findViewById(R.id.select_image_button);
        Button uploadButton = findViewById(R.id.upload_button);

        // Implementa la lógica para seleccionar una imagen aquí
        selectImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad para seleccionar una imagen
            }
        });

        // Configura el comportamiento del botón para cargar el archivo
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Maneja la carga del archivo
            }
        });
    }
}
