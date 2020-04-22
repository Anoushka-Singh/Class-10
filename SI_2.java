class SI_2
{
    int prin, time;
    double rate, ans;
    void init(int p, int t, double r)
    {
        prin=p;
        time=t;
        rate=r;
    }
    void calc()
    {
        ans=(prin*rate*time)/100;
    }
    void display()
    {
        System.out.println(ans);
    }
}
        
   
