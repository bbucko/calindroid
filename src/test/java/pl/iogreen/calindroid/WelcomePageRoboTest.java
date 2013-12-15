package pl.iogreen.calindroid;

import com.google.inject.AbstractModule;
import com.google.inject.util.Modules;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import pl.iogreen.calindroid.service.SomeService;
import roboguice.RoboGuice;

@RunWith(RobolectricTestRunner.class)
public class WelcomePageRoboTest {

    private WelcomePage injectedActivity;
//    private TextView injectedTextView;
//    private Button button;
    private SomeService someServiceMock = Mockito.mock(SomeService.class);

    @Before
    public void setUp() {
        RoboGuice.setBaseApplicationInjector(Robolectric.application, RoboGuice.DEFAULT_STAGE, Modules.override(RoboGuice.newDefaultRoboModule(Robolectric.application)).with(new MyTestModule()));

        injectedActivity = Robolectric.buildActivity(WelcomePage.class).create().get();
//        injectedTextView = (TextView) injectedActivity.findViewById(R.id.someLabel);
//        button = (Button) injectedActivity.findViewById(R.id.button);
    }

    @Test
    public void stringShouldEndInExclamationMark() {
//        assertEquals(injectedTextView.getText(), "hello world");
//        button.performClick();
//        assertEquals(injectedTextView.getText(), "clicked");
//
//        verify(someServiceMock).execute();
    }

    private class MyTestModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(SomeService.class).toInstance(someServiceMock);

        }
    }
}
