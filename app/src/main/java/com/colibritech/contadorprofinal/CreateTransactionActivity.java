package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Actividad para crear una nueva transacción.
 * Permite al usuario ingresar una descripción, un valor, una fecha y seleccionar un tipo de transacción.
 * Proporciona un botón para guardar la transacción.
 */
public class CreateTransactionActivity extends AppCompatActivity {

    /**
     * Método llamado al crear la actividad.
     * Configura la interfaz de usuario y define el comportamiento del botón para guardar la transacción.
     *
     * @param savedInstanceState Estado guardado de la instancia, que puede ser null si no existe.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_transaction);

        // Encuentra los elementos de la interfaz de usuario
        EditText descriptionEditText = findViewById(R.id.description_edit_text);
        EditText valueEditText = findViewById(R.id.value_edit_text);
        EditText dateEditText = findViewById(R.id.date_edit_text);
        RadioGroup typeRadioGroup = findViewById(R.id.type_radio_group);
        Button saveTransactionButton = findViewById(R.id.save_transaction_button);

        // Configura el comportamiento del botón para guardar la transacción
        saveTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtiene los valores ingresados por el usuario
                String description = descriptionEditText.getText().toString();
                String value = valueEditText.getText().toString();
                String date = dateEditText.getText().toString();
                int selectedTypeId = typeRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedType = findViewById(selectedTypeId);
                String type = selectedType != null ? selectedType.getText().toString() : "";

                // Maneja la lógica para guardar la transacción aquí
            }
        });
    }
}
