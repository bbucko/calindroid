package pl.iogreen.calindroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.inject.Inject;

import pl.iogreen.calindroid.service.SomeService;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.main)
public class Calindroid extends RoboActivity {

    @InjectView(R.id.someLabel)
    TextView someLabel;

    @InjectView(R.id.button)
    Button button;

    @Inject
    SomeService someService;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        someLabel.setText("hello world");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                someLabel.setText("clicked");
                someService.execute();
            }
        });
    }
}
