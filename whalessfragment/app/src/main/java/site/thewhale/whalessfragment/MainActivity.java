package site.thewhale.whalessfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = findViewById(R.id.vp);
        TabLayout tl = findViewById(R.id.tl);

        tl.setupWithViewPager(vp);

        FragAdapter fragAdapter = new FragAdapter(getSupportFragmentManager());
        vp.setAdapter(fragAdapter);
        vp.setCurrentItem(3, true);

        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_star_24);
        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_sports_kabaddi_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_baseline_directions_run_24);
    }
}