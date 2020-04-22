class square_2
{
    int side;
    int ans;
    void init(int s)
    {
        side=s;
    }
    void calc()
    {
        ans= side*side;
    }
    void display()
    {
        System.out.println(ans);
    }
}