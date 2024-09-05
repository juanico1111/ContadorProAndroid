package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class CreateTransactionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_transaction);

        EditText descriptionEditText = findViewById(R.id.description_edit_text);
        EditText valueEditText = findViewById(R.id.value_edit_text);
        EditText dateEditText = findViewById(R.id.date_edit_text);
        RadioGroup typeRadioGroup = findViewById(R.id.type_radio_group);
        Button saveTransactionButton = findViewById(R.id.save_transaction_button);

        saveTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = descriptionEditText.getText().toString();
                String value = valueEditText.getText().toString();
                String date = dateEditText.getText().toString();
                int selectedTypeId = typeRadioGroup.getCheckedRadioButtonId();
                RadioButton selectedType = findViewById(selectedTypeId);
                String type = selectedType != null ? selectedType.getText().toString() : "";

                // Handle transaction saving logic here
            }
        });
    }
}
