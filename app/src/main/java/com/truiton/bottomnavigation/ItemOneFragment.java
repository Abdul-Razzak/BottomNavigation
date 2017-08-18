

package com.truiton.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemOneFragment extends Fragment {
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_one, container, false);

        Button button = (Button)view.findViewById(R.id.breakfast);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                        Intent intent1 = new Intent(getActivity(), MyProfile.class);
                        startActivity(intent1);//Edited here
            }
        });

        Button button2 = (Button)view.findViewById(R.id.lunch);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(getActivity(), MyProfile.class);
                startActivity(intent1);//Edited here
            }
        });

        Button button3 = (Button)view.findViewById(R.id.dinner);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(getActivity(), MyProfile.class);
                startActivity(intent1);//Edited here
            }
        });

        return view;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_search, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
