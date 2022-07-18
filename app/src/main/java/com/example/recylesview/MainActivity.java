package com.example.recylesview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("ilyas", R.drawable.ic_baseline_person_24),
                new MyListData("Wira", R.drawable.ic_baseline_person_24),
                new MyListData("Akbar", R.drawable.ic_baseline_person_24),
                new MyListData("Alwan", R.drawable.ic_baseline_person_24),
                new MyListData("Amri", R.drawable.ic_baseline_person_24),
                new MyListData("Jati", R.drawable.ic_baseline_person_24),
                new MyListData("Andhika", R.drawable.ic_baseline_person_24),
                new MyListData("Antariksa", R.drawable.ic_baseline_person_24),
                new MyListData("Bayu", R.drawable.ic_baseline_person_24),
                new MyListData("Bhre Nabil", R.drawable.ic_baseline_person_24),
                new MyListData("Bimo", R.drawable.ic_baseline_person_24),
                new MyListData("Firdan", R.drawable.ic_baseline_person_24),
                new MyListData("Danar", R.drawable.ic_baseline_person_24),
                new MyListData("Dimas", R.drawable.ic_baseline_person_24),
                new MyListData("Firdaus", R.drawable.ic_baseline_person_24),
                new MyListData("Hegel", R.drawable.ic_baseline_person_24),
                new MyListData("Hibatullah", R.drawable.ic_baseline_person_24),
                new MyListData("Mikhail Haqqen", R.drawable.ic_baseline_person_24),
        };



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}