package com.example.android.clickcounter.androidTest;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.clickcounter.ClickActivity;
import com.example.android.clickcounter.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickFragmentTest {

    @Rule
    public ActivityTestRule<ClickActivity> activityTestRule = new ActivityTestRule<ClickActivity>(ClickActivity.class);

    @Test
    public void incrementClickCounter() {
        onView(withId(R.id.click_button)).perform(click());
        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
    }

    @Test
    public void displayClickCountIsZeroOnStart() {
        onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));
    }
}