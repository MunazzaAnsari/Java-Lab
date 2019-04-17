class ContactManager
{
    int pointer;
    Contact[] myContacts;
    ContactManager(){
        pointer=0; 
        myContact=new Contact[100];
    }
    public void addContact(Contact c){
        myContact[pointer]=c;
        pointer++;
        
    }
    public Contact SearchContact(String sname){
        sname=sname.toLowerCase();
        for (int i=0;i<pointer;i++){
            if (myContacts[i].sn.equals(sname))
            System.out.println("found a contact");
            return myContacts[i];

        }
        System.out.println("not found");
        return null;
    }
} 