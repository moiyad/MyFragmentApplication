package com.example.moiyadalmosa.myfragmentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String name ;
    private List<Book> bookArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookArray =new ArrayList<>();

        getFragmentManager().beginTransaction().replace(R.id.frameLayout,new loginFragment(),"login").commit();
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void addBook(Book book){
        bookArray.add(book);
    }

    public List<Book> getBookList(){
        return bookArray;
    }
}

