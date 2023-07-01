package cl.awakelab.ejercicioindividual12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import cl.awakelab.ejercicioindividual12.databinding.Activity2Binding;
import cl.awakelab.ejercicioindividual12.databinding.ActivityMainBinding;

public class Activity2 extends AppCompatActivity {

    Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayList<String> menuList = new ArrayList<String>(){};

        menuList.add("Puré de calabacín");
        menuList.add("Tortilla de patatas");
        menuList.add("Albóndigas de pollo");
        menuList.add("Ensalada de tomate");
        menuList.add("Leche, pan con aceite y fruta");
        menuList.add("Lentejas");
        menuList.add("Croquetas de atún");
        menuList.add("Menestra de verduras");
        menuList.add("Sardinas al horno");
        menuList.add("Macarrones con verduras");
        menuList.add("Pollo a la cerveza");
        menuList.add("Sopa juliana");
        menuList.add("Corvina al ajillo");
        menuList.add("Carne mechada con puré");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, menuList);
        binding.listViewMenu.setAdapter(adapter);

        binding.cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MapActivity.class);
                startActivity(intent);
            }
        });

    }

}
