package com.colibritech.contadorprofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DocumentMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_document_menu);

        Button uploadDocumentButton = findViewById(R.id.upload_document_button);
        Button documentListButton = findViewById(R.id.document_list_button);

        uploadDocumentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentMenuActivity.this, UploadDocumentActivity.class);
                startActivity(intent);
            }
        });

        documentListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DocumentMenuActivity.this, DocumentListActivity.class);
                startActivity(intent);
            }
        });
    }
}
