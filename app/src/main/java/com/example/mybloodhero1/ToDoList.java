package com.example.mybloodhero1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ToDoList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);
    }

    public void todolist(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acko.com/health-insurance/before-and-after-donating-blood-what-to-eat-and-benefits/"));
        startActivity(intent);
    }

    public void rule(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitcompletecare.com/blog/giving-blood-restrictions/"));
        startActivity(intent);
    }

    public void guide(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freemalaysiatoday.com/category/leisure/2021/08/10/a-guide-to-donating-blood-for-the-first-time/"));
        startActivity(intent);
    }

    public void advantage(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indushealthplus.com/blood-donation-facts-benefits.html"));
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.medicalnewstoday.com/articles/what-to-do-after-donating-blood"));
        startActivity(intent);
    }
}