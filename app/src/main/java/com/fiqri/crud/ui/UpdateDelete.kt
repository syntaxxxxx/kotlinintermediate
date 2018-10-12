package com.fiqri.crud.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.fiqri.crud.R
import kotlinx.android.synthetic.main.activity_update_delete.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.yesButton

class UpdateDelete : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_delete)
        udpateData()
    }

    private fun udpateData() {
        btnUpdate.setOnClickListener { _ ->
            alert(getString(R.string.update), getString(R.string.confrimation)) {
                yesButton { dialog ->
                    dialog.dismiss()
                }
                noButton { dialog ->
                    dialog.dismiss()
                }
            }.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_delete, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.btn_delete -> {
                alert(getString(R.string.deletee), getString(R.string.confrimation)) {
                    yesButton { dialog ->
                        dialog.dismiss()
                    }
                    noButton { dialog -> dialog.dismiss() }
                }.show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}