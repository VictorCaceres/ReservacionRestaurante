package victorcaceres.reservacionrestaurante;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Victor Cáceres on 21/4/2017.
 */

public class FoodsActivity extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foods);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener((v) -> {

            public void onClick(View v){
                Intent intent = new Intent(context, AddFoods.class);
                startActivity(intent);
            }
        });
    }
}
