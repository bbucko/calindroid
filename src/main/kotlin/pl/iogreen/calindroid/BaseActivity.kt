package pl.iogreen.calindroid

import roboguice.activity.RoboActivity
import roboguice.inject.ContentView
import android.widget.ListView
import pl.iogreen.calindroid.service.SomeService
import roboguice.inject.InjectView
import com.google.inject.Inject
import android.os.Bundle

[ContentView(R.layout.main)]
open class BaseActivity : RoboActivity() {

    [InjectView(R.id.books)] var books: ListView? = null
    [Inject] var someService: SomeService? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super<RoboActivity>.onCreate(savedInstanceState)

        books?.setAdapter(BookAdapter(array<String>("A", "B", "C", "D"), this))
    }
}