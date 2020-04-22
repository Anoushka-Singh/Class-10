class avg_marks_2
{
    int bio, chem, phy;
    double ans;
    void init(int b, int c, int p)
    {
        bio=b;
        chem=c;
        phy=p;
    }
    void calc()
    {
       ans= (bio+chem+phy)/3;
    }
    void display()
    {
       System.out.println(ans);
}
}
