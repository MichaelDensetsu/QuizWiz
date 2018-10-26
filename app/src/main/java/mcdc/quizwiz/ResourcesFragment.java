package mcdc.quizwiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResourcesFragment extends Fragment {

    //Create UI elements

    Toolbar toolbar;
    ListView listView;


    // Required empty public constructor
    public ResourcesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resources, container, false);


    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        {

            //Setting title for toolbar

            toolbar = getView().findViewById(R.id.toolbar);
            toolbar.setTitle("INFS2603");
            toolbar.setTitle("Resources - INFS2603");


            //Creating an ArrayAdapter for the Topics to put into ListView

            listView = getView().findViewById(R.id.listview);

            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ResourcesFragment.this.getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Topics));


            //Create OnItemClickListener to create an intent which allows for the ResourcesFragment to transition to the appropriate Topic

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent intent = new Intent(ResourcesFragment.this.getActivity(), Weeks_Activity.class);
                    intent.putExtra("Topic", listView.getItemAtPosition(i).toString());
                    startActivity(intent);

                }
            });

            listView.setAdapter(mAdapter);
        }
    }
}





