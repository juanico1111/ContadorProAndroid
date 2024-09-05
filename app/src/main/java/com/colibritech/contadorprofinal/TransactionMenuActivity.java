package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TransactionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_menu);

        Button createTransactionButton = findViewById(R.id.create_transaction_button);
        Button transactionListButton = findViewById(R.id.transaction_list_button);

        createTransactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionMenuActivity.this, CreateTransactionActivity.class);
                startActivity(intent);
            }
        });

        transactionListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionMenuActivity.this, TransactionListActivity.class);
                startActivity(intent);
            }
        });
    }
}
