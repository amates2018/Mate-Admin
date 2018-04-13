package io.mate.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.mate.R;

public class MainActivity extends AppCompatActivity {
	
	@BindView(R.id.container)
	ViewPager mViewPager;
	@BindView(R.id.toolbar)
	Toolbar toolbar;
	@BindView(R.id.tabs)
	TabLayout tabLayout;
	
	private FragmentManager fragmentManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
		
		//Setup UI
		setSupportActionBar(toolbar);
		
		//Init fragment manager
		fragmentManager = getSupportFragmentManager();
		mViewPager.setAdapter(new HomePagerAdapter(fragmentManager));
		mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
		tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
	}
	
	//Adapter for viewpager
	private class HomePagerAdapter extends FragmentStatePagerAdapter {
		private BusFragment busFragment;
		private TripFragment tripFragment;
		private TerminalFragment terminalFragment;
		private DriverFragment driverFragment;
		
		public HomePagerAdapter(FragmentManager fm) {
			super(fm);
			busFragment = new BusFragment();
			tripFragment = new TripFragment();
			terminalFragment = new TerminalFragment();
			driverFragment = new DriverFragment();
		}
		
		@Override
		public Fragment getItem(int position) {
			switch (position) {
				case 0:
					return terminalFragment;
				case 1:
					return tripFragment;
				case 2:
					return busFragment;
				case 3:
					return driverFragment;
				default:
					throw new IllegalArgumentException("No fragment defined for this position");
			}
		}
		
		@Override
		public int getCount() {
			return 4;
		}
	}
}
