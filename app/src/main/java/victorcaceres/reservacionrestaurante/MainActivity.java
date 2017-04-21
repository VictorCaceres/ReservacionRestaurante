package victorcaceres.reservacionrestaurante;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        final Context context = this;
        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener((v) -> {
            Intent intent = new Intent(context, FoodsActivity.class);
            startActivity(intent);
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(context, DrinksActivity.class);
            startActivity(intent);
        });
    }
}
