package com.mofidh1.stopmastur;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLongPressListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;


public class PdfActivity3 extends AppCompatActivity {
    String appPackageName;
PDFView pdfView;
    Button btn,btn2,btnnight;
    int mcurrentpage;
    int position;
    boolean Wantnight;
    int sayac;
    int ads_n;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf3);

        btn=findViewById(R.id.button3);
        btn2=findViewById(R.id.button4);
        btnnight=findViewById(R.id.btn_night);
        pdfView=findViewById(R.id.pdfView);


        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true); }




        appPackageName = getPackageName();


        Wantnight=getIntent().getBooleanExtra("want_night",false);
        sayac=getIntent().getIntExtra("sayac",2);

        id=getIntent().getIntExtra("pos_key",0);



        if (id>14){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
            PdfActivity3.this.finish();
        }if (id<0){
            PdfActivity3.this.finish();
        }



        if(id==0){

            getSupportActionBar().setTitle(R.string.how101);
            pdfView.fromAsset("how1.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })

                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btnnight.setVisibility(View.INVISIBLE);
                            btn.setVisibility(View.INVISIBLE);
                            return false; }
                    })

                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==1){
            getSupportActionBar().setTitle(R.string.how22);
            pdfView.fromAsset("how2.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==2){
            getSupportActionBar().setTitle(R.string.how33);
            pdfView.fromAsset("how3.pdf")
            .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==3){
            getSupportActionBar().setTitle(R.string.how44);
            pdfView.fromAsset("how4.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==4){
            getSupportActionBar().setTitle(R.string.how55);
            pdfView.fromAsset("how5.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==5){
            getSupportActionBar().setTitle(R.string.how66);
            pdfView.fromAsset("how6.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==6){
            getSupportActionBar().setTitle(R.string.how77);
            pdfView.fromAsset("how7.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==7){
            getSupportActionBar().setTitle(R.string.how88);
            pdfView.fromAsset("how8.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==8){
            getSupportActionBar().setTitle(R.string.how99);
            pdfView.fromAsset("how9.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==9){
            getSupportActionBar().setTitle(R.string.how100);
            pdfView.fromAsset("how10.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==10){
            getSupportActionBar().setTitle(R.string.how111);
            pdfView.fromAsset("how11.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==11){
            getSupportActionBar().setTitle(R.string.how122);
            pdfView.fromAsset("how12.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==12){
            getSupportActionBar().setTitle(R.string.how133);
            pdfView.fromAsset("how13.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==13){
            getSupportActionBar().setTitle(R.string.how144);
            pdfView.fromAsset("how14.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }
        else if(id==14){
            getSupportActionBar().setTitle(R.string.how155);
            pdfView.fromAsset("how15.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableAnnotationRendering(true)
                    .onLongPress(new OnLongPressListener() {
                        @Override
                        public void onLongPress(MotionEvent e) {
                            btnnight.setVisibility(View.VISIBLE);
                        }
                    })
                    .nightMode(Wantnight)
                    .onTap(new OnTapListener() {
                        @Override
                        public boolean onTap(MotionEvent e) {
                            btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            btnnight.setVisibility(View.INVISIBLE);
                            return false; }
                    })
                    .onPageScroll(new OnPageScrollListener() {
                        @Override
                        public void onPageScrolled(int page, float positionOffset) {
                            btnnight.setVisibility(View.INVISIBLE);
                        }
                    })
                    .onPageChange(new OnPageChangeListener() {
                        @Override
                        public void onPageChanged(int page, int pageCount) {
                            mcurrentpage = page;
                            if (mcurrentpage == pageCount - 1) {
                                btn.setVisibility(View.VISIBLE); btn2.setVisibility(View.VISIBLE);
                            } else {
                                btn.setVisibility(View.INVISIBLE); btn2.setVisibility(View.INVISIBLE);
                            }
                        }

                    })
                    .spacing(2)
                    .load();
        }






        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = id + 1;
                Intent intent = getIntent();
                intent.putExtra("pos_key", position);
                finish();
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = id - 1;
                Intent intent = getIntent();
                intent.putExtra("pos_key", position);
                finish();
                startActivity(intent);
            }
        });

        if (sayac%2==0){
            btnnight.setText(getString(R.string.night1));
            btnnight.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_unnight, 0, 0, 0);

        }else{
            btnnight.setText(getString(R.string.unnight1));
            btnnight.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sunny, 0, 0, 0);

        }

        btnnight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sayac%2==0){
                    Wantnight=true;
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                }else {
                    Wantnight=false;
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                }
                sayac=sayac+1;
                Intent intent = getIntent();
                intent.putExtra("want_night",Wantnight);
                intent.putExtra("sayac",sayac);
                finish();
                startActivity(intent);
            }
        });



        }

    //تكملة
    //زر الرجوع يلي الصفحة السابقة
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        if (item.getItemId()==android.R.id.home){
//            finish();
//        return super.onOptionsItemSelected(item);} }

//main_menu_create

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // MenuInflater inflater = getMenuInflater();
       // inflater.inflate(R.menu.menu_main1,menu);
        menu.add(0, 1, 1, menuIconWithText(getResources().getDrawable(R.drawable.ic_next), getResources().getString(R.string.next)));
        menu.add(0, 2, 2, menuIconWithText(getResources().getDrawable(R.drawable.ic_previous), getResources().getString(R.string.perveous)));
        menu.add(0, 3, 3, menuIconWithText(getResources().getDrawable(R.drawable.ic_share), getResources().getString(R.string.share_appmenuitem)));
        menu.add(0, 4, 4, menuIconWithText(getResources().getDrawable(R.drawable.ic_shareee), getResources().getString(R.string.return_tolist)));
        if (sayac%2==0){
            menu.add(0, 5, 5, menuIconWithText(getResources().getDrawable(R.drawable.ic_nights), getResources().getString(R.string.night)));
        }else{
            menu.add(0, 5, 5, menuIconWithText(getResources().getDrawable(R.drawable.ic_sunny1), getResources().getString(R.string.unnight1)));
        }
        menu.add(0, 6, 6, menuIconWithText(getResources().getDrawable(R.drawable.ic_more_apps), getResources().getString(R.string.more_app)));
        menu.add(0, 7, 7, menuIconWithText(getResources().getDrawable(R.drawable.ic_exitt), getResources().getString(R.string.exit_app)));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            finish();
            return super.onOptionsItemSelected(item);}

        if (item.getItemId()==1){
            position = id + 1;
            Intent intent = getIntent();
            intent.putExtra("pos_key", position);
            finish();
            startActivity(intent);

        }
        if (item.getItemId()==2){
            position = id - 1;
            Intent intent = getIntent();
            intent.putExtra("pos_key", position);
            finish();
            startActivity(intent);
        }


        if(item.getItemId()==3){

            Intent myintent = new Intent(Intent.ACTION_SEND);
            myintent.setType("text/plain");
            String Sharebody = "تطبيق كتاب كيف تقلع عن الإباحية لشون راسيل حمل هذا التطبيق من متجر قوقل بلاي : https://play.google.com/store/apps/details?id=com.mofidh1.stopmastur ";
            //String sharelink = "";
            //myintent.putExtra(Intent.EXTRA_SUBJECT, sharelink);
            myintent.putExtra(Intent.EXTRA_TEXT, Sharebody);
            startActivity(Intent.createChooser(myintent, "شارك التطبيق مع من تريد له الخير :"));
        }
        if(item.getItemId()==4){
            PdfActivity3.this.finish();
        }

        if(item.getItemId()==5){

            if (sayac%2==0){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                Wantnight=true;
//                item.setTitle(getString(R.string.night));
            }else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Wantnight=false;
//                    item.setTitle(getString(R.string.unnight1));
            }
            sayac=sayac+1;
            Intent intent = getIntent();
            intent.putExtra("want_night",Wantnight);
            intent.putExtra("sayac",sayac);
            finish();
            startActivity(intent);
        }

        if(item.getItemId()==6){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:mofid1_help")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/search?q=pub:mofid1_help")));
            }
        }
        if(item.getItemId()==7){
            AlertDialog.Builder builder = new AlertDialog.Builder(PdfActivity3.this);
            builder.setMessage("هل تريد اغلاق التطبيق");
            builder.setCancelable(true);

            builder.setNegativeButton("نعم", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(PdfActivity3.this, MainActivity.class);
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

    private CharSequence menuIconWithText(Drawable r, String title) {

        r.setBounds(0, 0, r.getIntrinsicWidth(), r.getIntrinsicHeight());
        SpannableString sb = new SpannableString("    " + title);
        ImageSpan imageSpan = new ImageSpan(r, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sb;}





    }
