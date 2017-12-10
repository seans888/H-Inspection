package com.chanty.ispector;

/*
This is the checklist for the normal rooms*/





import android.app.MediaRouteButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckList extends AppCompatActivity {

    //DECLARE VARAIBLES
    private DatabaseReference mFirebaseDatabase1, reference;
    private FirebaseDatabase mFirebaseInstance;
    private Button scan_btn, txt1btn, txt2btn, txt3btn, txt4btn, txt5btn, txt6btn, txt7btn, txt8btn, txt9btn, txt10btn, txt11btn, txt12btn, txt13btn, txt14btn,txt15btn, txt16btn, txt17btn, txt18btn, txt19btn, txt20btn, txt21btn, txt22btn, txt23btn, txt24btn, txt25btn, txt26btn, txt27btn, txt28btn, txt29btn, txt30btn
            ,txt31btn, txt32btn, txt33btn, txt34btn, txt35btn, txt36btn, txt37btn, txt38btn, txt39btn, txt40btn, txt41btn, txt42btn, txt43btn, txt44btn, txt45btn, txt46btn
            ,txt47btn, txt48btn, txt49btn, txt50btn, txt51btn, txt52btn, txt53btn, txt54btn, txt55btn, txt56btn,txt57btn, txt58btn, txt59btn, txt60btn, txt61btn, txt62btn
            ,txt63btn, txt64btn, txt65btn, txt66btn, txt67btn, txt68btn, txt69btn, txt70btn, txt71btn, txt72btn, txt73btn, txt74btn, txt75btn, txt76btn, txt77btn, txt78btn
            ,txt79btn, txt80btn, txt81btn, txt82btn, txt83btn, txt84btn, txt85btn, txt86btn, txt87btn, txt88btn, txt89btn, txt90btn, txt91btn, txt92btn, txt93btn, txt94btn, txt95btn
            ,txt96btn, txt97btn, txt98btn, txt99btn, txt111btn, txt112btn, txt113btn, txt114btn, txt115btn;
    EditText text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24,
            text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text43, text44, text45, text46, text47
            , text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text61, text62, text63, text64, text65, text66, text67, text68, text69, text70, text71, text72, text73
            , text74, text75, text76, text77, text78, text79, text80, text81, text82, text83, text84, text85, text86, text87, text88, text89, text90, text91, text92, text93, text94, text95, text96, text97, text98
            , text111, text112, text113, text114, text115;




    CheckBox First, Second, Third, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12, ch13, ch14, ch15, ch16, ch17,
            ch18, ch19, ch20, ch21, ch22, ch23, ch24, ch25, ch26, ch27, ch28, ch29, ch30, ch31, ch32, ch33, ch34, ch35, ch36, ch37, ch38, ch39, ch40, ch41, ch42, ch43, ch44, ch45, ch46, ch47,
            ch48, ch49, ch50, ch51, ch52, ch53, ch54, ch55, ch56, ch57, ch58, ch59, ch60, ch61, ch62, ch63, ch64, ch65, ch66, ch68, ch69, ch70, ch71, ch72, ch73, ch74, ch75, ch76, ch77, ch78,
            ch79, ch80, ch81, ch82, ch83, ch84, ch85, ch86, ch87, ch88, ch89, ch90, ch111, ch112, ch113, ch114, ch115;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase1 = mFirebaseInstance.getReference("Rooms");

        addListenerOnButton();



    }


    public void addListenerOnButton() {


        //ASSIGN VALUES FROM XMLS
        First = (CheckBox) findViewById(R.id.ch1);

        Second = (CheckBox) findViewById(R.id.ch2);

        Third = (CheckBox) findViewById(R.id.ch3);

        ch4 = (CheckBox) findViewById(R.id.ch4);

        ch5 = (CheckBox) findViewById(R.id.ch5);

        ch6 = (CheckBox) findViewById(R.id.ch6);

        ch7 = (CheckBox) findViewById(R.id.ch7);

        ch8 = (CheckBox) findViewById(R.id.ch8);

        ch9 = (CheckBox) findViewById(R.id.ch9);

        ch10 = (CheckBox) findViewById(R.id.ch10);

        ch11 = (CheckBox) findViewById(R.id.ch11);


        ch12 = (CheckBox) findViewById(R.id.ch12);

        ch13 = (CheckBox) findViewById(R.id.ch13);

        ch14 = (CheckBox) findViewById(R.id.ch14);

        ch15 = (CheckBox) findViewById(R.id.ch15);

        ch16 = (CheckBox) findViewById(R.id.ch16);

        ch17 = (CheckBox) findViewById(R.id.ch17);

        ch18 = (CheckBox) findViewById(R.id.ch19);

        ch19 = (CheckBox) findViewById(R.id.ch20);

        ch20 = (CheckBox) findViewById(R.id.ch21);

        ch21 = (CheckBox) findViewById(R.id.ch22);

        ch22 = (CheckBox) findViewById(R.id.ch23);

        ch23 = (CheckBox) findViewById(R.id.ch24);

        ch24 = (CheckBox) findViewById(R.id.ch25);

        ch25 = (CheckBox) findViewById(R.id.ch26);

        ch26 = (CheckBox) findViewById(R.id.ch27);

        ch27 = (CheckBox) findViewById(R.id.ch28);

        ch28 = (CheckBox) findViewById(R.id.ch29);

        ch29 = (CheckBox) findViewById(R.id.ch30);

        ch30 = (CheckBox) findViewById(R.id.ch31);

        ch31 = (CheckBox) findViewById(R.id.ch32);



        ch33 = (CheckBox) findViewById(R.id.ch34);

        ch34 = (CheckBox) findViewById(R.id.ch35);

        ch35 = (CheckBox) findViewById(R.id.ch36);

        ch36 = (CheckBox) findViewById(R.id.ch37);

        ch37 = (CheckBox) findViewById(R.id.ch38);

        ch38 = (CheckBox) findViewById(R.id.ch39);

        ch39 = (CheckBox) findViewById(R.id.ch40);

        ch40 = (CheckBox) findViewById(R.id.ch41);

        ch41 = (CheckBox) findViewById(R.id.ch42);

        ch42 = (CheckBox) findViewById(R.id.ch43);

        ch43 = (CheckBox) findViewById(R.id.ch44);

        ch44 = (CheckBox) findViewById(R.id.ch46);

        ch45 = (CheckBox) findViewById(R.id.ch47);

        ch46 = (CheckBox) findViewById(R.id.ch48);

        ch47 = (CheckBox) findViewById(R.id.ch49);

        ch48 = (CheckBox) findViewById(R.id.ch51);

        ch49 = (CheckBox) findViewById(R.id.ch52);

        ch50 = (CheckBox) findViewById(R.id.ch53);

        ch51 = (CheckBox) findViewById(R.id.ch54);

        ch52 = (CheckBox) findViewById(R.id.ch55);

        ch53 = (CheckBox) findViewById(R.id.ch56);

        ch54 = (CheckBox) findViewById(R.id.ch57);

        ch55 = (CheckBox) findViewById(R.id.ch58);

        ch56 = (CheckBox) findViewById(R.id.ch59);

        ch57 = (CheckBox) findViewById(R.id.ch60);

        ch58 = (CheckBox) findViewById(R.id.ch61);

        ch59 = (CheckBox) findViewById(R.id.ch62);

        ch60 = (CheckBox) findViewById(R.id.ch63);

        ch61 = (CheckBox) findViewById(R.id.ch64);

        ch62 = (CheckBox) findViewById(R.id.ch65);

        ch63 = (CheckBox) findViewById(R.id.ch66);

        ch64 = (CheckBox) findViewById(R.id.ch67);

        ch65 = (CheckBox) findViewById(R.id.ch68);

        ch66 = (CheckBox) findViewById(R.id.ch69);

        ch68 = (CheckBox) findViewById(R.id.ch70);

        ch69 = (CheckBox) findViewById(R.id.ch71);

        ch70 = (CheckBox) findViewById(R.id.ch72);

        ch71 = (CheckBox) findViewById(R.id.ch73);

        ch72 = (CheckBox) findViewById(R.id.ch74);

        ch73 = (CheckBox) findViewById(R.id.ch75);

        ch74 = (CheckBox) findViewById(R.id.ch76);

        ch75 = (CheckBox) findViewById(R.id.ch77);

        ch76 = (CheckBox) findViewById(R.id.ch78);

        ch77 = (CheckBox) findViewById(R.id.ch79);

        ch78 = (CheckBox) findViewById(R.id.ch80);

        ch79 = (CheckBox) findViewById(R.id.ch81);

        ch80 = (CheckBox) findViewById(R.id.ch82);

        ch81 = (CheckBox) findViewById(R.id.ch83);

        ch82 = (CheckBox) findViewById(R.id.ch84);

        ch83 = (CheckBox) findViewById(R.id.ch85);

        ch84 = (CheckBox) findViewById(R.id.ch86);

        ch85 = (CheckBox) findViewById(R.id.ch87);

        ch86 = (CheckBox) findViewById(R.id.ch89);

        ch87 = (CheckBox) findViewById(R.id.ch90);

        ch88 = (CheckBox) findViewById(R.id.ch91);

        ch89 = (CheckBox) findViewById(R.id.ch92);

        ch90 = (CheckBox) findViewById(R.id.ch93);

        ch111 = (CheckBox)findViewById(R.id.ch111);

        ch112 = (CheckBox)findViewById(R.id.ch112);

        ch113 = (CheckBox)findViewById(R.id.ch113);
        ch114 = (CheckBox)findViewById(R.id.ch114);
        ch115 = (CheckBox)findViewById(R.id.ch115);


        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
        text3 = (EditText) findViewById(R.id.text3);
        text4 = (EditText) findViewById(R.id.text4);
        text5 = (EditText) findViewById(R.id.text5);
        text6 = (EditText) findViewById(R.id.text6);
        text7 = (EditText) findViewById(R.id.text7);
        text8 = (EditText) findViewById(R.id.text8);
        text9 = (EditText) findViewById(R.id.text9);
        text10 = (EditText) findViewById(R.id.text10);
        text11 = (EditText) findViewById(R.id.text11);
        text12 = (EditText) findViewById(R.id.text12);
        text13 = (EditText) findViewById(R.id.text13);
        text14 = (EditText) findViewById(R.id.text14);
        text15 = (EditText) findViewById(R.id.text15);
        text16 = (EditText) findViewById(R.id.text16);
        text17 = (EditText) findViewById(R.id.text17);


        text19 = (EditText) findViewById(R.id.text19);
        text20 = (EditText) findViewById(R.id.text20);
        text21 = (EditText) findViewById(R.id.text21);
        text22 = (EditText) findViewById(R.id.text22);
        text23 = (EditText) findViewById(R.id.text23);
        text24 = (EditText) findViewById(R.id.text24);
        text25 = (EditText) findViewById(R.id.text25);
        text26 = (EditText) findViewById(R.id.text26);
        text27 = (EditText) findViewById(R.id.text27);
        text28 = (EditText) findViewById(R.id.text28);
        text29 = (EditText) findViewById(R.id.text29);
        text30 = (EditText) findViewById(R.id.text30);
        text31 = (EditText) findViewById(R.id.text31);
        text32 = (EditText) findViewById(R.id.text32);
        text34 = (EditText) findViewById(R.id.text34);
        text35 = (EditText) findViewById(R.id.text35);
        text36 = (EditText) findViewById(R.id.text36);
        text37 = (EditText) findViewById(R.id.text37);
        text38 = (EditText) findViewById(R.id.text38);
        text39 = (EditText) findViewById(R.id.text39);
        text40 = (EditText) findViewById(R.id.text40);
        text41 = (EditText) findViewById(R.id.text41);
        text42 = (EditText) findViewById(R.id.text42);
        text43 = (EditText) findViewById(R.id.text43);
        text44 = (EditText) findViewById(R.id.text44);
        text46 = (EditText) findViewById(R.id.text46);
        text47 = (EditText) findViewById(R.id.text47);

        text48 = (EditText) findViewById(R.id.text48);
        text49 = (EditText) findViewById(R.id.text49);
        text51 = (EditText) findViewById(R.id.text51);
        text52 = (EditText) findViewById(R.id.text52);
        text53 = (EditText) findViewById(R.id.text53);
        text54 = (EditText) findViewById(R.id.text54);
        text55 = (EditText) findViewById(R.id.text55);
        text56 = (EditText) findViewById(R.id.text56);
        text57 = (EditText) findViewById(R.id.text57);
        text58 = (EditText) findViewById(R.id.text58);
        text59 = (EditText) findViewById(R.id.text59);
        text60 = (EditText) findViewById(R.id.text60);
        text61 = (EditText) findViewById(R.id.text61);
        text62 = (EditText) findViewById(R.id.text62);
        text63 = (EditText) findViewById(R.id.text63);
        text64 = (EditText) findViewById(R.id.text64);
        text65 = (EditText) findViewById(R.id.text65);
        text66 = (EditText) findViewById(R.id.text66);
        text67 = (EditText) findViewById(R.id.text67);
        text68 = (EditText) findViewById(R.id.text68);
        text69 = (EditText) findViewById(R.id.text69);
        text70 = (EditText) findViewById(R.id.text70);
        text71 = (EditText) findViewById(R.id.text71);
        text72 = (EditText) findViewById(R.id.text72);
        text73 = (EditText) findViewById(R.id.text73);
        text74 = (EditText) findViewById(R.id.text74);
        text75 = (EditText) findViewById(R.id.text75);
        text76 = (EditText) findViewById(R.id.text76);
        text77 = (EditText) findViewById(R.id.text77);
        text78 = (EditText) findViewById(R.id.text78);
        text79 = (EditText) findViewById(R.id.text79);
        text80 = (EditText) findViewById(R.id.text80);
        text81 = (EditText) findViewById(R.id.text81);
        text82 = (EditText) findViewById(R.id.text82);
        text83 = (EditText) findViewById(R.id.text83);
        text84 = (EditText) findViewById(R.id.text84);
        text85 = (EditText) findViewById(R.id.text85);
        text86 = (EditText) findViewById(R.id.text86);
        text87 = (EditText) findViewById(R.id.text87);
        text89 = (EditText) findViewById(R.id.text89);
        text90 = (EditText) findViewById(R.id.text90);
        text91 = (EditText) findViewById(R.id.text91);
        text92 = (EditText) findViewById(R.id.text92);
        text93 = (EditText) findViewById(R.id.text93);
//OVERALL

        text111 = (EditText) findViewById(R.id.text111);
        text112 = (EditText) findViewById(R.id.text112);
        text113 = (EditText) findViewById(R.id.text113);
        text114 = (EditText) findViewById(R.id.text114);
        text115 = (EditText) findViewById(R.id.text115);







//SCAN BUTTON ON CLICK GETS THE VALUES

        scan_btn = (Button) findViewById(R.id.scan_btn);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//GETS THE VALUES OF THE TITLE OF THE TITLE/TEXT OF THE CHECKBOXES


                String param1 = First.getText().toString().trim();

                String param2 = Second.getText().toString().trim();

                String param3 = Third.getText().toString().trim();

                String param4 = ch4.getText().toString().trim();

                String param5 = ch5.getText().toString().trim();

                String param6 = ch6.getText().toString().trim();

                String param7 = ch7.getText().toString().trim();

                String param8 = ch8.getText().toString().trim();

                String param9 = ch9.getText().toString().trim();

                String param10 = ch10.getText().toString().trim();

                String param11 = ch11.getText().toString().trim();

                String param12 = ch12.getText().toString().trim();

                String param13 = ch13.getText().toString().trim();

                String param14 = ch14.getText().toString().trim();

                String param15 = ch15.getText().toString().trim();

                String param16 = ch16.getText().toString().trim();

                String param17 = ch17.getText().toString().trim();

                String param18 = ch18.getText().toString().trim();

                String param19 = ch20.getText().toString().trim();

                String param20 = ch20.getText().toString().trim();

                String param21 = ch21.getText().toString().trim();

                String param22 = ch22.getText().toString().trim();

                String param23 = ch23.getText().toString().trim();

                String param24 = ch24.getText().toString().trim();

                String param25 = ch25.getText().toString().trim();

                String param26 = ch26.getText().toString().trim();

                String param27 = ch27.getText().toString().trim();

                String param28 = ch28.getText().toString().trim();

                String param29 = ch29.getText().toString().trim();

                String param30 = ch30.getText().toString().trim();

                String param31 = ch31.getText().toString().trim();


                String param33 = ch33.getText().toString().trim();

                String param34 = ch34.getText().toString().trim();

                String param35 = ch35.getText().toString().trim();

                String param36 = ch36.getText().toString().trim();

                String param37 = ch37.getText().toString().trim();

                String param38 = ch38.getText().toString().trim();

                String param39 = ch39.getText().toString().trim();

                String param40 = ch40.getText().toString().trim();

                String param41 = ch41.getText().toString().trim();

                String param42 = ch42.getText().toString().trim();

                String param43 = ch43.getText().toString().trim();

                String param44 = ch44.getText().toString().trim();


                String param46 = ch46.getText().toString().trim();

                String param47 = ch47.getText().toString().trim();

                String param48 = ch48.getText().toString().trim();

                String param49 = ch49.getText().toString().trim();


                String param51 = ch51.getText().toString().trim();

                String param52 = ch52.getText().toString().trim();

                String param53 = ch53.getText().toString().trim();

                String param54 = ch54.getText().toString().trim();

                String param55 = ch55.getText().toString().trim();

                String param56 = ch56.getText().toString().trim();

                String param57 = ch57.getText().toString().trim();

                String param58 = ch58.getText().toString().trim();

                String param59 = ch59.getText().toString().trim();

                String param60 = ch60.getText().toString().trim();

                String param61 = ch61.getText().toString().trim();

                String param62 = ch62.getText().toString().trim();

                String param63 = ch63.getText().toString().trim();

                String param64 = ch64.getText().toString().trim();

                String param65 = ch65.getText().toString().trim();
                String param66 = ch66.getText().toString().trim();

                String param67 = ch68.getText().toString().trim();
                String param68 = ch69.getText().toString().trim();
                String param69 = ch70.getText().toString().trim();
                String param70 = ch71.getText().toString().trim();
                String param71 = ch72.getText().toString().trim();
                String param72 = ch73.getText().toString().trim();
                String param73 = ch74.getText().toString().trim();
                String param74 = ch75.getText().toString().trim();
                String param75 = ch76.getText().toString().trim();
                String param76 = ch77.getText().toString().trim();
                String param77 = ch78.getText().toString().trim();
                String param78 = ch79.getText().toString().trim();
                String param79 = ch80.getText().toString().trim();
                String param80 = ch81.getText().toString().trim();
                String param81 = ch82.getText().toString().trim();
                String param82 = ch83.getText().toString().trim();
                String param83 = ch84.getText().toString().trim();
                String param84 = ch85.getText().toString().trim();
                String param85 = ch86.getText().toString().trim();
                String param86 = ch87.getText().toString().trim();
                String param87 = ch89.getText().toString().trim();
                String param89 = ch90.getText().toString().trim();

                //OVERALL

                String param111 = ch111.getText().toString().trim();
                String param112 = ch112.getText().toString().trim();
                String param113 = ch113.getText().toString().trim();
                String param114 = ch114.getText().toString().trim();
                String param115 = ch115.getText().toString().trim();

                Intent inte = getIntent();
                String RoomName = inte.getStringExtra("RoomName");
                String userEmail = inte.getStringExtra("inspector");
                String Time = inte.getStringExtra("Time");

                int index = userEmail.lastIndexOf('@');
                String newuserEmail = userEmail.substring(0, index);
                String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());


                if (First.isChecked()) {


                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param1);
                    reference.setValue("Yes");
                    String userText = text1.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param1);
                    reference.setValue(userText);


                } else {


                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param1);
                    reference.setValue("No");
                    String userText = text1.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param1);
                    reference.setValue(userText);

                }





                if (Second.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param2);
                    reference.setValue("Yes");
                    text2.setVisibility(View.VISIBLE);
                    String userText = text2.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param2);
                    reference.setValue(userText);


                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param2);

                    reference.setValue("No");
                    String userText = text2.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param2);
                    reference.setValue(userText);


                }








                if (Third.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param3);
                    reference.setValue("Yes");
                    text3.setVisibility(View.VISIBLE);
                    String userText = text3.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param3);
                    reference.setValue(userText);


                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param3);

                    reference.setValue("No");
                    String userText = text3.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param3);
                    reference.setValue(userText);

                }







                if (ch4.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param4);
                    reference.setValue("Yes");
                    text4.setVisibility(View.VISIBLE);
                    String userText = text4.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param4);
                    reference.setValue(userText);


                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param4);
                    reference.setValue("No");
                    String userText = text4.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param4);
                    reference.setValue(userText);


                }




                if (ch5.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param5);
                    reference.setValue("Yes");
                    text5.setVisibility(View.VISIBLE);
                    String userText = text5.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param5);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param5);

                    reference.setValue("No");
                    String userText = text5.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param5);
                    reference.setValue(userText);


                }




                if (ch6.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param6);
                    reference.setValue("Yes");
                    text6.setVisibility(View.VISIBLE);
                    String userText = text6.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param6);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param6);

                    reference.setValue("No");
                    String userText = text6.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param6);
                    reference.setValue(userText);


                }



                if (ch7.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param7);
                    reference.setValue("Yes");
                    String userText = text7.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param7);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param7);

                    reference.setValue("No");
                    String userText = text7.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param7);
                    reference.setValue(userText);


                }




                if (ch8.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param8);
                    reference.setValue("Yes");
                    String userText = text8.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param8);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param8);

                    reference.setValue("No");
                    String userText = text8.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param8);
                    reference.setValue(userText);


                }







                if (ch9.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param9);
                    reference.setValue("Yes");
                    String userText = text9.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param9);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param9);

                    reference.setValue("No");
                    String userText = text9.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param9);
                    reference.setValue(userText);


                }


                if (ch10.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param10);
                    reference.setValue("Yes");
                    String userText = text10.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param10);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param10);

                    reference.setValue("No");
                    String userText = text10.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param10);
                    reference.setValue(userText);


                }




                if (ch11.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param11);
                    reference.setValue("Yes");
                    String userText = text11.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param11);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param11);

                    reference.setValue("No");
                    String userText = text11.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param11);
                    reference.setValue(userText);


                }







                if (ch12.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param12);
                    reference.setValue("Yes");
                    String userText = text12.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param12);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param12);

                    reference.setValue("No");
                    String userText = text12.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param12);
                    reference.setValue(userText);

                }


                if (ch13.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param13);
                    reference.setValue("Yes");
                    String userText = text13.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param13);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param13);

                    reference.setValue("No");
                    String userText = text13.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param13);
                    reference.setValue(userText);


                }








                if (ch14.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param14);
                    reference.setValue("Yes");
                    String userText = text14.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param14);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param14);

                    reference.setValue("No");
                    String userText = text14.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param14);
                    reference.setValue(userText);


                }



                if (ch15.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param15);
                    reference.setValue("Yes");
                    String userText = text15.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param15);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param15);

                    reference.setValue("No");
                    String userText = text15.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param15);
                    reference.setValue(userText);

                }


                if (ch16.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param16);
                    reference.setValue("Yes");
                    String userText = text16.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param16);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param16);

                    reference.setValue("No");
                    String userText = text16.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param16);
                    reference.setValue(userText);


                }




                if (ch17.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param17);
                    reference.setValue("Yes");
                    String userText = text17.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param17);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param17);

                    reference.setValue("No");
                    String userText = text17.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param17);
                    reference.setValue(userText);


                }




         /*       if (ch18.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time.cchild("Checklist).hild(param18);
                    reference.setValue("Yes");
                    String userText = text18.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time.cchild("Checklist).hild("Remarks").child(param18);
                    reference.setValue(userText);


                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time.cchild("Checklist).hild(param18);

                    reference.setValue("No");
                    String userText = text18.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time.cchild("Checklist).hild("Remarks").child(param18);
                    reference.setValue(userText);


                }*/



                if (ch19.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param19);
                    reference.setValue("Yes");
                    String userText = text19.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param19);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param19);

                    reference.setValue("No");
                    String userText = text19.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param19);
                    reference.setValue(userText);


                }



                if (ch20.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param20);
                    reference.setValue("Yes");
                    String userText = text20.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param20);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param20);

                    reference.setValue("No");
                    String userText = text20.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param20);
                    reference.setValue(userText);


                }




                if (ch21.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param21);
                    reference.setValue("Yes");
                    String userText = text21.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param21);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param21);

                    reference.setValue("No");
                    String userText = text21.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param21);
                    reference.setValue(userText);

                }




                if (ch22.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param22);
                    reference.setValue("Yes");
                    String userText = text22.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param22);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param22);

                    reference.setValue("No");

                    String userText = text22.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param22);
                    reference.setValue(userText);
                }








                if (ch23.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param23);
                    reference.setValue("Yes");
                    String userText = text23.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param23);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param23);

                    reference.setValue("No");
                    String userText = text23.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param23);
                    reference.setValue(userText);


                }




                if (ch24.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param24);
                    reference.setValue("Yes");
                    String userText = text24.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param24);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param24);

                    reference.setValue("No");
                    String userText = text24.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param24);
                    reference.setValue(userText);

                }



                if (ch25.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param25);
                    reference.setValue("Yes");
                    String userText = text25.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param25);
                    reference.child("Remarks").setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param25);

                    reference.setValue("No");
                    String userText = text25.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param25);
                    reference.child("Remarks").setValue(userText);

                }




                if (ch26.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param26);
                    reference.setValue("Yes");
                    String userText = text26.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param26);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param26);

                    reference.setValue("No");
                    String userText = text26.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param26);
                    reference.setValue(userText);

                }




                if (ch27.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param27);
                    reference.setValue("Yes");
                    String userText = text27.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param27);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param27);

                    reference.setValue("No");
                    String userText = text27.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param27);
                    reference.setValue(userText);


                }


                if (ch28.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param28);
                    reference.setValue("Yes");
                    String userText = text28.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param28);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param28);

                    reference.setValue("No");
                    String userText = text28.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param28);
                    reference.setValue(userText);

                }




                if (ch29.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param29);
                    reference.setValue("Yes");
                    String userText = text29.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param29);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param29);

                    reference.setValue("No");
                    String userText = text29.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param29);
                    reference.setValue(userText);


                }




                if (ch30.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param30);
                    reference.setValue("Yes");
                    String userText = text30.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param30);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param30);

                    reference.setValue("No");
                    String userText = text30.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param30);
                    reference.setValue(userText);

                }



                if (ch31.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param31);
                    reference.setValue("Yes");
                    String userText = text31.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param31);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param31);

                    reference.setValue("No");
                    String userText = text31.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param31);
                    reference.setValue(userText);


                }











                if (ch34.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param34);
                    reference.setValue("Yes");
                    String userText = text34.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param34);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param34);

                    reference.setValue("No");
                    String userText = text34.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param34);
                    reference.setValue(userText);

                }




                if (ch35.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param35);
                    reference.setValue("Yes");
                    String userText = text35.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param35);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param35);

                    reference.setValue("No");
                    String userText = text35.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param35);
                    reference.setValue(userText);

                }


                if (ch36.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param36);
                    reference.setValue("Yes");
                    String userText = text36.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param36);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param36);

                    reference.setValue("No");
                    String userText = text36.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param36);
                    reference.setValue(userText);


                }



                if (ch37.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param37);
                    reference.setValue("Yes");
                    String userText = text37.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param37);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param37);

                    reference.setValue("No");
                    String userText = text37.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param37);
                    reference.setValue(userText);


                }




                if (ch38.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param38);
                    reference.setValue("Yes");
                    String userText = text38.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param38);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param38);

                    reference.setValue("No");
                    String userText = text38.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param38);
                    reference.setValue(userText);


                }




                if (ch39.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param39);
                    reference.setValue("Yes");
                    String userText = text39.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param39);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param39);

                    reference.setValue("No");
                    String userText = text39.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param39);
                    reference.setValue(userText);

                }




                if (ch40.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param40);
                    reference.setValue("Yes");
                    String userText = text40.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param40);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param40);

                    reference.setValue("No");
                    String userText = text40.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param40);
                    reference.setValue(userText);


                }




                if (ch41.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param41);
                    reference.setValue("Yes");
                    String userText = text41.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param41);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param41);

                    reference.setValue("No");
                    String userText = text41.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param41);
                    reference.setValue(userText);


                }




                if (ch42.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param42);
                    reference.setValue("Yes");
                    String userText = text42.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param42);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param42);

                    reference.setValue("No");
                    String userText = text42.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param42);
                    reference.setValue(userText);

                }




                if (ch43.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param43);
                    reference.setValue("Yes");
                    String userText = text43.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param43);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param43);

                    reference.setValue("No");
                    String userText = text43.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param43);
                    reference.setValue(userText);

                }




                if (ch44.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param44);
                    reference.setValue("Yes");
                    String userText = text44.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param44);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param44);

                    reference.setValue("No");
                    String userText = text44.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param44);
                    reference.setValue(userText);

                }








                if (ch46.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param46);
                    reference.setValue("Yes");
                    String userText = text46.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param46);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param46);

                    reference.setValue("No");
                    String userText = text46.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param46);
                    reference.setValue(userText);


                }




                if (ch47.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param47);
                    reference.setValue("Yes");
                    String userText = text47.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param47);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param47);

                    reference.setValue("No");
                    String userText = text47.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param47);
                    reference.setValue(userText);

                }




                if (ch48.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param48);
                    reference.setValue("Yes");
                    String userText = text48.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param48);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param48);

                    reference.setValue("No");
                    String userText = text48.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param48);
                    reference.setValue(userText);

                }




                if (ch49.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param49);
                    reference.setValue("Yes");
                    String userText = text49.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param49);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param49);

                    reference.setValue("No");
                    String userText = text49.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param49);
                    reference.setValue(userText);

                }




                if (ch51.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param51);
                    reference.setValue("Yes");
                    String userText = text51.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param51);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param51);

                    reference.setValue("No");
                    String userText = text51.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param51);
                    reference.setValue(userText);

                }




                if (ch52.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param52);
                    reference.setValue("Yes");
                    String userText = text52.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param52);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param52);

                    reference.setValue("No");
                    String userText = text52.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param52);
                    reference.setValue(userText);

                }



                if (ch53.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param53);
                    reference.setValue("Yes");
                    String userText = text53.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param53);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param53);

                    reference.setValue("No");
                    String userText = text53.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param53);
                    reference.setValue(userText);

                }




                if (ch54.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param54);
                    reference.setValue("Yes");
                    String userText = text54.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param54);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param54);

                    reference.setValue("No");
                    String userText = text54.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param54);
                    reference.setValue(userText);

                }




                if (ch55.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param55);
                    reference.setValue("Yes");
                    String userText = text55.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param55);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param55);

                    reference.setValue("No");
                    String userText = text55.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param55);
                    reference.setValue(userText);

                }




                if (ch56.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param56);
                    reference.setValue("Yes");
                    String userText = text56.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param56);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param56);

                    reference.setValue("No");
                    String userText = text56.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param56);
                    reference.setValue(userText);

                }



                if (ch57.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param57);
                    reference.setValue("Yes");
                    String userText = text57.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param57);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param57);

                    reference.setValue("No");
                    String userText = text57.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param57);
                    reference.setValue(userText);

                }




                if (ch58.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param58);
                    reference.setValue("Yes");
                    String userText = text58.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param58);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param58);

                    reference.setValue("No");
                    String userText = text58.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param58);
                    reference.setValue(userText);


                }




                if (ch59.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param59);
                    reference.setValue("Yes");
                    String userText = text59.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param59);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param59);

                    reference.setValue("No");
                    String userText = text59.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param59);
                    reference.setValue(userText);

                }




                if (ch60.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param60);
                    reference.setValue("Yes");
                    String userText = text60.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param60);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param60);

                    reference.setValue("No");
                    String userText = text60.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param60);
                    reference.setValue(userText);

                }




                if (ch61.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param61);
                    reference.setValue("Yes");
                    String userText = text61.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param61);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param61);

                    reference.setValue("No");
                    String userText = text61.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param61);
                    reference.setValue(userText);

                }




                if (ch62.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param62);
                    reference.setValue("Yes");
                    String userText = text62.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param62);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param62);

                    reference.setValue("No");
                    String userText = text62.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param62);
                    reference.setValue(userText);

                }



                if (ch63.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param63);
                    reference.setValue("Yes");
                    String userText = text63.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param63);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param63);

                    reference.setValue("No");
                    String userText = text63.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param63);
                    reference.setValue(userText);

                }




                if (ch64.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param64);
                    reference.setValue("Yes");
                    String userText = text64.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param64);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param64);

                    reference.setValue("No");
                    String userText = text64.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param64);
                    reference.setValue(userText);

                }




                if (ch65.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param65);
                    reference.setValue("Yes");
                    String userText = text65.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param65);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param65);

                    reference.setValue("No");
                    String userText = text65.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param65);
                    reference.setValue(userText);


                }




                if (ch66.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param66);
                    reference.setValue("Yes");
                    String userText = text66.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param66);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param66);

                    reference.setValue("No");
                    String userText = text66.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param66);
                    reference.setValue(userText);

                }



                if (ch68.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param67);
                    reference.setValue("Yes");
                    String userText = text68.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param67);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param67);

                    reference.setValue("No");
                    String userText = text68.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param67);
                    reference.setValue(userText);

                }




                if (ch69.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param68);
                    reference.setValue("Yes");
                    String userText = text2.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param68);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param68);

                    reference.setValue("No");
                    String userText = text2.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param68);
                    reference.setValue(userText);

                }



                if (ch70.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param69);
                    reference.setValue("Yes");
                    String userText = text70.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param69);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param69);

                    reference.setValue("No");
                    String userText = text70.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param69);
                    reference.setValue(userText);


                }



                if (ch71.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param70);
                    reference.setValue("Yes");
                    String userText = text71.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param70);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param70);

                    reference.setValue("No");
                    String userText = text71.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param70);
                    reference.setValue(userText);


                }




                if (ch72.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param71);
                    reference.setValue("Yes");
                    String userText = text72.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param71);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param71);

                    reference.setValue("No");
                    String userText = text72.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param71);
                    reference.setValue(userText);

                }




                if (ch73.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param72);
                    reference.setValue("Yes");
                    String userText = text73.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param72);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param72);

                    reference.setValue("No");
                    String userText = text73.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param72);
                    reference.setValue(userText);

                }




                if (ch74.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param73);
                    reference.setValue("Yes");
                    String userText = text74.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param73);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param73);

                    reference.setValue("No");
                    String userText = text74.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param73);
                    reference.setValue(userText);

                }




                if (ch75.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param74);
                    reference.setValue("Yes");
                    String userText = text75.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param74);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param74);

                    reference.setValue("No");
                    String userText = text75.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param74);
                    reference.setValue(userText);

                }



                if (ch76.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param75);
                    reference.setValue("Yes");
                    String userText = text76.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param75);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param75);

                    reference.setValue("No");
                    String userText = text76.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param75);
                    reference.setValue(userText);

                }




                if (ch77.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param76);
                    reference.setValue("Yes");
                    String userText = text77.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param76);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param76);

                    reference.setValue("No");
                    String userText = text77.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param76);
                    reference.setValue(userText);

                }





                if (ch78.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param77);
                    reference.setValue("Yes");
                    String userText = text78.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param77);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param77);

                    reference.setValue("No");
                    String userText = text78.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param77);
                    reference.setValue(userText);

                }




                if (ch79.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param78);
                    reference.setValue("Yes");
                    String userText = text79.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param78);
                    reference.setValue(userText);

                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param78);

                    reference.setValue("No");
                    String userText = text79.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param78);
                    reference.setValue(userText);


                }




                if (ch80.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param79);
                    reference.setValue("Yes");
                    String userText = text80.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param79);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param79);

                    reference.setValue("No");
                    String userText = text80.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param79);
                    reference.setValue(userText);

                }




                if (ch81.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param80);
                    reference.setValue("Yes");
                    String userText = text81.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param80);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param80);

                    reference.setValue("No");
                    String userText = text81.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param80);
                    reference.setValue(userText);

                }




                if (ch82.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param81);
                    reference.setValue("Yes");
                    String userText = text82.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param81);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param81);

                    reference.setValue("No");
                    String userText = text82.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param81);
                    reference.setValue(userText);

                }




                if (ch83.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param82);
                    reference.setValue("Yes");
                    String userText = text83.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param82);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param82);

                    reference.setValue("No");
                    String userText = text83.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param82);
                    reference.setValue(userText);

                }




                if (ch84.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param83);
                    reference.setValue("Yes");
                    String userText = text84.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param83);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param83);

                    reference.setValue("No");
                    String userText = text84.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param83);
                    reference.setValue(userText);

                }




                if (ch85.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param84);
                    reference.setValue("Yes");
                    String userText = text85.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param84);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param84);

                    reference.setValue("No");
                    String userText = text85.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param84);
                    reference.setValue(userText);

                }




                if (ch86.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param85);
                    reference.setValue("Yes");
                    String userText = text86.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param85);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param85);

                    reference.setValue("No");
                    String userText = text86.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param85);
                    reference.setValue(userText);

                }




                if (ch87.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param86);
                    reference.setValue("Yes");
                    String userText = text87.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param86);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param86);

                    reference.setValue("No");

                    String userText = text87.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param86);
                    reference.setValue(userText);
                }




                if (ch89.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param87);
                    reference.setValue("Yes");
                    String userText = text89.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param87);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param87);

                    reference.setValue("No");
                    String userText = text89.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param87);
                    reference.setValue(userText);

                }




                if (ch90.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param89);
                    reference.setValue("Yes");
                    String userText = text90.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param89);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param89);

                    reference.setValue("No");
                    String userText = text90.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param89);
                    reference.setValue(userText);

                }


                if (ch111.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param111);
                    reference.setValue("Yes");
                    String userText = text111.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param111);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param111);

                    reference.setValue("No");
                    String userText = text111.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param111);
                    reference.setValue(userText);

                }



                if (ch112.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param112);
                    reference.setValue("Yes");
                    String userText = text112.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param112);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param112);

                    reference.setValue("No");
                    String userText = text112.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param112);
                    reference.setValue(userText);

                }


                if (ch113.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param113);
                    reference.setValue("Yes");
                    String userText = text113.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param113);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param113);

                    reference.setValue("No");
                    String userText = text113.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param113);
                    reference.setValue(userText);

                }



                if (ch114.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param114);
                    reference.setValue("Yes");
                    String userText = text114.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param114);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param114);

                    reference.setValue("No");
                    String userText = text114.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param114);
                    reference.setValue(userText);

                }



                if (ch115.isChecked()) {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param115);
                    reference.setValue("Yes");
                    String userText = text115.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param115);
                    reference.setValue(userText);
                } else {
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child(param115);

                    reference.setValue("No");
                    String userText = text115.getText().toString();
                    reference = mFirebaseDatabase1.child(RoomName).child(date).child("Inspection").child("Scan-in").child("Inspector").child(newuserEmail).child(Time).child("Checklist").child("Remarks").child(param115);
                    reference.setValue(userText);

                }




