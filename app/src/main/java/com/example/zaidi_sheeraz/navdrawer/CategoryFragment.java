package com.example.zaidi_sheeraz.navdrawer;



import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CategoryFragment extends Fragment implements AdapterView.OnItemClickListener {


    public CategoryFragment() {
        // Required empty public constructor
    }

    //Button b1,b2,b3;
    ListView l;
    String s[]={"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_category, container, false);
        l=(ListView)view.findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(CategoryFragment.this.getActivity(),android.R.layout.simple_list_item_1,s);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
        Toast.makeText(CategoryFragment.this.getActivity(),"Click on Item to checkout color",Toast.LENGTH_SHORT).show();
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp=(TextView)view;
        String cities = String.valueOf(parent.getItemAtPosition(position));
        //Toast.makeText(Cities.this, cities, Toast.LENGTH_LONG).show();

        if (position == 0) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.rgb(238,130,238));
            Intent myIntent = new Intent(view.getContext(), cat_act.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 1) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.rgb(75,0,130));
            Intent myIntent = new Intent(view.getContext(), cat2.class);
            startActivityForResult(myIntent, 0);


        }

        if (position == 2) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.BLUE);
            Intent myIntent = new Intent(view.getContext(), cat3.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 3) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.GREEN);
            Intent myIntent = new Intent(view.getContext(), cat4.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 4) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.YELLOW);
            Intent myIntent = new Intent(view.getContext(), cat5.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 5) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.rgb(255,165,0));
            Intent myIntent = new Intent(view.getContext(), cat6.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 6) {
            //code specific to first list item
            l.getChildAt(position).setBackgroundColor(Color.RED);
            Intent myIntent = new Intent(view.getContext(), cat7.class);
            startActivityForResult(myIntent, 0);


        }
    }
}
