
class Employee {

    private int eid;
    private String ename;

    public void setEid(int eid) {
        if(eid>999 && eid<9999)
        {
        this.eid = eid;
        }

    }

    public int getEid() {
        return eid;
    }

    public void setname(String ename) {
        this.ename = ename;

    }

    public String getname() {
        return ename;
    }

}