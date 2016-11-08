package dongguk.yamyam.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import dongguk.yamyam.R;

public class SecActivity extends AppCompatActivity {
    ArrayList<ItemData> dataSet;

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_layout);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true); //아이템 마다 크기다 달라지는 경우가 있어 크기를 고정시킨다.

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager((linearLayoutManager));

        dataSet = new ArrayList<ItemData>();

        ItemData item1 = new ItemData(R.drawable.magnifier,"title1","android1");dataSet.add(item1);
        ItemData item2 = new ItemData(R.drawable.magnifier,"title2","android2");dataSet.add(item2);
        ItemData item3 = new ItemData(R.drawable.magnifier,"title3","android3");dataSet.add(item3);
        ItemData item4 = new ItemData(R.drawable.magnifier,"title4","android4");dataSet.add(item4);
        ItemData item5 = new ItemData(R.drawable.magnifier,"title5","android5");dataSet.add(item5);
        ItemData item6 = new ItemData(R.drawable.magnifier,"title6","android6");dataSet.add(item6);
        ItemData item7 = new ItemData(R.drawable.magnifier,"title7","android7");dataSet.add(item7);
        ItemData item8 = new ItemData(R.drawable.magnifier,"title8","android8");dataSet.add(item8);
        ItemData item9 = new ItemData(R.drawable.magnifier,"title9","android9");dataSet.add(item9);
        ItemData item10 = new ItemData(R.drawable.magnifier,"title10","android10");dataSet.add(item10);
        ItemData item11 = new ItemData(R.drawable.magnifier,"title11","android11");dataSet.add(item11);
        ItemData item12 = new ItemData(R.drawable.magnifier,"title12","android12");dataSet.add(item12);
        ItemData item13 = new ItemData(R.drawable.magnifier,"title13","android13");dataSet.add(item13);
        ItemData item14 = new ItemData(R.drawable.magnifier,"title14","android14");dataSet.add(item14);


        TestActivity testActivity = new TestActivity(dataSet,clickEvent);

        recyclerView.setAdapter((testActivity));
    }
    public View.OnClickListener clickEvent = new View.OnClickListener() {
        public void onClick(View v) {
            int itemPosition = recyclerView.getChildPosition(v);
            String temp = dataSet.get(itemPosition).content;
            Toast.makeText(getApplicationContext(),temp,Toast.LENGTH_SHORT).show();
        }
    };}

