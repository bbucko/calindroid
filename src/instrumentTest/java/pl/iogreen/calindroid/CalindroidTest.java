package pl.iogreen.calindroid;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class pl.iogreen.calindroid.CalindroidTest \
 * pl.iogreen.calindroid.tests/android.test.InstrumentationTestRunner
 */
public class CalindroidTest extends ActivityInstrumentationTestCase2<Calindroid> {

    public CalindroidTest() {
        super(Calindroid.class);
    }

}