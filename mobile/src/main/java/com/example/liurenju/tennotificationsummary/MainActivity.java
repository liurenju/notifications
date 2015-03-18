package com.example.liurenju.tennotificationsummary;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {


    public final static String GROUP_KEY_EMAILS = "group_key_emails";
    String sender1 = "Hello Renju 1";
    String sender2 = "Hello Renju 2";
    String sender3 = "Hello Renju 3";
    String sender4 = "Hello Renju 4";
    String sender5 = "Hello Renju 5";
    String sender6 = "Hello Renju 6";
    String sender7 = "Hello Renju 7";
    String sender8 = "Hello Renju 8";
    String sender9 = "Hello Renju 9";
    String sender10 = "Hello Renju 10";

    public static int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notifyMe(View view) {
        int j = 0;
        //for (; j < 10; j++) {
            Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.largeicon);
            Intent intent = new Intent(this, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

            NotificationCompat.Action action = new NotificationCompat.Action.Builder(
                    R.drawable.ic_launcher, getString(R.string.wearTitle), pendingIntent).build();

            Notification notification1 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender1)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification2 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender2)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification3 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender3)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification4 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender4)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification5 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender5)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification6 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender6)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification7 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender7)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification8 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender8)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification9 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender9)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            Notification notification10 = new NotificationCompat.Builder(this)
                    .setContentTitle("New Email from " + sender10)
                    .setContentText("Info by SchoolSteps")
                    .setSmallIcon(R.drawable.mail)
                    .setLargeIcon(largeIcon)
                    .setGroup(GROUP_KEY_EMAILS)
                    .build();

            int i = 0;
            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            for (; i < 300; i++) {
                String send = "Sending " + Integer.toString(i);
                Notification notific = new NotificationCompat.Builder(this)
                        .setContentTitle("New Email from " + Integer.toString(i))
                        .setContentTitle("Info by SchoolSteps")
                        .setSmallIcon(R.drawable.mail)
                        .setLargeIcon(largeIcon)
                        .setGroup(GROUP_KEY_EMAILS)
                        .build();

                notificationManagerCompat.notify(getId(), notific);
                inboxStyle.addLine(send)
                        .setBigContentTitle(id + " new emails")
                        .setSummaryText("liu396@purdue.edu");
            }


            //NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        /*notificationManagerCompat.notify(getId(), notification1);
        notificationManagerCompat.notify(getId(), notification2);
        notificationManagerCompat.notify(getId(), notification3);
        notificationManagerCompat.notify(getId(), notification4);
        notificationManagerCompat.notify(getId(), notification5);
        notificationManagerCompat.notify(getId(), notification6);
        notificationManagerCompat.notify(getId(), notification7);
        notificationManagerCompat.notify(getId(), notification8);
        notificationManagerCompat.notify(getId(), notification9);
        notificationManagerCompat.notify(getId(), notification10);*/

        /*NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle()
                .addLine(sender1)
                .addLine(sender2)
                .addLine(sender3)
                .addLine(sender4)
                .addLine(sender5)
                .addLine(sender6)
                .addLine(sender7)
                .addLine(sender8)
                .addLine(sender9)
                .addLine(sender10)
                .setBigContentTitle(id + " new emails")
                .setSummaryText("liu396@purdue.edu");*/

        /*Notification notificationSummary = new NotificationCompat.Builder(this)
                .setContentTitle("New Email from " + sender10)
                .setContentText("Info by SchoolSteps")
                .setSmallIcon(R.drawable.mail)
                .setLargeIcon(largeIcon)
                .setGroup(GROUP_KEY_EMAILS)
                .setGroupSummary(true)
                .setStyle(inboxStyle)
                .build();

        notificationManagerCompat.notify(getId(), notificationSummary);

        id = 0;*/

        //}
    }

    public int getId() {
        return ++id;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
