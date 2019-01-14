package org.owntracks.android;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.owntracks.android.ui.welcome.WelcomeActivity;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.GrantPermissionRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class WelcomeActivityTests {
    @Rule
    public ActivityScenarioRule<WelcomeActivity> activityScenarioRule = new ActivityScenarioRule<>(WelcomeActivity.class);

    @Rule
    public GrantPermissionRule permissionRule = GrantPermissionRule.grant(android.Manifest.permission.ACCESS_FINE_LOCATION);

    @Test
    public void WelcomeScreenLoadsAndResponds() {
        onView(withId(R.id.btn_next)).perform(click());
        onView(withId(R.id.done)).perform(click());
    }
}
