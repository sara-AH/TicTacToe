package com.game.sara.tictactoe;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Dialog;


//sara abu hijleh 1110348

public class twoPlayer extends ActionBarActivity {


    TextView scoreX;
    TextView scoreO;
    int scorex = 1;
    int scoreo = 1;
    LinearLayout l;
    String playone = " Player X ";
    String playtwo = " Player O ";
    int[][] pick = new int[3][3];
    int count = 0;
    static Button[][] panel;
    TextView result;
    static BitmapDrawable[][] icons;
    String wintext = "Do you want to play again ?";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow_player);

//
//        // custom dialog
//        final Dialog dialog = new Dialog(twoPlayer.this);
//        dialog.setContentView(R.layout.activity_play);
//
//        // set the custom dialog components - text, image and button
//        TextView text = (TextView) dialog.findViewById(R.id.dialog_text);
//        text.setText(wintext);
//
//
//        Button dialogButton = (Button) dialog.findViewById(R.id.cancel);
//        // if button is clicked, close the custom dialog
//
//        dialogButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                dialog.dismiss();
//
//            }
//        });

        scorex = getIntent().getIntExtra("scorex", 0);
        scoreo = getIntent().getIntExtra("scoreo", 0);
        init();

        l = (LinearLayout) findViewById(R.id.lin);
        scoreX = (TextView) findViewById(R.id.textView2);
        scoreO = (TextView) findViewById(R.id.textView4);
        result = (TextView) findViewById(R.id.Score);
        Resources res = this.getResources();
        final BitmapDrawable imagex = (BitmapDrawable) res.getDrawable(R.drawable.xplayer);
        final BitmapDrawable imageo = (BitmapDrawable) res.getDrawable(R.drawable.oplayer);

        pick = new int[3][3];
        icons = new BitmapDrawable[3][3];


        int i, j;
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                final int x = i;
                final int y = j;
                panel[i][j].setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        if (pick[x][y] == 0) {
                            count++;
                            if (count % 2 == 1) {
                                pick[x][y] = 1;

                                panel[x][y].setBackgroundDrawable(imagex);
                                result.setText(playtwo);

                                try {
                                    win();
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            } else {
                                pick[x][y] = 2;

                                panel[x][y].setBackgroundDrawable(imageo);
                                result.setText(playone);

                                try {
                                    win();
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            }
                        }

                    }
                });
            }


    }

    @SuppressWarnings("deprecation")
    protected void win() throws InterruptedException {

        Resources res = this.getResources();
        final BitmapDrawable imagex = (BitmapDrawable) res.getDrawable(R.drawable.xplayer2);
        final BitmapDrawable imageo = (BitmapDrawable) res.getDrawable(R.drawable.oplayer2);
        int next = 0;
        if (pick[0][0] == 1 && pick[0][1] == 1 && pick[0][2] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[0][1].setEnabled(true);
            panel[0][2].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imagex);
            panel[0][1].setBackgroundDrawable(imagex);
            panel[0][2].setBackgroundDrawable(imagex);

        } else if (pick[1][0] == 1 && pick[1][1] == 1 && pick[1][2] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[1][0].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[1][2].setEnabled(true);

            panel[1][0].setBackgroundDrawable(imagex);
            panel[1][1].setBackgroundDrawable(imagex);
            panel[1][2].setBackgroundDrawable(imagex);
        } else if (pick[2][0] == 1 && pick[2][1] == 1 && pick[2][2] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[2][0].setEnabled(true);
            panel[2][1].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[2][0].setBackgroundDrawable(imagex);
            panel[2][1].setBackgroundDrawable(imagex);
            panel[2][2].setBackgroundDrawable(imagex);
        } else if (pick[0][0] == 1 && pick[1][1] == 1 && pick[2][2] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imagex);
            panel[1][1].setBackgroundDrawable(imagex);
            panel[2][2].setBackgroundDrawable(imagex);
        } else if (pick[0][2] == 1 && pick[1][1] == 1 && pick[2][0] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][2].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][0].setEnabled(true);


            panel[0][2].setBackgroundDrawable(imagex);
            panel[1][1].setBackgroundDrawable(imagex);
            panel[2][0].setBackgroundDrawable(imagex);
        } else if (pick[0][0] == 1 && pick[1][0] == 1 && pick[2][0] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[1][0].setEnabled(true);
            panel[2][0].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imagex);
            panel[1][0].setBackgroundDrawable(imagex);
            panel[2][0].setBackgroundDrawable(imagex);
        } else if (pick[0][1] == 1 && pick[1][1] == 1 && pick[2][1] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][1].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][1].setEnabled(true);

            panel[0][1].setBackgroundDrawable(imagex);
            panel[1][1].setBackgroundDrawable(imagex);
            panel[2][1].setBackgroundDrawable(imagex);
        } else if (pick[0][2] == 1 && pick[1][2] == 1 && pick[2][2] == 1) {
            result.setText("Congrats..Player X win !");
            scorex++;
            if (scoreo > 0) {
                scoreo--;
            }
            scoreX.setText("" + scorex);
            scoreO.setText("" + scoreo);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][2].setEnabled(true);
            panel[1][2].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[0][2].setBackgroundDrawable(imagex);
            panel[1][2].setBackgroundDrawable(imagex);
            panel[2][2].setBackgroundDrawable(imagex);
        } else if (pick[0][0] == 2 && pick[0][1] == 2 && pick[0][2] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[0][1].setEnabled(true);
            panel[0][2].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imageo);
            panel[0][1].setBackgroundDrawable(imageo);
            panel[0][2].setBackgroundDrawable(imageo);
        } else if (pick[1][0] == 2 && pick[1][1] == 2 && pick[1][2] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[1][0].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[1][2].setEnabled(true);

            panel[1][0].setBackgroundDrawable(imageo);
            panel[1][1].setBackgroundDrawable(imageo);
            panel[1][2].setBackgroundDrawable(imageo);
        } else if (pick[2][0] == 2 && pick[2][1] == 2 && pick[2][2] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[2][0].setEnabled(true);
            panel[2][1].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[2][0].setBackgroundDrawable(imageo);
            panel[2][1].setBackgroundDrawable(imageo);
            panel[2][2].setBackgroundDrawable(imageo);
        } else if (pick[0][0] == 2 && pick[1][1] == 2 && pick[2][2] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imageo);
            panel[1][1].setBackgroundDrawable(imageo);
            panel[2][2].setBackgroundDrawable(imageo);
        } else if (pick[0][2] == 2 && pick[1][1] == 2 && pick[2][0] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][2].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][0].setEnabled(true);

            panel[0][2].setBackgroundDrawable(imageo);
            panel[1][1].setBackgroundDrawable(imageo);
            panel[2][0].setBackgroundDrawable(imageo);
        } else if (pick[0][0] == 2 && pick[1][0] == 2 && pick[2][0] == 2) {
            result.setText("Congrats..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][0].setEnabled(true);
            panel[1][0].setEnabled(true);
            panel[2][0].setEnabled(true);

            panel[0][0].setBackgroundDrawable(imageo);
            panel[1][0].setBackgroundDrawable(imageo);
            panel[2][0].setBackgroundDrawable(imageo);
        } else if (pick[0][1] == 2 && pick[1][1] == 2 && pick[2][1] == 2) {
            result.setText("Congrats.. Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][1].setEnabled(true);
            panel[1][1].setEnabled(true);
            panel[2][1].setEnabled(true);

            panel[0][1].setBackgroundDrawable(imageo);
            panel[1][1].setBackgroundDrawable(imageo);
            panel[2][1].setBackgroundDrawable(imageo);
        } else if (pick[0][2] == 2 && pick[1][2] == 2 && pick[2][2] == 2) {
            result.setText("Congrats ..Player O win !");
            scoreo++;
            if (scorex > 0) {
                scorex--;
            }
            scoreO.setText("" + scoreo);
            scoreX.setText("" + scorex);
            l.setVisibility(View.VISIBLE);
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);
            panel[0][2].setEnabled(true);
            panel[1][2].setEnabled(true);
            panel[2][2].setEnabled(true);

            panel[0][2].setBackgroundDrawable(imageo);
            panel[1][2].setBackgroundDrawable(imageo);
            panel[2][2].setBackgroundDrawable(imageo);
        } else if (count == 9) {

            result.setText("Oops .. NO Winner !");

            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    panel[i][j].setEnabled(false);

        }

    }

    public void init() {

        panel = new Button[3][3];
        panel[0][0] = (Button) findViewById(R.id.button);
        panel[0][1] = (Button) findViewById(R.id.button2);
        panel[0][2] = (Button) findViewById(R.id.button3);
        panel[1][0] = (Button) findViewById(R.id.button4);
        panel[1][1] = (Button) findViewById(R.id.button5);
        panel[1][2] = (Button) findViewById(R.id.button6);
        panel[2][0] = (Button) findViewById(R.id.button7);
        panel[2][1] = (Button) findViewById(R.id.button8);
        panel[2][2] = (Button) findViewById(R.id.button9);

        count = 0;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tow_player, menu);
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
        } else if (id == R.id.action_exit) {
            finishAffinity();


        } else if (id == R.id.action_new) {
            //action_new handler

            this.finish();
            Intent intent = new Intent(getApplicationContext(), twoPlayer.class);
            intent.putExtra("scorex", scorex);
            intent.putExtra("scoreo", scoreo);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }


}
