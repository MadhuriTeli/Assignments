//Finding area and perimeter of rectangle or circle.
#include <stdio.h>
#include <math.h>
#define PI 3.14;
float AreaOfCircle(float);
float PerimeterOFCircle(float);
float AreaOfRectangle(float, float);
float PerimeterOfRectangle(float, float);

//Circle
float PerimeterOFCircle(float rad)
{
  return 2 * rad * PI;
}

float AreaOfCircle(float rad)
{
  float Area;
  Area = rad * rad * PI;
  return Area;
}

//Rectangle

float AreaOfRectangle(float len, float wid)
{
  return len * wid;
}
float PerimeterOfRectangle(float len, float wid)
{
  return 2 * len + 2 * wid;
}

int main()
{
  float radius, length, width;
  printf("enter Radius of circle \n");
  scanf("%f", &radius);

  printf("enter Length And width of Reactangle \n");
  scanf("%f%f", &length, &width);
  printf("Area Of circle : %f \n", AreaOfCircle(radius));
  printf("Perimeter of Circle: %f \n", PerimeterOFCircle(radius));

  printf("Area Of Rectangle : %f \n", AreaOfRectangle(length, width));
  printf("Perimeter of Rectangle: %f \n", PerimeterOfRectangle(length, width));

  return 0;
}