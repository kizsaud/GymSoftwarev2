public class MemberDatabase {
    enum Locations{
            Bridgewater("08807","Somerset County"),
            Edison("08837","Middlesex County"),
            Franklin("08873","Somerset County"),
            Piscataway("08854","Middlesex County"),
            Somerville("08876","Somerset County");

            String zipcode;
            String County;
            Locations(String Z, String C){
                zipcode=Z;
                County=C;


            }
            public String getCounty(Locations a){
                return a.County;

            }
        }


    private Member [] mlist;
    private int size;

    private int find(Member member) {
        int NOT_FOUND = -1;
        for (int i = 0; i < mlist.length; i++) {
            if (mlist[i] == member) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    private void grow() {

    }
    public boolean add(Member member) {
        Member newList[] = new Member[mlist.length + 1];
        for(int i = 0; i < mlist.length; i++) {
            newList[i] = mlist[i];
        }
    }
    public boolean remove(Member member) {
        Member [] newList = new Member[mlist.length-1];
        for(int i = 0; i < mlist.length; i++) {
            if(mlist[i] == member) {
                i++;
            }
            else {
                newList[i] = mlist[i];
            }
        }
        mlist = newList;
    }
    public void print () {
        for(int i = 0; i < mlist.length; i++) {
            System.out.println(mlist[i].toString());
        }
    } //print the array contents as is
    public void printByCounty() {

    } //sort by county and then zipcode
    public void printByExpirationDate() {
        Member [] newList = new Member[mlist.length];
        for(int i = 0; i < mlist.length; i++){
            newList[i] = mlist[i];
        }
        for(int i = 0; i < newList.length; i++) {
            for(int j = i+1; j < newList.length; j++) {
                if(newList[i].getExpire().getYear() > newList[j].getExpire().getYear()){
                    Member temp = newList[i];
                    newList[i] = newList[j];
                    newList[j] = temp;
                }
                else if(newList[i].getExpire().getYear() == newList[j].getExpire().getYear() &&
                        newList[i].getExpire().getMonth() > newList[j].getExpire().getMonth()){
                    Member temp = newList[i];
                    newList[i] = newList[j];
                    newList[j] = temp;
                }
                else if(newList[i].getExpire().getYear() == newList[j].getExpire().getYear() &&
                        newList[i].getExpire().getMonth() == newList[j].getExpire().getMonth() &&
                        newList[i].getExpire().getDay() > newList[j].getExpire().getDay()){
                    Member temp = newList[i];
                    newList[i] = newList[j];
                    newList[j] = temp;
                }
            }
        }
    } //sort by the expiration date


    public void printByName() {
        Member temp;
        Member [] nameList = new Member[mlist.length];
        for(int i = 0; i < mlist.length; i++) {
            nameList[i] = mlist[i];
        }
        for(int i = 0; i < nameList.length; i++) {
            for(int j = 1; j < nameList.length; j++) {
                if(nameList[i].getLname().equals(nameList[j].getLname())) {
                    if(nameList[i].getFname().compareTo(nameList[j].getFname()) > 0) {
                        temp = nameList[i];
                        nameList[i] = nameList[j];
                        nameList[j] = temp;
                    }
                }
                else {
                    if(nameList[i].getLname().compareTo(nameList[j].getLname()) > 0) {
                        temp = nameList[i];
                        nameList[i] = nameList[j];
                        nameList[j] = temp;
                    }
                }
            }
        }
        for(int i = 0; i < nameList.length; i++) {
            System.out.println(nameList[i]);
        }
    } //sort by last name and then first name
}
