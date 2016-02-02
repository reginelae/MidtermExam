package sidespell.tech.midtermexam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.lang.Override;

public class MainActivity extends AppCompatActivity {

    private ListViewFragment         mwListVieFragment;
    private GridViewFragment         mGridViewFragment;
    private RecyclerViewListFragment mRecyclerViewListFragment;
    private RecyclerViewGridFragment mRecyclerViewGridFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mListViewFragment = ListViewFragment.newInstance();
        mGridViewFragment = GridViewFragment.newInstance();
        mRecyclerViewListFragment = RecyclerViewListFragment.newInstance();
        mRecyclerViewGridFragment = RecyclerViewGridFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, mListViewFragment)

    }


    editText.setOnEditorActionListener(new TextView.OnEditorActionListener()

    {
        @Override
        public boolean onEditorAction (TextView v,int actionId, KeyEvent event){
        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            performSearch();
            return true;
        }
    }
    }
}
