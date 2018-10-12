package com.fiqri.crud

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        fab.setOnClickListener {
            dialogInputInflater()
        }
        showData()
    }

    /**
     *  function for show data
     * */
    private fun showData() {

    }

    /**
     *  proccess insert data use layout inflater
     * */
    @SuppressLint("InflateParams")
    private fun dialogInputInflater() {
        val alert = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.dialog_input, null)
        alert.setView(view)
        alert.setTitle(getString(R.string.input))
        alert.setPositiveButton(getString(R.string.yes)) { dialog, i ->
            // to do something

        }
        alert.setNegativeButton(getString(R.string.no)) { dialog, i ->
            dialog.dismiss()
        }
        alert.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val i = Intent(Intent.ACTION_MAIN)
        i.addCategory(Intent.CATEGORY_HOME)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(i)
    }
}

