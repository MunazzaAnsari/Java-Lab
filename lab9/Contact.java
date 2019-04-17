class Contact{
    public String number;
    public String name;
    public String email;
    public String sn;
    Contact(String n,String na ,String e){
        number=n;
        name=na;
        email=e;
        sn=name.toLowerCase();
    }

}