   int x1=200;
   int x2=1000;
   int Speed=5;
    void setup(){
        size(1200,1200);  

    }

    void draw(){
  int r =400;
      x1+=Speed;
      background(#7C7C7C);
      if (x1>=1200 || x1<=0){ 
      Speed*= -1;
      }
     for (int i = 0; i < 11; i++) {
       if (i % 2 == 0) {
          
            noFill();
         ellipse(x1,500,r,r);
     r-=50;
    }
    else {
     
       noFill();
       ellipse(x1,500,r,r);
      r-=50;
    }
     }
  r =400;
      x2-=Speed;
     for (int i = 0; i < 11; i++) {
       if (i % 2 == 0) {
          
            noFill();
         ellipse(x2,500,r,r);
     r-=50;
    }
    else {
     
       noFill();
       ellipse(x2,500,r,r);
      r-=50;
    }
     }
    }
