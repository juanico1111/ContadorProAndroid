package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad para mostrar la lista de transacciones.
 * Configura la interfaz de usuario con un LinearLayout para mostrar las transacciones.
 * Deberás implementar la lógica para poblar el layout con las transacciones.
 */
public class TransactionListActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y el LinearLayout para mostrar las transacciones.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_list);

        // Encuentra el LinearLayout para mostrar la lista de transacciones
        LinearLayout transactionListLayout = findViewById(R.id.transaction_list_layout);

        // Implementa la lógica para poblar el layout con transacciones aquí
    }
}
