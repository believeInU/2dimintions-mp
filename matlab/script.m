x = 0:0.5:6;
y = 1.3333333333333333 * x + 0.0;
line(x,y)
hold on
x = 6:0.5:14;
y = 0.0 * x + 8.0;
line(x,y)
hold on
x = 14:0.5:16;
y = -2.5 * x + 43.0;
line(x,y)
hold on
quiver(X,Y,u,v)
hold off