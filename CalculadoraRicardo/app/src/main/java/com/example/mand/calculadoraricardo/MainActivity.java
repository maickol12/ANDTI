package com.example.mand.calculadoraricardo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    FragmentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbarGen);

        setSupportActionBar(toolbar);

        ViewPager vp = (ViewPager) findViewById(R.id.vpPager);
        adapter = new vpAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

    }



    public boolean onCreateOptionsMenu(Menu menu){
        toolbar.setTitle(getString(R.string.name));
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        return  true;
    }


    public static class vpAdapter extends FragmentPagerAdapter{
        public static int item = 2;

        public vpAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return Frag.newInstance(0, "Page # 1");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return Frag.newInstance(1, "Page # 2");
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return item;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }

}
