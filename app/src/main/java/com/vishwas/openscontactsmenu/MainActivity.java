package com.vishwas.openscontactsmenu;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    //here I'm defining PICK_CONTACT constant to pass with intent
    private static final int PICK_CONTACT = 1234;

    Button contButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // In here getting the widgets reference from XML layout
        setContentView(R.layout.activity_main);
        /**
         * Handles click on the button to open the contacts
         *
         */
            contButton=(Button) findViewById(R.id.contactbutton);
        contButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                  * In here using intent to go contact list.
                  * Intent is a kind of message or information that is passed to the components.
                  * It is used to launch an activity, display a web page, send sms, send email etc.
                  *
                */
                Intent contect = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);//creates contact object

                startActivityForResult(contect, PICK_CONTACT);//starts the activity to open contact
            }


            });
        }


    }




