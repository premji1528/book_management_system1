package com.example.libmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        Button btn_home = findViewById(R.id.btn_home);
        ListView listView=(ListView)findViewById(android.R.id.list);
         String bookNames[] = {
                "CPlus",
                "Java",
                "DotNet",
                "SQL",
                "MongoDb"
        };
        String bookTitles[] = {
                "C++ Programming",
                "Java Programming",
                "DotNet Core Programming",
                "Master In SQL",
                "MongoDb Fundamentals"
        };
        Integer imageid[] = {
                R.drawable.cplusguide,
                R.drawable.javaguide,
                R.drawable.dotnetguide                ,
                R.drawable.mongodbguide,
                R.drawable.sqlguide
        };
        CustomImagTextAdapter customBookList = new CustomImagTextAdapter(this, bookNames, bookTitles, imageid);
//        listView.setAdapter(customBookList);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(getApplicationContext(),"You Selected "+bookNames[position-1]+ " as Book",Toast.LENGTH_SHORT).show();        }
//        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(BookListActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}