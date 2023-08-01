package com.mofidh1.stopmastur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setTitle(getString(R.string.act_bar2));

        //زر الرجوع يلي الصفحة السابقة
        //يتبع بالاسفل
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true); }








        listView = findViewById(R.id.list_view);
        //String[] diclist=getResources().getStringArray(R.array.HowStopBooklist);
        ArrayList<String> diclist = new ArrayList<String>();
        diclist.add(getString(R.string.how1));
        diclist.add(getString(R.string.how2));
        diclist.add(getString(R.string.how3));
        diclist.add(getString(R.string.how4));
        diclist.add(getString(R.string.how5));
        diclist.add(getString(R.string.how6));
        diclist.add(getString(R.string.how7));
        diclist.add(getString(R.string.how8));
        diclist.add(getString(R.string.how9));
        diclist.add(getString(R.string.how10));
        diclist.add(getString(R.string.how11));
        diclist.add(getString(R.string.how12));
        diclist.add(getString(R.string.how13));
        diclist.add(getString(R.string.how14));
        diclist.add(getString(R.string.how15));


        Myadabter arrayAdapter = new Myadabter(this, diclist);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent1 = new Intent(MainActivity2.this, PdfActivity3.class);
                intent1.putExtra("pos_key", position);
//                intent1.putExtra("show_ads_number", position);
                startActivity(intent1);



            }
        });


        FloatingActionButton fab = findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "شارك التطبيق مع اصدقائك الآخرين", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent myintent = new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String Sharebody = "تطبيق كتاب كيف تقلع عن الإباحية لشون راسيل حمل هذا التطبيق من متجر قوقل بلاي : https://play.google.com/store/apps/details?id=com.mofidh1.stopmastur ";
                //String sharelink = "";
                //myintent.putExtra(Intent.EXTRA_SUBJECT, sharelink);
                myintent.putExtra(Intent.EXTRA_TEXT, Sharebody);

                startActivity(Intent.createChooser(myintent, "شارك التطبيق لتعمَّ الفائدة :"));


            }
        });

    }
    //تكملة
    //زر الرجوع يلي الصفحة السابقة
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (item.getItemId()==android.R.id.home){
//            finish();
//        return super.onOptionsItemSelected(item);}
//
//    }

    //main_menu_create

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==android.R.id.home){
           finish();
       return super.onOptionsItemSelected(item);}

        if(item.getItemId()==R.id.sharing_app){

            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plain");
            String Sharebody = " كتاب كيف تقلع عن الإباحية لشون راسيل حمل هذا التطبيق من متجر قوقل بلاي : https://play.google.com/store/apps/details?id=com.mofidh1.stopmastur  ";
            //String sharelink = "";
            //myintent.putExtra(Intent.EXTRA_SUBJECT, sharelink);
            myintent.putExtra(Intent.EXTRA_TEXT, Sharebody);
            startActivity(Intent.createChooser(myintent, "شارك التطبيق مع اصدقائك :"));
        }
        if (item.getItemId()==R.id.more_apps){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:mofid1_help")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/search?q=pub:mofid1_help")));
            }
        }

        if(item.getItemId()==R.id.exit_app){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
            builder.setMessage("هل تريد اغلاق التطبيق");
            builder.setCancelable(true);

            builder.setNegativeButton("نعم", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    intent.putExtra("EXIT", true);
                    startActivity(intent);
                }
            });

            builder.setPositiveButton("لا", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            //finish();
            //System.exit(0);
        }
        return true;
    }
}