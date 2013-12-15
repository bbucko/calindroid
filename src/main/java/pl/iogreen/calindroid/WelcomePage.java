package pl.iogreen.calindroid;

import android.os.Bundle;
import android.widget.ListView;

import com.google.inject.Inject;

import pl.iogreen.calindroid.service.SomeService;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.main)
public class WelcomePage extends RoboActivity {

    @InjectView(R.id.books)
    ListView books;

    @Inject
    SomeService someService;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        books.setAdapter(new BookAdapter(new String[]{"A", "B", "C", "D"}, this));
    }
}
