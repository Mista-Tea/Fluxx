package com.example.bhavik.myapplication;

/* Import Statments*/
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.net.UnknownHostException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;

public class MainActivity extends Activity {


    /* Declares the variable and bluetooth adapter and for client server interface*/

    private Button On,Off,Visible,list, host, join;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice>pairedDevices;
    private ListView lv;
    private static ServerSocket serverSocket;
    private static Socket clientSocket;
    private static InputStreamReader inputStreamReader;
    private static BufferedReader bufferedReader;
    private static String message;
    private Socket client;
    private PrintWriter printwriter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /* Reference to button creates instance of it*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        On = (Button)findViewById(R.id.button1);
        Off = (Button)findViewById(R.id.button2);
        Visible = (Button)findViewById(R.id.button3);
        list = (Button)findViewById(R.id.button4);
        host = (Button)findViewById(R.id.button5);
        join = (Button)findViewById(R.id.button6);
        lv = (ListView)findViewById(R.id.listView1);
        BA = BluetoothAdapter.getDefaultAdapter();
    }


    /* Turns the bluetooth on*/
    public void on(View view){
        /* If the bluetooth is not one it sends request to turn on the bluetoothadapter*/
        if (!BA.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
            Toast.makeText(getApplicationContext(),"Turned on"
                    ,Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Already on",
                    Toast.LENGTH_LONG).show();
        }
    }

    /* List the devices on the bluetooth*/
    public void list(View view){
        /* Get list of devices and shows those devices*/
        pairedDevices = BA.getBondedDevices();

        ArrayList list = new ArrayList();
        for(BluetoothDevice bt : pairedDevices)
            list.add(bt.getName());

        Toast.makeText(getApplicationContext(),"Showing Paired Devices",
                Toast.LENGTH_SHORT).show();
        final ArrayAdapter adapter = new ArrayAdapter
                (this,android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);

    }
    /*Turn off the bluetooth*/
    public void off(View view){
        /*Turns the bluetooth off*/
        BA.disable();
        Toast.makeText(getApplicationContext(),"Turned off" ,
                Toast.LENGTH_LONG).show();
    }
    /* Makes the device visible on bluetooth*/
    public void visible(View view){
        Intent getVisible = new Intent(BluetoothAdapter.
                ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible, 0);

    }

/* Host game function acts as server, it listen for clients request and prints out the message*/

    public void host(View view){
        ArrayList tasks = new ArrayList<String>();
        String begin = "Host game has started";
        tasks.add(begin);
        final ArrayAdapter adapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, tasks);
        lv.setAdapter(adapter);
         /* Creates a socket for server and it try to catch error*/
        try {
            serverSocket = new ServerSocket(4444);  //Server socket
        } catch (IOException e) {

            System.out.println("Could not listen on port: 4444");
        }
        String test = "Server started. Listening to the port 4444";
        tasks.add(test);
        adapter.notifyDataSetChanged();
        System.out.println("Server started. Listening to the port 4444");

        while (true) {
            /* Accepts client request and try to print message */
            try {
                clientSocket = serverSocket.accept();   //accept the client connection
                inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
                bufferedReader = new BufferedReader(inputStreamReader); //get the client message
                message = bufferedReader.readLine();


                 tasks.add(message);
                adapter.notifyDataSetChanged();
                        //(this,android.R.layout.simple_list_item_2, message);

                System.out.println(message);
                inputStreamReader.close();
                clientSocket.close();

            } catch (IOException ex) {
                String error = "Problem in message reading";
                System.out.println("Problem in message reading");
                tasks.add(error);
                adapter.notifyDataSetChanged();
            }
        }

    }

    public void join(View view){
        /* Binds to the socket  and try to send message*/
        try {
            message = "test";
            client = new Socket("10.0.2.2", 4444);  //connect to server
            printwriter = new PrintWriter(client.getOutputStream(), true);
            printwriter.write(message);  //write the message to output stream

            printwriter.flush();
            printwriter.close();
            client.close();   //closing the connection

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


/*http://lakjeewa.blogspot.com/2012/03/simple-client-server-application-for.html*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
