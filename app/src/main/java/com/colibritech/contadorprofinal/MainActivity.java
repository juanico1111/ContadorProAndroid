package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad principal de la aplicación.
 * Proporciona botones para navegar a los menús de documentos y transacciones.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y define el comportamiento de los botones para navegar a otras actividades.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra los botones en la interfaz de usuario
        Button documentsButton = findViewById(R.id.documents_button);
        Button transactionsButton = findViewById(R.id.transactions_button);

        // Configura el comportamiento del botón para navegar al menú de documentos
        documentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DocumentMenuActivity.class);
                startActivity(intent);
            }
        });

        // Configura el comportamiento del botón para navegar al menú de transacciones
        transactionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TransactionMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
