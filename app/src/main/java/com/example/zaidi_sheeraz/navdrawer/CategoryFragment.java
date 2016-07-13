package com.example.zaidi_sheeraz.navdrawer;



import android.content.Intent;
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
//        b1=(Button)view.findViewById(R.id.cat1);
//        b2=(Button)view.findViewById(R.id.cat2);
//        b3=(Button)view.findViewById(R.id.cat3);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//             Intent intent   =new Intent(CategoryFragment.this.getActivity(),cat_act.class);
//                startActivity(intent);
//            }
//        });
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(CategoryFragment.this.getActivity(),cat2.class);
//                startActivity(intent);
//            }
//        });
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(CategoryFragment.this.getActivity(),cat3.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp=(TextView)view;
        String cities = String.valueOf(parent.getItemAtPosition(position));
        //Toast.makeText(Cities.this, cities, Toast.LENGTH_LONG).show();

        if (position == 0) {
            //code specific to first list item
            Intent myIntent = new Intent(view.getContext(), cat_act.class);
            startActivityForResult(myIntent, 0);


        }
        if (position == 1) {
            //code specific to first list item
            Intent myIntent = new Intent(view.getContext(), cat2.class);
            startActivityForResult(myIntent, 0);


        }

        if (position == 2) {
            //code specific to first list item
            Intent myIntent = new Intent(view.getContext(), cat3.class);
            startActivityForResult(myIntent, 0);


        }
    }
}
