public class MemberDatabase {
    private Member [] mlist;
    private int size;

    private int find(Member member)
    {
        int NOT_FOUND = -1;
        for (int i = 0; i < mlist.length; i++)
        {
            if (mlist[i] == member)
            {
                return i;
            }
        }
        return NOT_FOUND;
    }

    private void grow()
    {

    }
    public boolean add(Member member)
    {

    }
    public boolean remove(Member member)
    {

    }
    public void print ()
    {
        for(int i = 0; i < mlist.length; i++)
        {
            System.out.println(mlist[i].toString());
        }
    } //print the array contents as is
    public void printByCounty()
    {

    } //sort by county and then zipcode
    public void printByExpirationDate()
    {

    } //sort by the expiration date
    public void printByName()
    {

    } //sort by last name and then first name
}
