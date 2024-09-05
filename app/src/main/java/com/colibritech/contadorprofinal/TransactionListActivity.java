package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class TransactionListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_list);

        LinearLayout transactionListLayout = findViewById(R.id.transaction_list_layout);

        // Implement list view or layout population with transactions here
    }
}
