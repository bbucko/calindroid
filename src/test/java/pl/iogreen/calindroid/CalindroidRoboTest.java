package pl.iogreen.calindroid;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class CalindroidRoboTest {

    Calindroid injectedActivity;
    TextView injectedTextView;
    Button button;

    @Before
    public void setUp() {
        injectedActivity = Robolectric.buildActivity(Calindroid.class).create().get();
        injectedTextView = (TextView) injectedActivity.findViewById(R.id.someLabel);
        button = (Button) injectedActivity.findViewById(R.id.button);
    }

    @Test
    public void stringShouldEndInExclamationMark() {
        assertEquals(injectedTextView.getText(), "hello world");
        button.performClick();
        assertEquals(injectedTextView.getText(), "clicked");
    }

}
