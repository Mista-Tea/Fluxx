package com.cse326.anthonylenox.fluxx;

import com.cse326.anthonylenox.fluxx.util.SystemUiHider;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class TitleSceen extends Activity implements View.OnClickListener {


    private Button btnClickSettings;
    private Button btnClickHost;
    private Button btnClickSearch;
    private Button btnClickJoin;
    private Button btnClickLobby;
    private Button backBtnSettings;
    private Button backBtnHost;
    private Button backBtnSearch;
    private Button backBtnJoin;
    private Button backBtnLobby;
    private Button joinBtn1;
    private Button joinBtn2;
    private Button joinBtn3;
    private Button joinBtn4;
    private Button joinBtn5;
    private Button refresh;
    private Button start;
    private View home;
    private View search;
    private View host;
    private View settings;
    private View join;
    private View lobby;
    private View board;
    private TextView serverName;
    private TextView hostName;
    private EditText gameName;
    private Spinner numPlayers;
    private EditText playerName;

    int numGames;
    private String[] joinableGames;
    private Integer[] serverPopulations;
    private Button[] joinBtns;

    private String server;
    private String currentHost;
    private Integer maxPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_title_sceen);
        btnClickSettings = (Button) findViewById(R.id.button3);
        btnClickHost = (Button) findViewById(R.id.button);
        btnClickSearch = (Button) findViewById(R.id.button2);
        btnClickJoin = (Button) findViewById(R.id.search);
        btnClickLobby = (Button) findViewById(R.id.createGame);
        backBtnSettings = (Button) findViewById(R.id.back_button);
        backBtnHost = (Button) findViewById(R.id.back_button2);
        backBtnSearch = (Button) findViewById(R.id.back_button3);
        backBtnJoin = (Button) findViewById(R.id.back_button4);
        backBtnLobby = (Button) findViewById(R.id.back_buttonLobby);
        joinBtn1 = (Button) findViewById(R.id.join1);
        joinBtn2 = (Button) findViewById(R.id.join2);
        joinBtn3 = (Button) findViewById(R.id.join3);
        joinBtn4 = (Button) findViewById(R.id.join4);
        joinBtn5 = (Button) findViewById(R.id.join5);
        refresh = (Button) findViewById(R.id.refresh);
        start = (Button) findViewById(R.id.startBtn);
        home = findViewById(R.id.Home);
        search = findViewById(R.id.SearchGame);
        host = findViewById(R.id.HostGame);
        settings = findViewById(R.id.Settings);
        join = findViewById(R.id.JoinGame);
        lobby = findViewById(R.id.Lobby);
        board = findViewById(R.id.Board);
        serverName = (TextView) findViewById(R.id.serverText);
        hostName = (TextView) findViewById(R.id.HostName);
        gameName = (EditText) findViewById(R.id.editText2);
        numPlayers = (Spinner) findViewById(R.id.spinner);
        playerName = (EditText) findViewById(R.id.editText);


        btnClickSearch.setOnClickListener(this);
        btnClickHost.setOnClickListener(this);
        btnClickSettings.setOnClickListener(this);
        btnClickJoin.setOnClickListener(this);
        btnClickLobby.setOnClickListener(this);
        backBtnSettings.setOnClickListener(this);
        backBtnHost.setOnClickListener(this);
        backBtnSearch.setOnClickListener(this);
        backBtnJoin.setOnClickListener(this);
        backBtnLobby.setOnClickListener(this);
        joinBtn1.setOnClickListener(this);
        joinBtn2.setOnClickListener(this);
        joinBtn3.setOnClickListener(this);
        joinBtn4.setOnClickListener(this);
        joinBtn5.setOnClickListener(this);
        refresh.setOnClickListener(this);
        start.setOnClickListener(this);

        joinBtns = new Button[5];
        joinableGames = new String[5];
        serverPopulations = new Integer[5];

        joinBtns[0]=joinBtn1;
        joinBtns[1]=joinBtn2;
        joinBtns[2]=joinBtn3;
        joinBtns[3]=joinBtn4;
        joinBtns[4]=joinBtn5;

        try{
           // BufferedReader in = new BufferedReader(new FileReader("Profile"));
            InputStream in = getAssets().open("Profile.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            currentHost = reader.readLine();
            playerName.setText(currentHost);
            in.close();
        }
        catch(Throwable t){
            Toast.makeText(this, "Exception: " + t.toString(), Toast.LENGTH_LONG).show();
        }


    }


    public void onClick(View v) {
        if (v == btnClickSettings) {
            home.setVisibility(View.GONE);
            settings.setVisibility(View.VISIBLE);
        }
        if (v == btnClickHost)
        {
            home.setVisibility(View.GONE);
            host.setVisibility(View.VISIBLE);
        }
        if (v == btnClickSearch)
        {
            home.setVisibility(View.GONE);
            search.setVisibility(View.VISIBLE);
        }
        if (v == btnClickJoin)
        {
            search.setVisibility(View.GONE);
            join.setVisibility(View.VISIBLE);
        }
        if (v == btnClickLobby)
        {
            //data to get from networking

            server = gameName.getText().toString();
            currentHost = playerName.getText().toString();


            host.setVisibility(View.GONE);
            serverName.setText(server + "\nMax Players: " + numPlayers.getSelectedItem().toString());
            hostName.setText(currentHost);
            lobby.setVisibility(View.VISIBLE);
        }
        if(v == start)
        {
            lobby.setVisibility(View.GONE);
            board.setVisibility(View.VISIBLE);
        }

        if((v == backBtnHost) || (v == backBtnSearch))
        {
            host.setVisibility(View.GONE);
            search.setVisibility(View.GONE);
            home.setVisibility(View.VISIBLE);
        }
        if(v == backBtnSettings)
        {
            try {
                OutputStreamWriter out = new OutputStreamWriter(openFileOutput("Profile", MODE_APPEND));
                currentHost = playerName.getText().toString();
                out.write(currentHost);
                out.close();
                //Toast.makeText(this, "Username saved: " + currentHost, Toast.LENGTH_LONG).show();
            }
            catch(Throwable t) {
                Toast.makeText(this, "Exception: " + t.toString(), Toast.LENGTH_LONG).show();
            }
            settings.setVisibility(View.GONE);
            home.setVisibility(View.VISIBLE);
        }
        if(v == backBtnJoin)
        {
            join.setVisibility(View.GONE);
            search.setVisibility(View.VISIBLE);
        }
        if(v == backBtnLobby)
        {
            lobby.setVisibility(View.GONE);
            host.setVisibility(View.VISIBLE);
        }

        if(v == refresh)
        {
            for(int i = 0; i<joinBtns.length; i++)
            {
                joinBtns[i].setVisibility(View.GONE);
            }

            numGames = 3;   //Will be found using networking
            joinableGames[0]="Test Game 1";
            joinableGames[1]="Test Game 2";
            joinableGames[2]="Test Game 3";
            serverPopulations[0]=2;
            serverPopulations[1]=1;
            serverPopulations[2]=4;

            for(int i=0; i<numGames; i++)
            {
                joinBtns[i].setVisibility(View.VISIBLE);
                joinBtns[i].setText("Join Game: " + joinableGames[i] + "\nPlayers: " + serverPopulations[i].toString() + "/4");
            }
        }


    }


    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */


    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */

}
