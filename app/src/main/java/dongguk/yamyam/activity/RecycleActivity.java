package dongguk.yamyam.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import dongguk.yamyam.R;

public class RecycleActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        listView = (ListView)findViewById(R.id.Listview);

        dataSet = new ArrayList<String>();

        dataSet.add("android1");
        dataSet.add("android2");
        dataSet.add("android3");
        dataSet.add("android4");
        dataSet.add("android5");
        dataSet.add("android6");
        dataSet.add("android7");
        dataSet.add("android8");
        dataSet.add("android9");
        dataSet.add("android10");
        dataSet.add("android11");
        dataSet.add("android12");
        dataSet.add("android13");
        dataSet.add("android14");

        //액티비티,레이이웃(기본형식 스트링 2개),데이타셋
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,dataSet);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), dataSet.get(position)+" 클릭이 되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }

}

