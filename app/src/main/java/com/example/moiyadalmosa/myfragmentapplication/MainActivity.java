package com.example.moiyadalmosa.myfragmentapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String name;
    private List<Book> bookArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookArray = new ArrayList<>();

        getFragmentManager().beginTransaction().replace(R.id.frameLayout, new LoginFragment(), "login").commit();
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        bookArray.add(book);
    }

    @Override
    public void onBackPressed() {
        Fragment f = getFragmentManager().findFragmentById(R.id.frameLayout);
        if (f instanceof ShowFragment) {
            getFragmentManager().beginTransaction().replace(R.id.frameLayout, new InterestFragment(), "intrest").commit();
        } else if (f instanceof InterestFragment) {
            getFragmentManager().beginTransaction().replace(R.id.frameLayout, new LoginFragment(), "login").commit();
        } else
            super.onBackPressed();
    }

    public List<Book> getBookList() {
        return bookArray;
    }
}

