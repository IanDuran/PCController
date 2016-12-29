package com.example.usuario.pccontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    private Communicator c;

    //First row
    private ImageButton btnEscape;
    private ImageButton btnF1;
    private ImageButton btnF2;
    private ImageButton btnF3;
    private ImageButton btnF4;
    private ImageButton btnF5;
    private ImageButton btnF6;
    private ImageButton btnF7;
    private ImageButton btnF8;
    private ImageButton btnF9;
    private ImageButton btnF10;
    private ImageButton btnF11;
    private ImageButton btnF12;
    /////////////////////////////

    //Second row
    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
    private ImageButton btn6;
    private ImageButton btn7;
    private ImageButton btn8;
    private ImageButton btn9;
    private ImageButton btn0;
    private ImageButton btnEquals;
    private ImageButton btnBackspace;
    ////////////////////////////////

    //Third row
    private ImageButton btnTab;
    private ImageButton btnQ;
    private ImageButton btnW;
    private ImageButton btnE;
    private ImageButton btnR;
    private ImageButton btnT;
    private ImageButton btnY;
    private ImageButton btnU;
    private ImageButton btnI;
    private ImageButton btnO;
    private ImageButton btnP;
    private ImageButton btnBracket1;
    private ImageButton btnBracket2;
    private ImageButton btnTilde;
    ////////////////////////////

    //Fourth row
    private ImageButton btnA;
    private ImageButton btnS;
    private ImageButton btnD;
    private ImageButton btnF;
    private ImageButton btnG;
    private ImageButton btnH;
    private ImageButton btnJ;
    private ImageButton btnK;
    private ImageButton btnL;
    private ImageButton btnEnter;
    /////////////////////////////

    //Fifth row
    private ImageButton btnShift;
    private ImageButton btnZ;
    private ImageButton btnX;
    private ImageButton btnC;
    private ImageButton btnV;
    private ImageButton btnB;
    private ImageButton btnN;
    private ImageButton btnM;
    private ImageButton btnComma;
    private ImageButton btnPeriod;
    private ImageButton btnArrowUp;
    ///////////////////////////////

    //Sixth row
    private ImageButton btnControl;
    private ImageButton btnWinKey;
    private ImageButton btnAlt;
    private ImageButton btnSpace;
    private ImageButton btnArrowLeft;
    private ImageButton btnArrowDown;
    private ImageButton btnArrowRight;
    ///////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyboard_layout);
        c = new Communicator();
        //Initialization
        btnEscape = (ImageButton) findViewById(R.id.btn_escape);
        btnF1 = (ImageButton) findViewById(R.id.btn_f1);
        btnF2 = (ImageButton) findViewById(R.id.btn_f2);
        btnF3 = (ImageButton) findViewById(R.id.btn_f3);
        btnF4 = (ImageButton) findViewById(R.id.btn_f4);
        btnF5 = (ImageButton) findViewById(R.id.btn_f5);
        btnF6 = (ImageButton) findViewById(R.id.btn_f6);
        btnF7 = (ImageButton) findViewById(R.id.btn_f7);
        btnF8 = (ImageButton) findViewById(R.id.btn_f8);
        btnF9 = (ImageButton) findViewById(R.id.btn_f9);
        btnF10 = (ImageButton) findViewById(R.id.btn_f10);
        btnF11 = (ImageButton) findViewById(R.id.btn_f11);
        btnF12 = (ImageButton) findViewById(R.id.btn_f12);

        btn1 = (ImageButton) findViewById(R.id.btn_1);
        btn2 = (ImageButton) findViewById(R.id.btn_2);
        btn3 = (ImageButton) findViewById(R.id.btn_3);
        btn4 = (ImageButton) findViewById(R.id.btn_4);
        btn5 = (ImageButton) findViewById(R.id.btn_5);
        btn6 = (ImageButton) findViewById(R.id.btn_6);
        btn7 = (ImageButton) findViewById(R.id.btn_7);
        btn8 = (ImageButton) findViewById(R.id.btn_8);
        btn9 = (ImageButton) findViewById(R.id.btn_9);
        btn0 = (ImageButton) findViewById(R.id.btn_0);
        btnEquals = (ImageButton) findViewById(R.id.btn_equals);
        btnBackspace = (ImageButton) findViewById(R.id.btn_backspace);

        btnTab = (ImageButton) findViewById(R.id.btn_tab);
        btnQ = (ImageButton) findViewById(R.id.btn_q);
        btnW = (ImageButton) findViewById(R.id.btn_w);
        btnE = (ImageButton) findViewById(R.id.btn_e);
        btnR = (ImageButton) findViewById(R.id.btn_r);
        btnT = (ImageButton) findViewById(R.id.btn_t);
        btnY = (ImageButton) findViewById(R.id.btn_y);
        btnU = (ImageButton) findViewById(R.id.btn_u);
        btnI = (ImageButton) findViewById(R.id.btn_i);
        btnO = (ImageButton) findViewById(R.id.btn_o);
        btnP = (ImageButton) findViewById(R.id.btn_p);
        btnBracket1 = (ImageButton) findViewById(R.id.btn_bracket1);
        btnBracket2 = (ImageButton) findViewById(R.id.btn_bracket2);
        btnTilde = (ImageButton) findViewById(R.id.btn_tilde);

        btnA = (ImageButton) findViewById(R.id.btn_a);
        btnS = (ImageButton) findViewById(R.id.btn_s);
        btnD = (ImageButton) findViewById(R.id.btn_d);
        btnF = (ImageButton) findViewById(R.id.btn_f);
        btnG = (ImageButton) findViewById(R.id.btn_g);
        btnH = (ImageButton) findViewById(R.id.btn_h);
        btnJ = (ImageButton) findViewById(R.id.btn_j);
        btnK = (ImageButton) findViewById(R.id.btn_k);
        btnL = (ImageButton) findViewById(R.id.btn_l);
        btnEnter = (ImageButton) findViewById(R.id.btn_enter);

        btnShift = (ImageButton) findViewById(R.id.btn_shift);
        btnZ = (ImageButton) findViewById(R.id.btn_z);
        btnX = (ImageButton) findViewById(R.id.btn_x);
        btnC = (ImageButton) findViewById(R.id.btn_c);
        btnV = (ImageButton) findViewById(R.id.btn_v);
        btnB = (ImageButton) findViewById(R.id.btn_b);
        btnN = (ImageButton) findViewById(R.id.btn_n);
        btnM = (ImageButton) findViewById(R.id.btn_m);
        btnComma = (ImageButton) findViewById(R.id.btn_comma);
        btnPeriod = (ImageButton) findViewById(R.id.btn_period);
        btnArrowUp = (ImageButton) findViewById(R.id.btn_arrow_up);

        btnControl = (ImageButton) findViewById(R.id.btn_control);
        btnWinKey = (ImageButton) findViewById(R.id.btn_win_key);
        btnAlt = (ImageButton) findViewById(R.id.btn_alt);
        btnSpace = (ImageButton) findViewById(R.id.btn_space);
        btnArrowLeft = (ImageButton) findViewById(R.id.btn_arrow_left);
        btnArrowDown = (ImageButton) findViewById(R.id.btn_arrow_down);
        btnArrowRight = (ImageButton) findViewById(R.id.btn_arrow_right);
        //////////////////////////////////////////////////

        //Setting Listeners
        btnEscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(27);
            }
        });

        btnF1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(112);
            }
        });

        btnF2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(113);
            }
        });

        btnF3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(114);
            }
        });

        btnF4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(115);
            }
        });

        btnF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(116);
            }
        });

        btnF6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(117);
            }
        });

        btnF7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(118);
            }
        });

        btnF8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(119);
            }
        });

        btnF9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(120);
            }
        });

        btnF10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(121);
            }
        });

        btnF11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(122);
            }
        });

        btnF12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(123);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(49);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(50);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(51);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(52);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(53);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(54);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(55);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(56);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(57);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(48);
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(61);
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(8);
            }
        });
        //////////////////////////////////////////////////////

        btnTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(9);
            }
        });

        btnQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(81);
            }
        });

        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(87);
            }
        });

        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(69);
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(82);
            }
        });

        btnT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(84);
            }
        });

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(89);
            }
        });

        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(85);
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(73);
            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(79);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(80);
            }
        });

        btnBracket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(91);
            }
        });

        btnBracket2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(93);
            }
        });

        btnTilde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(131);
            }
        });
        //////////////////////////////////////////////////////////////

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(65);
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(83);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(68);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(70);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(71);
            }
        });

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(72);
            }
        });

        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(74);
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(75);
            }
        });

        btnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(76);
            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(10);
            }
        });
        /////////////////////////////////////////////

        btnShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(16);
            }
        });

        btnZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(90);
            }
        });

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(88);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(67);
            }
        });

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(86);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(66);
            }
        });

        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(78);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(77);
            }
        });

        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(44);
            }
        });

        btnPeriod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(46);
            }
        });

        btnArrowUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(38);
            }
        });
        /////////////////////////////////////////////////

        btnControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(17);
            }
        });

        btnWinKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(524);
            }
        });

        btnAlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(18);
            }
        });

        btnSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(32);
            }
        });

        btnArrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(37);
            }
        });

        btnArrowDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(40);
            }
        });

        btnArrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.send(39);
            }
        });
    }
}
