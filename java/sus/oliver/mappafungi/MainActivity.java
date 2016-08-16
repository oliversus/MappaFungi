package sus.oliver.mappafungi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logoImage = (ImageView)findViewById(R.id.image_logo);
        logoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Mappa Fungi");
                loadHomeActivity();
            }
        });

    }

    private void loadHomeActivity(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
