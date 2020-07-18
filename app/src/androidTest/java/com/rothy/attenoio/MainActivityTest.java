package com.rothy.attenoio;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import com.rothy.attenoio.activity.MainActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity = null;
    @Before
    public void setUp() throws Exception {
        mainActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLaunch(){
        View v = mainActivity.findViewById(R.id.welcome_tv);
        assertNotNull(v);
    }

    @After
    public void tearDown() throws Exception {
        mainActivity = null;
    }
}