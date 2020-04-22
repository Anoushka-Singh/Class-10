class avg_marks_1
{
    int bio, chem, phy;
    double ans;
    void init()
    {
        bio=92;
        chem=95;
        phy=98;
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
