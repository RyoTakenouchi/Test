boolean ia = true; boolean ib = true;
boolean ic = true; boolean id = true;

boolean ix = true; boolean iy = true;
boolean iz = true;

boolean im = true; 

boolean i1 = true; boolean i2 = true;
boolean i3 = true; boolean i4 = true;

//1~8 color
float c1 = 100; float c2 = 0;
float c3 = 100; float c4 = 0;

//number SetPoint
float px1 = 200-40;  float py1 = 30+15;
float px2 = 650-40;  float py2 = 30+15;   
float px3 = 720-50;  float py3 = 30+15;
float px4 = 1180-70; float py4 = 30+15;

//number VPoint
float px1t = 200-40;  float py1t = 30+15;
float px2t = 650-40;  float py2t = 30+15;
float px3t = 720-50;  float py3t = 30+15;
float px4t = 1180-70; float py4t = 30+15;

float r = 40;

//A,B,C,D SetPoint
float dx = 150-70;  float ay = 450;
float cx = 600-50;  float by = 250;
float bx = 750-40;  float cy = 430;
float ax = 1240-70; float dy = 220;

//A,B,C,D VPoint
float dxt = 150-70;  float ayt = 450;
float cxt = 600-50;  float byt = 250;
float bxt = 750-40;  float cyt = 430;
float axt = 1240-70; float dyt = 220;

//M,N,O SetPoint
float mx = 270;        float my = 630;//+30;

//M.N.O VPoint
//float mxt = 270;  float myt = 630+30;
float mxt = 270;  float myt = 630;

//X,Y,Z SetPoint
float xx = 380;     float xy = 580+30;
float yx = 1280/2;  float yy = 580+30;
float zx = 900;     float zy = 580+30;

//X,Y,Z VPoint
float xxt = 380;    float xyt = 580+30;
float yxt = 1280/2; float yyt = 580+30;
float zxt = 900;    float zyt = 580+30;

// color box
float z1 = 0; float z2 = 0;

float ex1 = -100; float ey1 = -100;
float ex2 = -100; float ey2 = -100;
float ex3 = -100; float ey3 = -100;
float ex4 = -100; float ey4 = -100;
float ex5 = -100; float ey5 = -100;
float ex6 = -100; float ey6 = -100;
float ex7 = -100; float ey7 = -100;
float ex8 = -100; float ey8 = -100;
float ex9 = -100; float ey9 = -100;
float ex10 = -100; float ey10 = -100;

float j = 0;  float w = 0;
float Li = 0; float El = 0;
float j2 = j; float w2 = w;

boolean ss = true;
int num = 0;
int y = year(); int m = month();
int d = day();  int h = hour();
int min = minute();

String ball = "On";
String line = "On";

float E = 0;
float L = 0;

PrintWriter output;
int push = 0; int push2 = 0; int push3 = 0; 
float [][]data;
String[] stuff;
int to = 0;
boolean Tx = true;

boolean B1 = true;

float ballx = 640-256; float bally = 60+20;
float ballxt = 640-256; float ballyt = 60+20;

import java.io.File;

File f = new File("positions"+1+".txt");

//reset
void setP(){
dx = 150-70;  ay = 450;
cx = 600-50;  by = 250;
bx = 750-40;  cy = 430;
ax = 1240-70; dy = 220;

px1 = 200-40;  py1 = 30+15;
px2 = 650-40;  py2 = 30+15;
px3 = 720-50;  py3 = 30+15;
px4 = 1180-70; py4 = 30+15;

 
dxt = 150-70;  ayt = 450;
cxt = 600-50;  byt = 250;
bxt = 750-40;  cyt = 430;
axt = 1240-70; dyt = 220;


px1t = 200-40;  py1t = 30+15;
px2t = 650-40;  py2t = 30+15;
px3t = 720-50;  py3t = 30+15;
px4t = 1180-70; py4t = 30+15;


mx = 270;   my = 630;//+30;

mxt = 270;  myt = 630;//+30;

xx = 380;      xy = 580+30;
yx = width/2;  yy = 580+30;
zx = 900;      zy = 580+30;

xxt = 380;     xyt = 580+30;
yxt = width/2; yyt = 580+30;
zxt = 900;     zyt = 580+30;

z1 = 0;  z2 = 0;

ex1 = -100; ey1 = -100;
ex2 = -100; ey2 = -100;
ex3 = -100; ey3 = -100;
ex4 = -100; ey4 = -100;
ex5 = -100; ey5 = -100;
ex6 = -100; ey6 = -100;
ex7 = -100; ey7 = -100;
ex8 = -100; ey8 = -100;
ex9 = -100; ey9 = -100;
ex10 = -100;  ey10 = -100;

j = 0; w = 0;


ballx = width/2-256;  bally = 60+20;
ballxt = width/2-256; ballyt = 60+20;
}

void setEl(){
ex1 = -100; ey1 = -100;
ex2 = -100; ey2 = -100;
ex3 = -100; ey3 = -100;
ex4 = -100; ey4 = -100;
ex5 = -100; ey5 = -100;
ex6 = -100; ey6 = -100;
ex7 = -100; ey7 = -100;
ex8 = -100; ey8 = -100;
ex9 = -100; ey9 = -100;
ex10 = -100;  ey10 = -100;

j = 0; w = 0;

}

