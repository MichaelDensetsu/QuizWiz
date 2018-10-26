package mcdc.quizwiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
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

    Toolbar toolbar;
    ListView listView;

    public ResourcesFragment() {
        // Required empty public constructor
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

            toolbar = getView().findViewById(R.id.toolbar);

            toolbar.setTitle("Resources - INFS2603");

            listView = getView().findViewById(R.id.listview);

            ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ResourcesFragment.this.getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Weeks));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Intent intent = new Intent(ResourcesFragment.this.getActivity(), Weeks_Activity.class);
                    intent.putExtra("Week", listView.getItemAtPosition(i).toString());
                    startActivity(intent);

                }
            });

            listView.setAdapter(mAdapter);
        }
    }
}





