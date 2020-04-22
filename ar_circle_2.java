class ar_circle_2
{
    double radius, ans;
    final double pi= 3.14;
    void init(double r)
    {
        radius=r;
    }
    void calc()
    {
        ans= pi*radius*radius;
    }
    void display()
    {
        System.out.println(ans);
    }
}