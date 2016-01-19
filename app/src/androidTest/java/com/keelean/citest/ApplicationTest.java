package com.keelean.citest;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;

import org.w3c.dom.Text;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private static final String TAG = "xxx";
    private Solo solo;

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected  void tearDown()  throws Exception {
        solo.finishOpenedActivities();
    }

    public void test_default() throws Exception {
        TextView text = (TextView) solo.getView(R.id.result);

        assertEquals("7 + 4 = 11", text.getText());

    }

    public void test_toast() throws Exception {

        solo.clickOnButton("test");

        boolean found = solo.searchText("toast shown");

        assertEquals(true, found);

    }

}
