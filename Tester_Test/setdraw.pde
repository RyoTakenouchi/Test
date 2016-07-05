void setup(){ 
 size(1280,800);
 //size(displayWidth,displayHeight);
  smooth();
  wr(); 
}

void draw(){
 background(0,235,0);
 strokeWeight(0);
 noStroke();
 frameRate(120);
 
// new File("//positions"+push2+".txt"); 
 /*
 fill(255,0,0);
 rect(width/2-256-220,120,110,440);
 fill(255,180,0);
 rect(width/2-256-110,120,210,440);
*/

//triangle X,Y Z
fill(250,150,0);
triangle(xx,xy,yx,yy,zx,zy); 
 
//X Move 
  xx = xx+(xxt-xx)*0.05;
  xy = xy+(xyt-xy)*0.05;
  if(dist(xx,xy,xxt,xyt) < 2){
    xx = xxt;
    xy = xyt;
  }

//Y Move 
  yx = yx+(yxt-yx)*0.05;
  yy = yy+(yyt-yy)*0.05;
  if(dist(yx,yy,yxt,yyt) < 2){
    yx = yxt;
    yy = yyt;
  }

//Z Move 
  zx = zx+(zxt-zx)*0.05;
  zy = zy+(zyt-zy)*0.05;
  if(dist(zx,zy,zxt,zyt) < 2){
    zx = zxt;
    zy = zyt;
  }    
  
// M,N,O
// fill(250,0,250,150);
// quad (mx,my,nx,ny,ox,oy,px,py);  
//M Move 
  mx = mx+(mxt-mx)*0.05;
  my = my+(myt-my)*0.05;
  if(dist(mx,my,mxt,myt) < 2){
    mx = mxt;
    my = myt;
  }
    
///coat/////////////////////////////////////////////////
  strokeWeight(5);
  stroke(255);
 //Net
 line(width/2,100+20,width/2,540+20);
 
 //side
 line(width/2,100+20,width/2-256,100+20);
 line(width/2,100+20,width/2+256,100+20);
 line(width/2,540+20,width/2-256,540+20);
 line(width/2,540+20,width/2+256,540+20);
 
 line(width/2-256,100+20,width/2-256-220,100+20);
 line(width/2+256,100+20,width/2+256+220,100+20);
 line(width/2-256,540+20,width/2-256-220,540+20);
 line(width/2+256,540+20,width/2+256+220,540+20);
 
 //Base
 line(width/2-256-220,100+20,width/2-256-220,540+20);
 line(width/2+256+220,100+20,width/2+256+220,540+20);
 
 //single
 line(width/2-256-220,100+54+20,width/2+256+220,100+54+20);
 line(width/2-256-220,540-54+20,width/2+256+220,540-54+20);
 
 //serve
 line(width/2-256,100+54+20,width/2-256,540-54+20);
 line(width/2-256,100+54+20,width/2-256,540-54+20);
 line(width/2+256,100+54+20,width/2+256,540-54+20);
 line(width/2+256,100+54+20,width/2+256,540-54+20);
 line(width/2-256,(100+540)/2+20,width/2+256,(100+540)/2+20);
 
 line(width/2-256-220,640/2+20,width/2-256-220+10,640/2+20);
 line(width/2+256+220,640/2+20,width/2+256+220-10,640/2+20);
 /////////////////////////////////////////////  

strokeWeight(0);
textSize(25); 
//XYZ
 fill(250,150,0);
 ellipse(xx,xy,r-10,r-10);
 //fill(255);    
 //text("X ",xx-10,xy+10);
 fill(250,150,0);
 ellipse(yx,yy,r-10,r-10);
 //fill(255);    
 //text("Y ",yx-10,yy+10);
 fill(250,150,0);
 ellipse(zx,zy,r-10,r-10);
 //fill(255);    
 //text("Z ",zx-10,zy+10);

//MNOP
  fill(250,0,250,200);
  ellipse(mx,my,(r*2)+15,(r*2)+15);
 
//1,2 Move   
  strokeWeight(5);
  stroke(0,c1,c2);
  fill(0,c1,c2);
  line(px1,py1,px2,py2);
  ellipse(px1,py1,20,20);
  ellipse(px2,py2,20,20);
  px1 = px1+(px1t-px1)*0.05;
  py1 = py1+(py1t-py1)*0.05;
  if(dist(px1,py1,px1t,py1t) < 2){
    px1 = px1t;
    py1 = py1t;
  }
  px2 = px2+(px2t-px2)*0.05;
  py2 = py2+(py2t-py2)*0.05;
  if(dist(px2,py2,px2t,py2t) < 2){
    px2 = px2t;
    py2 = py2t;   
  }
 textSize(20);
 fill(255);
 //text("1",px1-8,py1+7);
 //text("2",px2-8,py2+7);

//3,4 Move       
  stroke(0,c3,c4);
  fill(0,c3,c4);
  line(px3,py3,px4,py4);
  ellipse(px3,py3,20,20);
  ellipse(px4,py4,20,20);
  px3 = px3+(px3t-px3)*0.05;
  py3 = py3+(py3t-py3)*0.05;
  if(dist(px3,py3,px3t,py3t) < 2){
    px3 = px3t;
    py3 = py3t;
  }
  px4 = px4+(px4t-px4)*0.05;
  py4 = py4+(py4t-py4)*0.05;
  if(dist(px4,py4,px4t,py4t) < 2){
    px4 = px4t;
    py4 = py4t;
  }
 textSize(20);
 fill(255);
 //text("3",px3-8,py3+7);
 //text("4",px4-8,py4+7);

   
/////////////////////////////////
  
  //stroke(0);
  //Straight Line , Cross Line 
  //line(200,580,2377/2,580);
  //line(200,600,1273,600);    
 
///////////////////////////////// 

//Button
if(ss == true){
stroke(0);
strokeWeight(2);

//end
fill(255,0,0);
rect(width-40,0,40,25);

stroke(0);
strokeWeight(5);
// ALL reset
fill(150);
rect(1150,720,120,70);
//Ball reset
fill(150);
rect(1050,720,80,70);
//Ball ON or Off
fill(250,0,0);
rect(950,720,80,70);
//Line On or Off
fill(0,180,255);
rect(850,720,80,70);
//Ball Back
fill(230,160,235);
rect(750,720,80,70);
//1,2
fill(0,c1,c2);
rect(100,720,70,70);
//3,4
fill(0,c3,c4);
rect(190,720,70,70);
//Screen Shot
fill(0,0,255);
rect(5,720,75,70);

//text save
fill(0,180,255);
rect(550,720,70,70);
//text reset 
fill(180);
rect(650,720,70,70);
//text load
fill(255,0,0);
triangle(280,755,350,790,350,720);
triangle(460,790,460,720,530,755);

fill(255);
rect(360,720,90,70);

textSize(28);
fill(255);
text("Reset",1175,775);
text("ALL",1185,750);
textSize(23);
text("Ball",1070,750);
text("Reset",1060,780);
text("Ball",970,750); 
text(ball,970,780);
text("Line",870,750);
text(line,875,780);
text("Ball",770,750);
text("Return",753,780);
text("Save",660,750);
text("Reset",655,780);
//end
text("×",width-30,20);


fill(0);
text("Load",380,745);
textSize(22);
text(push,370,775);
text("/ ",400,775);
text(push2,410,775);


textSize(28);
fill(255);
text("1,2",110,765);
text("3,4",200,765);
text("Save",555,760);

textSize(20);
text("Screen",12,750);
text("Shot",20,770);

textSize(50);
text("-",310,770);
textSize(42);
text("+",465,765);

}
 
 //1,2 color change
 if(z1 % 2 == 0){
  c1 = 100;
  c2 = 0;
 } else{
   c1 = 200;
   c2 = 200;
 }
 
//3,4 color change
  if(z2 % 2 == 0){
  c3 = 100;
  c4 = 0;
 } else{
   c3 = 200;
   c4 = 200;
 }

 
fill(255,255,0);
boolean Elli = true;
boolean Line = true;

if(El % 2 == 0){
  Elli = false;
  ball = "Off";
  E = 0; 
  }else{
  Elli = true;
  E = 1;
  ball = "On";
}

if(Li % 2 == 0){
  Line = false;
  line = "Off";
}else{
  Line = true;
  line = "On";
}

 strokeWeight(5);
 if(Line == true){
 if(ex2>0){ stroke(255,255,0); line(ex1,ey1,ex2,ey2);}
 if(ex3>0){ stroke(255,255,0); line(ex2,ey2,ex3,ey3);}
 if(ex4>0){ stroke(255,255,0); line(ex3,ey3,ex4,ey4);}
 if(ex5>0){ stroke(255,255,0); line(ex4,ey4,ex5,ey5);}
 if(ex6>0){ stroke(255,255,0); line(ex5,ey5,ex6,ey6);}
 if(ex7>0){ stroke(255,255,0); line(ex6,ey6,ex7,ey7);}
 if(ex8>0){ stroke(255,255,0); line(ex7,ey7,ex8,ey8);}
 if(ex9>0){ stroke(255,255,0); line(ex8,ey8,ex9,ey9);}
 if(ex10>0){ stroke(255,255,0); line(ex9,ey9,ex10,ey10);}
 }
 
 //Click Ball  
 noStroke();
 fill(255,255,0);
 ellipse(ex1,ey1,20,20);
 ellipse(ex2,ey2,20,20);
 ellipse(ex3,ey3,20,20);
 ellipse(ex4,ey4,20,20);
 ellipse(ex5,ey5,20,20);
 ellipse(ex6,ey6,20,20);
 ellipse(ex7,ey7,20,20);
 ellipse(ex8,ey8,20,20);
 ellipse(ex9,ey9,20,20);
 ellipse(ex10,ey10,20,20);
 
 fill(0);
 textSize(20);
 text("1",ex1-7,ey1+7);
 text("2",ex2-7,ey2+7);
 text("3",ex3-7,ey3+7);
 text("4",ex4-7,ey4+7);
 text("5",ex5-7,ey5+7);
 text("6",ex6-7,ey6+7);
 text("7",ex7-7,ey7+7);
 text("8",ex8-7,ey8+7);
 text("9",ex9-7,ey9+7);
 textSize(17);
 text("10",ex10-9,ey10+7);
 
if(w == -1){
  setEl();
}

//A Move 
 strokeWeight(0);
 fill(0,0,255);
 ellipse(ax,ay,r,r);
  ax = ax+(axt-ax)*0.05;
  ay = ay+(ayt-ay)*0.05;
  if(dist(ax,ay,axt,ayt) < 2){
    ax = axt;
    ay = ayt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(ax,ay);
rotate(-HALF_PI);
translate(-ax,-ay);
text("A ",ax-10,ay+10);
popMatrix();
  
//B Move 
  fill(255,0,0);
  ellipse(bx,by,r,r);
  bx = bx+(bxt-bx)*0.05;
  by = by+(byt-by)*0.05;
  if(dist(bx,by,bxt,byt) < 2){
    bx = bxt;
    by = byt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(bx,by);
rotate(-HALF_PI);
translate(-bx,-by);
text("B ",bx-10,by+10);
popMatrix();

//C Move 
  fill(255,0,0);
  ellipse(cx,cy,r,r);
  cx = cx+(cxt-cx)*0.05;
  cy = cy+(cyt-cy)*0.05;
  if(dist(cx,cy,cxt,cyt) < 2){
    cx = cxt;
    cy = cyt;
  }
fill(255);
textSize(30);
  
pushMatrix();
translate(cx,cy);
rotate(-HALF_PI);
translate(-cx,-cy);
text("C ",cx-10,cy+10);
popMatrix();
  
//D Move 
  fill(0,0,255);
  ellipse(dx,dy,r,r);
  dx = dx+(dxt-dx)*0.05;
  dy = dy+(dyt-dy)*0.05;
  if(dist(dx,dy,dxt,dyt) < 2){
    dx = dxt;
    dy = dyt;
  }
fill(255);
textSize(30);

pushMatrix();
translate(dx,dy);
rotate(-HALF_PI);
translate(-dx,-dy);
text("D ",dx-10,dy+10);
popMatrix();

//Ball Move 
  fill(250,250,0);
  ellipse(ballx,bally,r-10,r-10);
  ballx = ballx+(ballxt-ballx)*0.05;
  bally = bally+(ballyt-bally)*0.05;
  if(dist(ballx,bally,ballxt,ballyt) < 2){
    ballx = ballxt;
    bally = ballyt;
  }
}
////////////////////////////////////////////////////////

 

