package com.colibritech.contadorprofinal;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class DocumentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_list);

        ListView documentListView = findViewById(R.id.document_list_view);

        // Implement list view adapter and data fetching here
    }
}
