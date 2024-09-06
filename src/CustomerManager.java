public class CustomerManager {

    BaseDatabaseManager databaseManager; //Base yerine oracle ya da sql'i newleseydik bağımlı olurduk.

    public void getCustomers(){
        databaseManager.getData();
    }
}
