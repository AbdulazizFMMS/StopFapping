package com.mofidh1.stopmastur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//        btn=findViewById(R.id.btn_start);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent);
//            }
//        });


//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Snackbar.make(view, "شاركِ التطبيق لِتعمَّ الفائدة..", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//                Intent myintent = new Intent(Intent.ACTION_SEND);
//                myintent.setType("text/plain");
//                String Sharebody = "كتاب كيف تقلع عن الإباحية لشون راسيل حمل هذا التطبيق من متجر قوقل بلاي : https://play.google.com/store/apps/details?id=com.mofidh1.stopmastur ";
//                //String sharelink = "";
//                //myintent.putExtra(Intent.EXTRA_SUBJECT, sharelink);
//                myintent.putExtra(Intent.EXTRA_TEXT, Sharebody);
//
//                startActivity(Intent.createChooser(myintent, "شارك التطبيق مع اصدقائك :"));
//
//
//            }
//        });

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }

    }


    //main_menu_create

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main1,menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId()==R.id.sharing_app){
//
//                Intent myintent = new Intent(Intent.ACTION_SEND);
//                myintent.setType("text/plain");
//                String Sharebody = "تطبيق كتاب كيف تقلع عن الإباحية لشون راسيل حمل هذا التطبيق من متجر قوقل بلاي : https://play.google.com/store/apps/details?id=com.mofidh1.stopmastur ";
//                //String sharelink = "";
//                //myintent.putExtra(Intent.EXTRA_SUBJECT, sharelink);
//                myintent.putExtra(Intent.EXTRA_TEXT, Sharebody);
//                startActivity(Intent.createChooser(myintent, "شارك التطبيق مع من تريد له الخير :"));
//        }
//        if (item.getItemId()==R.id.more_apps){
//            try {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:mofid1_help")));
//            } catch (android.content.ActivityNotFoundException anfe) {
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/search?q=pub:mofid1_help")));
//            }
//        }
//        if(item.getItemId()==R.id.exit_app){
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setMessage("هل تريد اغلاق التطبيق");
//            builder.setCancelable(true);
//
//            builder.setNegativeButton("نعم", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    MainActivity.this.finish();
//                }
//            });
//
//            builder.setPositiveButton("لا", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    dialog.cancel();
//                }
//            });
//            AlertDialog alertDialog = builder.create();
//            alertDialog.show();
//
//            //finish();
//            //System.exit(0);
//        }
//        return true;
//    }
}