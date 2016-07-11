package com.example.zaidi_sheeraz.navdrawer;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }

    Button b1,b2,b3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_category, container, false);
        b1=(Button)view.findViewById(R.id.cat1);
        b2=(Button)view.findViewById(R.id.cat2);
        b3=(Button)view.findViewById(R.id.cat3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent   =new Intent(CategoryFragment.this.getActivity(),cat_act.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
