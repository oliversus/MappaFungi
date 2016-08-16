package sus.oliver.mappafungi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {

    String fungiTypes[] = {"Cep", "Chanterelle", "Morel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, fungiTypes);

        ListView fungiListView = (ListView)findViewById(R.id.fungiListView);
        fungiListView.setAdapter(adapter);
    }
}
