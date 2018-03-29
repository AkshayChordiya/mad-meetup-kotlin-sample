package com.akshay.mad

import android.app.NotificationManager
import android.content.Context
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.graphics.drawable.toBitmap
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity() {

    // TODO: 13. Lazy
    private val notificationManagerLazy by lazy { getSystemService(Context.NOTIFICATION_SERVICE) }
    // TODO: 14. lateinit
    private lateinit var notificationManager: NotificationManager


    private lateinit var service: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        service = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notificationManager2: NotificationManager =
                getSystemService<NotificationManager>()

        // TODO: 3. Play with Views
        toolbar.title = "Abc"
        fab.setOnClickListener {v ->
            // TODO: 17. Playing with toast and snackbar
            toast("hdasjk")
            snackbar(v, "sbamsbm")
            startActivity<BoringJavaActivity>("id" to 1)
        }


        future()
        moreeeeIntoFuture()
    }

    private fun future() {
        // TODO: 16. Playing with Anko
        // Start Activity
        startActivity<BoringJavaActivity>()

        // Browser URL
        browse("https://madmeetup.com/")
    }


    private fun moreeeeIntoFuture() {
        // TODO: 21. Android KTX
        val drawable = ContextCompat.getDrawable(
                this,
                R.drawable.ic_android_black
        )
        val bitmap = drawable?.toBitmap()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