//CHECKLIST VALUES GETS SAVED AND REDIRECTS TO THE SCAN-OUT ACTIVIVTY FOR THE INSPECTOR
                Intent inter = getIntent();
                String resultnew = inter.getStringExtra("result");
                Intent mIntent = new Intent(getApplicationContext(), ScannerRed.class);
                mIntent.putExtra("result", resultnew);
                mIntent.putExtra("RoomName", RoomName);
                mIntent.putExtra("userEmail", userEmail);
                mIntent.putExtra("newEmail", newuserEmail);
                startActivity(mIntent);
                finish();
                Toast.makeText(getApplicationContext(), "List Complete!",
                        Toast.LENGTH_LONG).show();



            }

        });


        ///FOR REMARK FIELD VISIBILITY

        txt1btn = (Button) findViewById(R.id.txt1btn);

        txt1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text1.getVisibility() == View. VISIBLE){
                    text1.setVisibility(View.INVISIBLE);

                }else{
                    text1.setVisibility(View.VISIBLE);

                }



            }
        });

        txt2btn = (Button) findViewById(R.id.txt2btn);

        txt2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text2.getVisibility() == View. VISIBLE){
                    text2.setVisibility(View.INVISIBLE);

                }else{
                    text2.setVisibility(View.VISIBLE);

                }



            }
        });
        txt3btn = (Button) findViewById(R.id.txt3btn);

        txt3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text3.getVisibility() == View. VISIBLE){
                    text3.setVisibility(View.INVISIBLE);

                }else{
                    text3.setVisibility(View.VISIBLE);

                }



            }
        });


        txt4btn = (Button) findViewById(R.id.txt4btn);

        txt4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text4.getVisibility() == View. VISIBLE){
                    text4.setVisibility(View.INVISIBLE);

                }else{
                    text4.setVisibility(View.VISIBLE);

                }



            }
        });
        txt5btn = (Button) findViewById(R.id.txt5btn);

        txt5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text5.getVisibility() == View. VISIBLE){
                    text5.setVisibility(View.INVISIBLE);

                }else{
                    text5.setVisibility(View.VISIBLE);

                }



            }
        });
        txt6btn = (Button) findViewById(R.id.txt6btn);

        txt6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text6.getVisibility() == View. VISIBLE){
                    text6.setVisibility(View.INVISIBLE);

                }else{
                    text6.setVisibility(View.VISIBLE);

                }



            }
        });
        txt7btn = (Button) findViewById(R.id.txt7btn);

        txt7btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text7.getVisibility() == View. VISIBLE){
                    text7.setVisibility(View.INVISIBLE);

                }else{
                    text7.setVisibility(View.VISIBLE);

                }



            }
        });
        txt8btn = (Button) findViewById(R.id.txt8btn);

        txt8btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text8.getVisibility() == View. VISIBLE){
                    text8.setVisibility(View.INVISIBLE);

                }else{
                    text8.setVisibility(View.VISIBLE);

                }



            }
        });
        txt9btn = (Button) findViewById(R.id.txt9btn);

        txt9btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text9.getVisibility() == View. VISIBLE){
                    text9.setVisibility(View.INVISIBLE);

                }else{
                    text9.setVisibility(View.VISIBLE);

                }



            }
        });
        txt10btn = (Button) findViewById(R.id.txt10btn);

        txt10btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text10.getVisibility() == View. VISIBLE){
                    text10.setVisibility(View.INVISIBLE);

                }else{
                    text10.setVisibility(View.VISIBLE);

                }



            }
        });

        txt11btn = (Button) findViewById(R.id.txt11btn);

        txt11btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text11.getVisibility() == View. VISIBLE){
                    text11.setVisibility(View.INVISIBLE);

                }else{
                    text11.setVisibility(View.VISIBLE);

                }



            }
        });
        txt12btn = (Button) findViewById(R.id.txt12btn);

        txt12btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text12.getVisibility() == View. VISIBLE){
                    text12.setVisibility(View.INVISIBLE);

                }else{
                    text12.setVisibility(View.VISIBLE);

                }



            }
        });

        txt13btn = (Button) findViewById(R.id.txt13btn);

        txt13btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text13.getVisibility() == View. VISIBLE){
                    text13.setVisibility(View.INVISIBLE);

                }else{
                    text13.setVisibility(View.VISIBLE);

                }



            }
        });
        txt14btn = (Button) findViewById(R.id.txt14btn);

        txt14btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text14.getVisibility() == View. VISIBLE){
                    text14.setVisibility(View.INVISIBLE);

                }else{
                    text14.setVisibility(View.VISIBLE);

                }



            }
        });
        txt15btn = (Button) findViewById(R.id.txt15btn);

        txt15btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text15.getVisibility() == View. VISIBLE){
                    text15.setVisibility(View.INVISIBLE);

                }else{
                    text15.setVisibility(View.VISIBLE);

                }



            }
        });

        txt16btn = (Button) findViewById(R.id.txt16btn);

        txt16btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text16.getVisibility() == View. VISIBLE){
                    text16.setVisibility(View.INVISIBLE);

                }else{
                    text16.setVisibility(View.VISIBLE);

                }



            }
        });
        txt17btn = (Button) findViewById(R.id.txt17btn);

        txt17btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text17.getVisibility() == View. VISIBLE){
                    text17.setVisibility(View.INVISIBLE);

                }else{
                    text17.setVisibility(View.VISIBLE);

                }



            }
        });

        txt19btn = (Button) findViewById(R.id.txt19btn);

        txt19btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text19.getVisibility() == View. VISIBLE){
                    text19.setVisibility(View.INVISIBLE);

                }else{
                    text19.setVisibility(View.VISIBLE);

                }



            }
        });
        txt20btn = (Button) findViewById(R.id.txt20btn);

        txt20btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text20.getVisibility() == View. VISIBLE){
                    text20.setVisibility(View.INVISIBLE);

                }else{
                    text20.setVisibility(View.VISIBLE);

                }



            }
        });
        txt21btn = (Button) findViewById(R.id.txt21btn);

        txt21btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text21.getVisibility() == View. VISIBLE){
                    text21.setVisibility(View.INVISIBLE);

                }else{
                    text21.setVisibility(View.VISIBLE);

                }



            }
        });
        txt22btn = (Button) findViewById(R.id.txt22btn);

        txt22btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text22.getVisibility() == View. VISIBLE){
                    text22.setVisibility(View.INVISIBLE);

                }else{
                    text22.setVisibility(View.VISIBLE);

                }



            }
        });
        txt23btn = (Button) findViewById(R.id.txt23btn);

        txt23btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text23.getVisibility() == View. VISIBLE){
                    text23.setVisibility(View.INVISIBLE);

                }else{
                    text23.setVisibility(View.VISIBLE);

                }



            }
        });
        txt24btn = (Button) findViewById(R.id.txt24btn);

        txt24btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text24.getVisibility() == View. VISIBLE){
                    text24.setVisibility(View.INVISIBLE);

                }else{
                    text24.setVisibility(View.VISIBLE);

                }



            }
        });
        txt25btn = (Button) findViewById(R.id.txt25btn);

        txt25btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text25.getVisibility() == View. VISIBLE){
                    text25.setVisibility(View.INVISIBLE);

                }else{
                    text25.setVisibility(View.VISIBLE);

                }



            }
        });
        txt26btn = (Button) findViewById(R.id.txt26btn);

        txt26btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text26.getVisibility() == View. VISIBLE){
                    text26.setVisibility(View.INVISIBLE);

                }else{
                    text26.setVisibility(View.VISIBLE);

                }



            }
        });
        txt27btn = (Button) findViewById(R.id.txt27btn);

        txt27btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text27.getVisibility() == View. VISIBLE){
                    text27.setVisibility(View.INVISIBLE);

                }else{
                    text27.setVisibility(View.VISIBLE);

                }



            }
        });
        txt28btn = (Button) findViewById(R.id.txt28btn);

        txt28btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text28.getVisibility() == View. VISIBLE){
                    text28.setVisibility(View.INVISIBLE);

                }else{
                    text28.setVisibility(View.VISIBLE);

                }



            }
        });
        txt29btn = (Button) findViewById(R.id.txt29btn);

        txt29btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text29.getVisibility() == View. VISIBLE){
                    text29.setVisibility(View.INVISIBLE);

                }else{
                    text29.setVisibility(View.VISIBLE);

                }



            }
        });
        txt30btn = (Button) findViewById(R.id.txt30btn);

        txt30btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text30.getVisibility() == View. VISIBLE){
                    text30.setVisibility(View.INVISIBLE);

                }else{
                    text30.setVisibility(View.VISIBLE);

                }




            }
        });

        txt31btn = (Button) findViewById(R.id.txt31btn);

        txt31btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text31.getVisibility() == View. VISIBLE){
                    text31.setVisibility(View.INVISIBLE);

                }else{
                    text31.setVisibility(View.VISIBLE);

                }



            }
        });

        txt32btn = (Button) findViewById(R.id.txt32btn);

        txt32btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text32.getVisibility() == View. VISIBLE){
                    text32.setVisibility(View.INVISIBLE);

                }else{
                    text32.setVisibility(View.VISIBLE);

                }



            }
        });



        txt34btn = (Button) findViewById(R.id.txt34btn);

        txt34btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text34.getVisibility() == View. VISIBLE){
                    text34.setVisibility(View.INVISIBLE);

                }else{
                    text34.setVisibility(View.VISIBLE);

                }



            }
        });

        txt35btn = (Button) findViewById(R.id.txt35btn);

        txt35btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text35.getVisibility() == View. VISIBLE){
                    text35.setVisibility(View.INVISIBLE);

                }else{
                    text35.setVisibility(View.VISIBLE);

                }



            }
        });

        txt36btn = (Button) findViewById(R.id.txt36btn);

        txt36btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text36.getVisibility() == View. VISIBLE){
                    text36.setVisibility(View.INVISIBLE);

                }else{
                    text36.setVisibility(View.VISIBLE);

                }



            }
        });

        txt37btn = (Button) findViewById(R.id.txt37btn);

        txt37btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text37.getVisibility() == View. VISIBLE){
                    text37.setVisibility(View.INVISIBLE);

                }else{
                    text37.setVisibility(View.VISIBLE);

                }



            }
        });

        txt38btn = (Button) findViewById(R.id.txt38btn);

        txt38btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text38.getVisibility() == View. VISIBLE){
                    text38.setVisibility(View.INVISIBLE);

                }else{
                    text38.setVisibility(View.VISIBLE);

                }



            }
        });

        txt39btn = (Button) findViewById(R.id.txt39btn);

        txt39btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text39.getVisibility() == View. VISIBLE){
                    text1.setVisibility(View.INVISIBLE);

                }else{
                    text39.setVisibility(View.VISIBLE);

                }



            }
        });

        txt40btn = (Button) findViewById(R.id.txt40btn);

        txt40btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text40.getVisibility() == View. VISIBLE){
                    text40.setVisibility(View.INVISIBLE);

                }else{
                    text40.setVisibility(View.VISIBLE);

                }



            }
        });

        txt41btn = (Button) findViewById(R.id.txt41btn);

        txt41btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text41.getVisibility() == View. VISIBLE){
                    text41.setVisibility(View.INVISIBLE);

                }else{
                    text41.setVisibility(View.VISIBLE);

                }



            }
        });

        txt42btn = (Button) findViewById(R.id.txt42btn);

        txt42btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text42.getVisibility() == View. VISIBLE){
                    text42.setVisibility(View.INVISIBLE);

                }else{
                    text42.setVisibility(View.VISIBLE);

                }



            }
        });

        txt43btn = (Button) findViewById(R.id.txt43btn);

        txt43btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text43.getVisibility() == View. VISIBLE){
                    text43.setVisibility(View.INVISIBLE);

                }else{
                    text43.setVisibility(View.VISIBLE);

                }



            }
        });

        txt44btn = (Button) findViewById(R.id.txt44btn);

        txt44btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text44.getVisibility() == View. VISIBLE){
                    text44.setVisibility(View.INVISIBLE);

                }else{
                    text44.setVisibility(View.VISIBLE);

                }



            }
        });



        txt46btn = (Button) findViewById(R.id.txt46btn);

        txt46btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text46.getVisibility() == View. VISIBLE){
                    text46.setVisibility(View.INVISIBLE);

                }else{
                    text46.setVisibility(View.VISIBLE);

                }



            }
        });

        txt47btn = (Button) findViewById(R.id.txt47btn);

        txt47btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text47.getVisibility() == View. VISIBLE){
                    text47.setVisibility(View.INVISIBLE);

                }else{
                    text47.setVisibility(View.VISIBLE);

                }



            }
        });

        txt48btn = (Button) findViewById(R.id.txt48btn);

        txt48btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text48.getVisibility() == View. VISIBLE){
                    text48.setVisibility(View.INVISIBLE);

                }else{
                    text48.setVisibility(View.VISIBLE);

                }



            }
        });

        txt49btn = (Button) findViewById(R.id.txt49btn);

        txt49btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text49.getVisibility() == View. VISIBLE){
                    text49.setVisibility(View.INVISIBLE);

                }else{
                    text49.setVisibility(View.VISIBLE);

                }



            }
        });


        txt51btn = (Button) findViewById(R.id.txt51btn);


        txt51btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text51.getVisibility() == View. VISIBLE){
                    text51.setVisibility(View.INVISIBLE);

                }else{
                    text51.setVisibility(View.VISIBLE);

                }



            }
        });
        txt52btn = (Button) findViewById(R.id.txt52btn);


        txt52btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text52.getVisibility() == View. VISIBLE){
                    text52.setVisibility(View.INVISIBLE);

                }else{
                    text52.setVisibility(View.VISIBLE);

                }



            }
        });

        txt53btn = (Button) findViewById(R.id.txt53btn);

        txt53btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text53.getVisibility() == View. VISIBLE){
                    text53.setVisibility(View.INVISIBLE);

                }else{
                    text53.setVisibility(View.VISIBLE);

                }



            }
        });

        txt54btn = (Button) findViewById(R.id.txt54btn);

        txt54btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text54.getVisibility() == View. VISIBLE){
                    text54.setVisibility(View.INVISIBLE);

                }else{
                    text54.setVisibility(View.VISIBLE);

                }



            }
        });
        txt55btn = (Button) findViewById(R.id.txt55btn);


        txt55btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text55.getVisibility() == View. VISIBLE){
                    text55.setVisibility(View.INVISIBLE);

                }else{
                    text55.setVisibility(View.VISIBLE);

                }



            }
        });

        txt56btn = (Button) findViewById(R.id.txt56btn);

        txt56btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text56.getVisibility() == View. VISIBLE){
                    text56.setVisibility(View.INVISIBLE);

                }else{
                    text56.setVisibility(View.VISIBLE);

                }



            }
        });

        txt57btn = (Button) findViewById(R.id.txt57btn);

        txt57btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text57.getVisibility() == View. VISIBLE){
                    text57.setVisibility(View.INVISIBLE);

                }else{
                    text57.setVisibility(View.VISIBLE);

                }



            }
        });

        txt58btn = (Button) findViewById(R.id.txt58btn);

        txt58btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text58.getVisibility() == View. VISIBLE){
                    text58.setVisibility(View.INVISIBLE);

                }else{
                    text58.setVisibility(View.VISIBLE);

                }



            }
        });

        txt59btn = (Button) findViewById(R.id.txt59btn);

        txt59btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text59.getVisibility() == View. VISIBLE){
                    text59.setVisibility(View.INVISIBLE);

                }else{
                    text59.setVisibility(View.VISIBLE);

                }



            }
        });

        txt60btn = (Button) findViewById(R.id.txt60btn);

        txt60btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text60.getVisibility() == View. VISIBLE){
                    text60.setVisibility(View.INVISIBLE);

                }else{
                    text60.setVisibility(View.VISIBLE);

                }



            }
        });

        txt61btn = (Button) findViewById(R.id.txt61btn);

        txt61btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text61.getVisibility() == View. VISIBLE){
                    text61.setVisibility(View.INVISIBLE);

                }else{
                    text61.setVisibility(View.VISIBLE);

                }



            }
        });

        txt62btn = (Button) findViewById(R.id.txt62btn);

        txt62btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text62.getVisibility() == View. VISIBLE){
                    text62.setVisibility(View.INVISIBLE);

                }else{
                    text62.setVisibility(View.VISIBLE);

                }



            }
        });

        txt63btn = (Button) findViewById(R.id.txt63btn);

        txt63btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text63.getVisibility() == View. VISIBLE){
                    text63.setVisibility(View.INVISIBLE);

                }else{
                    text63.setVisibility(View.VISIBLE);

                }



            }
        });

        txt64btn = (Button) findViewById(R.id.txt64btn);

        txt64btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text64.getVisibility() == View. VISIBLE){
                    text64.setVisibility(View.INVISIBLE);

                }else{
                    text64.setVisibility(View.VISIBLE);

                }



            }
        });

        txt65btn = (Button) findViewById(R.id.txt65btn);

        txt65btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text65.getVisibility() == View. VISIBLE){
                    text65.setVisibility(View.INVISIBLE);

                }else{
                    text65.setVisibility(View.VISIBLE);

                }



            }
        });

        txt66btn = (Button) findViewById(R.id.txt66btn);

        txt66btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text66.getVisibility() == View. VISIBLE){
                    text66.setVisibility(View.INVISIBLE);

                }else{
                    text66.setVisibility(View.VISIBLE);

                }



            }
        });
        txt67btn = (Button) findViewById(R.id.txt67btn);

        txt67btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text67.getVisibility() == View. VISIBLE){
                    text67.setVisibility(View.INVISIBLE);

                }else{
                    text67.setVisibility(View.VISIBLE);

                }



            }
        });
        txt68btn = (Button) findViewById(R.id.txt68btn);

        txt68btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text68.getVisibility() == View. VISIBLE){
                    text68.setVisibility(View.INVISIBLE);

                }else{
                    text68.setVisibility(View.VISIBLE);

                }



            }
        });

        txt69btn = (Button) findViewById(R.id.txt69btn);

        txt69btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text69.getVisibility() == View. VISIBLE){
                    text69.setVisibility(View.INVISIBLE);

                }else{
                    text69.setVisibility(View.VISIBLE);

                }



            }
        });

        txt70btn = (Button) findViewById(R.id.txt70btn);

        txt70btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text70.getVisibility() == View. VISIBLE){
                    text70.setVisibility(View.INVISIBLE);

                }else{
                    text70.setVisibility(View.VISIBLE);

                }



            }
        });

        txt71btn = (Button) findViewById(R.id.txt71btn);

        txt71btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text71.getVisibility() == View. VISIBLE){
                    text71.setVisibility(View.INVISIBLE);

                }else{
                    text71.setVisibility(View.VISIBLE);

                }



            }
        });

        txt72btn = (Button) findViewById(R.id.txt72btn);

        txt72btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text72.getVisibility() == View. VISIBLE){
                    text72.setVisibility(View.INVISIBLE);

                }else{
                    text72.setVisibility(View.VISIBLE);

                }



            }
        });

        txt73btn = (Button) findViewById(R.id.txt73btn);

        txt73btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text73.getVisibility() == View. VISIBLE){
                    text73.setVisibility(View.INVISIBLE);

                }else{
                    text73.setVisibility(View.VISIBLE);

                }



            }
        });

        txt74btn = (Button) findViewById(R.id.txt74btn);

        txt74btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text74.getVisibility() == View. VISIBLE){
                    text74.setVisibility(View.INVISIBLE);

                }else{
                    text74.setVisibility(View.VISIBLE);

                }



            }
        });

        txt75btn = (Button) findViewById(R.id.txt75btn);

        txt75btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text75.getVisibility() == View. VISIBLE){
                    text75.setVisibility(View.INVISIBLE);

                }else{
                    text75.setVisibility(View.VISIBLE);

                }



            }
        });

        txt76btn = (Button) findViewById(R.id.txt76btn);

        txt76btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text76.getVisibility() == View. VISIBLE){
                    text76.setVisibility(View.INVISIBLE);

                }else{
                    text76.setVisibility(View.VISIBLE);

                }



            }
        });

        txt77btn = (Button) findViewById(R.id.txt77btn);

        txt77btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text77.getVisibility() == View. VISIBLE){
                    text77.setVisibility(View.INVISIBLE);

                }else{
                    text77.setVisibility(View.VISIBLE);

                }



            }
        });

        txt78btn = (Button) findViewById(R.id.txt78btn);

        txt78btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text78.getVisibility() == View. VISIBLE){
                    text78.setVisibility(View.INVISIBLE);

                }else{
                    text78.setVisibility(View.VISIBLE);

                }



            }
        });

        txt79btn = (Button) findViewById(R.id.txt79btn);

        txt79btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text79.getVisibility() == View. VISIBLE){
                    text79.setVisibility(View.INVISIBLE);

                }else{
                    text79.setVisibility(View.VISIBLE);

                }



            }
        });

        txt80btn = (Button) findViewById(R.id.txt80btn);

        txt80btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text80.getVisibility() == View. VISIBLE){
                    text80.setVisibility(View.INVISIBLE);

                }else{
                    text80.setVisibility(View.VISIBLE);

                }



            }
        });

        txt81btn = (Button) findViewById(R.id.txt81btn);

        txt81btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text81.getVisibility() == View. VISIBLE){
                    text81.setVisibility(View.INVISIBLE);

                }else{
                    text81.setVisibility(View.VISIBLE);

                }



            }
        });

        txt82btn = (Button) findViewById(R.id.txt82btn);

        txt82btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text82.getVisibility() == View. VISIBLE){
                    text82.setVisibility(View.INVISIBLE);

                }else{
                    text82.setVisibility(View.VISIBLE);

                }



            }
        });

        txt83btn = (Button) findViewById(R.id.txt83btn);

        txt83btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text83.getVisibility() == View. VISIBLE){
                    text83.setVisibility(View.INVISIBLE);

                }else{
                    text83.setVisibility(View.VISIBLE);

                }



            }
        });
        txt84btn = (Button) findViewById(R.id.txt84btn);

        txt84btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text84.getVisibility() == View. VISIBLE){
                    text84.setVisibility(View.INVISIBLE);

                }else{
                    text84.setVisibility(View.VISIBLE);

                }



            }
        });
        txt85btn = (Button) findViewById(R.id.txt85btn);

        txt85btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text85.getVisibility() == View. VISIBLE){
                    text85.setVisibility(View.INVISIBLE);

                }else{
                    text85.setVisibility(View.VISIBLE);

                }



            }
        });
        txt86btn = (Button) findViewById(R.id.txt86btn);

        txt86btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text86.getVisibility() == View. VISIBLE){
                    text86.setVisibility(View.INVISIBLE);

                }else{
                    text86.setVisibility(View.VISIBLE);

                }



            }
        });

        txt87btn = (Button) findViewById(R.id.txt87btn);

        txt87btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text87.getVisibility() == View. VISIBLE){
                    text87.setVisibility(View.INVISIBLE);

                }else{
                    text87.setVisibility(View.VISIBLE);

                }



            }
        });



        txt89btn = (Button) findViewById(R.id.txt89btn);


        txt89btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text89.getVisibility() == View. VISIBLE){
                    text89.setVisibility(View.INVISIBLE);

                }else{
                    text89.setVisibility(View.VISIBLE);

                }



            }
        });

        txt90btn = (Button) findViewById(R.id.txt90btn);

        txt90btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text90.getVisibility() == View. VISIBLE){
                    text90.setVisibility(View.INVISIBLE);

                }else{
                    text90.setVisibility(View.VISIBLE);

                }



            }
        });

        txt91btn = (Button) findViewById(R.id.txt91btn);

        txt91btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text91.getVisibility() == View. VISIBLE){
                    text91.setVisibility(View.INVISIBLE);

                }else{
                    text91.setVisibility(View.VISIBLE);

                }



            }
        });

        txt92btn = (Button) findViewById(R.id.txt92btn);

        txt92btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text92.getVisibility() == View. VISIBLE){
                    text92.setVisibility(View.INVISIBLE);

                }else{
                    text92.setVisibility(View.VISIBLE);

                }



            }
        });

        txt93btn = (Button) findViewById(R.id.txt93btn);

        txt93btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text93.getVisibility() == View. VISIBLE){
                    text93.setVisibility(View.INVISIBLE);

                }else{
                    text93.setVisibility(View.VISIBLE);

                }



            }
        });



        txt111btn = (Button) findViewById(R.id.txt111btn);

        txt111btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text111.getVisibility() == View. VISIBLE){
                    text111.setVisibility(View.INVISIBLE);

                }else{
                    text111.setVisibility(View.VISIBLE);

                }



            }
        });



        txt112btn = (Button) findViewById(R.id.txt112btn);

        txt112btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text112.getVisibility() == View. VISIBLE){
                    text112.setVisibility(View.INVISIBLE);

                }else{
                    text112.setVisibility(View.VISIBLE);

                }



            }
        });


        txt113btn = (Button) findViewById(R.id.txt113btn);

        txt113btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text113.getVisibility() == View. VISIBLE){
                    text113.setVisibility(View.INVISIBLE);

                }else{
                    text113.setVisibility(View.VISIBLE);

                }



            }
        });



        txt114btn = (Button) findViewById(R.id.txt114btn);

        txt114btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text114.getVisibility() == View. VISIBLE){
                    text114.setVisibility(View.INVISIBLE);

                }else{
                    text114.setVisibility(View.VISIBLE);

                }



            }
        });


        txt115btn = (Button) findViewById(R.id.txt115btn);

        txt115btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (text115.getVisibility() == View. VISIBLE){
                    text115.setVisibility(View.INVISIBLE);

                }else{
                    text115.setVisibility(View.VISIBLE);

                }



            }
        });




    }


    //RETURN TO ORIGINAL STATE IF BACK IS PRESSED
    @Override
    public void onBackPressed() {
        String message = "READY FOR INSPECTION";
        Intent inte = getIntent();
        String RoomName = inte.getStringExtra("RoomName");
        DatabaseReference reference = mFirebaseDatabase1.child(RoomName).child("RoomStatus");
        reference.setValue(message);


        Intent mIntent = new Intent(getApplicationContext(), ScannerParent.class);
        startActivity(mIntent);
        finish();
    }


}



