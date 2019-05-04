package com.example.trabiguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.io.IOException;
import java.util.ArrayList;

public class SurahActivity extends AppCompatActivity {

    private ArrayList<SurahInfo> Suras = new ArrayList<SurahInfo>();
    RecyclerView recyclerView;
    SeekBar seekBar;
    SurahAdapter surahAdapter;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);
        recyclerView = (RecyclerView)findViewById(R.id.recycleView);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //SurahInfo  s = new SurahInfo("Number 1","Cheap thrills",
        //      "https://firebasestorage.googleapis.com/v0/b/musicapp-53f58.appspot.com/o/%5BSongs.PK%5D%2002%20-%20Hunter.mp3?alt=media&token=6439a78d-0e8e-45ad-ab0d-0a73b8d56fa6");
        //SurahInfo  x = new SurahInfo("Number 1","Cheap thrills",
        //      "https://firebasestorage.googleapis.com/v0/b/musicapp-53f58.appspot.com/o/%5BSongs.PK%5D%2002%20-%20Hunter.mp3?alt=media&token=6439a78d-0e8e-45ad-ab0d-0a73b8d56fa6");
        //Suras.add(x);
        //Suras.add(s);

        SurahInfo One = new SurahInfo("001","Surat Al-Fatiha","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/001.mp3?alt=media&token=493e0156-d79a-4152-a80c-6d70d6664cd5");
        SurahInfo Two = new SurahInfo("002","Surat Al-Baqara","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/002.mp3?alt=media&token=a55baf64-476e-4a64-84ca-22f9d51d4f0e");
        SurahInfo Three = new SurahInfo("003","Surat Aal-E-Imran","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/003.mp3?alt=media&token=692045fa-d6ef-464c-8b68-639b4b946fc8");
        SurahInfo Four = new SurahInfo("004","Surat An-Nisa","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/004.mp3?alt=media&token=921f7eee-36a6-419c-ad46-f63d1e34139d");
        SurahInfo Five = new SurahInfo("005","Surat Al-Maeda","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/005.mp3?alt=media&token=a584bb85-3a09-4135-8f3c-d72267e69631");
        SurahInfo Six = new SurahInfo("006","Surat Al-Anaam","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/005.mp3?alt=media&token=a584bb85-3a09-4135-8f3c-d72267e69631");
        SurahInfo Seven = new SurahInfo("007","Surat Al-Araf","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/007.mp3?alt=media&token=a44273fc-b4b6-4665-9722-3740a002dde6");
        SurahInfo Eight = new SurahInfo("008","Surat Al-Anfal","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/008.mp3?alt=media&token=baff14ec-bf36-4a57-9ae8-18f2831054cf");
        SurahInfo nine = new SurahInfo("009","Surat At-Tawba","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/009.mp3?alt=media&token=33ad6115-43d0-4d48-8b3e-4c8908b4ba16");
        SurahInfo ten = new SurahInfo("010","Surat Yunus","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/010.mp3?alt=media&token=944e9218-4eee-4ea7-8072-5a8d5a0b3e3d");
        SurahInfo eleven = new SurahInfo("011","Surat Hud","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/011.mp3?alt=media&token=96c0be9f-86d9-426c-881d-cd70fc7d8cfb");
        SurahInfo twelve = new SurahInfo("012","Surat Yusuf","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/012.mp3?alt=media&token=e830baa0-e5e3-4e7f-9361-28a86cf437a9");
        SurahInfo thirteen = new SurahInfo("013","Surat Ar-Rad","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/013.mp3?alt=media&token=3fb0ed93-f73c-4d65-99ec-d915e446887c");
        SurahInfo fourteen = new SurahInfo("014","Surat Ibrahim","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/014.mp3?alt=media&token=1a640b52-4c89-47ca-b72a-341dadc85fb6");
        SurahInfo fifteen = new SurahInfo("015","Surat Al-Hijr","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/015.mp3?alt=media&token=a1be067a-8bed-42d0-855f-6322e5cd86c0");
        SurahInfo Sixteen = new SurahInfo("016","Surat An-Nahl","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/016.mp3?alt=media&token=cb2f7ad8-34e0-4287-9388-c9df727eb66d");
        SurahInfo sevelteen = new SurahInfo("017","Surat Al-Isra","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/017.mp3?alt=media&token=4c569ecd-1f78-4e11-a45b-a78dd354242c");
        SurahInfo eightteen = new SurahInfo("018","Surat Al-Kahf","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/018.mp3?alt=media&token=9fdbf9b4-f0a8-4975-94eb-7d289ab03edd");
        SurahInfo nineteen = new SurahInfo("019","Surat Maryam","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/019.mp3?alt=media&token=393fd768-bf92-4ea5-93e9-7f39fcb2558a");
        SurahInfo twenty = new SurahInfo("020","Surat Ta-Ha","https://firebasestorage.googleapis.com/v0/b/carwash-232015.appspot.com/o/020.mp3?alt=media&token=ddc70b9f-44a8-44c5-b378-00cebd5b91d2");
        SurahInfo twentyOne = new SurahInfo("021","Surat Al-Anbiya","");
        SurahInfo twentytwo = new SurahInfo("022","Surat Al-Fatiha","");
        SurahInfo twentythree = new SurahInfo("023","Surat Al-Fatiha","");
        SurahInfo twentyFour = new SurahInfo("024","Surat Al-Fatiha","");
        SurahInfo twentyFive = new SurahInfo("025","Surat Al-Fatiha","");
        SurahInfo twentySix = new SurahInfo("026","Surat Al-Fatiha","");
        SurahInfo twentySeven = new SurahInfo("027","Surat Al-Fatiha","");
        SurahInfo twentyEight = new SurahInfo("028","Surat Al-Fatiha","");
        SurahInfo twentyNine = new SurahInfo("029","Surat Al-Fatiha","");
        SurahInfo thirty = new SurahInfo("030","Surat Al-Fatiha","");
        SurahInfo thirtyOne = new SurahInfo("031","Surat Al-Fatiha","");
        SurahInfo thirtyTwo = new SurahInfo("032","Surat Al-Fatiha","");
        SurahInfo thirtyThree = new SurahInfo("033","Surat Al-Fatiha","");
        SurahInfo thirtyFour = new SurahInfo("034","Surat Al-Fatiha","");
        SurahInfo thirtyfive = new SurahInfo("035","Surat Al-Fatiha","");
        SurahInfo thirtysix = new SurahInfo("036","Surat Al-Fatiha","");
        SurahInfo thirtySeven = new SurahInfo("037","Surat Al-Fatiha","");
        SurahInfo thirtyEight = new SurahInfo("038","Surat Al-Fatiha","");
        SurahInfo thirtyNine = new SurahInfo("039","Surat Al-Fatiha","");
        SurahInfo fourty = new SurahInfo("040","Surat Al-Fatiha","");
        SurahInfo fourtyone = new SurahInfo("041","Surat Al-Fatiha","");
        SurahInfo thirtytwo = new SurahInfo("042","Surat Al-Fatiha","");
        SurahInfo fourtyThree = new SurahInfo("043","Surat Al-Fatiha","");
        SurahInfo fourtyFour = new SurahInfo("044","Surat Al-Fatiha","");
        SurahInfo fourtyfive = new SurahInfo("045","Surat Al-Fatiha","");
        SurahInfo fourtySix = new SurahInfo("046","Surat Al-Fatiha","");
        SurahInfo fourtySeven = new SurahInfo("047","Surat Al-Fatiha","");
        SurahInfo fourtyEight = new SurahInfo("048","Surat Al-Fatiha","");
        SurahInfo fourtyNine = new SurahInfo("049","Surat Al-Fatiha","");
        SurahInfo fifty = new SurahInfo("050","Surat Al-Fatiha","");
        SurahInfo fiftyOne = new SurahInfo("051","Surat Al-Fatiha","");
        SurahInfo fiftyTwo = new SurahInfo("052","Surat Al-Fatiha","");
        SurahInfo fiftyThree = new SurahInfo("053","Surat Al-Fatiha","");
        SurahInfo fiftyFour = new SurahInfo("054","Surat Al-Fatiha","");
        SurahInfo fiftyFive = new SurahInfo("055","Surat Al-Fatiha","");
        SurahInfo fiftySix = new SurahInfo("056","Surat Al-Fatiha","");
        SurahInfo fiftySeven = new SurahInfo("057","Surat Al-Fatiha","");
        SurahInfo fiftyEight = new SurahInfo("058","Surat Al-Fatiha","");
        SurahInfo fiftyNine = new SurahInfo("059","Surat Al-Fatiha","");
        SurahInfo Sixty = new SurahInfo("060","Surat Al-Fatiha","");
        SurahInfo SixtyOne = new SurahInfo("061","Surat Al-Fatiha","");
        SurahInfo SixtyTwo = new SurahInfo("062","Surat Al-Fatiha","");
        SurahInfo SixtyThree = new SurahInfo("063","Surat Al-Fatiha","");
        SurahInfo Sixtyfour = new SurahInfo("064","Surat Al-Fatiha","");
        SurahInfo Sixtyfive = new SurahInfo("065","Surat Al-Fatiha","");
        SurahInfo SixtySix = new SurahInfo("066","Surat Al-Fatiha","");
        SurahInfo SixtySeven = new SurahInfo("067","Surat Al-Fatiha","");
        SurahInfo SixtyEight = new SurahInfo("068","Surat Al-Fatiha","");
        SurahInfo SixtyNine = new SurahInfo("069","Surat Al-Fatiha","");
        SurahInfo Seventy = new SurahInfo("070","Surat Al-Fatiha","");
        SurahInfo SeventyOne = new SurahInfo("071","Surat Al-Fatiha","");
        SurahInfo SeventyTwo = new SurahInfo("072","Surat Al-Fatiha","");
        SurahInfo SeventyThree = new SurahInfo("073","Surat Al-Fatiha","");
        SurahInfo SeventyFour = new SurahInfo("074","Surat Al-Fatiha","");
        SurahInfo SeventyFive = new SurahInfo("075","Surat Al-Fatiha","");
        SurahInfo SeventySix = new SurahInfo("076","Surat Al-Fatiha","");
        SurahInfo SeventySeven = new SurahInfo("077","Surat Al-Fatiha","");
        SurahInfo SeventyEight = new SurahInfo("078","Surat Al-Fatiha","");
        SurahInfo SeventyNine = new SurahInfo("079","Surat Al-Fatiha","");
        SurahInfo eighty = new SurahInfo("080","Surat Al-Fatiha","");
        SurahInfo eightyOne = new SurahInfo("081","Surat Al-Fatiha","");
        SurahInfo Eightyytwo = new SurahInfo("082","Surat Al-Fatiha","");
        SurahInfo eightyThree = new SurahInfo("083","Surat Al-Fatiha","");
        SurahInfo eightyFour = new SurahInfo("084","Surat Al-Fatiha","");
        SurahInfo eightyFive = new SurahInfo("085","Surat Al-Fatiha","");
        SurahInfo eightysix = new SurahInfo("086","Surat Al-Fatiha","");
        SurahInfo eightySeven = new SurahInfo("087","Surat Al-Fatiha","");
        SurahInfo eightyEight = new SurahInfo("088","Surat Al-Fatiha","");
        SurahInfo eightyNine = new SurahInfo("089","Surat Al-Fatiha","");
        SurahInfo ninenty = new SurahInfo("090","Surat Al-Fatiha","");
        SurahInfo ninentyone = new SurahInfo("091","Surat Al-Fatiha","");
        SurahInfo ninentytwo = new SurahInfo("092","Surat Al-Fatiha","");
        SurahInfo ninentyThree = new SurahInfo("093","Surat Al-Fatiha","");
        SurahInfo nientyFour = new SurahInfo("094","Surat Al-Fatiha","");
        SurahInfo ninentyFive = new SurahInfo("095","Surat Al-Fatiha","");
        SurahInfo ninentySix = new SurahInfo("096","Surat Al-Fatiha","");
        SurahInfo ninentySeven = new SurahInfo("097","Surat Al-Fatiha","");
        SurahInfo ninentyEight = new SurahInfo("098","Surat Al-Fatiha","");
        SurahInfo ninentyNine = new SurahInfo("099","Surat Al-Fatiha","");
        SurahInfo Hundrade = new SurahInfo("100","Surat Al-Fatiha","");
        SurahInfo HundradeOne = new SurahInfo("101","Surat Al-Fatiha","");
        SurahInfo HundradeTwo = new SurahInfo("102","Surat Al-Fatiha","");
        SurahInfo HundradeThree = new SurahInfo("103","Surat Al-Fatiha","");
        SurahInfo Hundradefour = new SurahInfo("104","Surat Al-Fatiha","");
        SurahInfo HundradeFive = new SurahInfo("105","Surat Al-Fatiha","");
        SurahInfo HundradeSix = new SurahInfo("106","Surat Al-Fatiha","");
        SurahInfo HundradeSeven = new SurahInfo("107","Surat Al-Fatiha","");
        SurahInfo HundradeEight = new SurahInfo("108","Surat Al-Fatiha","");
        SurahInfo HundradeNine = new SurahInfo("109","Surat Al-Fatiha","");
        SurahInfo HundradeTen = new SurahInfo("110","Surat Al-Fatiha","");
        SurahInfo HundradeEleven = new SurahInfo("111","Surat Al-Fatiha","");
        SurahInfo HundradeTwelve = new SurahInfo("112","Surat Al-Fatiha","");
        SurahInfo HundradeThirteen = new SurahInfo("113","Surat Al-Fatiha","");
        SurahInfo HundradeFourteen = new SurahInfo("114","Surat Al-Fatiha","");

        Suras.add(One);
        Suras.add(Two);
        Suras.add(Three);
        Suras.add(Four);
        Suras.add(Five);
        Suras.add(Six);
        Suras.add(Seven);
        Suras.add(Eight);
        Suras.add(nine);
        Suras.add(ten);
        Suras.add(eleven);
        Suras.add(twelve);
        Suras.add(thirteen);
        Suras.add(fourteen);
        Suras.add(fifteen);
        Suras.add(Sixteen);
        Suras.add(sevelteen);
        Suras.add(nineteen);
        Suras.add(twenty);





        surahAdapter = new SurahAdapter(this,Suras);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(surahAdapter);

        surahAdapter.setOnItemClickListener(new SurahAdapter.OnItemClickListner() {
            @Override
            public void onItemClick(final Button b, View v, SurahInfo obj, int position) {

                try {
                    if (b.getText().toString().equals("stop")){
                        b.setText("play");
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        mediaPlayer.release();
                        mediaPlayer= null;
                    }
                    else {
                        mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource(obj.getSurahUrl());
                        mediaPlayer.prepare();
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mp) {
                                mp.start();
                                b.setText("stop");
                            }
                        });
                    }
                }catch (IOException e){

                }
            }
        });

    }
}
