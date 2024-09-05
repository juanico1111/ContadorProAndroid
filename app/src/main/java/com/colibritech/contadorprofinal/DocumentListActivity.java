package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad para mostrar la lista de documentos.
 * Configura la interfaz de usuario con un ListView para mostrar los documentos.
 * Deberás implementar el adaptador de la lista y la lógica para obtener los datos.
 */
public class DocumentListActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y el ListView para mostrar los documentos.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_list);

        // Encuentra el ListView para mostrar la lista de documentos
        ListView documentListView = findViewById(R.id.document_list_view);

        // Implementa el adaptador de la lista y la lógica para obtener los datos aquí
    }
}
