package com.cinnamint.shipmate;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import static android.support.test.espresso.Espresso.*;
//import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
//import static android.support.test.espresso.action.TypeTextAction;


//import static org.hamcrest.Matchers.not;
//import static org.hamcrest.Matchers.allOf;
//import static org.hamcrest.Matchers.anyOf;
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.startsWith;
//import static org.hamcrest.Matchers.endsWith;
//import static org.hamcrest.Matchers.equalToIgnoringCase;
//import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;



import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.AndroidJUnitRunner;
import android.test.ActivityInstrumentationTestCase2;

@RunWith(AndroidJUnit4.class)

@LargeTest
public class Test1 {
    private String mStringToBetyped;


//    @Rule public final ActivityInstrumentationTestCase2<MainActivity> main = new ActivityInstrumentationTestCase2<>(MainActivity.class);


    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "Espresso";
    }

    @Test
    public void changeText_sameActivity() {
        // Type text and then press the button.
//        onView(withId(R.id.))
//                .perform(typeText(mStringToBetyped), closeSoftKeyboard());
//        onView(withId(R.id.changeTextBt)).perform(click());
//
//        // Check that the text was changed.
//        onView(withId(R.id.textToBeChanged))
//                .check(matches(withText(mStringToBetyped)));
    }


}
