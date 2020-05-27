package acs.castac.ricsvil.nerdlauncher;

import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nerd_launcher_fragment);
    }


}
