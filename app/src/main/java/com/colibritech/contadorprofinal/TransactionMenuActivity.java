package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad del menú de transacciones.
 * Proporciona botones para acceder a la actividad de creación de transacciones y a la lista de transacciones.
 */
public class TransactionMenuActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y define el comportamiento de los botones del menú de transacciones.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_menu);

        // Encuentra los botones en la interfaz de usuario
        Button createTransactionButton = findViewById(R.id.create_transaction_button);
        Button transactionListButton = findViewById(R.id.transaction_list_button);

        // Configura el comportamiento del botón para crear una nueva transacción
        createTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionMenuActivity.this, CreateTransactionActivity.class);
                startActivity(intent);
            }
        });

        // Configura el comportamiento del botón para ver la lista de transacciones
        transactionListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionMenuActivity.this, TransactionListActivity.class);
                startActivity(intent);
            }
        });
    }
}
