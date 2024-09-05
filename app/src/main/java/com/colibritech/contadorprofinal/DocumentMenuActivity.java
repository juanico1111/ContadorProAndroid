package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad del menú de documentos.
 * Proporciona botones para acceder a la actividad de carga de documentos y a la lista de documentos.
 */
public class DocumentMenuActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y define el comportamiento de los botones del menú de documentos.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_menu);

        // Encuentra los botones en la interfaz de usuario
        Button uploadDocumentButton = findViewById(R.id.upload_document_button);
        Button documentListButton = findViewById(R.id.document_list_button);

        // Configura el comportamiento del botón para cargar documentos
        uploadDocumentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentMenuActivity.this, UploadDocumentActivity.class);
                startActivity(intent);
            }
        });

        // Configura el comportamiento del botón para ver la lista de documentos
        documentListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentMenuActivity.this, DocumentListActivity.class);
                startActivity(intent);
            }
        });
    }
}
