package com.ibaad.imagefileselectapp

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

     fun showImageInfo(view: View) {}
     fun showImage(view: View) {}


     fun selectImage(view: View) {
         // initialise the list items for the alert dialog
         // initialise the list items for the alert dialog
         val listItems = arrayOf<CharSequence>("Camera", "Gallery")
         val blackwhite = arrayOf<CharSequence>("White", "Black")
         val alertDialogBuilder = AlertDialog.Builder(this)
         alertDialogBuilder.setTitle("Select Image from...")
         alertDialogBuilder
             .setCancelable(false)
             .setSingleChoiceItems(listItems, -1, null)
             .setPositiveButton("Start") { dialog, id ->
                 val lw: ListView = (dialog as AlertDialog).listView
                 val checkedItem: Any = lw.getAdapter().getItem(lw.getCheckedItemPosition())

                 // Do something with checkedItem
             }
             .setNegativeButton("Cancel") { dialog, id -> dialog.cancel() }

         val alertDialog = alertDialogBuilder.create()
         alertDialog.show()
/*
         val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this@MainActivity)

             builder.setTitle("Choose Items")
         builder.setSingleChoiceItems(listItems)

             builder.setMultiChoiceItems(listItems, checkedItems) { dialog, which, isChecked ->
                 checkedItems[which] = isChecked
                 var currentItem: String = listItems[which]
                 if (listItems[which] == "Camera") {
                     checkedItems[1] = false
                     Toast.makeText(this, "" + listItems[which], Toast.LENGTH_SHORT).show()

                 }
                 if (listItems[which] == "Gallery"){
                     checkedItems[0] = false
                     Toast.makeText(this, "" + listItems[which], Toast.LENGTH_SHORT).show()

                 }





             }
             builder.setCancelable(false)
             builder.setPositiveButton("Done") { _, _ ->
                 for (i in checkedItems.indices) {
                     if (checkedItems[i]) {
                         Toast.makeText(this, "" + listItems[i], Toast.LENGTH_SHORT).show()
                     }
                 }
             }

             builder.setNegativeButton("CANCEL") { _, _ -> }
             builder.setNeutralButton("CLEAR ALL") { _, _ ->
                 for (i in checkedItems.indices) {
                     checkedItems[i] = false
                 }
             }
             builder.create()
             val alertDialog: android.app.AlertDialog? = builder.create()
             alertDialog?.show()*/

     }
}

