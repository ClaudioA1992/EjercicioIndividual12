package cl.awakelab.ejercicioindividual12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.awakelab.ejercicioindividual12.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonMenu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent activity2 = new Intent(getBaseContext(), Activity2.class);
                startActivity(activity2);
            }

        });

    }

}
